package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mph.entity.AttDetail;
import com.mph.entity.LeaveDetail;

public class AttDetailDaoImpl implements AttDetailDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createAttDetail(AttDetail attDetail) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(attDetail);
		System.out.println("AttDetail Saved successfully...");
	}

	@Override
	public List<AttDetail> getAllAttDetail() {
		Query qry = getSession().createQuery("select a from AttDetail a");
		List<AttDetail> attdetaillist = qry.list();
		System.out.println("emp list from dao : " + attdetaillist);
		return attdetaillist;
			}

	
}
