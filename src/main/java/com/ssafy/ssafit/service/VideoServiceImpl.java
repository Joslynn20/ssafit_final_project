package com.ssafy.ssafit.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ssafy.ssafit.domain.Video;
import com.ssafy.ssafit.exception.VideoNotFoundException;
import com.ssafy.ssafit.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService{
	
	private final VideoRepository videoRepository;

	/**
	 * 영상 등록
	 */
	@Override
	public void insert(Video video) throws VideoDuplicatedException {
		
		videoRepository.save(video);
	}


	@Override
	public Video delete(Long no) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Video update(Long no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 영상 번호로 조회
	 */
	@Override
	public Video findByNo(Long no) throws VideoNotFoundException {
		Video findVideo = videoRepository.findById(no).get();
		
		if(findVideo != null) {
			return findVideo;
		} else {
			throw new VideoNotFoundException("일치하는 영상이 존재하지 않습니다.");
		}
	}

	@Override
	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Video> findByPartName(String partName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Video> findOrderByViewCnt(String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}
}
