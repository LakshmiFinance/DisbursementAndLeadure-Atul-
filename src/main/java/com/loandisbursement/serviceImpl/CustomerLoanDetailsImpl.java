package com.loandisbursement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.CustomerLoanDetails;
import com.loandisbursement.repository.CustomerLoanDetailsRepository;
import com.loandisbursement.service.CustomerLoanDetailsService;
@Service
public class CustomerLoanDetailsImpl implements CustomerLoanDetailsService
{

	@Autowired
	private CustomerLoanDetailsRepository cusloDet;
	
	@Override
	public List<CustomerLoanDetails> getDetails() 
	{
		
		return cusloDet.findAll();
	}

}
