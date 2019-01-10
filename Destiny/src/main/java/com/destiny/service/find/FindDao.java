package com.destiny.service.find;

import java.util.List;
import java.util.Map;

import com.destiny.common.Search;
import com.destiny.service.domain.Find;
import com.destiny.service.domain.User;


//==> ȸ���������� CRUD �߻�ȭ/ĸ��ȭ�� DAO Interface Definition
public interface FindDao {
	
	//���Ӹ���Ʈ ã��
	public Map<String, Object> meetingResult(String locationName) throws Exception;
	
	//ȸ���� ã��
	public int userResult(Find find) throws Exception;

	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;
	
}