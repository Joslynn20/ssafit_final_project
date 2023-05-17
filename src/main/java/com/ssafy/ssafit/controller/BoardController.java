package com.ssafy.ssafit.controller;

import org.springframework.stereotype.Controller;

import com.ssafy.ssafit.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
}
