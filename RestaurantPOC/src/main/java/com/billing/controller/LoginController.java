package com.billing.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.billing.model.OrderForm;
import com.billing.service.DishOrderService;


@Controller
public class LoginController {
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String loginPage() {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if(auth instanceof AnonymousAuthenticationToken)
    		return "login";
    	
    	return "redirect:home";
    }
	
    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String homePage(Model model) {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if(auth instanceof AnonymousAuthenticationToken)
    		return "redirect:login";
    	
    	return "home";
    }
    
    
	@Autowired
	private DishOrderService dishOrderService;
	
	
	@RequestMapping(value = "/orderDisplay" , method = RequestMethod.GET)
	public String salesPage(Model model) {
		
    	List<OrderForm> pendingOrders = dishOrderService.getPendingOrders("*");
    	model.addAttribute("pendingOrders", pendingOrders);
    	
        return "orderDisplay";
    }
}