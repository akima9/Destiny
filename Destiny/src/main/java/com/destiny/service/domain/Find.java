package com.destiny.service.domain;

import java.util.List;

public class Find {

	private Meeting	findMeeting;
	private	String		selectGender;
	private	String		selectAge;
	private	String		selectAdress;
	private	String		selectInterest01;
	private	String		selectInterest02;
	private	String		selectInterest03;
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


	public String getSelectInterest01() {
		return selectInterest01;
	}


	public void setSelectInterest01(String selectInterest01) {
		this.selectInterest01 = selectInterest01;
	}


	public String getSelectInterest02() {
		return selectInterest02;
	}


	public void setSelectInterest02(String selectInterest02) {
		this.selectInterest02 = selectInterest02;
	}


	public String getSelectInterest03() {
		return selectInterest03;
	}


	public void setSelectInterest03(String selectInterest03) {
		this.selectInterest03 = selectInterest03;
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
				+ ", selectAdress=" + selectAdress + ", selectInterest01=" + selectInterest01 + ", selectInterest02="
				+ selectInterest02 + ", selectInterest03=" + selectInterest03 + ", city=" + city + ", town=" + town
				+ "]";
	}
	
	
	
}
