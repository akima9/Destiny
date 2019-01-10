package com.destiny.service.find;

import java.util.Map;

import com.destiny.service.domain.Find;

 
public interface FindService {
	
	//모임찾기
	public Map<String, Object> meetingResult(String locationName) throws Exception;
	
	//회원 수 찾기
	public int userResult(Find find) throws Exception;

	
}