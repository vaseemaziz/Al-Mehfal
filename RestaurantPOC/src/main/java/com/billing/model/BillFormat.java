package com.billing.model;

import java.util.List;

public class BillFormat {
	
	private List<OrderForm> bills;
	private double totalBill;
	private String mobile;
	
	
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	public double getTotalBill() {
		return totalBill;
	}
	
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	
	public void setBills(List<OrderForm> bills) {
		this.bills = bills;
	}
	
	public List<OrderForm> getBills() {
		return bills;
	}
	
}