package com.loandisbursement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.model.CustomerLoanDetails;
import com.loandisbursement.repository.CustomerLoanDetailsRepository;
import com.loandisbursement.service.CustomerLoanDetailsService;

@Service
public class CustomerLoanDetailsServiceImpl implements CustomerLoanDetailsService {

	@Autowired
	CustomerLoanDetailsRepository cldr;
	
	
	@Override
	public void saveData(CustomerLoanDetails cust)
	{
		
		cldr.save(cust);
	}

	@Override
	public List<CustomerLoanDetails> getAllData()
	{
		
		
		return cldr.findAll();
	}

}
