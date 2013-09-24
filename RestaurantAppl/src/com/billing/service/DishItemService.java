package com.billing.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.billing.model.DishItem;


public class DishItemService {
	
	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	public List<DishItem> getDishList(String term) {
		
		String sql = "select * from dish_items where item_name like '%" + term + "%'";
		List<DishItem> items = jdbcTemplate.query(sql, new RowMapper<DishItem>() {

			@Override
			public DishItem mapRow(ResultSet rs, int rowNum) throws SQLException {
				DishItem item = new DishItem();
				item.setItemCode(rs.getString("item_code"));
				item.setItemName(rs.getString("item_name"));
				item.setItemCost(rs.getString("item_cost"));
				return item;
			}
		});
		
		return items;
	}
	
}