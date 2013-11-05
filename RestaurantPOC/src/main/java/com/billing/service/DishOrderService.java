package com.billing.service;

import java.util.List;

import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.OrderForm;


public interface DishOrderService {
	
	List<String> getDineTables();
	List<Categories> getDishItems();
	
	List<OrderForm> getPendingOrders(String userId);
	OrderForm createOrder();
	void saveOrder(OrderForm orderForm);
	void closeOrder(OrderForm orderForm);
	void cancelOrder(long billNumber);
	
	OrderForm openBill(long billNumber);
	BillFormat printCreditBill(String creditId);
	
	void addCustomer(String name, String address, String mobile);
	String verifyCustomer(String verifyMobile);
	
}
