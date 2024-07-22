<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String myid=request.getParameter("id");
	String mypw=request.getParameter("pw");
	
	out.println(myid);
	
	if(myid.equals("moon")&&mypw.equals("1234")){
%>
	<script>
		alert("로그인 성공");
		location.href="login.jsp";
	</script>
<%
	}
%>

<%=mypw%>

<%-- jsp 주석 --%>


<!-- logincheck.jsp -->