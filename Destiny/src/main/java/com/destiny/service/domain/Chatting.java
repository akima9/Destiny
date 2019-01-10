package com.destiny.service.domain;

import java.util.Date;

public class Chatting {
	
	private String		beforeTranslationText;
	private String		afterTranslationText;
	private Date		chattingDate;
	private String		chattingTime;
	private String		anonymousNickName;
	private String		language;
	private int			favorability;
	private Telepathy	telepathy;
	private boolean		contactMeeting;
	
	
	
	public String getBeforeTranslationText() {
		return beforeTranslationText;
	}



	public void setBeforeTranslationText(String beforeTranslationText) {
		this.beforeTranslationText = beforeTranslationText;
	}



	public String getAfterTranslationText() {
		return afterTranslationText;
	}



	public void setAfterTranslationText(String afterTranslationText) {
		this.afterTranslationText = afterTranslationText;
	}



	public Date getChattingDate() {
		return chattingDate;
	}



	public void setChattingDate(Date chattingDate) {
		this.chattingDate = chattingDate;
	}



	public String getChattingTime() {
		return chattingTime;
	}



	public void setChattingTime(String chattingTime) {
		this.chattingTime = chattingTime;
	}



	public String getAnonymousNickName() {
		return anonymousNickName;
	}



	public void setAnonymousNickName(String anonymousNickName) {
		this.anonymousNickName = anonymousNickName;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public int getFavorability() {
		return favorability;
	}



	public void setFavorability(int favorability) {
		this.favorability = favorability;
	}



	public Telepathy getTelepathy() {
		return telepathy;
	}



	public void setTelepathy(Telepathy telepathy) {
		this.telepathy = telepathy;
	}



	public boolean isContactMeeting() {
		return contactMeeting;
	}



	public void setContactMeeting(boolean contactMeeting) {
		this.contactMeeting = contactMeeting;
	}



	@Override
	public String toString() {
		return "Chatting [beforeTranslationText=" + beforeTranslationText + ", afterTranslationText="
				+ afterTranslationText + ", chattingTime=" + chattingTime + ", anonymousNickName=" + anonymousNickName
				+ ", language=" + language + ", favorability=" + favorability + ", contactMeeting=" + contactMeeting
				+ "]";
	}
	
}
