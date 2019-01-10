package com.destiny.service.domain;

import java.util.Date;
import java.util.List;

public class Community {
	
	private String	postNo;
	private String	postTitle;
	private Date	writeDate;
	private int		views;
	private int		likeCount;
	private String	postKindNo;
	private String	postContents;
	private int		commentCount;
	private List	postImg;
	private List	postVideo;
	private List	postMap;
	private boolean	importRank;
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public String getPostKindNo() {
		return postKindNo;
	}
	public void setPostKindNo(String postKindNo) {
		this.postKindNo = postKindNo;
	}
	public String getPostContents() {
		return postContents;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public List getPostImg() {
		return postImg;
	}
	public void setPostImg(List postImg) {
		this.postImg = postImg;
	}
	public List getPostVideo() {
		return postVideo;
	}
	public void setPostVideo(List postVideo) {
		this.postVideo = postVideo;
	}
	public List getPostMap() {
		return postMap;
	}
	public void setPostMap(List postMap) {
		this.postMap = postMap;
	}
	public boolean isImportRank() {
		return importRank;
	}
	public void setImportRank(boolean importRank) {
		this.importRank = importRank;
	}
	@Override
	public String toString() {
		return "Community [postNo=" + postNo + ", postTitle=" + postTitle + ", writeDate=" + writeDate + ", views="
				+ views + ", likeCount=" + likeCount + ", postKindNo=" + postKindNo + ", postContents=" + postContents
				+ ", commentCount=" + commentCount + ", postImg=" + postImg + ", postVideo=" + postVideo + ", postMap="
				+ postMap + ", importRank=" + importRank + "]";
	}

	
}
