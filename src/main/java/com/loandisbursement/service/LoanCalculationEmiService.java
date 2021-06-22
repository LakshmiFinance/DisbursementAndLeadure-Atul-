package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.LoanCalculationEmi;

public interface LoanCalculationEmiService {

	void saveEmi(LoanCalculationEmi loancalemi);

	List<LoanCalculationEmi> getLoanCal();

}
