package com.loandisbursment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursment.model.AccountHead;
import com.loandisbursment.model.LoanDisbursementDetails;
import com.loandisbursment.service.AccountHeadService;

@CrossOrigin("*")
@RestController
public class AccountHeadController {

	@Autowired
	AccountHeadService hs;
	
	@PostMapping("/Register")
	public void addAccountHead(@RequestBody AccountHead ach )
	{
		 hs.saveAccountHead(ach); 
	}
	
	@GetMapping("/getAllAccountHead")
	public List<AccountHead> getAllAccountHDetails()
	{
		return hs.getAllAccountHeadId();
	}
	
}
