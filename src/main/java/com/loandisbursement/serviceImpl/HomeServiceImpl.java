package com.loandisbursement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.masterModel.CustomerPersonalDetails;
import com.loandisbursement.model.AccountHead;
import com.loandisbursement.repository.HomeRepository;
import com.loandisbursement.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	private HomeRepository hr;

	@Override
	public List<AccountHead> getAllAccountHeadId() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void saveAccountHead(AccountHead ach) {
		 hr.save(ach);	
	}

	

}
