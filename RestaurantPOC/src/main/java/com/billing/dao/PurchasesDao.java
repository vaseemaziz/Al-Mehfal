package com.billing.dao;

import java.util.List;

import com.billing.model.Purchases;
import com.billing.model.PurchasesAmount;


public interface PurchasesDao {
	
	Purchases createPurchase();
	void savePurchases(Purchases purchases);
	List<Purchases> findPurchases(String fromDate, String toDate, String supplierNum);
	List<PurchasesAmount> getPurchasesAmounts();
	
}
