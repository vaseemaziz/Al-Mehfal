package com.billing.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.billing.dao.EmployeeDao;
import com.billing.model.Employee;
import com.billing.model.EmployeePayroll;
import com.billing.model.EmployeePayrollList;


@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void saveEmployee(Employee db) {
		
		 String name = db.getName();
		 String gender = db.getGender();
		 String dateOfBirth = db.getDateOfBirth();
		 String dateOfJoining = db.getDateOfJoining();
		 String passportNo = db .getPassportNum();
		 String passportExpiryDate = db.getPassportExpiryDate();
		 String visaNum = db.getVisaNum();
		 String visaExpiryDate = db.getVisaExpiryDate();
		 String localContactNum = db.getLocalContactNum();
		 String internationalContactNum = db.getInternationalContactNum();
		 String createdBy = db.getCreatedBy();
		 String createdOn = db.getCreatedOn();
		 String updatedBy = db.getLastUpdatedBy();
		 String updatedOn = db.getLastUpdatedOn();
		 String healthCardExpiryDate = db.getHealthCardExpiryDate();
		 String healthCardExpirydate2 = db.getHealthCardExpiryDate2();
		 String bankName = db.getBankName();
		 String branchName = db.getBranchName();
		 String accountNum = db.getAccountNum();
		 double basicSalary = db.getBasicSalary();
		 String addressLine1 = db.getAddressLine1();
		 String addressLine2 = db.getAddressLine2();
		 String addressLine3 = db.getAddressLine3();
		 String username = db.getUsername();
		
		String iquery = "insert into employee_master(emp_name,gender,date_of_birth,date_of_joining,passport_no,"
				+ "passport_expiry_date,visa_no,visa_expiry_date,local_contact_no,international_contact_no,"
				+ "creation_by,creation_date,last_updated_by,last_updated_on,health_card_expiry,health_card_expiry2,bank_name,"
				+ "bank_branch_name,bank_account_no,basic_salary,address_line1,address_line2,address_line3,loginid) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(iquery,new Object[]{name,gender,dateOfBirth,dateOfJoining,passportNo,passportExpiryDate,visaNum,
				 visaExpiryDate,localContactNum,internationalContactNum,createdBy,createdOn,updatedBy,
				 updatedOn,healthCardExpiryDate,healthCardExpirydate2,bankName,branchName, accountNum,
				 basicSalary,addressLine1,addressLine2,addressLine3,username});
		
		
		String password = db.getPassword();
		String role = db.getRole();
		System.out.println(role);
		
		iquery = "insert into employees(username, password, authority) values(?,?,?)";
		jdbcTemplate.update(iquery, new Object[]{username, password, role});
	}
	
	
	@Override
	public List<Employee> getEmployeeList() {
		String showquery = "select loginid,emp_name,reg_no,basic_salary,passport_no,local_contact_no,address_line1 from employee_master";
		List<Employee> list = jdbcTemplate.query(showquery, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee db = new Employee();
				db.setUsername(rs.getString("loginid"));
				db.setRegNum(rs.getInt("reg_no"));
				db.setName(rs.getString("emp_name"));
				db.setBasicSalary(rs.getDouble("basic_salary"));
				db.setPassportNum(rs.getString("passport_no"));
				db.setLocalContactNum(rs.getString("local_contact_no"));
				db.setAddressLine1(rs.getString("address_line1"));
				return db;
			}
		});
		return list;
	}
	
	@Override
	public void updateEmployee(Employee db) {
		
		 String name = db.getName();
		 String gender = db.getGender();
		 String dateOfBirth = db.getDateOfBirth();
		 String dateOfJoining = db.getDateOfJoining();
		 String passportNo = db .getPassportNum();
		 String passportExpiryDate = db.getPassportExpiryDate();
		 String visaNum = db.getVisaNum();
		 String visaExpiryDate = db.getVisaExpiryDate();
		 String localContactNum = db.getLocalContactNum();
		 String internationalContactNum = db.getInternationalContactNum();
		 String createdBy = db.getCreatedBy();
		 String createdOn = db.getCreatedOn();
		 String updatedBy = db.getLastUpdatedBy();
		 String updatedOn = db.getLastUpdatedOn();
		 String healthCardExpiryDate = db.getHealthCardExpiryDate();
		 String healthCardExpiryDate2 = db.getHealthCardExpiryDate2();
		 String bankName = db.getBankName();
		 String branchName = db.getBranchName();
		 String accountNum = db.getAccountNum();
		 double basicSalary = db.getBasicSalary();
		 String addressLine1 = db.getAddressLine1();
		 String addressLine2 = db.getAddressLine2();
		 String addressLine3 = db.getAddressLine3();
		 String username = db.getUsername();
		 
		 String editQuery = "update employee_master set emp_name=?,gender=?,date_of_birth=?,date_of_joining=?,passport_no=?,"
				+ "passport_expiry_date=?,visa_no=?,visa_expiry_date=?,local_contact_no=?,international_contact_no=?,"
				+ "creation_by=?,creation_date=?,last_updated_by=?,last_updated_on=?,health_card_expiry=?,"
				+ "health_card_expiry2=?,bank_name=?,bank_branch_name=?,bank_account_no=?,basic_salary=?,address_line1=?,"
				+ "address_line2=?,address_line3=? where loginid=? ";
		 
		 jdbcTemplate.update(editQuery, new Object[]{name,gender,dateOfBirth,dateOfJoining,passportNo,passportExpiryDate,visaNum,
				 visaExpiryDate,localContactNum,internationalContactNum,createdBy,createdOn,updatedBy,
				 updatedOn,healthCardExpiryDate,healthCardExpiryDate2,bankName,branchName, accountNum,
				 basicSalary,addressLine1,addressLine2,addressLine3,username});
	}
	
	@Override
	public Employee getEmployee(String id) {
			String query = "select reg_no,emp_name,gender,date_of_birth,date_of_joining,passport_no,"
					+ "passport_expiry_date,visa_no,visa_expiry_date,local_contact_no,international_contact_no,"
					+ "creation_by,creation_date,last_updated_by,last_updated_on,health_card_expiry,"
					+ "health_card_expiry2,bank_name,bank_branch_name,bank_account_no,basic_salary,address_line1,"
					+ "address_line2,address_line3,loginid from employee_master where loginid=?";
			
			List<Employee> list = jdbcTemplate.query(query, new Object[]{id},new RowMapper<Employee>(){

				@Override
				public Employee mapRow(ResultSet rs, int row) throws SQLException {
					Employee db = new Employee();
					db.setRegNum(rs.getInt("reg_no"));
					db.setName(rs.getString("emp_name"));
					db.setGender(rs.getString("gender"));
					db.setDateOfBirth(rs.getString("date_of_birth"));
					db.setDateOfJoining(rs.getString("date_of_joining"));
					db.setPassportNum(rs.getString("passport_no"));
					db.setPassportExpiryDate("passport_expiry_date");
					db.setVisaNum(rs.getString("visa_no"));
					db.setVisaExpiryDate(rs.getString("visa_expiry_date"));
					db.setLocalContactNum(rs.getString("local_contact_no"));
					db.setInternationalContactNum(rs.getString("creation_by"));
					db.setCreatedBy(rs.getString("creation_by"));
					db.setCreatedOn(rs.getString("creation_date"));
					db.setLastUpdatedBy(rs.getString("last_updated_by"));
					db.setLastUpdatedOn(rs.getString("last_updated_on"));
					db.setHealthCardExpiryDate(rs.getString("health_card_expiry"));
					db.setHealthCardExpiryDate2(rs.getString("health_card_expiry2"));
					db.setBankName(rs.getString("bank_name"));
					db.setBranchName(rs.getString("bank_branch_name"));
					db.setAccountNum(rs.getString("bank_account_no"));
					db.setBasicSalary(rs.getDouble("basic_salary"));
					db.setAddressLine1(rs.getString("address_line1"));
					db.setAddressLine2(rs.getString("address_line2"));
					db.setAddressLine3(rs.getString("address_line3"));
					db.setUsername(rs.getString("loginid"));
					return db;
				}	
		});
		return list.get(0);
	}
	
	@Override
	public void deleteEmployee(String id) {
		
		jdbcTemplate.update("delete from employee_master where loginid=?", new Object[]{id});
		jdbcTemplate.update("delete from employees where username=?", new Object[]{id});
	}
	
	
	@Override
	public List<EmployeePayroll> getPayrolls(String month_year) {
		String findPayrollsQuery = "select reg_no,emp_name,basic_salary,gross_pay,loan_deduction,other_deduction,created_by,created_on,net_salary from employee_payroll where date=?";
		List<EmployeePayroll> list = jdbcTemplate.query(findPayrollsQuery, new Object[]{month_year}, new RowMapper<EmployeePayroll>(){
			@Override
			public EmployeePayroll mapRow(ResultSet rs, int row) throws SQLException {
				EmployeePayroll payroll = new EmployeePayroll();
				payroll.setRegNum(rs.getInt("reg_no"));
				payroll.setName(rs.getString("emp_name"));
				payroll.setBasicSalary(rs.getDouble("basic_salary"));
				payroll.setGrossPay(rs.getDouble("gross_pay"));
				payroll.setLoanDeduction(rs.getDouble("loan_deduction"));
				payroll.setOtherDeduction(rs.getDouble("other_deduction"));
				payroll.setNetSalary(rs.getDouble("net_salary"));
				payroll.setCreatedBy(rs.getString("created_by"));
				payroll.setCreatedOn(rs.getString("created_on"));
				return payroll;
			}
		});
		return list;
	}
	
	
	@Override
	public void savePayrolls(EmployeePayrollList payrolls) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	User user = (User) auth.getPrincipal();
    	
		String savePayrollsQuery = "insert into employee_payroll(reg_no, emp_name, date, basic_salary, gross_pay, loan_deduction, other_deduction, created_by, created_on, net_salary, last_updated_by, last_updated_on) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		System.out.println(payrolls.getMonth() + " " + payrolls.getYear());
		for(int i=0;i<payrolls.getPayrolls().size();i++) {
			EmployeePayroll payroll = payrolls.getPayrolls().get(i);
			jdbcTemplate.update(savePayrollsQuery, new Object[] {
					payroll.getRegNum(),payroll.getName(),payrolls.getMonth() + " " + payrolls.getYear(), payroll.getBasicSalary(),payroll.getGrossPay(),payroll.getLoanDeduction(),
					payroll.getOtherDeduction(),payroll.getCreatedBy(), payroll.getCreatedOn(),payroll.getNetSalary(), user.getUsername(), user.getUsername()
			});
		}
	}
	
}