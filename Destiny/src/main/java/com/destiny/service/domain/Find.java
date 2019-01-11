package com.destiny.service.domain;

import java.util.List;

public class Find {

	private	User			findUser;
	private Meeting	findMeeting;
	private	String		selectGender;
	private	int			startAge;
	private int			endAge;
	private	String		selctAdress;
	private	String		selectInterest01;
	private	String		selectInterest02;
	private	String		selectInterest03;
	private	String		city;
	private	String		town;


	public Find() {
	}


	public User getFindUser() {
		return findUser;
	}


	public void setFindUser(User findUser) {
		this.findUser = findUser;
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


	public int getStartAge() {
		return startAge;
	}


	public void setStartAge(int startAge) {
		this.startAge = startAge;
	}


	public int getEndAge() {
		return endAge;
	}


	public void setEndAge(int endAge) {
		this.endAge = endAge;
	}


	public String getSelctAdress() {
		return selctAdress;
	}


	public void setSelctAdress(String selctAdress) {
		this.selctAdress = selctAdress;
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
		return "Find [findUser=" + findUser + ", findMeeting=" + findMeeting + ", selectGender=" + selectGender
				+ ", startAge=" + startAge + ", endAge=" + endAge + ", selctAdress=" + selctAdress
				+ ", selectInterest01=" + selectInterest01 + ", selectInterest02=" + selectInterest02
				+ ", selectInterest03=" + selectInterest03 + ", city=" + city + ", town=" + town + "]";
	}


	
	

	
}
