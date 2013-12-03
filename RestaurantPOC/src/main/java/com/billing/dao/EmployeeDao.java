package com.billing.dao;

import java.util.List;
import com.billing.model.Employee;
import com.billing.model.EmployeePayroll;
import com.billing.model.EmployeePayrollList;


public interface EmployeeDao {
	
	void saveEmployee(Employee employee);
	void savePayrolls(EmployeePayrollList payrolls);
	List<Employee> getEmployeeList();
	void updateEmployee(Employee employee);
	void deleteEmployee(String id);
	Employee getEmployee(String id);
	List<EmployeePayroll> getPayrolls(String month_year);
	
}