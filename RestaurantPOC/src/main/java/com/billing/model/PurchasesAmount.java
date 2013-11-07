package com.billing.model;


public class PurchasesAmount {
	
	private int supplierNum;
	private String supplierName;
	private double amount;
	private String invoiceDate;
	
	
	public void setSupplierNum(int supplierNum) {
		this.supplierNum = supplierNum;
	}
	
	public int getSupplierNum() {
		return supplierNum;
	}
	
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	public String getInvoiceDate() {
		return invoiceDate;
	}
	
}