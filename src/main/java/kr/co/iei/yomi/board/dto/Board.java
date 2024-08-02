package kr.co.iei.yomi.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardAddr;
	private String boardContent;
	private String thumbNailImg;
	private String boardRegdate;
	private int readCount;
	private String boardWriter;

}
