<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>