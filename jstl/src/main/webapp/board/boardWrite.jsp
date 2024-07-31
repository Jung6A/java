<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="board/boardWrite.css">
</head>
<body>
	<h1>게시글 작성</h1>
	<form method="post" action="/write.do">
		<input type="hidden" name="method" value="write">
		<div id="writeBox">
			<div class="writeInput">
				<label>제목</label>
				<input type="text" name="title" id="title">
			</div>
			<div class="writeInput">
				<label>내용</label>
				<textarea name="content" id="content"></textarea>
			</div>
			<button>작성</button>
		</div>
	</form>
</body>
</html>