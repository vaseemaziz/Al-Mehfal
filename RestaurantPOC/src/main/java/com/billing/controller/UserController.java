package com.billing.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.OrderForm;
import com.billing.service.DishOrderService;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private DishOrderService dishOrderService;
	
	
	@RequestMapping(value = "/sales" , method = RequestMethod.GET)
	public String salesPage(Model model) {
		if(model.containsAttribute("billToPrint"))
			return "sales/sales";

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	
    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders(user.getUsername());
    	List<Categories> categoriesList = dishOrderService.getDishItems();
    	
    	if(!model.containsAttribute("billToOpen")) {
    		OrderForm orderForm = dishOrderService.createOrder();
    		orderForm.setCreatedBy(user.getUsername());
    		model.addAttribute("orderForm", orderForm);
    	}
		
    	model.addAttribute("billToPrint", false);
    	model.addAttribute("dishItems", categoriesList);
    	model.addAttribute("pendingOrders", pendingOrders);
    	
        return "sales/sales";
    }
	
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, RedirectAttributes redirectAttributes) {
		
    	if(!orderForm.getSalesType().equals("Al-a-Carte"))
    		orderForm.setTableNum("-");
    	
    	if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/user/sales";
    	}
    	
    	dishOrderService.saveOrder(orderForm);
    	return "redirect:/user/sales";
    }
	
	
	@RequestMapping(value = "/cancelOrder", method = RequestMethod.GET)
    public String cancelOrder(@RequestParam("value") String value) {
    	dishOrderService.cancelOrder(Long.parseLong(value));
    	return "redirect:/user/sales";
    }
	
	
    @RequestMapping(value = "/printOrder", method = RequestMethod.POST)
    public String printOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, 
    		Model model, RedirectAttributes redirectAttributes) {
    	if(!orderForm.getSalesType().equals("Al-a-Carte"))
    		orderForm.setTableNum("-");
    	
    	if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/user/sales";
    	}
    	
    	dishOrderService.closeOrder(orderForm);
    	redirectAttributes.addFlashAttribute("billToPrint", true);
		redirectAttributes.addFlashAttribute("orderForm", orderForm);
    	return "redirect:/user/sales";
    }
    
    
    @RequestMapping(value="/printBill", method=RequestMethod.GET)
    public String printBill(@RequestParam("billNum") String billNum, Model model) {
    	OrderForm orderForm= dishOrderService.openBill(Long.parseLong(billNum));
    	model.addAttribute("orderForm", orderForm);
    	return "sales/printBill";
    }
    
    
    @RequestMapping(value="/printCreditBill", method=RequestMethod.GET)
    public String printCreditBill(@RequestParam("creditId") String creditId, Model model) {
    	BillFormat billFormat = dishOrderService.printCreditBill(creditId);
    	model.addAttribute("billFormat", billFormat);
    	return "sales/printCreditBill";
    }
    
    
    @RequestMapping(value="/openOrder", method=RequestMethod.GET)
    public String openOrder(@RequestParam("bill") String value, Model model, RedirectAttributes redirectAttrs) {
    	
    	OrderForm orderForm = dishOrderService.openBill(Long.parseLong(value));
    	redirectAttrs.addFlashAttribute("billToOpen", true);
		redirectAttrs.addFlashAttribute("orderForm", orderForm);
    	return "redirect:/user/sales";
    }
    
    
    @RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public @ResponseBody String addCustomer(
		@RequestParam(value="name", required=true) String name,
		@RequestParam(value="address", required=true) String address,
		@RequestParam(value="mobile", required=true) String mobile) {
		
    	boolean b = dishOrderService.addCustomer(name, address, mobile);
    	if(b)
    		return "{\"msg\":\"Successfully Added\"}";
    	else
    		return "{\"error\":\"Already Customer Exists\"}";
	}
	
	
	@RequestMapping(value="/verifyCustomer", method=RequestMethod.POST)
	public @ResponseBody String verifyCustomer(
		@RequestParam(value="verifyMobile", required=true) String verifyMobile) {
		
		String name = dishOrderService.verifyCustomer(verifyMobile);
		if(name=="none")
			return "{\"error\":\"No record found\"}";
		
		BillFormat billFormat = dishOrderService.printCreditBill(verifyMobile);
		double due = billFormat.getTotalBill() - billFormat.getTotalPaidBill();
		return "{\"name\":\"" + name + "\",\"due\":\"" + due + "\"}";
	}
	
}