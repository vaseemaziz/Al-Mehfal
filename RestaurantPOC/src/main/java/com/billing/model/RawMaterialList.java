package com.billing.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public class RawMaterialList {
	
	@NotNull @Valid
	private List<RawMaterial> materials;
	
	
	public void setMaterials(List<RawMaterial> materials) {
		this.materials = materials;
	}
	
	public List<RawMaterial> getMaterials() {
		return materials;
	}
	
}