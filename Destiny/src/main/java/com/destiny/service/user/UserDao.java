package com.destiny.service.user;

import java.util.List;

import com.destiny.common.Search;
import com.destiny.service.domain.User;


//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface UserDao {
	
	// SELECT ONE
	public User getUser(String userId) throws Exception;
	
	public void attendLogin(User user) throws Exception;
	
}