package com.billing.dao;

import com.billing.model.Expenses;
import com.billing.model.ExpensesList;


public interface ExpensesDao {
	
	void saveExpenses(Expenses expenses);
	Expenses getExpenses(long id);
	ExpensesList getExpenses(String fromDate, String toDate);
	void updateExpenses(Expenses expenses);
	
}