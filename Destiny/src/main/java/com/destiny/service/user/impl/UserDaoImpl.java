package com.destiny.service.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.destiny.service.domain.User;
import com.destiny.service.user.UserDao;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}	
	
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public User getUser(String userId) throws Exception {
		return sqlSession.selectOne("UserMapper.getUser", userId);
	}
}
