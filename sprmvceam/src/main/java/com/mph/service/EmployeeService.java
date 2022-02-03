package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> updateEmployee(Employee employee);
	public Employee getEmployee(int eid);
	//public List<Employee> getEmployee();
	
	public List<Employee> getAllEmployee();
	
	

}
