package com.loandisbursment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursment.model.LoanDisbursementDetails;
import com.loandisbursment.service.LoanDisbursementDetailsService;


@CrossOrigin("*")
@RestController
public class LoanDisbursementDetailsController {
	
	@Autowired
	LoanDisbursementDetailsService lddservice;

	
	@GetMapping("/getAllLoanDisDetails")
	public List<LoanDisbursementDetails> getAllLoanDisDetails()
	{
		return lddservice.getAllLoanDisbursementId();
	}
	
	/*
	 * @GetMapping("/getLoanDisById") public LoanDisbursementDetails
	 * getLoanDisbursementDetailsById(@PathVariable(value = "id")Integer id) {
	 * return lddservice.getLoanDisById(id); }
	 */
	
	@PostMapping("/OneToOne")
	public void addLoanDisburDetails(@RequestBody LoanDisbursementDetails ldd )
	{
		 lddservice.saveLoanDisbursementDetails(ldd); 
	}
	
	
	
	
	
	
	
	
}
