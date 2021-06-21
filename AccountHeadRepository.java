package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.model.AccountHead;

@Repository
public interface AccountHeadRepository extends JpaRepository<AccountHead, Integer>
{
	

}
