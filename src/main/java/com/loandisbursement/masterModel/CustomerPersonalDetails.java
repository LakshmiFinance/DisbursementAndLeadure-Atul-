 package com.loandisbursement.masterModel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CustomerPersonalDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;                                
	private String customerName;
	private String customerGender;
	private long customerMoblieNo;
	private double customerLoanAmount;
	private Integer customerAge;
	private String customerDoB;
	private String customerEmail;
	private String customerPancardNo;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cus_id")
	private Set<BankDetails> bankDetails=new HashSet<BankDetails>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="C_Id")
	private Set<Address> address =new HashSet<Address>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="C_Id")
	private Set<LoanDetails> loanDetails=new HashSet<>();

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public long getCustomerMoblieNo() {
		return customerMoblieNo;
	}

	public void setCustomerMoblieNo(long customerMoblieNo) {
		this.customerMoblieNo = customerMoblieNo;
	}

	public double getCustomerLoanAmount() {
		return customerLoanAmount;
	}

	public void setCustomerLoanAmount(double customerLoanAmount) {
		this.customerLoanAmount = customerLoanAmount;
	}

	public Integer getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerDoB() {
		return customerDoB;
	}

	public void setCustomerDoB(String customerDoB) {
		this.customerDoB = customerDoB;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPancardNo() {
		return customerPancardNo;
	}

	public void setCustomerPancardNo(String customerPancardNo) {
		this.customerPancardNo = customerPancardNo;
	}

	public Set<BankDetails> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(Set<BankDetails> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<LoanDetails> getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(Set<LoanDetails> loanDetails) {
		this.loanDetails = loanDetails;
	}
	
	
	
}
