package com.billing.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.billing.model.OrderForm;
import com.billing.model.OrderItem;


public class DishOrderService {
	
	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DishItemService dishItemService;
	
	
	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	
	public List<String> getDineTables() {
		String sql = "select table_name from dine_tables";
		
		List<String> dineTables = jdbcTemplate.query(sql, new RowMapper<String> () {
				
				@Override
				public String mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rs.getString("table_name");
				}
		});
		
		return dineTables;
	}
	
	
	public OrderForm newOrder(final String waiterId) {
		
		String sql = "insert into customer_order(bill_amount, bill_date, waiter_id, table_num, chair_num, cust_name) values(?,?,?,?,?,?)";
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		final String timestamp = dateFormat.format(new Date());
		jdbcTemplate.update(sql, new Object[] {0.00, timestamp, waiterId, "", (short)1, "customer"});
		
		
		sql = "select bill_num from customer_order where bill_date=? and waiter_id=?";
		List<OrderForm> orderForm = jdbcTemplate.query(sql, new Object[]{timestamp, waiterId}, new RowMapper<OrderForm>() {
				
				@Override
				public OrderForm mapRow(ResultSet rs, int rowNum) throws SQLException {
					OrderForm orderForm = new OrderForm();
					
					orderForm.setBillNum(rs.getLong("bill_num"));
					orderForm.setChairNum((short)1);
					orderForm.setCustName("customer");
					orderForm.setDate(timestamp);
					orderForm.setWaiterId(waiterId);
					
					return orderForm;
				}
		});
		
		return orderForm.get(0);
	}
	
	public String saveOrder(OrderForm orderForm) {
		
		try {
			String sql = "update customer_order set bill_amount=?, table_num=?, chair_num=?, cust_name=? where bill_num=?";
			jdbcTemplate.update(sql, new Object[] {orderForm.getBillAmount(), orderForm.getTableNum(), orderForm.getChairNum(), orderForm.getCustName(), orderForm.getBillNum()});
		
			sql = "insert into dish_order(order_id, item_name, quantity, item_cost) values(?,?,?,?)";
			List<OrderItem> orderedItems = orderForm.getOrderedItems();
		
			for(OrderItem orderItem : orderedItems)
				jdbcTemplate.update(sql, new Object[] {orderForm.getBillNum(), orderItem.getItemName(), orderItem.getQuantity(), orderItem.getItemCost()});
		}
		catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
		
		return "success";
	}
	
	public boolean deleteOrder(long billNum) {
		
		try {
			String sql = "delete from dish_order where order_id=?";
			jdbcTemplate.update(sql, new Object[] {billNum});
			
			sql = "delete from customer_order where bill_num=?";
			jdbcTemplate.update(sql, new Object[] {billNum});
		}
		catch(Exception e) {
			return false;
		}
		
		return true;
	}
	
}