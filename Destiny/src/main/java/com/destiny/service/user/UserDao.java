package com.destiny.service.user;

import java.util.List;

import com.destiny.common.Search;
import com.destiny.service.domain.User;


//==> ȸ���������� CRUD �߻�ȭ/ĸ��ȭ�� DAO Interface Definition
public interface UserDao {
	
	// SELECT ONE
	public User getUser(String userId) throws Exception;
	
	public void attendLogin(User user) throws Exception;
	
}