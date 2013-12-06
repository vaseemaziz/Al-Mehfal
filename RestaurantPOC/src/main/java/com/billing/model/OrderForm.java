package com.billing.model;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;


public class OrderForm {
	
	private long billNum;
	
	@NotBlank(message="Bill date should not be empty")
	private String billDate;
	
	@Digits(integer=12, fraction=2, message="Bill amount must be a number")
	private double billAmount;
	
	@Digits(integer=12, fraction=2, message="Discount must be a number")
	private double discount;
	
	@Digits(integer=12, fraction=2, message="Net amount must be a number")
	private double billNetAmount;
	
	@NotBlank(message="Created by should not be empty")
	private String createdBy;
	
	@NotBlank(message="Bill type should not be empty")
	private String billType;
	
	private String billStatus;
	private String tableNum;
	private String creditId;
	private String paidAmount;
	
	@NotBlank(message="Select sales type")
	private String salesType;
	
	@NotNull(message="There should be atleast one menu item")
	@Valid
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

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
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

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getTableNum() {
		return tableNum;
	}

	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

	public String getCreditId() {
		return creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getSalesType() {
		return salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	public List<OrderItem> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<OrderItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
}