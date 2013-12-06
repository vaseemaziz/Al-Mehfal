package com.billing.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

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
		
    	Calendar cal = Calendar.getInstance();
    	int month = cal.get(Calendar.MONTH)+1;
    	int year = cal.get(Calendar.YEAR);
    	int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    	String str = getSalesByMonth1(month, year);
    	
    	String days = "[";
    	for(int i=0;i<daysInMonth;i++)
    		days += (i+1) + ",";
    	days = days.substring(0,days.length()-1) + "]";
    	
    	model.addAttribute("month", month);
    	model.addAttribute("year", year);
    	model.addAttribute("sales", str);
    	model.addAttribute("days", days);
    	
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
		
		String[] str = dishOrderService.verifyCustomer(verifyMobile);
		if(str==null)
			return "{\"error\":\"No record found\"}";
		
		return "{\"name\":\"" + str[0] + "\",\"due\":\"" + str[1] + "\"}";
	}
	
	
	@RequestMapping(value="/creditDetails", method=RequestMethod.GET)
	public String creditDetails(Model model) {
		List<String[]> str = dishOrderService.getCustomerDetails();
		model.addAttribute("list", str);
		return "sales/credit";
	}
	
	@RequestMapping(value="/payBill", method=RequestMethod.POST)
	public String payBill(Model model,
		@RequestParam(value="mobile", required=true) String mobile,
		@RequestParam(value="paidAmount", required=true) String paidAmount) {
		
		mobile = mobile.trim();
		paidAmount = paidAmount.trim();
		
    	dishOrderService.payBill(mobile, paidAmount);
    	model.addAttribute("url", "/user/creditDetails");
		model.addAttribute("message", "Bill Updated");
		return "success";
	}
	
	
	@RequestMapping(value="/salesByMonth", method=RequestMethod.GET)
	public @ResponseBody String getSalesByMonth(@RequestParam(value="month", required=true) String month, 
			@RequestParam(value="year", required=true) String year, Model model) {
		
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);
		
		if(m == 0) {
			String str1 = getSalesByYear1(y);
			String days1 = "[\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]";
			
			return "{\"sales\":" + str1 + ",\"days\":" + days1 + "}";
		}
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, m-1);
		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String str = getSalesByMonth1(m, y);
		
		String days = "[";
    	for(int i=0;i<daysInMonth;i++)
    		days += (i+1) + ",";
    	days = days.substring(0,days.length()-1) + "]";
		
		return "{\"sales\":" + str + ",\"days\":" + days + "}";
	}
	
	private String getSalesByMonth1(int month, int year) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.YEAR, year);
		
		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		Properties prop = dishOrderService.getSalesByMonth(month, year);
		String str = "[";
		
		for(int i=0; i<daysInMonth; i++) {
			String key = "" + (i+1);
			String value = prop.getProperty(key);
			
			if(value==null)
				str += "0,";
			else
				str += value + ",";
		}
		
		str = str.substring(0, str.length()-1) + "]";
		return str;
	}
	
	private String getSalesByYear1(int year) {
		
		Properties prop = dishOrderService.getSalesByYear(year);
		String str = "[";
		
		for(int i=0; i<12; i++) {
			String key = "" + (i+1);
			String value = prop.getProperty(key);
			
			if(value==null)
				str += "0,";
			else
				str += value + ",";
		}
		
		str = str.substring(0, str.length()-1) + "]";
		return str;
	}
	
}