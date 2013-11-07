package com.billing.service;

import java.util.List;
import com.billing.model.RawMaterial;


public interface RawMaterialService {

	void saveRawMaterials(List<RawMaterial> materials);
	void deleteRawMaterial(String id);
	List<RawMaterial> getRawMaterials();
}
