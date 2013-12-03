package com.billing.service;

import java.util.List;
import com.billing.model.RawMaterial;


public interface RawMaterialService {

	void saveRawMaterials(List<RawMaterial> materials);
	List<RawMaterial> getRawMaterials();
	void editRawMaterial(RawMaterial rawMaterial);
	
}
