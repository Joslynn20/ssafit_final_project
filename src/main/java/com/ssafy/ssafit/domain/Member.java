package com.ssafy.ssafit.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {
	
	@Id
	private String memberId;
	
	@Column(nullable = false)
	private String password;
	
	private String name;
	
	private int age;
	
	private String email;
	
	@CreationTimestamp
	private LocalDateTime reg_date;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Bookmark> bookmarks = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Board> boards = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Likes> likes = new ArrayList<>();
}
