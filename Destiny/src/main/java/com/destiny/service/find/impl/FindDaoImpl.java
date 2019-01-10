package com.destiny.service.find.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.destiny.common.Search;
import com.destiny.service.domain.Find;
import com.destiny.service.find.FindDao;

@Repository("findDaoImpl")
public class FindDaoImpl implements FindDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public FindDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public int userResult(Find find) throws Exception {
		return sqlSession.selectOne("FindMapper.getUserCount", find);
	}

	@Override
	public Map<String, Object> meetingResult(String locationName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



}
