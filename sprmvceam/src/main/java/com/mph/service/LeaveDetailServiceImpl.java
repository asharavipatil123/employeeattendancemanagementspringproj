package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.LeaveDetailDao;
import com.mph.entity.LeaveDetail;




@Service
@Transactional
public class LeaveDetailServiceImpl implements LeaveDetailService {
	@Autowired
	public LeaveDetailDao leaveDetailDao;
	
	@Override
	public void createLeave(LeaveDetail leaveDetail) {
		// TODO Auto-generated method stub
		leaveDetailDao.createLeave(leaveDetail);
		
	}

	@Override
	public List<LeaveDetail> getAllLeaveDetail() {
		return leaveDetailDao.getAllLeaveDetail();
	}

}
