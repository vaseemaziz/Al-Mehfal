package com.billing.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import com.billing.model.Categories;
import com.billing.model.DishItem;
import com.billing.model.OrderForm;
import com.billing.model.OrderItem;
import com.billing.model.UserBean;


public class DishOrderService {
	
	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DishItemService dishItemService;
	
	
	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	public void getUserInfo(UserBean userBean) {
		
		String sql = "select name, email, mobile from users where username=?";
		List<String[]> list = jdbcTemplate.query(sql, new Object[]{userBean.getUser()}, new RowMapper<String[]>() {

			@Override
			public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
				String[] info = new String[3];
				info[0] = rs.getString("name");
				info[1] = rs.getString("email");
				info[2] = rs.getString("mobile");
				
				return info;
			}
			
		});
		
		String[] info = list.get(0);
		userBean.setName(info[0]);
		userBean.setEmail(info[1]);
		userBean.setMobile(info[2]);
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
	
	public List<Categories> getDishItems() {
		
		String sql = "select code, description from categories";
		List<Categories> categoriesList = jdbcTemplate.query(sql, new RowMapper<Categories>() {

			@Override
			public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
				Categories categories = new Categories();
				categories.setCode(rs.getString("code"));
				categories.setDescription(rs.getString("description"));
				return categories;
			}
			
		});
		
		sql = "select item_name, item_cost from dish_items where category=?";
		for(int i=0; i<categoriesList.size(); i++) {
			Categories categories = categoriesList.get(i);
			
			List<DishItem> dishItems = jdbcTemplate.query(sql, new Object[]{categories.getCode()}, new RowMapper<DishItem>() {

				@Override
				public DishItem mapRow(ResultSet rs, int rowNum) throws SQLException {
					DishItem dishItem = new DishItem();
					dishItem.setItemName(rs.getString("item_name"));
					dishItem.setItemCost(rs.getString("item_cost"));
					return dishItem;
				}
				
			});
			
			categories.setDishItems(dishItems);
		}
		
		return categoriesList;
	}
	
	public List<OrderForm> getPendingOrders() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String createdBy = user.getUsername();
    	
    	String pendingOrdersQuery = "select bill_number, bill_amount, discount, net_amount, bill_type, table_num, bill_date from customer_order where bill_status=? and created_by=?";
    	List<OrderForm> pendingOrders = jdbcTemplate.query(pendingOrdersQuery, new Object[]{"pending", createdBy}, new RowMapper<OrderForm>() {

			@Override
			public OrderForm mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderForm orderForm = new OrderForm();
				orderForm.setBillNum(rs.getLong("bill_number"));
				orderForm.setBillAmount(rs.getDouble("bill_amount"));
				orderForm.setDiscount(rs.getDouble("discount"));
				orderForm.setBillNetAmount(rs.getDouble("net_amount"));
				orderForm.setSalesType(rs.getString("bill_type"));
				orderForm.setTableNum(rs.getString("table_num"));
				orderForm.setBillDate(rs.getString("bill_date"));
				
				return orderForm;
			}
    		
    	});
    	
		return pendingOrders;
	}
	
	public void saveOrder(final OrderForm orderForm) {
		
		String saveOrderQuery = "update customer_order set bill_amount=?, discount=?, net_amount=?, bill_type=?, table_num=?, bill_status=? where bill_number=?";
		jdbcTemplate.update(saveOrderQuery, new Object[]{orderForm.getBillAmount(), orderForm.getDiscount(), orderForm.getBillNetAmount(), 
															orderForm.getSalesType(), orderForm.getTableNum(), "pending", orderForm.getBillNum()});
		
		String deleteOrderItemQuery = "delete from dish_order where order_id=?";
		jdbcTemplate.update(deleteOrderItemQuery, new Object[]{orderForm.getBillNum()});
		
		String saveItemQuery = "insert into dish_order(order_id, item_name, quantity, item_cost) values(?,?,?,?)";
		final List<OrderItem> list = orderForm.getOrderedItems();
		jdbcTemplate.batchUpdate(saveItemQuery, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				OrderItem item = list.get(index);
				ps.setLong(1, orderForm.getBillNum());
				ps.setString(2, item.getItemName());
				ps.setInt(3, item.getQuantity());
				ps.setDouble(4, item.getItemCost());
			}
			
			@Override
			public int getBatchSize() {
				return list.size();
			}
		});
	}
	
	public OrderForm createOrder() {
		
		OrderForm orderForm = new OrderForm();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String billDate = dateFormat.format(new Date());
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	String createdBy = user.getUsername();
		
		String newOrderQuery = "insert into customer_order(bill_amount, discount, net_amount, created_by, bill_type, table_num, bill_date) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(newOrderQuery, new Object[]{"0.00", "0.00", "0.00", createdBy, "", "", billDate});
		
		orderForm.setBillAmount(0.00);
		orderForm.setDiscount(0.00);
		orderForm.setBillNetAmount(0.00);
		orderForm.setCreatedBy(createdBy);
		orderForm.setSalesType("");
		orderForm.setTableNum("");
		orderForm.setBillDate(billDate);
		
		String getBillNumQuery = "select bill_number from customer_order where bill_date=? and created_by=?";
		List<String> list = jdbcTemplate.query(getBillNumQuery, new Object[]{billDate, createdBy}, new RowMapper<String>() {
			
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("bill_number");
			}
		});
		
		long billNumber = Long.parseLong(list.get(0));
		orderForm.setBillNum(billNumber);
		
		String dishOrderQuery = "select item_name, quantity, item_cost from dish_order where order_id=?";
		List<OrderItem> orderedItems = jdbcTemplate.query(dishOrderQuery, new Object[]{billNumber}, new RowMapper<OrderItem>() {

			@Override
			public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderItem orderItem = new OrderItem();
				orderItem.setItemName(rs.getString("item_name"));
				orderItem.setQuantity(rs.getInt("quantity"));
				orderItem.setItemCost(rs.getDouble("item_cost"));
				
				return orderItem;
			}
		});
		
		orderForm.setOrderedItems(orderedItems);
		return orderForm;
	}
	
	public void cancelOrder(String value) {
		long billNum = Long.parseLong(value);
		
		String deleteOrderItemQuery = "delete from dish_order where order_id=?";
		jdbcTemplate.update(deleteOrderItemQuery, new Object[]{billNum});
		
		String deleteOrderQuery = "delete from customer_order where bill_number=?";
		jdbcTemplate.update(deleteOrderQuery, new Object[]{billNum});
	}
	
	public void closeOrder(final OrderForm orderForm) {
		
		String saveOrderQuery = "update customer_order set bill_amount=?, discount=?, net_amount=?, bill_type=?, table_num=?, bill_status=? where bill_number=?";
		jdbcTemplate.update(saveOrderQuery, new Object[]{orderForm.getBillAmount(), orderForm.getDiscount(), orderForm.getBillNetAmount(), 
															orderForm.getSalesType(), orderForm.getTableNum(), "completed", orderForm.getBillNum()});
		
		String deleteOrderItemQuery = "delete from dish_order where order_id=?";
		jdbcTemplate.update(deleteOrderItemQuery, new Object[]{orderForm.getBillNum()});
		
		String saveItemQuery = "insert into dish_order(order_id, item_name, quantity, item_cost) values(?,?,?,?)";
		final List<OrderItem> list = orderForm.getOrderedItems();
		jdbcTemplate.batchUpdate(saveItemQuery, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				OrderItem item = list.get(index);
				ps.setLong(1, orderForm.getBillNum());
				ps.setString(2, item.getItemName());
				ps.setInt(3, item.getQuantity());
				ps.setDouble(4, item.getItemCost());
			}
			
			@Override
			public int getBatchSize() {
				return list.size();
			}
		});
	}
	
	public OrderForm printBill(long billNum) {
		
		String query = "select bill_amount, discount, net_amount, bill_type, bill_date, created_by, table_num from customer_order where bill_number=?";
		List<String[]> list = jdbcTemplate.query(query, new Object[]{billNum}, new RowMapper<String[]>() {

			@Override
			public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
				String[] details = new String[7];
				details[0] = rs.getString("bill_amount");
				details[1] = rs.getString("discount");
				details[2] = rs.getString("net_amount");
				details[3] = rs.getString("bill_type");
				details[4] = rs.getString("bill_date");
				details[5] = rs.getString("created_by");
				details[6] = rs.getString("table_num");
				
				return details;
			}
			
		});
		
		String[] details = list.get(0);
		OrderForm orderForm = new OrderForm();
		orderForm.setBillNum(billNum);
		orderForm.setBillAmount(Double.parseDouble(details[0]));
		orderForm.setDiscount(Double.parseDouble(details[1]));
		orderForm.setBillNetAmount(Double.parseDouble(details[2]));
		orderForm.setSalesType(details[3]);
		orderForm.setBillDate(details[4]);
		orderForm.setCreatedBy(details[5]);
		orderForm.setTableNum(details[6]);
		
		String dishOrderQuery = "select item_name, quantity, item_cost from dish_order where order_id=?";
		List<OrderItem> orderedItems = jdbcTemplate.query(dishOrderQuery, new Object[]{billNum}, new RowMapper<OrderItem>() {

			@Override
			public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderItem orderItem = new OrderItem();
				orderItem.setItemName(rs.getString("item_name"));
				int qty = rs.getInt("quantity");
				orderItem.setQuantity(qty);
				orderItem.setItemCost(rs.getDouble("item_cost"));
				
				return orderItem;
			}
			
		});
		
		orderForm.setOrderedItems(orderedItems);
		return orderForm;
	}
	
}