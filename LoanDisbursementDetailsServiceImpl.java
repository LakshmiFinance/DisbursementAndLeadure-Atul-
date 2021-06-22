package com.loandisbursment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursment.model.LoanDisbursementDetails;
import com.loandisbursment.repository.LoanDisbursementDetailsRepository;
import com.loandisbursment.service.LoanDisbursementDetailsService;

@Service
public class LoanDisbursementDetailsServiceImpl implements LoanDisbursementDetailsService {

	@Autowired
	LoanDisbursementDetailsRepository lddrepo;

	@Override
	public List<LoanDisbursementDetails> getAllLoanDisbursementId() {
		
		return lddrepo.findAll();
	}

	@Override
	public LoanDisbursementDetails getLoanDisById(Integer id) {
		
		return lddrepo.getById(id);
	}

	@Override
	public void saveLoanDisbursementDetails(LoanDisbursementDetails ldd) {
		lddrepo.save(ldd);
		
	}
	
	
	
}
