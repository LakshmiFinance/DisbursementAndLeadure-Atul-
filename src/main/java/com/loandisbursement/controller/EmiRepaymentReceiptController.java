package com.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loandisbursement.model.EmiRepaymentReceipt;
import com.loandisbursement.service.EmiRepaymentReceiptService;
@CrossOrigin("*")
@RestController
public class EmiRepaymentReceiptController 
{
	@Autowired
	private EmiRepaymentReceiptService emiRepaymentReceipt;
	
	@RequestMapping(value = "getEmi",method = RequestMethod.GET)
	public List<EmiRepaymentReceipt> getEmi()
	{
		return emiRepaymentReceipt.getAllEmi();
	}
	
	@RequestMapping(value = "/saveEmi", method = RequestMethod.POST)
	public void saveEmi(@RequestBody EmiRepaymentReceipt emireci)
	{
		emiRepaymentReceipt.saveEmiRepayReci0(emireci);
	}
	
	@RequestMapping(value = "getInvoice/{invoiceId}",method = RequestMethod.GET)
	public EmiRepaymentReceipt getInvoice(@PathVariable(value="invoiceId")int invoiceId)
	{
		return emiRepaymentReceipt.getInvoice(invoiceId);
	}

}
