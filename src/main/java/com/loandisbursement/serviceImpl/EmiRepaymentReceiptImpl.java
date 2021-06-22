package com.loandisbursement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loandisbursement.model.EmiRepaymentReceipt;
import com.loandisbursement.repository.EmiRepaymentReceiptRepository;
import com.loandisbursement.service.EmiRepaymentReceiptService;

@Service
public class EmiRepaymentReceiptImpl implements EmiRepaymentReceiptService
{

	@Autowired
	private EmiRepaymentReceiptRepository emiRepayReceipt;
	
	@Override
	public List<EmiRepaymentReceipt> getAllEmi() 
	{
		
		return emiRepayReceipt.findAll();
	}

	@Override
	public void saveEmiRepayReci0(EmiRepaymentReceipt emireci)
	{
		emiRepayReceipt.save(emireci);
		
	}

	@Override
	public EmiRepaymentReceipt getInvoice(int id) {
		
		return emiRepayReceipt.findByInvoiceId(id);
	}
	

}
