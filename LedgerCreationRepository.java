package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.model.LedgerCreation;

@Repository
public interface LedgerCreationRepository extends JpaRepository<LedgerCreation,Integer>
{
	LedgerCreation findByLcId(int lcId);
}
