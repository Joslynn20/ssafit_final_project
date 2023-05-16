package com.ssafy.ssafit.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Video {
	
	@Id
	@GeneratedValue
	private Long videoNo;
	
	private String videoId;
	
	private String title;
	
	private String partName;
	
	private String url;
	
	private String channelName;
	
	private int viewCnt;
	
	private LocalDateTime regDate;
	
	private LocalDateTime modDate;
	
	@OneToMany(mappedBy = "video", cascade = CascadeType.ALL)
	private List<Bookmark> bookmarks = new ArrayList<>();
}
