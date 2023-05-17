package com.ssafy.ssafit.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Likes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long likeNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_no")
	private Board board;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;
}
