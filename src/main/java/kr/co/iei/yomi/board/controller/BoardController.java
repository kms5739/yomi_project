package kr.co.iei.yomi.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import kr.co.iei.yomi.board.service.BoardService;

@Controller

public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@Value("${file.root}")
	private String root;

}
