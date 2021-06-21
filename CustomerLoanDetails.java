package com.loandisbursement.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.loandisbursement.masterclass.CustomerPersonalDetails;
import com.loandisbursement.masterclass.LoanDetails;

@Entity
public class CustomerLoanDetails
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanId;
	private Integer loanCode;
	private String customerName;
	private String loanType;
	private double loanAmount;
	private double rateofInterest;
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public Integer getLoanCode() {
		return loanCode;
	}
	public void setLoanCode(Integer loanCode) {
		this.loanCode = loanCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public double getRateofInterest() {
		return rateofInterest;
	}
	public void setRateofInterest(double rateofInterest) {
		this.rateofInterest = rateofInterest;
	}
	
	
	
	
	
	
}
