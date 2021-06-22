package com.loandisbursement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LoanCalculationEmi 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lcEmiId;
	private double emiAmount;
	private int totalEmi;
	
	private double emiInterest;
	private String startDate;
	
	
	public Integer getLcEmiId() {
		return lcEmiId;
	}
	public void setLcEmiId(Integer lcEmiId) {
		this.lcEmiId = lcEmiId;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public double getEmiInterest() {
		return emiInterest;
	}
	public void setEmiInterest(double emiInterest) {
		this.emiInterest = emiInterest;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getTotalEmi() {
		return totalEmi;
	}
	public void setTotalEmi(int totalEmi) {
		this.totalEmi = totalEmi;
	}
	
	
}
