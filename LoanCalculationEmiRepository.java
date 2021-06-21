package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.model.LoanCalculationEmi;

@Repository
public interface LoanCalculationEmiRepository extends JpaRepository<LoanCalculationEmi,Integer>
{

}
