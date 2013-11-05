package com.billing.service;

import java.util.List;

import com.billing.model.Supplier;


public interface SupplierService {
	
	void saveSupplier(Supplier supplier);
	Supplier createSupplier();
	List<Supplier> getSupplierList();
	Supplier getSupplier(int id);
	void updateSupplier(Supplier supplier);
	
}