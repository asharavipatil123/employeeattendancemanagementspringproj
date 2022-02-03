package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.AttDetailDao;
import com.mph.entity.AttDetail;
import com.mph.entity.LeaveDetail;
@Service
@Transactional
public class AttDetailServiceImpl implements AttDetailService {
	@Autowired
	public AttDetailDao attDetailDao;
	
	@Override
	public void createAttDetail(AttDetail attDetail) {
		// TODO Auto-generated method stub
		attDetailDao.createAttDetail(attDetail);
		
	}
	
	@Override
	public List<AttDetail> getAllAttDetail() {
		return attDetailDao.getAllAttDetail();
	}
}