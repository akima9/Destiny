package com.destiny.service.user;

import java.util.Map;

import com.destiny.common.Search;
import com.destiny.service.domain.User;


//==> ȸ���������� ������ ���� �߻�ȭ/ĸ��ȭ�� Service  Interface Definition  
public interface UserService {
	
	// ������Ȯ�� / �α���
	public User getUser(String userId) throws Exception;
		
}