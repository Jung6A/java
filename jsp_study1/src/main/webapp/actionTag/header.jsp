<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String select=request.getParameter("select");
%>

<div id="header">
	<ul id="menuList">
		<li class="menu"><a href="mainPage.jsp">HOME</a></li>
		<li class="menu">소개</li>
		<li class="menu">자유게시판</li>
		<li class="menu <%=select.equals("imageBoard")?"active":"" %>"><a href="mainPage.jsp?part=imageBoard">이미지게시판</a></li>
		<li class="menu"><a href="mainPage.jsp?part=notify">신고</a></li>
	</ul>
</div>