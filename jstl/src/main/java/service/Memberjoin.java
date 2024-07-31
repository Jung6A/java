package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.MemberDAO;
import DTO.MemberDTO;

public class Memberjoin implements MainActive {
	
	public String action(HttpServletRequest req, HttpServletResponse res) {
		//회원가입을 처리해주는 곳: 사용자가 입력한 값을 데이터베이스에 저장
		String id=req.getParameter("userId");
		String pw=req.getParameter("userPassword");
		String email=req.getParameter("userEmail");
		String name=req.getParameter("userName");
		
		MemberDTO dto=new MemberDTO(id,pw,email,name);
		
		//데이터베이스 저장하기
		MemberDAO dao=new MemberDAO();
		dao.save(dto);
		
		try {
			res.sendRedirect("/");
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return null;
	}
}
