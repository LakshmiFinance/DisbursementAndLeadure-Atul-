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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OperationalExecutive 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oeId;
	private String oeName;
	private String userName;
	private String password;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "oe_Id")
	private RelationalExecutivedetails relationalExecutivedetails;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "acc_Id")
	private AccountHandler accountHandler;

	public Integer getOeId() {
		return oeId;
	}

	public void setOeId(Integer oeId) {
		this.oeId = oeId;
	}

	public String getOeName() {
		return oeName;
	}

	public void setOeName(String oeName) {
		this.oeName = oeName;
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

	public RelationalExecutivedetails getRelationalExecutivedetails() {
		return relationalExecutivedetails;
	}

	public void setRelationalExecutivedetails(RelationalExecutivedetails relationalExecutivedetails) {
		this.relationalExecutivedetails = relationalExecutivedetails;
	}

	public AccountHandler getAccountHandler() {
		return accountHandler;
	}

	public void setAccountHandler(AccountHandler accountHandler) {
		this.accountHandler = accountHandler;
	}

	
	
}
