package com.destiny.service.find;

import java.util.List;
import java.util.Map;

import com.destiny.common.Search;
import com.destiny.service.domain.Find;
import com.destiny.service.domain.User;


//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface FindDao {
	
	//모임리스트 찾기
	public Map<String, Object> meetingResult(String locationName) throws Exception;
	
	//회원수 찾기
	public int userResult(Find find) throws Exception;

	// 게시판 Page 처리를 위한 전체Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;
	
}