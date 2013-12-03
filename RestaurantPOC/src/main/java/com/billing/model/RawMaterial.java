package com.billing.model;

import org.hibernate.validator.constraints.NotBlank;


public class RawMaterial {
	
	private int sno;
	
	@NotBlank(message="Raw material id should not be empty")
	private String id;
	
	@NotBlank(message="Raw material description should not be empty")
	private String desc;
	
	@NotBlank(message="Raw material unit of measure should not be empty")
	private String uom;
	
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}
	
}