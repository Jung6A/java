<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<div id="signBox">
	<div id="ha">
		<form method="post" action="signCheck.jsp" id="signForm">
			<div id="signInput">
				<div>
					<b>아이디</b>
					<input type="text" name="userId">
				</div>
				<div>
					<b>비밀번호</b>
					<input type="password" name="userPassword">
				</div>
			</div>
			<div><button id="loginBT">로그인</button></div>
		</form>
	</div>
	<div id="option">
		<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
		<p><a href="signup.jsp">회원가입</a></p>
	</div>
</div>

<%--
	전송 방식: post
	전송 url: signCheck.jsp
	아이디 패러미터: userId
	비밀번호 패러미터: userPassword
	아이디/비밀번호 찾기 url: findUser.jsp
	회원가입 url: signup.jsp
--%>