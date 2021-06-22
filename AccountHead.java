package com.loandisbursment.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.loandisbursment.MasterModel.OperationalExecutive;
@Entity
public class AccountHead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountHeadId;
	private String username;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ldm_id")
	private LoanDisbursementMaster loanDisbursementMaster;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ldd_id")
	private LoanDisbursementDetails  loanDisbursementDetails;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "erp_id")
	private EmiRepaymentReceipt  emiRepaymentReceipt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ledger_id")
	private LedgerCreation ledgerCreation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "loan_id")
	private CustomerLoanDetails customerLoanDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "lcEmi_id")
	private LoanCalculationEmi loanCalculationEmi;

	public Integer getAccountHeadId() {
		return accountHeadId;
	}

	public void setAccountHeadId(Integer accountHeadId) {
		this.accountHeadId = accountHeadId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoanDisbursementMaster getLoanDisbursementMaster() {
		return loanDisbursementMaster;
	}

	public void setLoanDisbursementMaster(LoanDisbursementMaster loanDisbursementMaster) {
		this.loanDisbursementMaster = loanDisbursementMaster;
	}

	public LoanDisbursementDetails getLoanDisbursementDetails() {
		return loanDisbursementDetails;
	}

	public void setLoanDisbursementDetails(LoanDisbursementDetails loanDisbursementDetails) {
		this.loanDisbursementDetails = loanDisbursementDetails;
	}

	public EmiRepaymentReceipt getEmiRepaymentReceipt() {
		return emiRepaymentReceipt;
	}

	public void setEmiRepaymentReceipt(EmiRepaymentReceipt emiRepaymentReceipt) {
		this.emiRepaymentReceipt = emiRepaymentReceipt;
	}

	public LedgerCreation getLedgerCreation() {
		return ledgerCreation;
	}

	public void setLedgerCreation(LedgerCreation ledgerCreation) {
		this.ledgerCreation = ledgerCreation;
	}

	public CustomerLoanDetails getCustomerLoanDetails() {
		return customerLoanDetails;
	}

	public void setCustomerLoanDetails(CustomerLoanDetails customerLoanDetails) {
		this.customerLoanDetails = customerLoanDetails;
	}

	public LoanCalculationEmi getLoanCalculationEmi() {
		return loanCalculationEmi;
	}

	public void setLoanCalculationEmi(LoanCalculationEmi loanCalculationEmi) {
		this.loanCalculationEmi = loanCalculationEmi;
	}
	
	
	
}