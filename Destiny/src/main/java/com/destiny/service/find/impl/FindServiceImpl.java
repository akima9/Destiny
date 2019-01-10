package com.destiny.service.find.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.destiny.service.community.CommunityDao;
import com.destiny.service.domain.Find;
import com.destiny.service.find.FindDao;
import com.destiny.service.find.FindService;

@Service("findServiceImpl")
public class FindServiceImpl implements FindService {
	
	///Field
	@Autowired
	@Qualifier("findDaoImpl")
	private FindDao findDao;
	public void setFindeDao(FindDao findDao) {
		this.findDao = findDao;
	}
	
	public FindServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public Map<String, Object> meetingResult(String locationName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int userResult(Find find) throws Exception {
		return findDao.userResult(find);
	}

}
