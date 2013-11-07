package com.billing.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.billing.dao.PurchasesDao;
import com.billing.model.Purchases;
import com.billing.model.PurchasesAmount;
import com.billing.service.PurchasesService;


@Service("purchasesService")
public class PurchasesServiceImpl implements PurchasesService {
	
	@Autowired
	private PurchasesDao purchasesDao;
	
	
	@Override
	public Purchases createPurchase() {
		return purchasesDao.createPurchase();
	}
	
	
	@Override
	public void savePurchases(Purchases purchases) {
		purchasesDao.savePurchases(purchases);
	}
	
	
	@Override
	public List<Purchases> findPurchases(String fromDate, String toDate, int supplierNum, String rawMaterialId) {
		return purchasesDao.findPurchases(fromDate, toDate, supplierNum, rawMaterialId);
	}
	
	
	@Override
	public List<PurchasesAmount> getPurchasesAmounts() {
		return purchasesDao.getPurchasesAmounts();
	}
	
}