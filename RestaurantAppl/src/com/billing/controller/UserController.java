package com.billing.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.billing.model.Categories;
import com.billing.model.OrderForm;
import com.billing.model.UserBean;
import com.billing.service.DishItemService;
import com.billing.service.DishOrderService;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private DishItemService dishItemService;
	
	@Autowired
	private DishOrderService dishOrderService;
	
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String homePage(Model model) {
    	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String username = user.getUsername();
    	
    	UserBean userBean = new UserBean();
    	userBean.setUser(username);
    	
    	dishOrderService.getUserInfo(userBean);
    	model.addAttribute("user", userBean);
    	
    	return "user/home";
    }
	
	@RequestMapping(value = "/sales" , method = RequestMethod.GET)
    public String salesPage(Model model) {
    	
    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders();
    	OrderForm orderForm = dishOrderService.createOrder();
    	List<Categories> categoriesList = dishOrderService.getDishItems();
		
		model.addAttribute("dishItems", categoriesList);
		model.addAttribute("orderForm", orderForm);
    	model.addAttribute("pendingOrders", pendingOrders);
		model.addAttribute("printBill", false);
    	
        return "user/sales";
    }
    
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, Model model) {
    	
    	if(result.hasErrors()) {
    		List<ObjectError> list = result.getAllErrors();
    		String errors = "";
    		for (ObjectError objectError : list)
				errors += objectError.getDefaultMessage() + "\n";
    		
    		System.out.println(errors);
    	}
    	
    	dishOrderService.saveOrder(orderForm);
    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders();
    	OrderForm newOrderForm = dishOrderService.createOrder();
    	List<Categories> categoriesList = dishOrderService.getDishItems();
		
		model.addAttribute("dishItems", categoriesList);
    	model.addAttribute("orderForm", newOrderForm);
    	model.addAttribute("pendingOrders", pendingOrders);
    	model.addAttribute("printBill", false);
    	
    	return "user/sales";
    }
    
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.GET)
    public String cancelOrder(@RequestParam("value") String value) {
    	
    	dishOrderService.cancelOrder(value);
    	return "redirect:/user/home";
    }
    
    @RequestMapping(value = "/printOrder", method = RequestMethod.POST)
    public String printOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, Model model) {
    	
    	if(result.hasErrors()) {
    		List<ObjectError> list = result.getAllErrors();
    		String errors = "";
    		for (ObjectError objectError : list)
				errors += objectError.getDefaultMessage() + "\n";
    		
    		System.out.println(errors);
    	}
    	
    	dishOrderService.closeOrder(orderForm);
    	
    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders();
    	OrderForm newOrderForm = dishOrderService.createOrder();
    	List<Categories> categoriesList = dishOrderService.getDishItems();
		
		model.addAttribute("dishItems", categoriesList);
    	model.addAttribute("orderForm", newOrderForm);
    	model.addAttribute("pendingOrders", pendingOrders);
    	model.addAttribute("printBill", true);
    	model.addAttribute("billNum", orderForm.getBillNum());
    	
        return "user/sales";
    }
    
    @RequestMapping(value="/printBill", method=RequestMethod.GET)
    public String printBill(@RequestParam("billNum") String billNum, Model model) {
    	
    	OrderForm orderForm = dishOrderService.printBill(Long.parseLong(billNum));
    	model.addAttribute("orderForm", orderForm);
    	
    	return "user/printBill";
    }
    
    @RequestMapping(value="/openOrder", method=RequestMethod.GET)
    public String openOrder(@RequestParam("value") String value, Model model) {
    	
    	OrderForm orderForm = dishOrderService.printBill(Long.parseLong(value));

    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders();
    	List<Categories> categoriesList = dishOrderService.getDishItems();
		
		model.addAttribute("dishItems", categoriesList);
    	model.addAttribute("orderForm", orderForm);
    	model.addAttribute("pendingOrders", pendingOrders);
    	model.addAttribute("printBill", false);
    	
    	return "user/sales";
    }
    
}