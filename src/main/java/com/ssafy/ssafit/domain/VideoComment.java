package com.ssafy.ssafit.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VideoComment extends Comment {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "video_no")
	private Video video;
}
