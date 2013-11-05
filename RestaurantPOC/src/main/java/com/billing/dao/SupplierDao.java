package com.billing.dao;

import java.util.List;
import com.billing.model.Supplier;


public interface SupplierDao {
	
	void saveSupplier(Supplier supplier);
	Supplier createSupplier();
	List<Supplier> getSupplierList();
	Supplier getSupplier(int id);
	void updateSupplier(Supplier supplier);
	
}