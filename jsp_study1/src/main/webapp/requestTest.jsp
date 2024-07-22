<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("myName");
		String today=request.getParameter("today");
		String[] inter=request.getParameterValues("interest");
		String city=request.getParameter("city");
	%>
	<div>이름: <%=name %></div>
	<div>날짜: <%=today %></div>
	<div>관심분야: <%=Arrays.toString(inter) %></div>
	<div>거주지: <%=city %></div>
</body>
</html>