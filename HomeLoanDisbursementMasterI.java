package com.loandisbursment.ServiceI;

import java.util.List;

import com.loandisbursment.Model.LoanDisbursementMaster;

public interface HomeLoanDisbursementMasterI {

	void saveLoanDisbursementMaster(LoanDisbursementMaster ldm);

	List<LoanDisbursementMaster> fetchAllData();

}
