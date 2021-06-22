package com.loandisbursement.service;

import java.util.List;

import com.loandisbursement.model.EmiRepaymentReceipt;

public interface EmiRepaymentReceiptService 
{
	public List<EmiRepaymentReceipt> getAllEmi();
	
	public void saveEmiRepayReci0(EmiRepaymentReceipt emireci);
	
	public EmiRepaymentReceipt getInvoice(int id);

}
