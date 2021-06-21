package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.CustomerLoanDetails;

public interface CustomerLoanDetailsService {

	public void saveData(CustomerLoanDetails cust);

	public List<CustomerLoanDetails> getAllData();
	


}
