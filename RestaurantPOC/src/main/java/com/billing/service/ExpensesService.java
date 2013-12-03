package com.billing.service;

import com.billing.model.ExpensesList;


public interface ExpensesService {
	
	void saveExpenses(ExpensesList expenses);
	ExpensesList getExpenses(String fromDate, String toDate);
	void updateExpenses(ExpensesList expenses);
	
}
