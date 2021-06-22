package com.loandisbursement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LedgerCreation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lcid;
	private double processingFee;
	private double totalInterest;
	private Integer numberOfMonth;
	private String sanctionDate;
	private String status;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "lcemi_id")
	private LoanCalculationEmi loanCalculationEmi;

	

	public Integer getLcid() {
		return lcid;
	}

	public void setLcid(Integer lcid) {
		this.lcid = lcid;
	}

	public double getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}

	public double getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}

	public Integer getNumberOfMonth() {
		return numberOfMonth;
	}

	public void setNumberOfMonth(Integer numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}

	public String getSanctionDate() {
		return sanctionDate;
	}

	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LoanCalculationEmi getLoanCalculationEmi() {
		return loanCalculationEmi;
	}

	public void setLoanCalculationEmi(LoanCalculationEmi loanCalculationEmi) {
		this.loanCalculationEmi = loanCalculationEmi;
	}

}
