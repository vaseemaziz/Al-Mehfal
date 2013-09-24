package com.billing.model;

import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class OrderForm {
	
	private long billNum;
	private String billDate;
	private double billAmount;
	private String waiterId;
	
	@NotNull @Size(min=1, max=50)
	private String custName;
	
	@NotNull @Size(min=1, max=5)
	private String tableNum;
	
	@Min(value=1) @Max(value=99)
	private short chairNum;
	
	@NotNull
	private List<OrderItem> orderedItems;
	
	
	public long getBillNum() {
		return billNum;
	}
	
	public void setBillNum(long billNum) {
		this.billNum = billNum;
	}
	
	public String getDate() {
		return billDate;
	}
	
	public void setDate(String billDate) {
		this.billDate = billDate;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getTableNum() {
		return tableNum;
	}
	
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	
	public short getChairNum() {
		return chairNum;
	}
	
	public void setChairNum(short chairNum) {
		this.chairNum = chairNum;
	}
	
	public String getWaiterId() {
		return waiterId;
	}
	
	public void setWaiterId(String waiterId) {
		this.waiterId = waiterId;
	}
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	
	public List<OrderItem> getOrderedItems() {
		return orderedItems;
	}
	
	public void setOrderedItems(List<OrderItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
}