package com.billing.dao;

import java.util.List;

import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.OrderForm;


public interface DishOrderDao {
	
	List<String> getDineTables();
	List<Categories> getDishItems();
	
	List<OrderForm> getPendingOrders(String userId);
	OrderForm createOrder();
	void saveOrder(OrderForm orderForm);
	void closeOrder(OrderForm orderForm);
	void cancelOrder(long billNumber);
	
	OrderForm openBill(long billNumber);
	BillFormat printCreditBill(String creditId);
	
	boolean addCustomer(String name, String address, String mobile);
	String verifyCustomer(String verifyMobile);
	List<String[]> getCustomerDetails();
	void payBill(String mobile, String paidAmount);
	
	List<String[]> getSalesReport1(String toFrom, String toDate);
	List<String[]> getSalesReport2(String fromMonth, String toMonth, String year);
	
}