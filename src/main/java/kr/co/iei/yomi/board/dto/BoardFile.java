package kr.co.iei.yomi.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BoardFile {
	private int fileNo;
	private int boardNo;
	private String fileName;
	private String filePath;
	
	

}
