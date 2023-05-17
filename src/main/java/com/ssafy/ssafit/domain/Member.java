package com.ssafy.ssafit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	private String memberId;
	
	private String password;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private String title;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Bookmark> bookmarks = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Board> boards = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Likes> likes = new ArrayList<>();
}
