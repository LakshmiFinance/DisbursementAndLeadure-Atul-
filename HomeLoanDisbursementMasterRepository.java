package com.loandisbursment.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loandisbursment.Model.LoanDisbursementMaster;

public interface HomeLoanDisbursementMasterRepository extends CrudRepository<LoanDisbursementMaster, Integer> {

	

	List<LoanDisbursementMaster> findAll();

}
