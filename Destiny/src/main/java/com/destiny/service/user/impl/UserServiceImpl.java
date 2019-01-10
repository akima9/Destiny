package com.destiny.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.destiny.service.domain.User;
import com.destiny.service.user.UserDao;
import com.destiny.service.user.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public User getUser(String userId) throws Exception {
		return userDao.getUser(userId);
	}
}
