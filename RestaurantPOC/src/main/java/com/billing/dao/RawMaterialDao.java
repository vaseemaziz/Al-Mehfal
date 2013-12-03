package com.billing.dao;

import java.util.List;
import com.billing.model.RawMaterial;


public interface RawMaterialDao {
	
	void saveRawMaterials(List<RawMaterial> materials);
	List<RawMaterial> getRawMaterials();
	void editRawMaterial(RawMaterial rawMaterial);
	
}