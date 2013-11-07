package com.billing.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.billing.dao.RawMaterialDao;
import com.billing.model.RawMaterial;


@Repository("rawMaterialDao")
public class RawMaterialDaoImpl implements RawMaterialDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void saveRawMaterials(final List<RawMaterial> materials) {
		
		if(materials.size() > 0) {
			String insertRawMaterialQuery = "insert into raw_materials(id,description,uom) values(?,?,?)";
			jdbcTemplate.batchUpdate(insertRawMaterialQuery, new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int row) throws SQLException {
					RawMaterial rm = materials.get(row);
					ps.setString(1, rm.getId());
					ps.setString(2, rm.getDesc());
					ps.setString(3, rm.getUom());
				}
				
				@Override
				public int getBatchSize() {
					return materials.size();
				}
			});
		}
	}
	
	
	@Override
	public void deleteRawMaterial(String id) {
		
		String deleteRawMaterialQuery = "delete from raw_materials where id=?";
		jdbcTemplate.update(deleteRawMaterialQuery, new Object[]{id});
	}
	
	
	@Override
	public List<RawMaterial> getRawMaterials() {
		
		String getRawMaterialsQuery = "select id, description, uom from raw_materials";
		List<RawMaterial> list = jdbcTemplate.query(getRawMaterialsQuery, new RowMapper<RawMaterial>() {
			@Override
			public RawMaterial mapRow(ResultSet rs, int rowNum) throws SQLException {
				RawMaterial rawMaterial = new RawMaterial();
				rawMaterial.setId(rs.getString("id"));
				rawMaterial.setDesc(rs.getString("description"));
				rawMaterial.setUom(rs.getString("uom"));
				return rawMaterial;
			}
		});
		
		return list;
	}
	
}