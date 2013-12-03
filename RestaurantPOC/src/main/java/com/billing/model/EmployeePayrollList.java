package com.billing.model;

import java.util.List;


public class EmployeePayrollList {
	
	private List<EmployeePayroll> payrolls;
	private String month;
	private String year;
	
	public List<EmployeePayroll> getPayrolls() {
		return payrolls;
	}
	
	public void setPayrolls(List<EmployeePayroll> payrolls) {
		this.payrolls = payrolls;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
}