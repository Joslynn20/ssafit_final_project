package com.ssafy.ssafit.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Board {
	
	@Id
	@GeneratedValue
	private Long boardNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<Like> likes = new ArrayList<>();
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<File> file = new ArrayList<>();
	
	private String title;
	
	private String content;
	
	private int viewCnt;
	
	@Enumerated(EnumType.STRING)
	private BoardType type;
	
	private LocalDateTime regDate;
	
	private LocalDateTime modDate;	
}
