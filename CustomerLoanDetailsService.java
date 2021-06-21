package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.CustomerLoanDetails;

public interface CustomerLoanDetailsService 
{
	public List<CustomerLoanDetails> getDetails();

}
