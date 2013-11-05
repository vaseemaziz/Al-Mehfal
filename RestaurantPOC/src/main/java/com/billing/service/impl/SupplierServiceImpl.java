package com.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.dao.SupplierDao;
import com.billing.model.Supplier;
import com.billing.service.SupplierService;


@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierDao supplierDao;
	
	
	@Override
	public void saveSupplier(Supplier supplier) {
		supplierDao.saveSupplier(supplier);
	}
	
	
	@Override
	public Supplier createSupplier() {
		return supplierDao.createSupplier();
	}
	
	
	@Override
	public List<Supplier> getSupplierList() {
		return supplierDao.getSupplierList();
	}
	
	
	@Override
	public Supplier getSupplier(int id) {
		return supplierDao.getSupplier(id);
	}
	
	
	@Override
	public void updateSupplier(Supplier supplier) {
		supplierDao.updateSupplier(supplier);
	}
	
}