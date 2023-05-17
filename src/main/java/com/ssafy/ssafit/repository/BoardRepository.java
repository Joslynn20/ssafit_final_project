package com.ssafy.ssafit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.ssafy.ssafit.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long>, QuerydslPredicateExecutor<Board> {

}
