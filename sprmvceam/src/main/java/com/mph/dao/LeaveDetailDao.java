package com.mph.dao;


import java.util.List;

import com.mph.entity.LeaveDetail;

public interface LeaveDetailDao {
	public void createLeave(LeaveDetail leaveDetail);
	public List<LeaveDetail> getAllLeaveDetail();

}
