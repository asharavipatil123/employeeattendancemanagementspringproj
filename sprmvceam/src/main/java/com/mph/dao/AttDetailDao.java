package com.mph.dao;
import java.util.List;

import com.mph.entity.AttDetail;
import com.mph.entity.LeaveDetail;

public interface AttDetailDao {
	public void createAttDetail(AttDetail attDetail);
	public List<AttDetail> getAllAttDetail();
}
