package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.CustomerLoanDetails;
import com.loandisbursement.service.CustomerLoanDetailsService;

@CrossOrigin("*")
@RestController
public class CustomerLoanDetailsController 
{
	@Autowired
	CustomerLoanDetailsService clds;
	
	@PostMapping("/saveData")
	public String saveDetails(@RequestBody CustomerLoanDetails cust)
	{
		clds.saveData(cust);
		return "Data Save Successfully....";
	}
	
	@GetMapping("/getData")
	public List<CustomerLoanDetails> getDetails()
	{
		List<CustomerLoanDetails> list=clds.getAllData();
		return list;
		
	}

}
