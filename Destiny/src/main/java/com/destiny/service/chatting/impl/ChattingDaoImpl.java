package com.destiny.service.chatting.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.destiny.service.chatting.ChattingDao;

@Repository("chattingDaoImpl")
public class ChattingDaoImpl implements ChattingDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}	
	
	public ChattingDaoImpl() {
		System.out.println(this.getClass());
	}
	
	
}
