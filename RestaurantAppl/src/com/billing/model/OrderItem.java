package com.billing.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class OrderItem {
	
	private double itemCost;
	
	@NotNull(message="itemName: should not be null")
	@Pattern(regexp="[a-zA-z]+", message="itemName: invalid pattern")
	private String itemName;
	
	@Pattern(regexp="[0-9]+", message="quantity: invalid pattern")
	@Min(value=1)
	private int quantity;
	
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemCost() {
		return itemCost;
	}
	
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}