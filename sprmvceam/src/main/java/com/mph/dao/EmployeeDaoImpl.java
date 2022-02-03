package com.mph.dao;

import java.util.List; 

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createEmployee(Employee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee Saved successfully...");
		
	}

	@Override
	public List<Employee> updateEmployee(Employee employee) {
		
		Query qry = getSession()
				.createQuery(" update Employee  e set ename=:ename,email=:email,password=:password,role=:role,phone=:phone,worklocation=:worklocation where eid=:eid");
        qry.setParameter("ename", employee.getEname());
        qry.setParameter("email", employee.getEmail());
        qry.setParameter("password", employee.getPassword());
        qry.setParameter("role", employee.getRole());
        qry.setParameter("phone", employee.getPhone());
        qry.setParameter("worklocation", employee.getWorklocation());
        qry.setParameter("eid", employee.getEid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		
		return getAllEmployee();
			}

	

	@Override
	public Employee getEmployee(int eid) {
		Query qry = getSession().createQuery("from Employee e where eid=:eid");
		qry.setParameter("eid", eid);
		Employee emp = (Employee) qry.uniqueResult();
		System.out.println("search result : " + emp);
		return emp;
	}
	/*
	@Override
	public Employee getEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Criteria c = getSession().createCriteria(Employee.class);
		c.add(Restrictions.eq("eid", emp.getEid()));
		Employee empl = (Employee) c.uniqueResult();
		return empl;
	}

	@Override
	public List<Employee> getEmployee() {
		return null;
	}

	*/

	@Override
	public List<Employee> getAllEmployee() {
		Query qry = getSession().createQuery("select e from Employee e");
		List<Employee> emplist = qry.list();
		System.out.println("emp list from dao : " + emplist);
		return emplist;
	}

	
	


}
