package com.destiny.service.find;

import java.util.Map;

import com.destiny.service.domain.Find;

 
public interface FindService {
	
	//ȸ�� �� ã��
		public int userResult(Find find) throws Exception;
	
	//����ã��
	public Map<String, Object> meetingResult(String locationName) throws Exception;

}