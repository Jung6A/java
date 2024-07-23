<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	액션 태그
		서버나 클라이언트에게 동작을 명령하는 태그
		xml 형식의 태그 사용방법
		자바 빈의 기능 사용
	
	종류
		<jsp:forward /> 다른 페이지로 이동(주소 변경 없이)
		<jsp:include /> 외부 페이지의 내용을 포함
		<jsp:plugin /> 웹 브라우저에서 자바 애플릿을 실행
		<jsp:useBean /> jsp 페이지에 자바 빈즈를 설정(자바 클래스 객체)
		<jsp:setProperty /> 자바 빈즈의 프로퍼티 값 설정(클래스 인스턴스 변수 값 설정)
		<jsp:getProperty /> 자바 빈즈의 프로퍼티 값 가져오기(클래스 인스턴스 변수 값 가져오기)
		<jsp:param /> forward, include의 인자 추가(메서드 매개변수에 값 저장)
--%>

<%-- useBean
		id: 클래스 객체의 주소를 저장할 참조변수
			Music 'music'=new Music();
		class: 클래스 경로(패키지명 포함)
		scope: 자바 빈 객체가 저장될 영역 설정(내장객체 중 하나)
			page, request, session, application(기본 설정은 page)
	 setProperty- 자바 빈 객체 인스턴스 변수에 값 저장
		 	music.setTitle("비가 오는 날엔");
	 	name: 객체 이름(객체 주소가 저장된 참조변수. useBean의 id)
	 	property: 인스턴스 변수 이름(set 변수명 메서드 호출)
	 	value: 저장할 데이터
--%>
<% request.setCharacterEncoding("utf-8"); //request로 객체에 문자코드 적용(깨짐 방지) %>

<jsp:useBean id="music" class="test.Music" />
<jsp:setProperty name="music" property="*" />

<jsp:getProperty name="music" property="title" />
<%
	out.println(music.getSinger());
%>
<%=music.getYear()%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>