package com.billing.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

import com.billing.dao.SupplierDao;
import com.billing.model.Supplier;


@Transactional
@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void updateSupplier(Supplier supplier) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String username = user.getUsername();
    	
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String lastUpdatedOn = dateFormat.format(new Date());
		
		String updateSupplierQuery = "update suppliers set supplier_name=?, last_updated_by=?, last_updated_on=?, first_contact_name=?, first_contact_num=?, " +
										"first_mobile_num=?, second_contact_name=?, second_contact_num=?, second_mobile_num=?, " +
										"address_line1=?, address_line2=?, address_line3=? where supplier_num=?";
		
		jdbcTemplate.update(updateSupplierQuery, new Object[]{
				supplier.getSupplierName(), username, lastUpdatedOn, supplier.getFirstContactName(), supplier.getFirstContactNum(),
				supplier.getFirstMobileNum(), supplier.getSecondContactName(), supplier.getSecondContactNum(), supplier.getSecondMobileNum(),
				supplier.getAddressLine1(), supplier.getAddressLine2(), supplier.getAddressLine3(), supplier.getSupplierNum()
		});
	}
	
	@Override
	public void saveSupplier(Supplier supplier) {
		if(supplier.getSupplierNum()==0) {
			String insertSupplierQuery = "insert into suppliers(supplier_name,created_by,created_on,last_updated_by,last_updated_on,first_contact_name,first_contact_num,first_mobile_num,second_contact_name,second_contact_num,second_mobile_num,address_line1,address_line2,address_line3) " + 
												"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(insertSupplierQuery, new Object[]{
				supplier.getSupplierName(), supplier.getCreatedBy(), supplier.getCreatedOn(),
				supplier.getLastUpdatedBy(), supplier.getLastUpdatedOn(), supplier.getFirstContactName(), supplier.getFirstContactNum(),
				supplier.getFirstMobileNum(), supplier.getSecondContactName(), supplier.getSecondContactNum(), supplier.getSecondMobileNum(),
				supplier.getAddressLine1(), supplier.getAddressLine2(), supplier.getAddressLine3()
			});
		}
		else {
			String insertSupplierQuery = "insert into suppliers(supplier_num,supplier_name,created_by,created_on,last_updated_by,last_updated_on,first_contact_name,first_contact_num,first_mobile_num,second_contact_name,second_contact_num,second_mobile_num,address_line1,address_line2,address_line3) " + 
											"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(insertSupplierQuery, new Object[]{
					supplier.getSupplierNum(), supplier.getSupplierName(), supplier.getCreatedBy(), supplier.getCreatedOn(),
					supplier.getLastUpdatedBy(), supplier.getLastUpdatedOn(), supplier.getFirstContactName(), supplier.getFirstContactNum(),
					supplier.getFirstMobileNum(), supplier.getSecondContactName(), supplier.getSecondContactNum(), supplier.getSecondMobileNum(),
					supplier.getAddressLine1(), supplier.getAddressLine2(), supplier.getAddressLine3()
			});
		}
	}
	
	
	@Override
	public Supplier createSupplier() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String username = user.getUsername();
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String createdOn = dateFormat.format(new Date());
		
		Supplier supplier = new Supplier();
		supplier.setCreatedBy(username);
		supplier.setCreatedOn(createdOn);
		supplier.setLastUpdatedBy("not updated");
		supplier.setLastUpdatedOn("not updated");
		return supplier;
	}
	
	
	@Override
	public List<Supplier> getSupplierList() {
		
		String getSupplierQuery = "select supplier_num, supplier_name, first_contact_name, first_contact_num, " + "" +
				"first_mobile_num, second_contact_name, second_contact_num, second_mobile_num, address_line1, " + "" +
						"address_line2, address_line3 from suppliers";
		
		List<Supplier> suppliers = jdbcTemplate.query(getSupplierQuery, new RowMapper<Supplier>() {
			@Override
			public Supplier mapRow(ResultSet rs, int row) throws SQLException {
				Supplier supplier = new Supplier();
				supplier.setSupplierNum(rs.getInt("supplier_num"));
				supplier.setSupplierName(rs.getString("supplier_name"));
				supplier.setFirstContactName(rs.getString("first_contact_name"));
				supplier.setFirstContactNum(rs.getString("first_contact_num"));
				supplier.setFirstMobileNum(rs.getString("first_mobile_num"));
				supplier.setSecondContactName(rs.getString("second_contact_name"));
				supplier.setSecondContactNum(rs.getString("second_contact_num"));
				supplier.setSecondMobileNum(rs.getString("second_mobile_num"));
				supplier.setAddressLine1(rs.getString("address_line1"));
				supplier.setAddressLine2(rs.getString("address_line2"));
				supplier.setAddressLine3(rs.getString("address_line3"));
				return supplier;
			}
		});
		
		return suppliers;
	}
	
	
	@Override
	public Supplier getSupplier(int id) {
		
		String getSupplierQuery = "select supplier_name, created_by, created_on, last_updated_by, last_updated_on, " +
										"first_contact_name, first_contact_num, first_mobile_num, second_contact_name, " +
										"second_contact_num, second_mobile_num, address_line1, address_line2, address_line3 " +
										"from suppliers where supplier_num=?";
		List<Supplier> list = jdbcTemplate.query(getSupplierQuery, new Object[]{id}, new RowMapper<Supplier>(){
			@Override
			public Supplier mapRow(ResultSet rs, int row) throws SQLException {
				Supplier supplier = new Supplier();
				supplier.setSupplierName(rs.getString("supplier_name"));
				supplier.setCreatedBy(rs.getString("created_by"));
				supplier.setCreatedOn(rs.getString("created_on"));
				supplier.setLastUpdatedBy(rs.getString("last_updated_by"));
				supplier.setLastUpdatedOn(rs.getString("last_updated_on"));
				supplier.setFirstContactName(rs.getString("first_contact_name"));
				supplier.setFirstContactNum(rs.getString("first_contact_num"));
				supplier.setFirstMobileNum(rs.getString("first_mobile_num"));
				supplier.setSecondContactName(rs.getString("second_contact_name"));
				supplier.setSecondContactNum(rs.getString("second_contact_num"));
				supplier.setSecondMobileNum(rs.getString("second_mobile_num"));
				supplier.setAddressLine1(rs.getString("address_line1"));
				supplier.setAddressLine2(rs.getString("address_line2"));
				supplier.setAddressLine3(rs.getString("address_line3"));
				return supplier;
			}
		});
		
		list.get(0).setSupplierNum(id);
		return list.get(0);
	}
	
}