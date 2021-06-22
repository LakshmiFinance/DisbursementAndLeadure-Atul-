package com.loandisbursement.masterModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RelationalMasterFunctionality 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rmfId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cus_id")
	private RelationalExecutivedetails res;

}
