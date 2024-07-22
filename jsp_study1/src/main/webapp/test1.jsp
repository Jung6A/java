<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,java.util.LinkedList"
    session="true" errorPage="error500.jsp" buffer="1kb" autoFlush="false" %>
<%@ page import="java.util.Date" %>
<%
	//include 동작 전 
	String name="이순신";
	out.println(name);
%>
<%@ include file="menu.jsp" %>
    
<%
	 out.println("테스트");
	//int num=10/0;
%>

<%-- 
	<%@- jsp 지시어 스크립트 작성 부분
	지시어는 해당 jsp 페이지 설정 위한 부분
		page: jsp 페이지 속성 지정
			language: 페이지에서 사용할 언어셋 설정
			contentType: 페이지의 문서 타입
			pageEncoding: 현재 페이지의 인코딩 타입 설정
			import: 다른 패키지의 클래스나 메서드 추가
			session: 세션 사용여부 지정 (기본값
			isErrorPage: true이 경우 현재 페이지 에러 페이지 지정
			ErrorPage: 현재 페이지를 에러 방생시 대신한 페이지로 함
					클라이언트 브라우저에는 서버 언어(JAVA)가 노출되면 안 됨
			info: 페이지 설명
			extends: 현재 페이지에 상속할 클래스 지정
			buffer: jsp의 출력 버퍼 값 지정(기본 8kb)
			autoFlush: 출력버퍼가 초과되면 수행할 기능 지정
					true일 경우 버퍼가 100%이면 내용을 화면에 출력, false일 경우 IOException 발생
					예외처리에서 throw를 하는 이유와 같이 기록(log)에 남겨두기 위해 false를 사용하기도 함
					
		include: 다른 jsp 페이지를 추가하여 현재 페이지에 포함
				 실행 순서는 파일에 쓰인 순차대로
				 
		taglib: 태그 라이브러리 태그를 사용할 경우 사용


	jsp 주석:
		사용자 브라우저에서는 확인되지 않음
		서버 컴퓨터에서만 동작하는 부분이라 사용자에게 노출되지 않음
	
	웹 흐름
		서버 컴퓨터: 서비스를 제공하는 컴퓨터
			클라이언트가 주소로 요청하면 서버 컴퓨터는 요청에 대한 응답함
			페이지를 보기 위해 해당 페이지 주소를 요청 시
			서버는 해당 페이지를 찾아 페이지 내부 서버 언어(JAVA) 실행
			클라이언트 언어(HTML, CSS, JS) 부분을 클라이언트에게 전송
			클라이언트는 서버로부터 받은 내용을 브라우저가 실행 후 화면 출력
 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>