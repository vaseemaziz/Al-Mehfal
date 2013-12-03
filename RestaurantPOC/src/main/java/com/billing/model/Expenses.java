package com.billing.model;

import org.hibernate.validator.constraints.NotBlank;


public class Expenses {
	
	@NotBlank
	private String expHead;
	
	@NotBlank
	private String expSubHead;
	
	@NotBlank
	private String expDetails;
	
	@NotBlank
	private double expAmount;
	
	@NotBlank
	private String expDate;
	
	@NotBlank
	private String createdBy;
	
	@NotBlank
	private String createdOn;
	
	private String lastUpdatedOn;
	private String lastUpdatedBy;
	
	
	public String getExpHead() {
		return expHead;
	}
	
	public void setExpHead(String expHead) {
		this.expHead = expHead;
	}
	
	
	public String getExpSubHead() {
		return expSubHead;
	}
	
	public void setExpSubHead(String expSubHead) {
		this.expSubHead = expSubHead;
	}
	
	
	public String getExpDetails() {
		return expDetails;
	}
	
	public void setExpDetails(String expDetails) {
		this.expDetails = expDetails;
	}
	
	
	public double getExpAmount() {
		return expAmount;
	}
	
	public void setExpAmount(double expAmount) {
		this.expAmount = expAmount;
	}
	
	
	public String getExpDate() {
		return expDate;
	}
	
	public void setExpDate(String expDate) {
		this.expDate = expDate;
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
	
	
	public String getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	
	public void setLastUpdatedOn(String lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
}