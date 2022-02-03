package com.mph.service;



import java.util.List;

import com.mph.entity.LeaveDetail;

public interface LeaveDetailService {
	public void createLeave(LeaveDetail leaveDetail);

	public List<LeaveDetail> getAllLeaveDetail();

}
