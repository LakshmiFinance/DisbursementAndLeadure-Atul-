package com.loandisbursement.masterModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private Integer localHouseNo;
	private String localArea;
	private String localLandmark;
	private String locality;
	private String permanantHouseNo;
	private String permanantArea;
	private String permanantLandMark;
	private String permanantCity;
	private String state;
	private String country;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Integer getLocalHouseNo() {
		return localHouseNo;
	}
	public void setLocalHouseNo(Integer localHouseNo) {
		this.localHouseNo = localHouseNo;
	}
	public String getLocalArea() {
		return localArea;
	}
	public void setLocalArea(String localArea) {
		this.localArea = localArea;
	}
	public String getLocalLandmark() {
		return localLandmark;
	}
	public void setLocalLandmark(String localLandmark) {
		this.localLandmark = localLandmark;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getPermanantHouseNo() {
		return permanantHouseNo;
	}
	public void setPermanantHouseNo(String permanantHouseNo) {
		this.permanantHouseNo = permanantHouseNo;
	}
	public String getPermanantArea() {
		return permanantArea;
	}
	public void setPermanantArea(String permanantArea) {
		this.permanantArea = permanantArea;
	}
	public String getPermanantLandMark() {
		return permanantLandMark;
	}
	public void setPermanantLandMark(String permanantLandMark) {
		this.permanantLandMark = permanantLandMark;
	}
	public String getPermanantCity() {
		return permanantCity;
	}
	public void setPermanantCity(String permanantCity) {
		this.permanantCity = permanantCity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	


}
