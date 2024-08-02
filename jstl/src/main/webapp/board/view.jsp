<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<body>
	<table>
		<tr>
			<td>제목</td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${board.hit}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${board.content}</td>	
		</tr>
		<tr>
			<td>
				<a href="/board.do"><button type="button" id="boardBack">목록</button></a>
			</td>
			<td colspan='2'>
				<c:if test="${sessionScope.user eq board.writer}">
					<button type="button" id="modify">수정</button>
					<button type="button" id="delete">삭제</button>
				</c:if>
			</td>
		</tr>
	</table>
	<hr>
	<!-- 댓글 -->
	<table>
		<c:if test="${sessionScope.user!=null}">
			<tr>
				<td>
					<textarea name="comment" id="comment" rows=3 cols=30></textarea>
				</td>
				<td>
					<button id="commentBT">입력</button>
				</td>
			</tr>
		</c:if>
		<c:forEach var="row" items="${comments}">
			<tr>
				<td>${row.writer} ${row.writeDate}
					<c:if test="${sessionScope.user eq row.writer}">
						<a href="/commentDelete.do?id=${row.commentId}">삭제</a>
					</c:if>
				</td>
				<td><br></td>
				<td>${row.comment}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<script>
	$("#modify").on("click", function(){
		location.href="/boardUpdate.do?id=${board.boardId}";
	});
	$("#delete").on("click", function(){
		var isOk=confirm("게시글을 삭제하시겠습니까?");
		if(isOk) {
			location.href="/boardDelete.do?id=${board.boardId}";
		}
	});
	$("#commentBT").on("click", function(){
		let $fm=$('<form></form>'); //폼 태그 생성
		$fm.attr('method','get');
		$fm.attr('action','/comment.do');
		$fm.append("<input type=hidden name=boardId value=${board.boardId}>");
		$fm.append($("#comment"));
		$fm.appendTo("body");
		$fm.submit(); //전송
	});
</script>