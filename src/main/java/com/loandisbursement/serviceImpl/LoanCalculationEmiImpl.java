package com.loandisbursement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.model.LoanCalculationEmi;
import com.loandisbursement.repository.LoanCalculationEmiRepository;
import com.loandisbursement.service.LoanCalculationEmiService;
@Service
public class LoanCalculationEmiImpl implements LoanCalculationEmiService
{
	@Autowired
	private LoanCalculationEmiRepository loanCalculationEmi;

	@Override
	public void saveEmi(LoanCalculationEmi loancalemi) {
		// TODO Auto-generated method stub
		loanCalculationEmi.save(loancalemi);
	}

	@Override
	public List<LoanCalculationEmi> getLoanCal() {
		// TODO Auto-generated method stub
		return loanCalculationEmi.findAll();
	}
	

//	@Override
//	public void saveEmi(LoanCalculationEmi loancalemi)
//	{
//		loanCalculationEmi.save(loancalemi);
//		
//	}
//
//	@Override
//	public List<LoanCalculationEmi> getLoanCal() {
//	
//		return loanCalculationEmi.findAll();
//	}

}
