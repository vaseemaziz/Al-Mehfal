package com.billing.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
    
}