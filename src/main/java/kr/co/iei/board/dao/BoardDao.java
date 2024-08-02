package kr.co.iei.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.iei.board.dto.BoardFileRowMapper;
import kr.co.iei.board.dto.BoardRowMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	@Autowired
	private BoardRowMapper boardRowMapper;
	@Autowired
	private BoardFileRowMapper boardFileRowMapper;
	

}
