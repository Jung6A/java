<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	이름과 국어, 수학, 과학 성적을 받아서
	평균이 90 이상이면 참 잘했어요
	80 이상이면 잘했어요
	70 이상이면 노력해라
	나머지는 이게 점수야!
--%>

<%
	String name=request.getParameter("name");
	int kor=Integer.parseInt(request.getParameter("kor"));
	int mat=Integer.parseInt(request.getParameter("mat"));
	int sci=Integer.parseInt(request.getParameter("sci"));
	int avg=(kor+mat+sci)/3;
%>

<%="이름: "+name+"<br>"
	+"국어: "+kor+"점, 수학: "+mat+"점, 과학: "+sci+"점<br>"
	+"평균: "+avg+"점<br><br>" %>
<%
	if(avg>=90) {
%>
		<%="<h3>참 잘했어요</h3>" %>
<%
	}else if(avg>=80){
%>
		<%="<h3>잘했어요</h3>" %>
<%
	}else if(avg>=70){
%>
		<%="<h3>노력해라</h3>" %>
<%
	}else{
%>
		<%="<h3>이게 점수야!</h3>" %>
<%
	}
%>

<br>
<hr>
<br>
<%@include file="requestTest2.jsp" %>