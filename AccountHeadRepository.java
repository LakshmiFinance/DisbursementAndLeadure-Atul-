package com.loandisbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.loandisbursment.mastermodel.CustomerPersonalDetails;
import com.loandisbursment.model.AccountHead;

@Repository
public interface AccountHeadRepository extends JpaRepository<AccountHead, Integer> {

}
