<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.* , java.sql.SQLException , java.util.ArrayList"%>

<div id="boardWrap">
	<h2>게시판</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<table id="boardList">
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
				<%
				DBconnect db=new DBconnect();
				String sql="select * from board order by board_id desc";
				//order by 정렬기준컬럼명 (asc: 오름차순  desc: 내림차순)
				
				ArrayList<Board> list=new ArrayList<>();
				try {
					db.pt=db.conn.prepareStatement(sql);
					db.rs=db.pt.executeQuery();
					while(db.rs.next()) {
						list.add(
							new Board(db.rs.getInt(1), db.rs.getString(2), db.rs.getString(3), db.rs.getString(4), db.rs.getInt(5))
								);
					}
					
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("board 테이블 조회 실패");
				}
				
				for(Board bd:list){
				%>
				<tr>
					<td class="num"><%=bd.getBoardId() %></td>
					<td class="title"><%=bd.getTitle() %></td>
					<td class="writer"><%=bd.getWriter() %></td>
					<td class="hit"><%=bd.getHit() %></td>
				</tr>
				<% } %>
			</table>
		</div>
		<div id="boardSearchBox">
			<form method="get" action="?part=board">
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

<%
	int level=0;
	if(session.getAttribute("user")!=null) {
		level=((study.Member)session.getAttribute("user")).getLevel();
	}
%>

<script>
	//작성을 클릭했을 때 로그인 회원 중 권한이 있는 사람만 작성 가능
	let lv='<%=level%>';
	$("#wrBT").on("click",function() { //작성 버튼 클릭
		if(lv==3) {
			location.href="?part=boardWrite"; //권한이 3레벨이면 글 작성 이동
		}else{
			alert("게시글 작성 권한이 없습니다.");
		}
	});
</script>