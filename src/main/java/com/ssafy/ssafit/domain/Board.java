package com.ssafy.ssafit.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long boardNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<Like> likes = new ArrayList<>();
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<File> files = new ArrayList<>();
	
	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String content;
	
	// 디폴트값 0으로 설정
	@ColumnDefault("0")
	private int viewCnt;
	
	@Enumerated(EnumType.STRING)
	private BoardType type;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime regDate;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime modDate;	
}
