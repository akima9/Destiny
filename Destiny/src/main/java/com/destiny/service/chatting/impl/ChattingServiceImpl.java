package com.destiny.service.chatting.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.destiny.service.chatting.ChattingDao;
import com.destiny.service.chatting.ChattingService;


@Service("chattingServiceImpl")
public class ChattingServiceImpl implements ChattingService {
	@Autowired
	@Qualifier("chattingDaoImpl")
	private ChattingDao chattingDao;
	
	public void setChattingtDao(ChattingDao chattingDao) {
		this.chattingDao = chattingDao;
	}	
	
	public ChattingServiceImpl() {
		System.out.println(this.getClass());
	}
}
