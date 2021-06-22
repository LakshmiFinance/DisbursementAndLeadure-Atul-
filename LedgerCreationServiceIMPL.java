package com.loandisbursement.serviceIMPL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.model.LedgerCreation;
import com.loandisbursement.repository.LedgerCreationRepository;
import com.loandisbursement.service.LedgerCreationService;

@Service
public class LedgerCreationIMPL implements LedgerCreationService{
	@Autowired
	private LedgerCreationRepository ledgerCreation;
	
	@Override
	public List<LedgerCreation> getAllLc() 
	{
		
		return ledgerCreation.findAll();
	}

	@Override
	public void saveLc(LedgerCreation lc)
	{
		ledgerCreation.save(lc);
		
	}

	@Override
	public LedgerCreation getLc(int id) {
		
		return ledgerCreation.findByLcId(id);
	}
	

}
