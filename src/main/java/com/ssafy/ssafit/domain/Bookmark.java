package com.ssafy.ssafit.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Bookmark {

	@Id
	@GeneratedValue
	private Long bookmarkNo;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "video_no")
	private Video video;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;
}
