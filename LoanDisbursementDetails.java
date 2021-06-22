package com.loandisbursment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LoanDisbursementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanDisbursementId;
	private Integer loanMasterDetailsId;
	private Integer loanId;
	private String loanType;
	private double loanAmount;
	
	

	public Integer getLoanDisbursementId() {
		return loanDisbursementId;
	}

	public void setLoanDisbursementId(Integer loanDisbursementId) {
		this.loanDisbursementId = loanDisbursementId;
	}

	public Integer getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}

	public void setLoanMasterDetailsId(Integer loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	

}
