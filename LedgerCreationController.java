package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.LedgerCreation;
import com.loandisbursement.service.LedgerCreationService;

@CrossOrigin("*")
@RestController

public class LedgerCreationController {

	@Autowired
	private LedgerCreationService LedgerCreation;
	
	@RequestMapping(value = "getLc",method = RequestMethod.GET)
	public List<LedgerCreation> getEmi()
	{
		return LedgerCreation.getAllLc();
	}
	
	@RequestMapping(value = "/saveLc", method = RequestMethod.POST)
	public void saveLc(@RequestBody LedgerCreation lc)
	{
		LedgerCreation.saveLc(lc);
	}
	
	@RequestMapping(value = "getLc/{lcId}",method = RequestMethod.GET)
	public LedgerCreation getLc(@PathVariable(value="lcId")int lcId)
	{
		return LedgerCreation.getLc(lcId);
	}

}

