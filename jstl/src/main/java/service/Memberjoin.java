package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Memberjoin {
	
	public void join(HttpServletRequest req, HttpServletResponse res) {
		//회원가입을 처리해주는 곳: 사용자가 입력한 값을 데이터베이스에 저장
		String id=req.getParameter("userId");
		String pw=req.getParameter("userPassword");
		String email=req.getParameter("userEmail");
		String name=req.getParameter("userName");
		
		//데이터베이스 저장하기
	}
}
