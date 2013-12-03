package com.billing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.dao.ExpensesDao;
import com.billing.model.ExpensesList;
import com.billing.service.ExpensesService;


@Service("expensesService")
public class ExpensesServiceImpl implements ExpensesService {
	
	@Autowired
	private ExpensesDao expensesDao;
	
	
	@Override
	public void saveExpenses(ExpensesList expenses) {
		expensesDao.saveExpenses(expenses);
	}

	@Override
	public ExpensesList getExpenses(String fromDate, String toDate) {
		return expensesDao.getExpenses(fromDate, toDate);
	}

	@Override
	public void updateExpenses(ExpensesList expenses) {
		expensesDao.updateExpenses(expenses);
	}
	
}