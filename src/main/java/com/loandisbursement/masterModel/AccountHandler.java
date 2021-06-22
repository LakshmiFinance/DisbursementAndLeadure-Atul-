package com.loandisbursement.masterModel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class AccountHandler 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer acId;
	private String acName;
	private String userName;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "operationalEx_id")
	private OperationalExecutive operationalExecutive;

	public Integer getAcId() {
		return acId;
	}

	public void setAcId(Integer acId) {
		this.acId = acId;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OperationalExecutive getOperationalExecutive() {
		return operationalExecutive;
	}

	public void setOperationalExecutive(OperationalExecutive operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}

	
	


}
