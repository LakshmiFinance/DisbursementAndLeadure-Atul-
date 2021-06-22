package com.loandisbursment.service;

import java.util.List;

import com.loandisbursment.model.LoanDisbursementDetails;

public interface LoanDisbursementDetailsService {

	List<LoanDisbursementDetails> getAllLoanDisbursementId();

	LoanDisbursementDetails getLoanDisById(Integer id);

	void saveLoanDisbursementDetails(LoanDisbursementDetails ldd);

}
