package com.billing.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;


public class Purchases {
	
	private long grnNo;
	
	@NotBlank(message="Purchase date should not be empty")
	private String purchaseDate;
	
	@Min(value=1)
	private int supplierNum;
	
	@NotBlank(message="Supplier name should not be empty")
	private String supplierName;
	
	@NotBlank(message="Invoice number should not be empty")
	private String invoiceNum;
	
	@NotBlank(message="Invoice date should not be empty")
	private String invoiceDate;
	
	private double invoiceAmount;
	private double paidAmount;
	
	@NotBlank(message="Created on should not be empty")
	private String createdOn;
	
	@NotBlank(message="Created by id should not be empty")
	private String createdBy;
	
	private double totalAmount;
	
	@Valid
	private List<PurchaseMaterials> materials;
	
	
	public long getGrnNo() {
		return grnNo;
	}
	
	public void setGrnNo(long grnNo) {
		this.grnNo = grnNo;
	}
	
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
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
	
	
	public String getInvoiceNum() {
		return invoiceNum;
	}
	
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	
	
	public String getInvoiceDate() {
		return invoiceDate;
	}
	
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	
	
	public double getPaidAmount() {
		return paidAmount;
	}
	
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	
	public String getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public List<PurchaseMaterials> getMaterials() {
		return materials;
	}
	
	public void setMaterials(List<PurchaseMaterials> materials) {
		this.materials = materials;
	}
	
}