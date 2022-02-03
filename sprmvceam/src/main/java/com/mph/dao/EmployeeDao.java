package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List<Employee> updateEmployee(Employee employee);
	public  Employee getEmployee(int eid);
	//public List<Employee> getEmployee();
	public List<Employee> getAllEmployee();
	//public Employee getEmployee(Employee emp);

}
