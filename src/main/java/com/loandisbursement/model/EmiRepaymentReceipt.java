package com.loandisbursement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmiRepaymentReceipt 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer invoiceId;
	private String emiPayDate;
	private String customerName;
	private String modeOfRepayment;
	private double totalEmi;
	private double remainingEmi;
	private Integer transectionId;
	
	private String disbursementDate;
	private String categoryOfLoan;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ach_id")
	private AccountHead  accountHead;
	
	public AccountHead getAccountHead() {
		return accountHead;
	}
	public void setAccountHead(AccountHead accountHead) {
		this.accountHead = accountHead;
	}
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getEmiPayDate() {
		return emiPayDate;
	}
	public void setEmiPayDate(String emiPayDate) {
		this.emiPayDate = emiPayDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getModeOfRepayment() {
		return modeOfRepayment;
	}
	public void setModeOfRepayment(String modeOfRepayment) {
		this.modeOfRepayment = modeOfRepayment;
	}
	public double getTotalEmi() {
		return totalEmi;
	}
	public void setTotalEmi(double totalEmi) {
		this.totalEmi = totalEmi;
	}
	public double getRemainingEmi() {
		return remainingEmi;
	}
	public void setRemainingEmi(double remainingEmi) {
		this.remainingEmi = remainingEmi;
	}
	public Integer getTransectionId() {
		return transectionId;
	}
	public void setTransectionId(Integer transectionId) {
		this.transectionId = transectionId;
	}
	
	public String getDisbursementDate() {
		return disbursementDate;
	}
	public void setDisbursementDate(String disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	public String getCategoryOfLoan() {
		return categoryOfLoan;
	}
	public void setCategoryOfLoan(String categoryOfLoan) {
		this.categoryOfLoan = categoryOfLoan;
	}
}
