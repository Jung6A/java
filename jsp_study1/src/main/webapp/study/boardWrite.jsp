<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form method="post" action="boardSave.jsp" enctype="multipart/form-data">
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>이미지</label>
			<input type="file" name="boardImg" id="boardImg" accept="image/*">
											<!-- accept="image/*"  accept="video/*" -->
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>작성</button>
	</div>
</form>