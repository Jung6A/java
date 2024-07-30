<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a href="/main.jsp">로그인 및 회원가입</a>
<a href="/board.jsp">게시판</a>
<a href="/inquiry">문의</a>

<%-- <jsp:forward page=""/> --%>
<%
//	pageContext.forward("경로");
%>

<%-- 코어 태그로 가능한 것: 참조변수 생성, 조건문, 반복문 (클래스, 메서드 정의 불가) --%>
<%-- 코어 태그 변수 --%>
<c:set var="num" value="10"/>
${num+20}

<c:set var="num" value="300" scope="session"/>
${sessionScope.num}

<%-- 코어 태그 조건문 --%>
<%-- 코어 태그 if문은 true만 존재 --%>
<c:if test="${30>20}">
<%--조건식은 ${}로 표기 --%>
	30>20 참이다
</c:if>

<%-- choose문 --%>
<c:choose>
	<c:when test="${num>5}">
		<h1>5보다 크다</h1>
	</c:when>
	<%-- 참인 조건이 여럿 있어도 가장 첫 참만 출력 --%>
	<c:when test="${100>10}">
		<h1>10보다 크다</h1>
	</c:when>
	<%-- otherwise: switch문의 default와 유사 --%>
	<c:otherwise>
		나는 위의 모든 when이 거짓일 경우 실행된다.
	</c:otherwise>
</c:choose>

<%-- 코어 태그 반복문 --%>
<% //for(int i=1;i<=10;i++) %>
<c:forEach begin="1" end="10" step="1">
	내가 반복된다.
</c:forEach>
<%
	ArrayList<String> list=new ArrayList<>();
	list.add("강감찬"); list.add("이순신"); list.add("장보고");
	
	request.setAttribute("list", list);
%>
<%-- 리스트나 컬렉션 출력에 사용하는 형태 --%>
<% //for(String name:list) %>
<c:forEach var="name" items="${list}">
	${name}
</c:forEach>

<%-- 두 번째 반복문 --%>
<%-- 문자열 데이터만 사용 가능 --%>
<c:forTokens items="${'포도@딸기@수박@참외@토마토'}" var="fruit" delims="@">
<%-- split과 유사 --%>
	${fruit}
</c:forTokens>

<%--
	웹 모델1:
			사용자 요청 → 서버 → 컨테이너 → 서블릿 → 페이지 처리 → 컨테이너 → 서버 → 사용자
	
	웹 모델2(MVC 디자인패턴):
			사용자 요청 → 서버 → 컨테이너 → 요청에 맞는 서블릿 → 서비스 → (데이터베이스가 필요하면 DAO, DTO) → 서블릿 → 컨테이너 → 서버 → 사용자
	
	M: model- service, DAO, DTO
	V: view- html, jsp 페이지 (사용자 브라우저에 표시되는 부분)
	C: controller- 사용자의 요청을 어떻게 처리할지 결정 (서블릿)
	
	DAO: Data Access Object: 데이터베이스에 접근하기 위한 클래스
	DTO: Data Transfer Object: 데이터를 저장하기 위한 클래스
	
	예) 회원가입을 위해 아이디, 비밀번호, 이름, 주소, 연락처 등을 입력하고 가입 버튼을 클릭
		
		1. 가입 요청을 controller가 받음
		2. 가입 요청을 처리해줄 service 실행
		3. service에서 데이터베이스에 저장하기 위한 DAO 실행
		4. DAO 실행이 끝나면 가입 완료 페이지를 controller에 보냄
		5. controller는 가입 완료 페이지를 사용자에게 보냄
		
		사용자가 로그인. 아이디·비밀번호 입력 후 로그인 버튼 클릭
		
		1. 로그인 요청을 controller가 받음
		2. 로그인 처리를 할 수 있는 service 실행
		3. service에서 데이터베이스 작업을 수행하는 DAO 실행
		4. DAO 실행 결과 아이디·비밀번호 일치하면 service에서 세션 생성
		   일치하지 않으면 로그인 실패를 controller에 전달
		5. controller는 로그인 성공유무에 따른 service의 결과를 사용자에게 보냄
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