package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.CustomerLoanDetails;
import com.loandisbursement.service.CustomerLoanDetailsService;

@CrossOrigin("*")
@RestController
public class CustomerLoanDetailsController 
{
	@Autowired
	private CustomerLoanDetailsService cusloDet;
	
	@GetMapping("/getAllloanDet")
	public List<CustomerLoanDetails> getAllDetailes()
	{
		return cusloDet.getDetails();
		
	}

}
