package com.destiny.service.find;

import java.util.Map;

import com.destiny.service.domain.Find;

 
public interface FindService {
	
	//����ã��
	public Map<String, Object> meetingResult(String locationName) throws Exception;
	
	//ȸ�� �� ã��
	public int userResult(Find find) throws Exception;

	
}