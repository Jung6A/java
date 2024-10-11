package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class UpdateService implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		//�Խñ� ����- ���������� �� �Խñ� �ۼ� �� ������ ���ĳ��� ��
		
		if(request.getParameter("method")!=null) {
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			int bid=Integer.parseInt(request.getParameter("boardId"));
			
			BoardDTO dto=new BoardDTO(bid,title,null,content,0);
			
			//�����ͺ��̽� �����ϱ�
			BoardDAO dao=new BoardDAO();
			dao.update(dto);
			
			try {
				response.sendRedirect("/boardView.do?id="+bid);
			}catch(Exception e) {
				e.getStackTrace();
			}
			
			return null;
		}else {
		
			int bid=Integer.parseInt(request.getParameter("id"));
			BoardDAO dao=new BoardDAO();
			
			BoardDTO dto=dao.findById(bid);
			
			request.setAttribute("board", dto);
			
			return "board/update.jsp";
		}
	}
	
}