package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.LedgerCreation;

public interface LedgerCreationService 
{
	public List<LedgerCreation> getAllLc();
	
	public void saveLc(LedgerCreation lc);
	
	public LedgerCreation getLc(int id);

}
