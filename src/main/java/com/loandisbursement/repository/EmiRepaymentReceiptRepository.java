package com.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loandisbursement.model.EmiRepaymentReceipt;

@Repository
public interface EmiRepaymentReceiptRepository extends JpaRepository<EmiRepaymentReceipt,Integer>
{
	EmiRepaymentReceipt findByInvoiceId(int invoiceId);
}
