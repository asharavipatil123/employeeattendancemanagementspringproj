package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.LeaveDetail;

@Repository
public class LeaveDetailDaoImpl implements LeaveDetailDao{
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createLeave(LeaveDetail leaveDetail) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(leaveDetail);
		System.out.println("LeaveDetails Saved successfully...");
	}

	@Override
	public List<LeaveDetail> getAllLeaveDetail() {
		Query qry = getSession().createQuery("select l from LeaveDetail l");
		List<LeaveDetail> leavelist = qry.list();
		System.out.println("emp list from dao : " + leavelist);
		return leavelist;
	}

}
