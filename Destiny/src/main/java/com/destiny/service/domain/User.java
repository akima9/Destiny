package com.destiny.service.domain;

import java.util.Date;
import java.util.List;

public class User {
	
	private String	userId;
	private String	password;
	private String	email;
	private String	address;
	private Date	birthday;
	private String	profile;
	private String	nickName;
	private String	gender;
	private String	phone;
	private String	interest1;
	private String	interest2;
	private String	interest3;
	private String	userGrade;
	private String	myType;
	private List	partnerType;
	private String	userState;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInterest1() {
		return interest1;
	}
	public void setInterest1(String interest1) {
		this.interest1 = interest1;
	}
	public String getInterest2() {
		return interest2;
	}
	public void setInterest2(String interest2) {
		this.interest2 = interest2;
	}
	public String getInterest3() {
		return interest3;
	}
	public void setInterest3(String interest3) {
		this.interest3 = interest3;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getMyType() {
		return myType;
	}
	public void setMyType(String myType) {
		this.myType = myType;
	}
	public List getPartnerType() {
		return partnerType;
	}
	public void setPartnerType(List partnerType) {
		this.partnerType = partnerType;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", profile=" + profile + ", nickName=" + nickName + ", gender=" + gender
				+ ", phone=" + phone + ", interest1=" + interest1 + ", interest2=" + interest2 + ", interest3="
				+ interest3 + ", userGrade=" + userGrade + ", myType=" + myType + ", partnerType=" + partnerType
				+ ", userState=" + userState + "]";
	}
	
	

}
