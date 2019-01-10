package com.destiny.service.domain;

import java.util.List;

public class Find {

	private	User		userFind;
	private Meeting		meetingFind;
	private	String		selectGender;
	private	int			startAge;
	private int			endAge;
	private	String		selctAdress;
	private	List		selectType;
	private	String		city;
	private	String		town;
	public User getUserFind() {
		return userFind;
	}
	public void setUserFind(User userFind) {
		this.userFind = userFind;
	}
	public Meeting getMeetingFind() {
		return meetingFind;
	}
	public void setMeetingFind(Meeting meetingFind) {
		this.meetingFind = meetingFind;
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
	public List getSelectType() {
		return selectType;
	}
	public void setSelectType(List selectType) {
		this.selectType = selectType;
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
		return "Find [userFind=" + userFind + ", meetingFind=" + meetingFind + ", selectGender=" + selectGender
				+ ", startAge=" + startAge + ", endAge=" + endAge + ", selctAdress=" + selctAdress + ", selectType="
				+ selectType + ", city=" + city + ", town=" + town + "]";
	}
	
	
}
