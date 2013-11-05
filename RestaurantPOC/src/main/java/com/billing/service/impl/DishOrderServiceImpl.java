package com.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.dao.DishOrderDao;
import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.OrderForm;
import com.billing.service.DishOrderService;


@Service("dishOrderService")
public class DishOrderServiceImpl implements DishOrderService {
	
	@Autowired
	private DishOrderDao dishOrderDao;
	
	
	@Override
	public List<String> getDineTables() {
		return dishOrderDao.getDineTables();
	}
	
	
	@Override
	public List<Categories> getDishItems() {
		return dishOrderDao.getDishItems();
	}
	
	
	@Override
	public List<OrderForm> getPendingOrders(String userId) {
		return dishOrderDao.getPendingOrders(userId);
	}
	
	
	@Override
	public OrderForm createOrder() {
		return dishOrderDao.createOrder();
	}
	
	
	@Override
	public void saveOrder(OrderForm orderForm) {
		dishOrderDao.saveOrder(orderForm);
	}
	
	
	@Override
	public void closeOrder(OrderForm orderForm) {
		dishOrderDao.closeOrder(orderForm);
	}
	
	
	@Override
	public void cancelOrder(long billNumber) {
		dishOrderDao.cancelOrder(billNumber);
	}
	
	
	@Override
	public BillFormat printCreditBill(String creditId) {
		return dishOrderDao.printCreditBill(creditId);
	}
	
	
	@Override
	public OrderForm openBill(long billNumber) {
		return dishOrderDao.openBill(billNumber);
	}
	
	
	@Override
	public void addCustomer(String name, String address, String mobile) {
		dishOrderDao.addCustomer(name, address, mobile);
	}
	
	
	@Override
	public String verifyCustomer(String verifyMobile) {
		return dishOrderDao.verifyCustomer(verifyMobile);
	}
	
}