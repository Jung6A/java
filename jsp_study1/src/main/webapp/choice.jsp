<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="bab" class="test.Lunch" />
<jsp:setProperty name="bab" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>점심 메뉴</h3>
	<div><%=bab.getRestaurant() %>- <%=bab.getMenu() %>(<%=bab.getPrice() %>원)</div>
</body>
</html>