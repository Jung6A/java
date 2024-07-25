<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<div id="signBox">
	<form id="signFm" method="post" action="signCheck.jsp">
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
		<button type="button" id="loginBT">로그인</button>
		</form>
	<div id="option">
		<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
		<p><a href="/jsp_study1/study/?part=signup">회원가입</a></p>
	</div>
</div>
<style>
	.error{
		color: red;
		font-size: 12px;
	}
</style>
<script>
	let bt=document.getElementById("loginBT");
	bt.addEventListener("click",function() { //로그인 버튼의 클릭 이벤트 등록 및 실행 함수정의
		let id=document.getElementById("userId");
		let pw=document.getElementById("userPassword");
		if(id.value=='') { //아이디 미입력한 경우
			document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요.";
		}else if(pw.value=='') { //비밀번호 미입력한 경우
			document.getElementsByClassName("error")[1].innerText="비밀번호를 입력하세요.";
		}else{ //아이디·비밀번호 입력했다면 로그인 처리 페이지로 전송 및 이동 
			document.getElementById("signFm").submit();
		}
	});
</script>

<%--
	전송 방식: post
	전송 url: signCheck.jsp
	아이디 패러미터: userId
	비밀번호 패러미터: userPassword
	아이디/비밀번호 찾기 url: findUser.jsp
	회원가입 url: signup.jsp
--%>