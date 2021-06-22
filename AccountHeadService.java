package com.loandisbursment.service;

import java.util.List;

import com.loandisbursment.model.AccountHead;

public interface AccountHeadService {

	void saveAccountHead(AccountHead ach);

	List<AccountHead> getAllAccountHeadId();

}
