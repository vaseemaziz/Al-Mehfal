package com.billing.model;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;


public class OrderForm {
	
	private long billNum;
	private String billDate;
	private double billAmount;
	private double discount;
	private double billNetAmount;
	private String createdBy;
	
	@NotBlank(message="Select a sales type")
	private String salesType;
	
	@NotBlank(message="Select a table number")
	private String tableNum;
	
	@NotNull @Valid
	private List<OrderItem> orderedItems;
	
	
	public long getBillNum() {
		return billNum;
	}
	
	public void setBillNum(long billNum) {
		this.billNum = billNum;
	}
	
	
	public String getBillDate() {
		return billDate;
	}
	
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	public double getBillNetAmount() {
		return billNetAmount;
	}
	
	public void setBillNetAmount(double billNetAmount) {
		this.billNetAmount = billNetAmount;
	}
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	public String getSalesType() {
		return salesType;
	}
	
	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}
	
	
	public String getTableNum() {
		return tableNum;
	}
	
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	
	
	public List<OrderItem> getOrderedItems() {
		return orderedItems;
	}
	
	public void setOrderedItems(List<OrderItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
	
	@Override
	public String toString() {
		String str = billNum + ", " + billDate + ", " + billAmount + ", " + discount + ", " + billNetAmount + ", " +  
						createdBy + ", " + salesType + ", " + tableNum + ", " + orderedItems;
		return str;
	}
}