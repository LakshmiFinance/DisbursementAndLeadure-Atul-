package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.AccountHead;
import com.loandisbursement.service.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	private HomeService hs;
	

	@PostMapping("/Register")
	public void addAccountHead(@RequestBody AccountHead ach)
	{
		 hs.saveAccountHead(ach); 
	}
	
	@GetMapping("/getAllAccountHead")
	public List<AccountHead> getAllAccountHDetails()
	{
		return hs.getAllAccountHeadId();
	}

}
