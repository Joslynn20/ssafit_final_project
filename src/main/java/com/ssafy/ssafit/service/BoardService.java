package com.ssafy.ssafit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ssafy.ssafit.domain.Board;
import com.ssafy.ssafit.domain.BoardType;
import com.ssafy.ssafit.domain.Member;

public interface BoardService {

	/**
	 * 게시글 등록
	 */
	Board insert(Board board, Member member);

	/**
	 * 게시글 수정
	 * : 제목, 내용 수정 가능
	 */
	Board update(Board board);

	/**
	 * 게시글 삭제
	 */
	void delete(Long boardId);

	/**
	 * 게시글 전체 조회
	 * : 게시판별, 등록일 순, 조회수 순
	 */
	Page<Board> findAll(Pageable pageable, BoardType boardType, String orderCondition, String orderDirection);

	/**
	 * 게시글 상세 조회
	 */
	Board findByBoardId(Long boardId);

	
}
