package com.loandisbursement.masterModel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RelationalExecutivedetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reId;
	private String reName;
	private String userName;
	private String passWord;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name ="operationalExecutive")
	private Set<OperationalExecutive> operationalExecutive=new HashSet<OperationalExecutive>();
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "custPDetails")
	private CustomerPersonalDetails customerPersonalDetails ;

	public Integer getReId() {
		return reId;
	}

	public void setReId(Integer reId) {
		this.reId = reId;
	}

	public String getReName() {
		return reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Set<OperationalExecutive> getOperationalExecutive() {
		return operationalExecutive;
	}

	public void setOperationalExecutive(Set<OperationalExecutive> operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}

	public CustomerPersonalDetails getCustomerPersonalDetails() {
		return customerPersonalDetails;
	}

	public void setCustomerPersonalDetails(CustomerPersonalDetails customerPersonalDetails) {
		this.customerPersonalDetails = customerPersonalDetails;
	}

	
	
	
}
