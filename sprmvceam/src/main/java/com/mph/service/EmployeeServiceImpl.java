package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	public EmployeeDao employeeDao;

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.createEmployee(employee);
		
	}

	@Override
	public List<Employee> updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	
	/*

	@Override
	public List<Employee> getEmployee() {
		return employeeDao.getEmployee();
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(eid);
	}
*/
	
	

}
