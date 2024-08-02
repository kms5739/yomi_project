package kr.co.iei.yomi.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iei.yomi.board.dao.BoardDao;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
}
