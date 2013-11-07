package com.billing.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billing.dao.PurchasesDao;
import com.billing.model.PurchaseMaterials;
import com.billing.model.Purchases;
import com.billing.model.PurchasesAmount;
import com.billing.model.Supplier;


@Repository("purchasesDao")
@Transactional
public class PurchasesDaoImpl implements PurchasesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Purchases createPurchase() {
		String createPurchaseQuery = "insert into purchases_seq(n) values(NULL)";
		jdbcTemplate.update(createPurchaseQuery);
		
		String getPurchaseGrnNoQuery = "select max(n) from purchases_seq";
		List<String> list = jdbcTemplate.query(getPurchaseGrnNoQuery, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int row) throws SQLException {
				return rs.getString(1);
			}
		});
		
		long grnNo = Long.parseLong(list.get(0));
		Purchases purchases = new Purchases();
		purchases.setGrnNo(grnNo);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String createdBy = user.getUsername();
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String createdOn = dateFormat.format(new Date());
		
		purchases.setCreatedBy(createdBy);
		purchases.setCreatedOn(createdOn);
		
		return purchases;
	}
	
	
	@Override
	public void savePurchases(Purchases purchases) {
		double invoiceAmount = purchases.getTotalAmount() + (purchases.getInvoiceAmount()-purchases.getPaidAmount());
		String savePurchasesQuery = "insert into purchases(purchase_date, supplier_num, supplier_name, invoice_num, invoice_date, invoice_amount, paid_amount, created_on, created_by) values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(savePurchasesQuery, new Object[]{
				purchases.getPurchaseDate(), purchases.getSupplierNum(), purchases.getSupplierName(), purchases.getInvoiceNum(),
				purchases.getInvoiceDate(), invoiceAmount, purchases.getPaidAmount(), purchases.getCreatedOn(), purchases.getCreatedBy()
		});
		
		String getGrnNoQuery = "select grn_no from purchases where created_by=? and created_on=?";
		List<String> list =jdbcTemplate.query(getGrnNoQuery, new Object[]{purchases.getCreatedBy(),purchases.getCreatedOn()}, 
				new RowMapper<String>() {
					@Override
					public String mapRow(ResultSet rs, int row) throws SQLException {
						return rs.getString("grn_no");
					}
		});
		
		long grpNo = Long.parseLong(list.get(0));
		List<PurchaseMaterials> materials = purchases.getMaterials();
		String insertPurchaseItemsQuery = "insert into purchase_items(grp_no, raw_material_id, raw_material_desc, raw_material_uom, raw_material_qty, raw_material_amt) values(?,?,?,?,?,?)";
		for(int i=0; i<materials.size(); i++) {
			PurchaseMaterials purchaseMaterials = materials.get(i);
			jdbcTemplate.update(insertPurchaseItemsQuery, new Object[]{
					grpNo, purchaseMaterials.getRawMaterialId(), purchaseMaterials.getRawMaterialDesc(),
					purchaseMaterials.getRawMaterialUom(), purchaseMaterials.getRawMaterialQty(), purchaseMaterials.getRawMaterialAmount()
			});
		}
	}
	
	
	@Override
	public List<Purchases> findPurchases(String fromDate, String toDate, int supplierNum, String rawMaterialId) {
		return null;
	}
	
	
	@Override
	public List<PurchasesAmount> getPurchasesAmounts() {
		String getSupplierQuery = "select supplier_num, supplier_name from suppliers";
		
		List<Supplier> suppliers = jdbcTemplate.query(getSupplierQuery, new RowMapper<Supplier>() {
			@Override
			public Supplier mapRow(ResultSet rs, int row) throws SQLException {
				Supplier supplier = new Supplier();
				supplier.setSupplierNum(rs.getInt("supplier_num"));
				supplier.setSupplierName(rs.getString("supplier_name"));
				return supplier;
			}
		});
		
		String getInvoiceAmounts = "select invoice_amount, invoice_date from purchases where supplier_num=? and invoice_date=(select max(invoice_date) from purchases where supplier_num=?)";
		List<PurchasesAmount> purchasesAmounts = new ArrayList<PurchasesAmount>();
		for(int i=0; i<suppliers.size(); i++) {
			List<Purchases> amounts = jdbcTemplate.query(getInvoiceAmounts, 
					new Object[]{suppliers.get(i).getSupplierNum(), suppliers.get(i).getSupplierNum()},
					new RowMapper<Purchases>(){
						
						@Override
						public Purchases mapRow(ResultSet rs, int row) throws SQLException {
							Purchases purchases1 = new Purchases();
							purchases1.setInvoiceAmount(rs.getDouble("invoice_amount"));
							purchases1.setInvoiceDate(rs.getString("invoice_date"));
							return purchases1;
						}
			});
			
			double total = 0.0;
			String invoiceDate = "";
			if(amounts.size() > 0) {
				total = amounts.get(0).getInvoiceAmount();
				invoiceDate = amounts.get(0).getInvoiceDate();
			}
			else{
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				invoiceDate = dateFormat.format(new Date());
			}
			
			PurchasesAmount pAmount = new PurchasesAmount();
			pAmount.setAmount(total);
			pAmount.setSupplierNum(suppliers.get(i).getSupplierNum());
			pAmount.setSupplierName(suppliers.get(i).getSupplierName());
			pAmount.setInvoiceDate(invoiceDate);
			
			System.out.println(suppliers.get(i).getSupplierNum() + " - " + suppliers.get(i).getSupplierName() + " - " + pAmount.getAmount() + " - " + pAmount.getInvoiceDate());
			
			purchasesAmounts.add(pAmount);
		}
		
		return purchasesAmounts;
	}
	
}