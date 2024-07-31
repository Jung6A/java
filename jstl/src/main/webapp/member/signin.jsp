<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="member/signin.css">
</head>
<body>
	<div id="signBox">
		<form id="signFm" method="post" action="/signinCheck.do">
			<div>
				<b>아이디</b>
				<input type="text" name="userId" id="userId">
				<p class="error"></p>
			</div>
			<div>
				<b>비밀번호</b>
				<input type="password" name="userPassword" id="userPassword">
				<p class="error"></p>
			</div>
			<button id="loginBT">로그인</button>
			</form>
		<div id="option">
			<p><a href="">아이디/비밀번호 찾기</a></p>
			<p><a href="/signup.do">회원가입</a></p>
		</div>
	</div>
</body>
</html>