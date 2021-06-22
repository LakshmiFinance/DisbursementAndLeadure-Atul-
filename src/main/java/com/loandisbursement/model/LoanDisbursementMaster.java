package com.loandisbursement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.loandisbursement.masterModel.BankDetails;
@Entity
public class LoanDisbursementMaster 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanDisbursementMId;
	private String loanType;
	private String amountPayType;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String accountType;
	private double transferAmount;
	private Boolean paymentStatus;
	private String amountPaidDate;
	
	public Integer getLoanDisbursementMId() {
		return loanDisbursementMId;
	}
	public void setLoanDisbursementMId(Integer loanDisbursementMId) {
		this.loanDisbursementMId = loanDisbursementMId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getAmountPayType() {
		return amountPayType;
	}
	public void setAmountPayType(String amountPayType) {
		this.amountPayType = amountPayType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public Boolean getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAmountPaidDate() {
		return amountPaidDate;
	}
	public void setAmountPaidDate(String amountPaidDate) {
		this.amountPaidDate = amountPaidDate;
	}
	
}
