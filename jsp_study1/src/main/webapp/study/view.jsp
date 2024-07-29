
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.DBconnect , java.sql.SQLException , study.Board , study.BoardImg"%>

<%-- 
	id 패러미터의 값을 board 테이블의 board_id 컬럼으로 조회하여
	board_id와 id 패러미터가 일치하는 게시글 데이터를 가져와 화면에 출력
--%>

<%
	DBconnect db=new DBconnect();
	
	//id 패러미터 값 가져와 정수로 변환
	int id=Integer.parseInt(request.getParameter("id"));
	
	String sql="select * from board where board_id=?";
	
	Board data=null; //select sql문의 결과는 Board 클래스 객체 하나에 저장되는 데이터이기 때문에 Board 클래스 객체 저장 가능한 변수면 됨
	
	try{
		db.pt=db.conn.prepareStatement(sql);
		db.pt.setInt(1, id);
		db.rs=db.pt.executeQuery();
		if(db.rs.next()){
			data=new Board(db.rs.getInt(1), db.rs.getString(2), db.rs.getString(3), db.rs.getString(4), db.rs.getInt(5));
		}
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println("해당 게시글 조회 실패");
		}
	//해당 게시글 이미지 로드
	sql="select * from board_img where board_id=?";
	BoardImg img=null;
			
	try{
		db.pt=db.conn.prepareStatement(sql);
		db.pt.setInt(1, data.getBoardId());
		db.rs=db.pt.executeQuery();
		if(db.rs.next()) {
			img=new BoardImg(db.rs.getInt("board_img_id"),db.rs.getInt("board_id"),db.rs.getString("img_name"),db.rs.getString("img_path"));
		}
	}catch(SQLException e) {
		e.printStackTrace();
		System.out.println("게시글 이미지 조회 실패");
	}
%>

<h2><%=data.getTitle() %></h2>
<h3>작성자: <%=data.getWriter() %></h3>
<h3><%=data.getContent() %></h3>
<h4>조회수: <%=data.getHit() %></h4>
<img src="<%=img.getImgPath()%><%=img.getImgName()%>">