package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.LeaveDetail;

import com.mph.service.LeaveDetailService;



@RestController
@RequestMapping("/leavedetail")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST} )
public class LeaveDetailRestController {
	
	
	@Autowired
	public LeaveDetailService leaveDetailService;
	LeaveDetail leaveDetail;
	
	
	@GetMapping("/allLeavedetail")
	public ResponseEntity<List<LeaveDetail>> listAllLeaveDetail() {
		List<LeaveDetail> ld = leaveDetailService.getAllLeaveDetail();
		if (ld.isEmpty()) {
			return new ResponseEntity<List<LeaveDetail>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<LeaveDetail>>(ld,HttpStatus.OK);
	}
	
	
	@PostMapping("/createLeave")
	public LeaveDetail createLeave(@RequestBody LeaveDetail leaveDetail) {
		leaveDetailService.createLeave(leaveDetail);
		return leaveDetail;
	}

}
