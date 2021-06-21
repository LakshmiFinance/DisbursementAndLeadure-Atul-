package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.AccountHead;

public interface AccountHeadService {

	public void saveData(AccountHead ah);

	public List<AccountHead> getAllData();

}
