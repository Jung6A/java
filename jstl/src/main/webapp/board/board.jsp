<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="board/board.css">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	<div id="boardWrap">
		<h2><a href="/board.do">게시판</a></h2>
		<div id="boardBox">
			<div id="boardListBox">
				<table id="boardList">
					<tr>
						<th class="num">번호</th>
						<th class="title">제목</th>
						<th class="writer">작성자</th>
						<th class="hit">조회수</th>
					</tr>
					<c:forEach var="row" items="${list}">
						<tr>
							<td class="num">${row.boardId}</td>
							<td class="title">
								<a href="/boardView.do?id=${row.boardId}">${row.title}</a>
							</td>
							<td class="writer">${row.writer}</td>
							<td class="hit">${row.hit}</td>
						</tr>
					</c:forEach>
				</table>
				<div id="pageNum">
					<ul id="pageNumList">
						<c:if test="${pageNum>1}">
							<a href="/board.do?page=${pageNum-skip<1?1:pageNum-skip}${param.word==null?'':'&word='}${param.word}"><i class="bi bi-caret-left-fill"></i></a>
						</c:if>
						<c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
							<c:if test="${pageNum==i}">
								<li class="nowPage">${i}</li>
							</c:if>
							<c:if test="${pageNum!=i}">
								<li><a href="/board.do?page=${i}${param.word==null?'':'&word='}${param.word}">${i}</a></li>
							</c:if>
						</c:forEach>
						<c:if test="${pageNum<pageTotalNum}">
							<a href="/board.do?page=${pageNum+skip>pageTotalNum?pageTotalNum:pageNum+skip}${param.word==null?'':'&word='}${param.word}"><i class="bi bi-caret-right-fill"></i></a>
						</c:if>
					</ul>
				</div>
			</div>
			<div id="boardSearchBox">
				<form method="get" action="/board.do">
					<div class="boardSearch">
						<input type="search" name="word" id="word">
						<button>검색</button>
					</div>
				</form>
			</div>
			<div id="boardWriteBox">
				<a id="wrBT">작성</a>
			</div>
		</div>
	</div>
	
	
	<script>
		//작성을 클릭했을 때 로그인 회원 중 권한이 있는 사람만 작성 가능
		$("#wrBT").on("click",function() { //작성 버튼 클릭
			if('${sessionScope.user}'!='') {
				location.href="/write.do"; //권한이 3레벨이면 글 작성 이동
			}else {
				var isOk=confirm("게시글 작성 권한이 없습니다. 로그인 하시겠습니까?");
				if(isOk) { //로그인 하겠다고 확인 버튼 클릭했으니 로그인 페이지로 이동
					location.href="/signin.do";
				}
			}
		});
	</script>
</body>
</html>