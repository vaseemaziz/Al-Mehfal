package com.billing.model;

import java.util.List;
import javax.validation.Valid;


public class ExpensesList {
	
	@Valid
	private List<Expenses> expenses;
	
	
	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}
	
	public List<Expenses> getExpenses() {
		return expenses;
	}
	
}