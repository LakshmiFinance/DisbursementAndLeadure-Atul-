package com.loandisbursement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.model.AccountHead;
import com.loandisbursement.repository.AccountHeadRepository;
import com.loandisbursement.service.AccountHeadService;

@Service
public class AccountHeadServiceImpl implements AccountHeadService {

	@Autowired
	AccountHeadRepository ahr;

	@Override
	public void saveData(AccountHead ah)
	{
		ahr.save(ah);
	}

	@Override
	public List<AccountHead> getAllData() {
		return ahr.findAll();
	}
	
}
