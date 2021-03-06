package com.destiny.service.community;

import java.util.List;

import com.destiny.common.Search;
import com.destiny.service.domain.Community;

public interface CommunityDao {
	
	//insert
	public void addCommunity(Community community) throws Exception;
	
	//select one
	public Community getCommunity(int communityNo) throws Exception;
	
	//select list
	public List<Community> getCommunityList(Search search) throws Exception;
	
	//update
	public void updateCommunity(Community community) throws Exception;
	
	//게시판 page 처리를 위한 전체 row(totalCount) return
	public int getTotalCount(Search search) throws Exception;

}
