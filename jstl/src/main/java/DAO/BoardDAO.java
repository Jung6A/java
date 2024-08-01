package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect {
	
	public int totalCount(String keyword) { //�Խñ� �� ����
		keyword="%"+keyword+"%";
		String sql="select COUNT(board_id) as cnt from board where title like ? or content like ?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyword);
			pt.setString(2, keyword);
			rs=pt.executeQuery();
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		}catch(SQLException e) {
			System.out.println("�� �Խñ� �� Ȯ�� ����");
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<BoardDTO> findAll(int row, String keyword) {
		keyword="%"+keyword+"%";
		String sql="select * from board where title like ? or content like ? order by board_id desc limit ?, 10";
		List<BoardDTO> list=new ArrayList<>();
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyword);
			pt.setString(2, keyword);
			pt.setInt(3,row);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(new BoardDTO(rs.getInt("board_id"),rs.getString("title"),rs.getString("writer"),rs.getString("content"),rs.getInt("hit")));
			}
		}catch(SQLException e) {
			System.out.println("�Խñ� �ҷ����� ����");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void save(BoardDTO board) { //�Է��� �Խñ� ����
		String sql="insert into board(title,writer,content) values(?,?,?)";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, board.getTitle());
			pt.setString(2, board.getWriter());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("�Խñ� ���� ����");
			e.printStackTrace();
		}
	}
}
