package com.destiny.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.destiny.service.review.ReviewDao;

@Service("userServiceImpl")
public class UserServiceImpl {
	@Autowired
	@Qualifier("reviewDaoImpl")
	private ReviewDao reviewDao;

	public void setReviewDao(ReviewDao reviewDao) {
		this.reviewDao = reviewDao;
	}
	
	public UserServiceImpl() {
		System.out.println(this.getClass());
	}
}
