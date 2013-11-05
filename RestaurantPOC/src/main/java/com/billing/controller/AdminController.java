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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.OrderForm;
import com.billing.model.RawMaterialList;
import com.billing.model.Supplier;
import com.billing.service.DishOrderService;
import com.billing.service.RawMaterialService;
import com.billing.service.SupplierService;


@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	@Autowired
	private DishOrderService dishOrderService;
	@Autowired
	private RawMaterialService rawMaterialService;
	@Autowired
	private SupplierService supplierService;
	
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String homePage(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	
    	String username = user.getUsername();
    	model.addAttribute("user", username);
    	
    	return "home";
    }
	
	
	@RequestMapping(value = "/sales" , method = RequestMethod.GET)
	public String salesPage(Model model) {
		if(model.containsAttribute("billToPrint")) {
			return "sales";
		}
		
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
    	
        return "sales";
    }
	
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, Model model) {
		System.out.println(orderForm.getBillType());
    	if(!orderForm.getSalesType().equals("Al-a-Carte"))
    		orderForm.setTableNum("-");
    	
    	if(result.hasErrors()) {
    		List<ObjectError> list = result.getAllErrors();
    		String errors = "";
    		for (ObjectError objectError : list)
				errors += objectError.getDefaultMessage() + "\n";
    		System.out.println(errors);
    	}
    	
    	dishOrderService.saveOrder(orderForm);
    	return "redirect:/admin/sales";
    }
	
	
	@RequestMapping(value = "/cancelOrder", method = RequestMethod.GET)
    public String cancelOrder(@RequestParam("value") String value) {
    	dishOrderService.cancelOrder(Long.parseLong(value));
    	return "redirect:/admin/sales";
    }
	
	
    @RequestMapping(value = "/printOrder", method = RequestMethod.POST)
    public String printOrder(@ModelAttribute("orderForm") @Valid OrderForm orderForm, BindingResult result, 
    		Model model, RedirectAttributes redirectAttrs) {
    	if(!orderForm.getSalesType().equals("Al-a-Carte"))
    		orderForm.setTableNum("-");
    	
    	if(result.hasErrors()) {
    		List<ObjectError> list = result.getAllErrors();
    		String errors = "";
    		for (ObjectError objectError : list)
				errors += objectError.getDefaultMessage() + "\n";
    		
    		System.out.println(errors);
    	}
    	
    	dishOrderService.closeOrder(orderForm);
    	redirectAttrs.addFlashAttribute("billToPrint", true);
		redirectAttrs.addFlashAttribute("orderForm", orderForm);
    	return "redirect:/admin/sales";
    }
    
    
    @RequestMapping(value="/printBill", method=RequestMethod.GET)
    public String printBill(@RequestParam("billNum") String billNum, Model model) {
    	OrderForm orderForm= dishOrderService.openBill(Long.parseLong(billNum));
    	model.addAttribute("orderForm", orderForm);
    	return "printBill";
    }
    
    
    @RequestMapping(value="/printCreditBill", method=RequestMethod.GET)
    public String printCreditBill(@RequestParam("creditId") String creditId, Model model) {
    	BillFormat billFormat = dishOrderService.printCreditBill(creditId);
    	model.addAttribute("billFormat", billFormat);
    	return "printCreditBill";
    }
    
    
    @RequestMapping(value="/openOrder", method=RequestMethod.GET)
    public String openOrder(@RequestParam("bill") String value, Model model, RedirectAttributes redirectAttrs) {
    	
    	OrderForm orderForm = dishOrderService.openBill(Long.parseLong(value));
    	redirectAttrs.addFlashAttribute("billToOpen", true);
		redirectAttrs.addFlashAttribute("orderForm", orderForm);
    	return "redirect:/admin/sales";
    }
    
    
    @RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public @ResponseBody String addCustomer(
		@RequestParam(value="name", required=true) String name,
		@RequestParam(value="address", required=true) String address,
		@RequestParam(value="mobile", required=true) String mobile) {
		
		dishOrderService.addCustomer(name, address, mobile);
		return "Successfully Added";
	}
	
	
	@RequestMapping(value="/verifyCustomer", method=RequestMethod.POST)
	public @ResponseBody String verifyCustomer(
		@RequestParam(value="verifyMobile", required=true) String verifyMobile) {
		
		String name = dishOrderService.verifyCustomer(verifyMobile);
		if(name=="")
			return "No record found";
		return name;
	}
	
	
	@RequestMapping(value="/rawMaterials", method=RequestMethod.GET)
	public String rawMaterialsPage(Model model) {
		return "rawMaterials";
	}
	
	
	@RequestMapping(value="/saveRawMaterials", method=RequestMethod.POST)
	public String saveRawMaterialsPage(@ModelAttribute("materials") RawMaterialList materials, Model model) {
		rawMaterialService.saveRawMaterials(materials.getMaterials());
		model.addAttribute("url", "rawMaterials");
		return "success";
	}
	
	
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public String suppliers(Model model) {
		Supplier supplier = supplierService.createSupplier();
		model.addAttribute("supplier", supplier);
		return "suppliers";
	}
	
	
	@RequestMapping(value="/editSupplier", method=RequestMethod.GET)
	public String editSupplier(@RequestParam("id") String id, Model model) {
		Supplier supplier = supplierService.getSupplier(Integer.parseInt(id));
		model.addAttribute("supplier", supplier);
		return "editSuppliers";
	}
	
	
	@RequestMapping(value="/saveSupplier", method=RequestMethod.POST)
	public String saveSupplier(@ModelAttribute("suppier") Supplier supplier, Model model) {
		supplierService.saveSupplier(supplier);
		model.addAttribute("url", "suppliers");
		return "success";
	}
	
	
	@RequestMapping(value="/updateSupplier", method=RequestMethod.POST)
	public String updateSupplier(@ModelAttribute("suppier") Supplier supplier, Model model) {
		supplierService.updateSupplier(supplier);
		model.addAttribute("url", "suppliers");
		model.addAttribute("message","Updated Successfully");
		return "success";
	}
	
	
	@RequestMapping(value="/listSuppliers", method=RequestMethod.POST)
	public String listSupplier(Model model) {
		List<Supplier> list = supplierService.getSupplierList();
		model.addAttribute("list", list);
		return "showSuppliers";
	}
	
}