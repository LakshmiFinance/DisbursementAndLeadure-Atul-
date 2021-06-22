package com.loandisbursment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.loandisbursment.MasterModel.CustomerPersonalDetails;
import com.loandisbursment.Model.AccountHead;

public interface HomeRepository extends JpaRepository<AccountHead, Integer>{

}
