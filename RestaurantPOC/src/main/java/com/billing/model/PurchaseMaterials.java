package com.billing.model;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;


public class PurchaseMaterials {
	
	@NotBlank(message="Raw material id should not be empty")
	private String rawMaterialId;
	
	@NotBlank(message="Raw material description should not be empty")
	private String rawMaterialDesc;
	
	@NotBlank(message="Raw material uom should not be empty")
	private String rawMaterialUom;
	
	@Min(value=1)
	private int rawMaterialQty;
	
	private double rawMaterialAmount;
	
	
	public String getRawMaterialId() {
		return rawMaterialId;
	}
	
	public void setRawMaterialId(String rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}
	
	
	public String getRawMaterialDesc() {
		return rawMaterialDesc;
	}
	
	public void setRawMaterialDesc(String rawMaterialDesc) {
		this.rawMaterialDesc = rawMaterialDesc;
	}
	
	
	public String getRawMaterialUom() {
		return rawMaterialUom;
	}
	
	public void setRawMaterialUom(String rawMaterialUom) {
		this.rawMaterialUom = rawMaterialUom;
	}
	
	
	public int getRawMaterialQty() {
		return rawMaterialQty;
	}
	
	public void setRawMaterialQty(int rawMaterialQty) {
		this.rawMaterialQty = rawMaterialQty;
	}
	
	
	public double getRawMaterialAmount() {
		return rawMaterialAmount;
	}
	
	public void setRawMaterialAmount(double rawMaterialAmount) {
		this.rawMaterialAmount = rawMaterialAmount;
	}
	
}