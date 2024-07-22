<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	JSP 페이지를 생성하고 서버에 의해 페이지가 동작할 때 서버에서 페이지에 객체를 할당
	
	내장객체는 총 9가지 존재
		서버- application: 처음 서버가 개설될 때 생성
		연결- session: 사용자가 서버에 처음 요청할 때 생성되고 사용자가 브라우저를 종료하기 전까지 존재
		페이지- request: 사용자의 요청 내용을 저장
			  response: 요청에 대한 응답 정보를 저장
			  out: 출력
			  page: JSP 페이지 자체
			  config: JSP 페이지 설정 정보 저장
			  exception: JSP 페이지의 예외발생 처리
			  pageContext: JSP 페이지의 모든 정보 저장
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String localAddr=request.getLocalAddr();
		out.println(localAddr);
		
		String serverAddr=request.getRemoteAddr();
		out.println(serverAddr);
		
		out.println(request.getLocale());
		
		out.println(request.getMethod());
		
		out.println(request.getRequestURI());
		out.println(request.getRequestURL());
	%>

<%-- input 태그에 입력한 내용에 대한 처리를 requestTest.jsp 주소로 요청 --%>
	<form method="get" action="requestTest.jsp">
		<input type="text" name="myName"> <br>
		<input type="date" name="today"> <br>
		<input type="checkbox" name="interest" value="게임">게임
		<input type="checkbox" name="interest" value="영화">영화
		<input type="checkbox" name="interest" value="책">책
		<input type="checkbox" name="interest" value="음악">음악
		<br>
		<select name="city">
			<option value="서울">서울</option>
			<option value="대전">대전</option>
			<option value="광주">광주</option>
			<option value="부산">부산</option>
		</select>
		<br>
		<button>전송</button>
	</form>
	
</body>
</html>