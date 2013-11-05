package com.billing.model;


public class DishItem {
	
	private String itemCode;
	private String itemName;
	private String itemCost;
	
	
	public String getItemCode() {
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemCost() {
		return itemCost;
	}
	
	public void setItemCost(String itemCost) {
		this.itemCost = itemCost;
	}
	
	@Override
	public String toString() {
		return "{ " +
					"\"label\" : \"" + itemName + "\", " +
					"\"value\" : \"" + itemCost + "\" " +
				"}";
	}
	
}