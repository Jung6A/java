package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class Signin implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		if(request.getSession().getAttribute("user")!=null) { //로그인 상태일 경우
			request.getSession().removeAttribute("user"); //user 세션 삭제
		}else { //로그인 시도
			String id=request.getParameter("userId");
			String pw=request.getParameter("userPassword");
			
			//데이터베이스에서 아이디·비밀번호 조회
			MemberDAO dao=new MemberDAO();
			boolean isSuccess=dao.login(id,pw);
			if(isSuccess) {
				request.getSession().setAttribute("user", id);
			}
		}
		
		try {
			response.sendRedirect("/");
		}catch(Exception e) {
			
		}
		
		return null;
	}

}