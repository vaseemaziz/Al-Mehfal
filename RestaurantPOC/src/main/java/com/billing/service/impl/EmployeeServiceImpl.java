package com.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.dao.EmployeeDao;
import com.billing.model.Employee;
import com.billing.model.EmployeePayroll;
import com.billing.model.EmployeePayrollList;
import com.billing.service.EmployeeService;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}
	
	
	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.getEmployeeList();
	}
	
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
	
	
	@Override
	public void deleteEmployee(String id) {
		employeeDao.deleteEmployee(id);
	}


	@Override
	public Employee getEmployee(String id) {
		return employeeDao.getEmployee(id);
	}
	
	
	@Override
	public List<EmployeePayroll> getPayrolls(String month_year) {
		return employeeDao.getPayrolls(month_year);
	}
	
	
	@Override
	public void savePayrolls(EmployeePayrollList payrolls) {
		employeeDao.savePayrolls(payrolls);
	}
	
}