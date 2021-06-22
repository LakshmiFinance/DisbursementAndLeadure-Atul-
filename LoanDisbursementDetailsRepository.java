package com.loandisbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursment.model.LoanDisbursementDetails;

@Repository
public interface LoanDisbursementDetailsRepository extends JpaRepository<LoanDisbursementDetails, Integer>
{

}
