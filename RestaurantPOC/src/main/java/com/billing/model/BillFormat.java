package com.billing.model;

import java.util.List;

public class BillFormat {
	
	private List<OrderForm> bills;
	private List<String[]> paidBills;
	private double totalBill;
	private double totalPaidBill;
	private String mobile;
	
	
	public List<OrderForm> getBills() {
		return bills;
	}
	
	public void setBills(List<OrderForm> bills) {
		this.bills = bills;
	}
	
	public List<String[]> getPaidBills() {
		return paidBills;
	}
	
	public void setPaidBills(List<String[]> paidBills) {
		this.paidBills = paidBills;
	}
	
	public double getTotalBill() {
		return totalBill;
	}
	
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	public double getTotalPaidBill() {
		return totalPaidBill;
	}
	
	public void setTotalPaidBill(double totalPaidBill) {
		this.totalPaidBill = totalPaidBill;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}