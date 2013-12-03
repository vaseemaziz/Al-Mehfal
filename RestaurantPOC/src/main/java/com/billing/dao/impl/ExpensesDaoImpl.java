package com.billing.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.billing.dao.ExpensesDao;
import com.billing.model.Expenses;
import com.billing.model.ExpensesList;


@Repository("expensesDao")
@Transactional
public class ExpensesDaoImpl implements ExpensesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void saveExpenses(ExpensesList expenses) {
		
		List<Expenses> list = expenses.getExpenses();
		String saveExpensesQuery = "insert into expenses(exp_head, exp_sub_head, exp_details, exp_amount, exp_date, created_by, created_on, last_updated_on, last_updated_by) values(?,?,?,?,?,?,?,?,?)";
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String username = user.getUsername();
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date = dateFormat.format(new Date());
    	
		for(int i=0; i<list.size(); i++) {
			Expenses exp = list.get(i);
			jdbcTemplate.update(saveExpensesQuery, new Object[] {
				exp.getExpHead(), exp.getExpSubHead(), exp.getExpDetails(), exp.getExpAmount(), exp.getExpDate(),
				username, date, "not updated", "not updated"
			});
		}
	}
	
	
	@Override
	public void updateExpenses(ExpensesList expenses) {
		
		List<Expenses> list = expenses.getExpenses();
		String saveExpensesQuery = "insert into expenses(exp_head, exp_sub_head, exp_details, exp_amount, exp_date, last_updated_on, last_updated_by) values(?,?,?,?,?,?,?)";
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String username = user.getUsername();
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date = dateFormat.format(new Date());
    	
		for(int i=0; i<list.size(); i++) {
			Expenses exp = list.get(i);
			jdbcTemplate.update(saveExpensesQuery, new Object[] {
				exp.getExpHead(), exp.getExpSubHead(), exp.getExpDetails(), exp.getExpAmount(), exp.getExpDate(),
				date, username
			});
		}
	}
	
	
	@Override
	public ExpensesList getExpenses(String fromDate, String toDate) {
		
		ExpensesList exp = new ExpensesList();
		
		String query = "select * from expenses where exp_date between ? and ?";
		List<Expenses> list = jdbcTemplate.query(query, new Object[]{fromDate, toDate}, new RowMapper<Expenses>(){
			@Override
			public Expenses mapRow(ResultSet rs, int row) throws SQLException {
				Expenses exp1 = new Expenses();
				exp1.setExpHead(rs.getString("exp_head"));
				exp1.setExpSubHead(rs.getString("exp_sub_head"));
				exp1.setExpDetails(rs.getString("exp_details"));
				exp1.setExpAmount(rs.getDouble("exp_amount"));
				exp1.setExpDate(rs.getString("exp_date"));
				exp1.setCreatedBy(rs.getString("created_by"));
				exp1.setCreatedOn(rs.getString("created_on"));
				return exp1;
			}
		});
		exp.setExpenses(list);
		return exp;
	}
	
}