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
public class File {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fileNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_no")
	private Board board;
	
	private String originalName;
	
	private String saveName;
}
