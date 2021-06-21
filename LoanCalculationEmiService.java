package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.LoanCalculationEmi;

public interface LoanCalculationEmiService 
{
	public List<LoanCalculationEmi> getLoanCal();
	
	public void saveEmi(LoanCalculationEmi loancalemi);

}
