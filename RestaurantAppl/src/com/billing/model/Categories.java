package com.billing.model;

import java.util.List;


public class Categories {
	
	private String code;
	private String description;
	private List<DishItem> dishItems;
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<DishItem> getDishItems() {
		return dishItems;
	}
	
	public void setDishItems(List<DishItem> dishItems) {
		this.dishItems = dishItems;
	}
	
}