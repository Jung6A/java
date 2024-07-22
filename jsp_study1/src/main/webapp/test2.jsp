<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner" %>

<%--
	JSP 스크립트
		JSP 스크립트릿: <% %>
			자바 로직 코드 작성(일반적인 코드 작성)
		선언문: <%! %>
			자바 변수나 메서드, 클래스 정의
		표현식: <%= %>
			결과값 출력

--%>

<%! //선언문
	int age=20; //변수 선언
	String name="이순신"; //변수 선언
	
	int sum(int a,int b){ //메서드 정의
		return a+b;
	}
	
	class mem{ //클래스 정의
		String userName;
	}
	//선언문 내부에서는 선언, 정의만 가능
	//if, for 등 제어문 사용 불가
	//메서드 호출 불가
	
	Scanner scan=new Scanner(System.in);
%>

<% //스크립트릿

	int num=scan.nextInt();

	sum(10,20); //메서드 호출 가능
			
	if(age>15) { //제어문 사용 가능
		
	}
	
	String job="군인"; //변수 선언 가능
	//메서드, 클래스 정의 불가
%>

<%=100 %>
<%="<br> 이순신" %>
<%=10>5 ? "크다":"작다" %> <%-- 조건식 사용 가능 --%>
<%=sum(10,20) %> <%-- 반환이 있는 메서드 호출 가능 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>