package kr.co.iei.board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BoardRowMapper implements RowMapper<Board>{

	@Override
	public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
		Board b = new Board();
		b.setBoardAddr(rs.getString("board_addr"));
		b.setBoardContent(rs.getString("board_content"));
		b.setBoardNo(rs.getInt("board_no"));
		b.setBoardRegdate(rs.getString("board_regdate"));
		b.setBoardTitle(rs.getString("board_title"));
		b.setReadCount(rs.getInt("board_readCount"));
		b.setThumbNailImg(rs.getString("thumnail_img"));
		return b;
	}

}
