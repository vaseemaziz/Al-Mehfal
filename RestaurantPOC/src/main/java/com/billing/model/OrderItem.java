package com.billing.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;


public class OrderItem {
	
	@NotBlank(message="Menu item should not be empty")
	private String itemName;
	
	@Min(value=1, message="Quantity must be greater than 1")
	private int quantity;
	
	@Digits(integer=12, fraction=2)
	private double itemCost;
	
	
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