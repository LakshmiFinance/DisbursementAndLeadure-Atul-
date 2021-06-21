package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.AccountHead;
import com.loandisbursement.model.CustomerLoanDetails;
import com.loandisbursement.service.AccountHeadService;

@CrossOrigin("*")
@RestController
public class AccountHeadController {
	
	@Autowired
	AccountHeadService ahs;
	
	
	@PostMapping("/registerData")
	public String saveAccountHeadDetails(@RequestBody AccountHead ah)
	{
		ahs.saveData(ah);
		return "Data Save Successfully....";
	}
	
	@GetMapping("/getAllData")
	public List<AccountHead> getAccountHeadDetails()
	{
		List<AccountHead> list=ahs.getAllData();
		return list;
		
	}


}
