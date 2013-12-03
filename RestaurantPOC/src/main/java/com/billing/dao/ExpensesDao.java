package com.billing.dao;

import com.billing.model.ExpensesList;


public interface ExpensesDao {
	
	void saveExpenses(ExpensesList expenses);
	ExpensesList getExpenses(String fromDate, String toDate);
	void updateExpenses(ExpensesList expenses);
	
}