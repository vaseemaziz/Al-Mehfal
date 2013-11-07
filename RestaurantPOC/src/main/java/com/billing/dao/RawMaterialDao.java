package com.billing.dao;

import java.util.List;
import com.billing.model.RawMaterial;


public interface RawMaterialDao {
	
	void saveRawMaterials(List<RawMaterial> materials);
	void deleteRawMaterial(String id);
	List<RawMaterial> getRawMaterials();
	
}