package com.ssafy.ssafit.service;

import java.util.List;

import com.ssafy.ssafit.domain.Video;
import com.ssafy.ssafit.exception.VideoNotFoundException;


public interface VideoService {
	
	public void insert(Video video) throws VideoDuplicatedException;
	
	public Video delete(Long no);
	
	public Video update(Long no);
	
	public Video findByNo(Long no) throws VideoNotFoundException;
	
	public List<Video> findAll();
	
	public List<Video> findByPartName(String partName);
	
	public List<Video> findOrderByViewCnt(String orderDir);
}
