package com.billing.model;


import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;


public class OrderItem {
	
	@NotBlank(message="Menu Item: This field is required")
	private String itemName;
	
	@Min(value=1)
	private int quantity;
	
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
	
	
	@Override
	public String toString() {
		return itemName + ", " + quantity + ", " + itemCost;
	}
}