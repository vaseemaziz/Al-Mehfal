package com.billing.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	
    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String setUp(Model model){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	
    	model.addAttribute("username", user.getUsername());
    	return "manager/home";
    }
    
}