package com.billing.model;


public class EmployeePayroll {
	
	private int regNum;
	private String name;
	private double basicSalary;
	private double grossPay;
	private double loanDeduction;
	private double otherDeduction;
	private double netSalary;
	private String createdBy;
	private String createdOn;
	private String lastUpdatedBy;
	private String lastUpdatedOn;
	private String payrollDate;
	
	
	public int getRegNum() {
		return regNum;
	}
	
	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double getGrossPay() {
		return grossPay;
	}
	
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	
	public double getLoanDeduction() {
		return loanDeduction;
	}
	
	public void setLoanDeduction(double loanDeduction) {
		this.loanDeduction = loanDeduction;
	}
	
	public double getOtherDeduction() {
		return otherDeduction;
	}
	
	public void setOtherDeduction(double otherDeduction) {
		this.otherDeduction = otherDeduction;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	public String getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	
	public void setLastUpdatedOn(String lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	public String getPayrollDate() {
		return payrollDate;
	}
	
	public void setPayrollDate(String payrollDate) {
		this.payrollDate = payrollDate;
	}
	
}