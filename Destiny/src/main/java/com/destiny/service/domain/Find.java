package com.destiny.service.domain;

import java.util.List;

public class Find {

	private Meeting	findMeeting;
	private	String		selectGender;
	private	String		selectAge;
	private	String		selectAdress;
	private	String		selectInterest;
	private	String		city;
	private	String		town;


	public Find() {
	}


	public Meeting getFindMeeting() {
		return findMeeting;
	}


	public void setFindMeeting(Meeting findMeeting) {
		this.findMeeting = findMeeting;
	}


	public String getSelectGender() {
		return selectGender;
	}


	public void setSelectGender(String selectGender) {
		this.selectGender = selectGender;
	}


	public String getSelectAge() {
		return selectAge;
	}


	public void setSelectAge(String selectAge) {
		this.selectAge = selectAge;
	}


	public String getSelectAdress() {
		return selectAdress;
	}


	public void setSelectAdress(String selectAdress) {
		this.selectAdress = selectAdress;
	}


	public String getSelectInterest() {
		return selectInterest;
	}


	public void setSelectInterest(String selectInterest) {
		this.selectInterest = selectInterest;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	@Override
	public String toString() {
		return "Find [findMeeting=" + findMeeting + ", selectGender=" + selectGender + ", selectAge=" + selectAge
				+ ", selectAdress=" + selectAdress + ", selectInterest=" + selectInterest + ", city=" + city + ", town="
				+ town + "]";
	}

	
	
}
