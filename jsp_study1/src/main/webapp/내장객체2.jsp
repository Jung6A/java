<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	response: 사용자 요청에 대한 응답을 위한 객체
			  사용자의 요청은 대부분 새 페이지
			  response로 사용자가 원하는 페이지 제공
			  
		페이지 이동을 위한 메서드 sendRedirect
		
		DB 저장 후 이동해야 하는 경우
	
--%>

<%
	int num=20;

	if (num>20) {
		response.sendRedirect("requestTest2.jsp");
	}else {
		out.println("20보나 작거나 같다");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>