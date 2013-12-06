package com.billing.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billing.dao.DishOrderDao;
import com.billing.model.BillFormat;
import com.billing.model.Categories;
import com.billing.model.DishItem;
import com.billing.model.OrderForm;
import com.billing.model.OrderItem;


@Repository("dishOrderDao")
@Transactional
public class DishOrderDaoImpl implements DishOrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
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
	
	
	@Override
	public List<Categories> getDishItems() {
		String sql = "select category_code, category_name from dish_categories";
		List<Categories> categoriesList = jdbcTemplate.query(sql, new RowMapper<Categories>() {
			@Override
			public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
				Categories categories = new Categories();
				categories.setCode(rs.getString("category_code"));
				categories.setDescription(rs.getString("category_name"));
				return categories;
			}
		});
		
		sql = "select item_name, item_cost from dish_items where category_code=?";
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
	
	
	@Override
	public List<OrderForm> getPendingOrders(String userId) {
		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String pendingOrdersQuery = "select bill_number, bill_amount, discount, net_amount, sales_type, table_num, bill_date from orders where bill_status=? and created_by=?";
    	List<OrderForm> pendingOrders = jdbcTemplate.query(pendingOrdersQuery, new Object[]{"pending", userId}, new RowMapper<OrderForm>() {
			@Override
			public OrderForm mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderForm orderForm = new OrderForm();
				orderForm.setBillNum(rs.getLong("bill_number"));
				orderForm.setBillAmount(rs.getDouble("bill_amount"));
				orderForm.setDiscount(rs.getDouble("discount"));
				orderForm.setBillNetAmount(rs.getDouble("net_amount"));
				orderForm.setSalesType(rs.getString("sales_type"));
				orderForm.setTableNum(rs.getString("table_num"));
				orderForm.setBillDate(dateFormat.format(rs.getTimestamp("bill_date")));
				return orderForm;
			}
    	});
    	return pendingOrders;
	}
	
	
	@Override
	public OrderForm createOrder() {
		OrderForm orderForm = new OrderForm();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String billDate = dateFormat.format(new Date());
		
		orderForm.setBillAmount(0.00);
		orderForm.setDiscount(0.00);
		orderForm.setBillNetAmount(0.00);
		orderForm.setSalesType("Al-a-Carte");
		orderForm.setTableNum("");
		orderForm.setBillDate(billDate);
		orderForm.setBillType("Cash");
		
		List<OrderItem> orderedItems = new ArrayList<OrderItem>();
		orderForm.setOrderedItems(orderedItems);
		
		return orderForm;
	}
	
	
	@Override
	public void saveOrder(final OrderForm orderForm) {
		String billStatus = orderForm.getBillStatus();
		if(billStatus==null)
			billStatus = "pending";
		
		String saveOrderQuery = "";
		if(orderForm.getBillNum() == 0) {
			saveOrderQuery = "insert into orders(bill_date, bill_amount, discount, net_amount, created_by, sales_type, table_num, bill_type, bill_status) values(?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(saveOrderQuery, new Object[]{orderForm.getBillDate(), orderForm.getBillAmount(), orderForm.getDiscount(), orderForm.getBillNetAmount(),
					orderForm.getCreatedBy(), orderForm.getSalesType(), orderForm.getTableNum(), orderForm.getBillType(), billStatus});
			
			String getBillNumberQuery = "select bill_number from orders where bill_date=? and created_by=?";
			List<String> list = jdbcTemplate.query(getBillNumberQuery, new Object[]{orderForm.getBillDate(),orderForm.getCreatedBy()}, new RowMapper<String>() {
				@Override
				public String mapRow(ResultSet rs, int row) throws SQLException {
					return rs.getString("bill_number");
				}
			});
			
			orderForm.setBillNum(Long.parseLong(list.get(0)));
		}
		else {
			String deleteOrderQuery = "delete from orders where bill_number=?";
			jdbcTemplate.update(deleteOrderQuery, new Object[] {orderForm.getBillNum()});
			
			saveOrderQuery = "insert into orders(bill_number, bill_date, bill_amount, discount, net_amount, created_by, sales_type, table_num, bill_type, bill_status) values(?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(saveOrderQuery, new Object[]{orderForm.getBillNum(), orderForm.getBillDate(), orderForm.getBillAmount(), orderForm.getDiscount(), orderForm.getBillNetAmount(),
					orderForm.getCreatedBy(), orderForm.getSalesType(), orderForm.getTableNum(), orderForm.getBillType(), billStatus});
		}
		
		String deleteOrderedItemsQuery = "delete from dish_orders where bill_number=?";
		jdbcTemplate.update(deleteOrderedItemsQuery, new Object[]{orderForm.getBillNum()});
		
		String saveItemQuery = "insert into dish_orders(bill_number, item_name, quantity, item_cost) values(?,?,?,?)";
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
		
		if(billStatus.equals("completed") && orderForm.getBillType().toLowerCase().equals("credit")) {
			if(orderForm.getPaidAmount().equals(""))
	    		orderForm.setPaidAmount("0");
			String creditUpdateQuery = "insert into credit_details(bill_number, customer_id, due_amount, paid_amount) values(?,?,?,?)";
			jdbcTemplate.update(creditUpdateQuery, new Object[]{orderForm.getBillNum(), orderForm.getCreditId(), orderForm.getBillNetAmount(), Double.parseDouble(orderForm.getPaidAmount())});
		}
	}
	
	
	@Override
	public void closeOrder(OrderForm orderForm) {
		orderForm.setBillStatus("completed");
		saveOrder(orderForm);
	}
	
	
	@Override
	public void cancelOrder(long billNumber) {
		String deleteOrderItemQuery = "delete from dish_orders where bill_number=?";
		jdbcTemplate.update(deleteOrderItemQuery, new Object[]{billNumber});
		
		String deleteOrderQuery = "delete from orders where bill_number=?";
		jdbcTemplate.update(deleteOrderQuery, new Object[]{billNumber});
	}
	
	
	@Override
	public BillFormat printCreditBill(String creditId) {
		BillFormat billFormat = new BillFormat();
		billFormat.setMobile(creditId);
		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String query = "select bill_number from credit_details where customer_id=? and bill_number > 0";
		final List<Long> billNums = jdbcTemplate.query(query, new Object[]{creditId}, new RowMapper<Long>() {
			@Override
			public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getLong("bill_number");
			}
		});
		
		List<OrderForm> bills = new ArrayList<OrderForm>();
		double totalBill = 0.0;
		double totalPaidBill = 0.0;
		
		for(int i=0; i<billNums.size(); i++) {
			query = "select bill_amount, discount, net_amount, sales_type, bill_date, bill_type, created_by, table_num from orders where bill_number=?";
			List<OrderForm> list = jdbcTemplate.query(query, new Object[]{billNums.get(i)}, new RowMapper<OrderForm>() {
				@Override
				public OrderForm mapRow(ResultSet rs, int rowNum) throws SQLException {
					OrderForm orderForm = new OrderForm();
					orderForm.setBillAmount(rs.getDouble("bill_amount"));
					orderForm.setDiscount(rs.getDouble("discount"));
					orderForm.setBillNetAmount(rs.getDouble("net_amount"));
					orderForm.setSalesType(rs.getString("sales_type"));
					orderForm.setBillDate(dateFormat.format(rs.getTimestamp("bill_date")));
					orderForm.setCreatedBy(rs.getString("created_by"));
					orderForm.setTableNum(rs.getString("table_num"));
					orderForm.setBillType(rs.getString("bill_type"));
					return orderForm;
				}
			});
		
			OrderForm orderForm = list.get(0);
			orderForm.setBillNum(billNums.get(i));
			totalBill += orderForm.getBillNetAmount();
			
			String dishOrderQuery = "select item_name, quantity, item_cost from dish_orders where bill_number=?";
			List<OrderItem> orderedItems = jdbcTemplate.query(dishOrderQuery, new Object[]{orderForm.getBillNum()}, 
					new RowMapper<OrderItem>() {
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
			bills.add(orderForm);
		}
		
		String paidAmountQuery = "select paid_amount, date from credit_details where customer_id=? and paid_amount > 0";
		List<String[]> paidBills = jdbcTemplate.query(paidAmountQuery, new Object[]{creditId}, new RowMapper<String[]>(){
			@Override
			public String[] mapRow(ResultSet rs, int row) throws SQLException {
				String[] str = new String[2];
				str[0] = rs.getString("paid_amount");
				str[1] = dateFormat.format(rs.getTimestamp("date"));
				return str;
			}
		});
		
		for (String[] str1 : paidBills)
			totalPaidBill += Double.parseDouble(str1[0]);
		
		billFormat.setBills(bills);
		billFormat.setPaidBills(paidBills);
		billFormat.setTotalBill(totalBill);
		billFormat.setTotalPaidBill(totalPaidBill);
		
		return billFormat;
	}
	
	
	@Override
	public OrderForm openBill(long billNumber) {
		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String query = "select bill_amount, discount, net_amount, sales_type, bill_date, bill_type, created_by, table_num from orders where bill_number=?";
		List<OrderForm> list = jdbcTemplate.query(query, new Object[]{billNumber}, new RowMapper<OrderForm>() {
			@Override
			public OrderForm mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderForm orderForm = new OrderForm();
				orderForm.setBillAmount(rs.getLong("bill_amount"));
				orderForm.setDiscount(rs.getDouble("discount"));
				orderForm.setBillNetAmount(rs.getDouble("net_amount"));
				orderForm.setSalesType(rs.getString("sales_type"));
				orderForm.setBillDate(dateFormat.format(rs.getTimestamp("bill_date")));
				orderForm.setCreatedBy(rs.getString("created_by"));
				orderForm.setTableNum(rs.getString("table_num"));
				orderForm.setBillType(rs.getString("bill_type"));
				return orderForm;
			}
		});
		
		OrderForm orderForm = list.get(0);
		String dishOrderQuery = "select item_name, quantity, item_cost from dish_orders where bill_number=?";
		List<OrderItem> orderedItems = jdbcTemplate.query(dishOrderQuery, new Object[]{billNumber}, new RowMapper<OrderItem>() {
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
		orderForm.setBillNum(billNumber);
		orderForm.setOrderedItems(orderedItems);
		return orderForm;
	}
	
	
	public boolean addCustomer(String name, String address, String mobile) {
		String searchQuery = "select count(*) as 'count' from customer where mobile=?";
		List<String> list = jdbcTemplate.query(searchQuery, new Object[]{mobile}, new RowMapper<String>(){
			@Override
			public String mapRow(ResultSet rs, int row) throws SQLException {
				return rs.getString("count");
			}
		});
		
		if(list.get(0).equals("0")) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    	User user = (User) auth.getPrincipal();
	    	String createdBy = user.getUsername();
	    	
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String createdOn = dateFormat.format(new Date());
			
			String insertQuery = "insert into customer(name,address,mobile,created_by,created_on) values(?,?,?,?,?)";
			jdbcTemplate.update(insertQuery, new Object[]{name, address, mobile, createdBy, createdOn});
			
			return true;
		}
		return false;
	}
	
	
	@Override
	public String[] verifyCustomer(String verifyMobile) {
		String verifyQuery = "select c1.name as 'name', sum(c2.due_amount)-sum(c2.paid_amount) as 'due_amount' from customer c1, credit_details c2 where c1.mobile=? group by c1.name;";
		List<String[]> list = jdbcTemplate.query(verifyQuery, new Object[]{verifyMobile}, new RowMapper<String[]>() {
			@Override
			public String[] mapRow(ResultSet rs, int row) throws SQLException {
				String[] str = new String[2];
				str[0] = rs.getString("name");
				str[1] = rs.getString("due_amount");
				return str;
			}
		});
		
		if(list.size()==0)
			return null;
		return list.get(0);
	}
	
	
	@Override
	public List<String[]> getCustomerDetails() {
		
		String query1 = "select name, mobile, address from customer";
		List<String[]> list = jdbcTemplate.query(query1, new RowMapper<String[]>() {
			@Override
			public String[] mapRow(ResultSet rs, int row) throws SQLException {
				String[] str = new String[4];
				str[0] = rs.getString(1);
				str[1] = rs.getString(2);
				str[2] = rs.getString(3);
				str[3] = "";
				return str;
			}
		});
		
		for(int i=0; i<list.size(); i++) {
			String query2 = "select sum(due_amount)-sum(paid_amount) as 'amount' from credit_details where customer_id=?";
			List<String> amtList = jdbcTemplate.query(query2, new Object[]{list.get(i)[1]}, new RowMapper<String>() {
				@Override
				public String mapRow(ResultSet rs, int row) throws SQLException {
					return rs.getString("amount");
				}
			});
			
			list.get(i)[3] = amtList.get(0);
		}
		
		return list;
	}


	@Override
	public void payBill(String mobile, String paidAmount) {
		double amt = Double.parseDouble(paidAmount);
		
		String payBillQuery = "insert into credit_details(bill_number, customer_id, due_amount, paid_amount) values(?,?,?,?)";
		jdbcTemplate.update(payBillQuery, new Object[]{0,mobile,0,amt});
	}
	
	@Override
	public List<String[]> getSalesReport1(String fromDate, String toDate) {
		String query1 = "select date(bill_date) as 'date', count(*) as 'sales', sum(net_amount) as 'amount' from orders where date(bill_date) between ? and ? group by date(bill_date)";
		List<String[]> list = jdbcTemplate.query(query1, new Object[]{fromDate, toDate}, new RowMapper<String[]>(){
			@Override
			public String[] mapRow(ResultSet rs, int row) throws SQLException {
				String[] str = new String[3];
				str[0] = rs.getString(1);
				str[1] = rs.getString(2);
				str[2] = rs.getString(3);
				return str;
			}
		});
		return list;
	}
	
	
	@Override
	public List<String[]> getSalesReport2(String fromMonth, String toMonth, String year) {
		String query1 = "select month(bill_date) as 'month', count(*) as 'sales', sum(net_amount) as 'amount' from orders where month(bill_date) between ? and ? and year(bill_date)=? group by month(bill_date)";
		final String calendar[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		List<String[]> list = jdbcTemplate.query(query1, new Object[]{fromMonth, toMonth, year}, new RowMapper<String[]>(){
			@Override
			public String[] mapRow(ResultSet rs, int row) throws SQLException {
				String[] str = new String[3];
				str[0] = calendar[Integer.parseInt(rs.getString(1))-1];
				str[1] = rs.getString(2);
				str[2] = rs.getString(3);
				return str;
			}
		});
		return list;
	}


	@Override
	public Properties getSalesByMonth(int month, int year) {
		String getSalesByMonthQuery = "select day(bill_date) as 'day', count(*) as 'sales' from orders where month(bill_date)=? and year(bill_date)=? group by day";
		final Properties prop = new Properties();
		jdbcTemplate.query(getSalesByMonthQuery, new Object[]{month, year}, new RowMapper<String>(){
			
			@Override
			public String mapRow(ResultSet rs, int row) throws SQLException {
				if(rs.getString("day")==null)
					prop.put("0", "0");
				else
					prop.put(rs.getString("day"),rs.getString("sales"));
				return null;
			}
			
		});
		return prop;
	}


	@Override
	public Properties getSalesByYear(int year) {
		String getSalesByMonthQuery = "select month(bill_date) as 'month', count(bill_date) as 'sales' from orders where year(bill_date)=? group by month";
		final Properties prop = new Properties();
		jdbcTemplate.query(getSalesByMonthQuery, new Object[]{year}, new RowMapper<String>(){
			
			@Override
			public String mapRow(ResultSet rs, int row) throws SQLException {
				if(rs.getString("month")==null)
					prop.put("0", "0");
				else
					prop.put(rs.getString("month"),rs.getString("sales"));
				return null;
			}
			
		});
		return prop;
	}
		
}