package com.destiny.service.meeting.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.destiny.service.letter.LetterDao;
import com.destiny.service.meeting.MeetingDao;
import com.destiny.service.meeting.MeetingService;

@Service("meetingServiceImpl")
public class MeetingServiceImpl implements MeetingService {
	@Autowired
	@Qualifier("meetingDaoImpl")
	private MeetingDao meetingDao;

	public void setLetterDao(MeetingDao meetingDao) {
		this.meetingDao = meetingDao;
	}
	
	public MeetingServiceImpl() {
		System.out.println(this.getClass());
	}
}
