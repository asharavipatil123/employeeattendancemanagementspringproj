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

import com.mph.entity.AttDetail;

import com.mph.service.AttDetailService;


@RestController
@RequestMapping("/attdetail")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST} )
public class AttDetailRestController {
	@Autowired
	public AttDetailService attDetailService;
	
	@GetMapping("/allAttDetail")
	public ResponseEntity<List<AttDetail>> listAllAttDetail() {
		List<AttDetail> ld = attDetailService.getAllAttDetail();
		if (ld.isEmpty()) {
			return new ResponseEntity<List<AttDetail>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<AttDetail>>(ld,HttpStatus.OK);
	}
	
	@PostMapping("/createAtt")
	public AttDetail createAttDetail(@RequestBody AttDetail attDetail) {
		attDetailService.createAttDetail(attDetail);
		return attDetail;
	}
}

