package com.billing.model;

import org.hibernate.validator.constraints.NotBlank;


public class Supplier {
	
	private int supplierNum;
	
	@NotBlank
	private String supplierName;
	
	private String createdBy;
	private String createdOn;
	private String lastUpdatedBy;
	private String lastUpdatedOn;
	
	
	private String firstContactName;
	private String firstContactNum;
	private String firstMobileNum;
	
	private String secondContactName;
	private String secondContactNum;
	private String secondMobileNum;
	
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	
	
	public Supplier() {
		supplierName = "";
		firstContactName = "";
		firstContactNum = "";
		firstMobileNum = "";
		secondContactName = "";
		secondContactNum = "";
		secondMobileNum = "";
		addressLine1 = "";
		addressLine2 = "";
		addressLine3 = "";
	}
	
	
	public int getSupplierNum() {
		return supplierNum;
	}
	
	public void setSupplierNum(int supplierNum) {
		this.supplierNum = supplierNum;
	}
	
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	
	
	public String getFirstContactName() {
		return firstContactName;
	}
	
	public void setFirstContactName(String firstContactName) {
		this.firstContactName = firstContactName;
	}
	
	
	public String getFirstContactNum() {
		return firstContactNum;
	}
	
	public void setFirstContactNum(String firstContactNum) {
		this.firstContactNum = firstContactNum;
	}
	
	
	public String getFirstMobileNum() {
		return firstMobileNum;
	}
	
	public void setFirstMobileNum(String firstMobileNum) {
		this.firstMobileNum = firstMobileNum;
	}
	
	
	public String getSecondMobileNum() {
		return secondMobileNum;
	}
	
	public void setSecondMobileNum(String secondMobileNum) {
		this.secondMobileNum = secondMobileNum;
	}
	
	
	public String getSecondContactName() {
		return secondContactName;
	}
	
	public void setSecondContactName(String secondContactName) {
		this.secondContactName = secondContactName;
	}
	
	
	public String getSecondContactNum() {
		return secondContactNum;
	}
	
	public void setSecondContactNum(String secondContactNum) {
		this.secondContactNum = secondContactNum;
	}


	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	
	public String getAddressLine2() {
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	
	public String getAddressLine3() {
		return addressLine3;
	}
	
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	
}