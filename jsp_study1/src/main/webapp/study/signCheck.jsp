<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* , java.util.ArrayList , study.Member" %>

<%--
	입력한 아이디와 비밀번호를 데이터베이스에 저장된 member 테이블의 값들과 비교하여
	일치하면 로그인 처리, 불일치하면 아이디 또는 비밀번호가 틀렸다고 알림
--%>

<%
	request.setCharacterEncoding("UTF-8");
	
	String id=request.getParameter("userId");
	String pw=request.getParameter("userPassword");
	
	try { //드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e) {
		System.out.println("드라이버 로드 실패");
	}

	//계정 접속
	String user="junga";
	String password="1234";
	String url="jdbc:mysql://localhost:3306/junga";
	
	Connection conn=null;
	PreparedStatement pt=null;
	
	try {
		conn=DriverManager.getConnection(url,user,password);
	}catch(SQLException e) {
		System.out.println("드라이버 접속 실패");
	}
	
	//member 테이블의 데이터들과 비교하여 로그인 처리 진행
	//자바 코드로 비교, 데이터베이스를 통해 비교
	//1. 자바로 비교하기
	String sql="select * from member";
	ResultSet rs=null; //select문 결과를 받기 위한 참조변수
	
	ArrayList<Member> list=new ArrayList<>();
	try {
		pt=conn.prepareStatement(sql);
		rs=pt.executeQuery();
		while(rs.next()) {
			list.add(
				new Member(rs.getString("user_id"), rs.getString("user_password"), rs.getString("user_email"), rs.getString("user_name"), rs.getInt("level"))	
			);
		}
	}catch(SQLException e) {
		System.out.println("데이터베이스 조회 실패");
	}
	
	if(!list.isEmpty()) { //테이블 조회 데이터를 arraylist에 저장한 경우
		for(Member m:list) {
			if(m.getUserId().equals(id)) { //입력한 아이디와 같은지
				if(m.getUserPassword().equals(pw)) { //입력한 비밀번호와 같은지
					//아이디와 비밀번호 일치하므로 세션값 생성
					session.setAttribute("user", m); //m: 입력한 아이디와 비밀번호가 일치한 Member클래스 객체
					String path=request.getContextPath()+"/study";
					response.sendRedirect(path);
				}
			}
		}
	}
	
%>

<script>
	alert("아이디 또는 비밀번호가 일치하지 않습니다");
	history.back();
</script>