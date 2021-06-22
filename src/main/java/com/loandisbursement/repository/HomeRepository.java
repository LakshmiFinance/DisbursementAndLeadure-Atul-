package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.AccountHead;

@Repository
public interface HomeRepository extends JpaRepository<AccountHead,Integer>
{

}
