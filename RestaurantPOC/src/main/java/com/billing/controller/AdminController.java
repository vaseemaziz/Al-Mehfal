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
import com.billing.model.Employee;
import com.billing.model.EmployeePayroll;
import com.billing.model.EmployeePayrollList;
import com.billing.model.Expenses;
import com.billing.model.ExpensesList;
import com.billing.model.OrderForm;
import com.billing.model.Purchases;
import com.billing.model.RawMaterial;
import com.billing.model.RawMaterialList;
import com.billing.model.Supplier;
import com.billing.service.DishOrderService;
import com.billing.service.EmployeeService;
import com.billing.service.ExpensesService;
import com.billing.service.PurchasesService;
import com.billing.service.RawMaterialService;
import com.billing.service.SupplierService;


@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	@Autowired
	private DishOrderService dishOrderService;
	
	
	@RequestMapping(value = "/sales" , method = RequestMethod.GET)
	public String salesPage(Model model) {
		
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
    		return "redirect:/admin/sales";
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
    		return "redirect:/admin/sales";
    	}
    	
    	dishOrderService.closeOrder(orderForm);
    	redirectAttributes.addFlashAttribute("billToPrint", true);
		redirectAttributes.addFlashAttribute("orderForm", orderForm);
    	return "redirect:/admin/sales";
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
    	return "redirect:/admin/sales";
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
    	model.addAttribute("url", "/admin/creditDetails");
		model.addAttribute("message", "Bill Updated");
		return "success";
	}
	
	
	
	
	
	@RequestMapping(value="/records", method=RequestMethod.GET)
	public String records(Model model) {
		return "redirect:/admin/rawMaterials";
	}
	
	
	
	
	
	@Autowired
	private RawMaterialService rawMaterialService;
	
	
	@RequestMapping(value="/rawMaterials", method=RequestMethod.GET)
	public String rawMaterialsPage(Model model) {
		model.addAttribute("mode", "save");
		return "rawMaterials";
	}
	
	
	@RequestMapping(value="/editRawMaterial", method=RequestMethod.POST)
	public String editRawMaterialPage(@ModelAttribute("editRawMaterial") RawMaterial editRawMaterial, Model model) {
		rawMaterialService.editRawMaterial(editRawMaterial);
		model.addAttribute("url", "/admin/rawMaterials");
		model.addAttribute("message", "Successfully updated");
		return "success";
	}
	
	
	@RequestMapping(value="/saveRawMaterials", method=RequestMethod.POST)
	public String saveRawMaterialsPage(@ModelAttribute("materials") @Valid RawMaterialList materials, BindingResult result,
			Model model, RedirectAttributes redirectAttributes) {
		
    	if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/admin/rawMaterials";
    	}
    	
		rawMaterialService.saveRawMaterials(materials.getMaterials());
		model.addAttribute("url", "/admin/rawMaterials");
		model.addAttribute("message", "Successfully added");
		return "success";
	}
	
	
	@RequestMapping(value="/viewRawMaterials", method=RequestMethod.GET)
	public String viewRawMaterialsPage(Model model) {
		List<RawMaterial> list = rawMaterialService.getRawMaterials();
		model.addAttribute("mode", "view");
		model.addAttribute("list", list);
		return "rawMaterials";
	}
	
	
	
	
	@Autowired
	private SupplierService supplierService;
	
	
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public String suppliers(Model model) {
		Supplier supplier = supplierService.createSupplier();
		model.addAttribute("supplier", supplier);
		model.addAttribute("url", "saveSupplier");
		return "suppliers/suppliers";
	}
	
	
	@RequestMapping(value="/editSupplier", method=RequestMethod.GET)
	public String editSupplier(@RequestParam("id") String id, Model model) {
		Supplier supplier = supplierService.getSupplier(Integer.parseInt(id));
		model.addAttribute("supplier", supplier);
		model.addAttribute("url", "updateSupplier");
		return "suppliers/suppliers";
	}
	
	
	@RequestMapping(value="/saveSupplier", method=RequestMethod.POST)
	public String saveSupplier(@ModelAttribute("suppier") @Valid Supplier supplier, BindingResult result,
			Model model, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/admin/suppliers";
		}
		
		supplierService.saveSupplier(supplier);
		model.addAttribute("url", "/admin/suppliers");
		model.addAttribute("message","Saved successfully");
		return "success";
	}
	
	
	@RequestMapping(value="/updateSupplier", method=RequestMethod.POST)
	public String updateSupplier(@ModelAttribute("suppier") @Valid Supplier supplier, BindingResult result,
			Model model, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/admin/suppliers";
		}
		
		supplierService.updateSupplier(supplier);
		model.addAttribute("url", "/admin/suppliers");
		model.addAttribute("message","Updated successfully");
		return "success";
	}
	
	
	@RequestMapping(value="/listSuppliers", method=RequestMethod.GET)
	public String listSupplier(Model model) {
		List<Supplier> list = supplierService.getSupplierList();
		model.addAttribute("list", list);
		return "suppliers/showSuppliers";
	}
	
	
	
	
	
	@Autowired
	private PurchasesService purchasesService;
	
	
	@RequestMapping(value="/purchases", method=RequestMethod.GET)
	public String purchases(Model model) {
		Purchases purchases = purchasesService.createPurchase();
		model.addAttribute("purchases", purchases);
		model.addAttribute("amounts", purchasesService.getPurchasesAmounts());
		model.addAttribute("materials", rawMaterialService.getRawMaterials());
		return "purchases/purchases";
	}
	
	@RequestMapping(value="/savePurchases", method=RequestMethod.POST)
	public String savePurchases(@ModelAttribute("purchases") @Valid Purchases purchases, BindingResult result,
			Model model, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
    		List<FieldError> list = result.getFieldErrors();
    		List<String> errors = new ArrayList<String>();
    		for (FieldError fieldError : list)
				errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
    		
    		System.out.println(errors);
    		redirectAttributes.addFlashAttribute("errors", errors);
    		return "redirect:/admin/purchases";
    		
    	}
		
		purchasesService.savePurchases(purchases);
		model.addAttribute("url", "/admin/purchases");
		model.addAttribute("message", "Saved successfully");
		return "success";
	}
	
	
	@RequestMapping(value="/findPurchases", method=RequestMethod.GET)
	public String findPurchases(Model model) {
		List<Supplier> list = supplierService.getSupplierList();
		model.addAttribute("suppliersList", list);
		return "purchases/findPurchases";
	}
	
	
	@RequestMapping(value="/getPurchases", method=RequestMethod.POST)
	public String getPurchases(@RequestParam("pDate") String pDate,
			@RequestParam("toDate") String toDate,
			@RequestParam("sNum") String supplierNum, Model model, RedirectAttributes redirectAttrs) {
		
		List<Purchases> purchases = purchasesService.findPurchases(pDate, toDate, supplierNum);
		redirectAttrs.addFlashAttribute("pDate", pDate);
		redirectAttrs.addFlashAttribute("toDate", toDate);
		redirectAttrs.addFlashAttribute("sNum", supplierNum);
		redirectAttrs.addFlashAttribute("list", purchases);
		
		return "redirect:/admin/findPurchases";
	}
	
	
	
	
	
	
	@Autowired
	private ExpensesService expensesService;
	
	
	@RequestMapping(value="/expenses", method=RequestMethod.GET)
	public String expenses(Model model) {
		Expenses exp = new Expenses();
		model.addAttribute("expenses", exp);
		model.addAttribute("url", "saveExpenses");
		return "expenses/expenses";
	}
	
	@RequestMapping(value="/saveExpenses", method=RequestMethod.POST)
	public String saveExpenses(@ModelAttribute("expenses") Expenses expenses, Model model) {
		expensesService.saveExpenses(expenses);
		model.addAttribute("url", "/admin/expenses");
		model.addAttribute("message","Saved Successfully");
		return "success";
	}
	
	@RequestMapping(value="/editExpenses", method=RequestMethod.GET)
	public String editExpenses(@RequestParam("id") String id, Model model) {
		Expenses exp = expensesService.getExpenses(Long.parseLong(id));
		model.addAttribute("expenses", exp);
		model.addAttribute("url", "updateExpenses");
		return "expenses/expenses";
	}
	
	@RequestMapping(value="/updateExpenses", method=RequestMethod.POST)
	public String updateExpenses(@ModelAttribute("expenses") Expenses expenses, Model model) {
		expensesService.updateExpenses(expenses);
		model.addAttribute("url", "/admin/expenses");
		model.addAttribute("message","Updated Successfully");
		return "success";
	}
	
	@RequestMapping(value="/viewExpenses", method=RequestMethod.GET)
	public String viewExpenses(Model model) {
		return "expenses/viewExpenses";
	}
	
	@RequestMapping(value="/getExpenses", method=RequestMethod.POST)
	public String getExpenses(
			@RequestParam("fDate") String fromDate,
			@RequestParam("tDate") String toDate, Model model,
			RedirectAttributes redirectAttribs) {
		
		ExpensesList list = expensesService.getExpenses(fromDate, toDate);
		redirectAttribs.addFlashAttribute("fDate", fromDate);
		redirectAttribs.addFlashAttribute("tDate", toDate);
		redirectAttribs.addFlashAttribute("list", list);
		return "redirect:/admin/viewExpenses";
	}
	
	
	
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public String employees(Model model) {
		Employee emp = new Employee();
		model.addAttribute("url", "/saveEmployee");
		model.addAttribute("emp", emp);
		return "employees/employees";
	}
	
	@RequestMapping(value="/editEmployee", method=RequestMethod.GET)
	public String editEmployee(@RequestParam("id") String id, Model model) {
		Employee emp = employeeService.getEmployee(id);
		model.addAttribute("url", "/updateEmployee");
		model.addAttribute("emp", emp);
		return "employees/employees";
	}
	
	@RequestMapping(value="/deleteEmployee", method=RequestMethod.GET)
	public String deleteEmployee(@RequestParam("id") String id, Model model) {
		employeeService.deleteEmployee(id);
		return "employees/showEmployees";
	}
	
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		employeeService.saveEmployee(employee);
		model.addAttribute("url", "/admin/employees");
		model.addAttribute("message", "Saved successfully");
		return "success";
	}
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	public String editEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		employeeService.updateEmployee(employee);
		model.addAttribute("url", "/admin/employees");
		model.addAttribute("message", "Updated successfully");
		return "success";
	}
	
	@RequestMapping(value="/showEmployees", method=RequestMethod.GET)
	public String showEmployess(Model model) {
		List<Employee> list = employeeService.getEmployeeList();
		model.addAttribute("list", list);
		return "employees/showEmployees";
	}
	
	@RequestMapping(value="/payrolls", method=RequestMethod.GET)
	public String payrolls(Model model) {
		return "employees/payrolls";
	}
	
	
	@RequestMapping(value="/findPayrolls", method=RequestMethod.POST)
	public String findPayrolls(RedirectAttributes redirectAttributes, Model model,
			@RequestParam("month") String month,
			@RequestParam("year") String year) {
		
		String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		Calendar cal = Calendar.getInstance();
		List<EmployeePayroll> payrolls = employeeService.getPayrolls(month + " " + year);
		
		if(month.equals(months[cal.get(Calendar.MONTH)]) && year.equals(""+cal.get(Calendar.YEAR)) && payrolls.size() <= 0) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    	User user = (User) auth.getPrincipal();
	    	model.addAttribute("user", user.getUsername());
	    	
			List<Employee> emp = employeeService.getEmployeeList();
			model.addAttribute("empList", emp);
			model.addAttribute("month", month);
			model.addAttribute("year", year);
			
			return "employees/employeePayroll";
		}
		
		redirectAttributes.addFlashAttribute("month", month);
		redirectAttributes.addFlashAttribute("year", year);
		redirectAttributes.addFlashAttribute("payrolls", payrolls);
		return "redirect:/admin/payrolls";
	}
	
	@RequestMapping(value="/savePayroll", method=RequestMethod.POST)
	public String savePayroll(@ModelAttribute("payrolls") EmployeePayrollList payrolls, Model model) {
		employeeService.savePayrolls(payrolls);
		model.addAttribute("url", "/admin/payrolls");
		model.addAttribute("message", "Saved Successfully");
		return "success";
	}
	
	
	@RequestMapping(value="/salesReports", method=RequestMethod.GET)
	public String reports() {
		return "salesReports";
	}
	
	
	@RequestMapping(value="/dateWiseReport", method=RequestMethod.POST)
	public String report1(@RequestParam("fDate") String fDate, @RequestParam("tDate") String tDate, Model model) {
		List<String[]> list = dishOrderService.getSalesReport1(fDate, tDate);
		model.addAttribute("fDate",fDate);
		model.addAttribute("tDate",tDate);
		model.addAttribute("list", list);
		return "salesReportsDateWise";
	}
	
	
	@RequestMapping(value="/monthWiseReport", method=RequestMethod.POST)
	public String report2(@RequestParam("year") String year, @RequestParam("fMonth") String fMonth, @RequestParam("tMonth") String tMonth, Model model) {
		List<String[]> list = dishOrderService.getSalesReport2(fMonth, tMonth, year);
		model.addAttribute("year", year);
		String calendar[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		fMonth = calendar[Integer.parseInt(fMonth)-1];
		tMonth = calendar[Integer.parseInt(tMonth)-1];
		model.addAttribute("fMonth",fMonth);
		model.addAttribute("tMonth",tMonth);
		model.addAttribute("list", list);
		return "salesReportsMonthWise";
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
    	System.out.println(daysInMonth + ": " + days);
		
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