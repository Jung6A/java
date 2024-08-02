package DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CommentDTO {
	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	
	public static CommentDTO of(int cid, int bid, String writer, String comment, LocalDate date) {
		CommentDTO dto=new CommentDTO();
		dto.commentId=cid;
		dto.boardId=bid;
		dto.writer=writer;
		dto.comment=comment;
		dto.writeDate=date;
		
		return dto;
	}
}
