package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.LoanCalculationEmi;
import com.loandisbursement.service.LoanCalculationEmiService;

@RestController
public class LoanCalculationEmiController 
{
	@Autowired
	private LoanCalculationEmiService loanCalculationEmi;
	
	@RequestMapping(value = "getloanCal",method = RequestMethod.GET)
	public List<LoanCalculationEmi> getLoanCalculationEmi()
	{
		return loanCalculationEmi.getLoanCal();
		
	}

	@RequestMapping(value = "/postloanCal", method = RequestMethod.POST)
	public void saveloanCalculationEmi(@RequestBody LoanCalculationEmi loancalemi)
	{
		loanCalculationEmi.saveEmi(loancalemi);
	}
}
