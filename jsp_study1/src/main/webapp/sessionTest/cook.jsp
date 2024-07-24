<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//form으로 전송한 데이터 받기 (패러미터)
	//데이터 받아서 food, price, rest라는 name으로 쿠키에 저장
	//만료 시간은 1시간 10분
	
	request.setCharacterEncoding("UTF-8");
	
	String food=request.getParameter("food");
	String price=request.getParameter("price");
	String rest=request.getParameter("rest");
	
	//기존 쿠키가 존재한다면 가져와서 새로 입력한 값과 함치기
	Cookie[] cooks=request.getCookies();
	for(Cookie cook:cooks) {
		if(cook.getName().equals("food")) food=cook.getValue()+"-"+food;
		if(cook.getName().equals("price")) price=cook.getValue()+"-"+price;
		if(cook.getName().equals("restaurant")) rest=cook.getValue()+"-"+rest;
	}
	
	Cookie ck1=new Cookie("food", food);
	Cookie ck2=new Cookie("price", price);
	Cookie ck3=new Cookie("restaurant", rest);
	
	ck1.setMaxAge(4200);
	ck2.setMaxAge(4200);
	ck3.setMaxAge(4200);
	
	response.addCookie(ck1);
	response.addCookie(ck2);
	response.addCookie(ck3);
	
	response.sendRedirect("cook_read.jsp");
	
%>



<%
// 	//쿠키의 종류
// 	//세션 쿠키: 세션처럼 정해진 기간 없이 클라이언트가 연결을 끊을 때 삭제
// 	//영구 쿠키: 서버 상태와 상관 없이 정해진 기간 동안 생존해 있는 쿠키
// 	//인증 쿠키: 사용자 정보를 저장하고 있는 쿠키, 로그인 유지
// 	//추적 쿠키: 사용자의 브라우저 활동을 기록하는 쿠키
// 	//좀비 쿠키: 쿠키가 삭제된 후 재생성됨

// 	//웹 서버 쿠키 생성
// 	Cookie ck=new Cookie("name", "이순신"); //Cookie의 구조는 맵과 동일: key와 value
// 	ck.setMaxAge(3600); //초 단위 설정
	
// 	//생성된 쿠키 클라이언트에게 전송
// 	response.addCookie(ck);
	
// 	//쿠키 삭제
// 	//클라이언트 쿠키 가져오기
// 	Cookie[] cooks=request.getCookies();
// 	for(Cookie c:cooks) {
// 		if(c.getName().equals("name")) {
// 			c.setMaxAge(0);
// 			response.addCookie(c); //쿠키의 만료시간을 0으로 변경, 클라이언트에게 전송
// 			break; //일괄 주석 처리: ctrl+shift+c
// 		}
// 	}
%>