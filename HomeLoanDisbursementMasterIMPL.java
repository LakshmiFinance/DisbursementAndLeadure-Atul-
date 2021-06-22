package com.loandisbursment.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursment.Model.LoanDisbursementMaster;
import com.loandisbursment.Repository.HomeLoanDisbursementMasterRepository;
import com.loandisbursment.ServiceI.HomeLoanDisbursementMasterI;
@Service
public class HomeLoanDisbursementMasterIMPL implements HomeLoanDisbursementMasterI {
      
	@Autowired
	HomeLoanDisbursementMasterRepository hr;
	
	@Override
	public void saveLoanDisbursementMaster(LoanDisbursementMaster ldm) {
		hr.save(ldm);
		
	}

	@Override
	public List<LoanDisbursementMaster> fetchAllData() {
		
		List<LoanDisbursementMaster>list=(List<LoanDisbursementMaster>) hr.findAll();
		
		return list;
	}
	
	

}
