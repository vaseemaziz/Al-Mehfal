package com.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.dao.RawMaterialDao;
import com.billing.model.RawMaterial;
import com.billing.service.RawMaterialService;


@Service("rawMaterialService")
public class RawMaterialServiceImpl implements RawMaterialService {
	
	@Autowired
	private RawMaterialDao rawMaterialDao;
	
	
	@Override
	public void saveRawMaterials(List<RawMaterial> materials) {
		rawMaterialDao.saveRawMaterials(materials);
	}
	
	
	@Override
	public void deleteRawMaterial(String id) {
		rawMaterialDao.deleteRawMaterial(id);
	}
	
	
	@Override
	public List<RawMaterial> getRawMaterials() {
		return rawMaterialDao.getRawMaterials();
	}
	
}