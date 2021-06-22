package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.AccountHead;

public interface HomeService 
{
	public List<AccountHead> getAllAccountHeadId();
	
	public void saveAccountHead(AccountHead ach);;
	

}
