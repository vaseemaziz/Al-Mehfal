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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billing.model.DishItem;
import com.billing.model.OrderForm;
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
    	
    	model.addAttribute("username", user.getUsername());
        return "user/home";
    }
    
    @RequestMapping(value = "/getDishList", method = RequestMethod.GET)
    public String getDishList(@RequestParam("term") String query, Model model) {
    	
    	List<DishItem> dishList = dishItemService.getDishList(query);
    	model.addAttribute("list", dishList);
    	
    	return "user/dishList";
    }
    
    @RequestMapping(value = "/sales" , method = RequestMethod.GET)
    public String salesPage(Model model) {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	
    	OrderForm orderForm = dishOrderService.newOrder(user.getUsername());
    	model.addAttribute("orderForm", orderForm);
    	
    	return "user/sales";
    }
    
    @RequestMapping(value = "/saveOrder" , method = RequestMethod.POST)
    public @ResponseBody String orderPage(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, Model model) {
    	
    	if(result.hasErrors()) {
    		return "{\"name\": \"error\", \"value\": \"Order Form has errors\"}";
    	}
    	
    	String msg = dishOrderService.saveOrder(orderForm);
    	if(msg.equals("error")) {
    		dishOrderService.deleteOrder(orderForm.getBillNum());
    		return "{\"name\": \"error\", \"value\": \"Order Form has errors\"}";
    	}
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) auth.getPrincipal();
        
    	OrderForm newOrderForm = dishOrderService.newOrder(user.getUsername());
    	String str = "{\"name\": \"success\", \"value\": \"Order saved\"," +
    					"\"newBillNum\": \"" + newOrderForm.getBillNum() + "\" ," + 
    					"\"newBillDate\": \"" + newOrderForm.getDate() + "\" }";
    	
    	return str;
    }
    
}