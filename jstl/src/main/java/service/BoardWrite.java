package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardWrite implements MainActive {
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String method=request.getParameter("method");
		if(method!=null) { //게시글을 작성할 경우
			String title=request.getParameter("title");
			String writer=(String)request.getSession().getAttribute("user");
			String content=request.getParameter("content");
			
			BoardDTO dto=new BoardDTO(title,writer,content);
			
			//데이터베이스 저장하기
			BoardDAO dao=new BoardDAO();
			dao.save(dto);
			
			try {
				response.sendRedirect("/board.do");
			}catch(Exception e) {
				e.getStackTrace();
			}
			
			return null;
		}else { //게시글 작성 페이지를 요청할 경우
			return "board/boardWrite.jsp";
		}
	}
}
