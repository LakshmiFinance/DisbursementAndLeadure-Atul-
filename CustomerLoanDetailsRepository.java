package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.model.CustomerLoanDetails;

@Repository
public interface CustomerLoanDetailsRepository extends JpaRepository<CustomerLoanDetails, Integer>{

}
