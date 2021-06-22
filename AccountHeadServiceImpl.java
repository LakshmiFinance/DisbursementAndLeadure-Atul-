package com.loandisbursment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursment.model.AccountHead;
import com.loandisbursment.repository.AccountHeadRepository;
import com.loandisbursment.service.AccountHeadService;

@Service
public class AccountHeadServiceImpl implements AccountHeadService{

	@Autowired
	AccountHeadRepository hr;

	@Override
	public void saveAccountHead(AccountHead ach) {
	  hr.save(ach);
		
	}

	@Override
	public List<AccountHead> getAllAccountHeadId() {
		
		return hr.findAll();
	}
}
