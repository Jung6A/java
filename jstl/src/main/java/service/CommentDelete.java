package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CommentDAO;

public class CommentDelete implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		int bid=Integer.parseInt(request.getParameter("boardId"));
		int cid=Integer.parseInt(request.getParameter("commentId"));
		CommentDAO dao=new CommentDAO();
		dao.delete(cid);
		
		try {
			response.sendRedirect("/boardView.do?="+bid);
		}catch(Exception e) {
			System.out.println("댓글 삭제 실패");
			e.printStackTrace();
		}
		
		return null;
	}

}
