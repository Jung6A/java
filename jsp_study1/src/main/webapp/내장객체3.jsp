<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
	out.print("출력");
	out.newLine();
	out.println("정수, 실수, 문자, 문자열 출력 가능");
	
	//page==this: 객체 그 자체를 의미
	
	String name="이순신";
	
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
	//pageContext.include("requestTest2.jsp"); // <%@ include file="경로"
	//pageContext.forward("내장객체1.jsp");
	
%>

<%-- jsp의 include 태그 사용 --%>
<jsp:include page="requestTest2.jsp" />
<jsp:forward page="내장객체1.jsp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.getAttribute("age") %>
</body>
</html>