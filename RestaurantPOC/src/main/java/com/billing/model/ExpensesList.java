package com.billing.model;

import java.util.List;


public class ExpensesList {
	
	private List<Expenses> expenses;
	
	
	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}
	
	public List<Expenses> getExpenses() {
		return expenses;
	}
	
}