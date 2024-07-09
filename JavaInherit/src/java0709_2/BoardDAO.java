package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {
	//클래스가 아니라 인터페이스
	private Connection conn; //데이터베이스 접속 정보 저장
	private Statement st; //SQL 명령어 전달과 결과 받기 (직렬)
	private PreparedStatement pt; //SQL 명령어 전달과 결과 받기 (병렬)
	private ResultSet rs; // 데이터 조회 결과 저장
	
	public BoardDAO() {
		DriverLoad(); //데이터베이스 드라이버 로드
		Connect(); //데이터베이스 접속
	}
	
	//test_board 테이블의 데이터 가져와서 Board 클래스 객체로 저장
	public Board[] findByAll() {
		Board[] list=new Board[7]; //Board 클래스 객체 7개 저장 위한 배열
		
		String sql="select * from test_board"; //sql 질의문, 쿼리문
		
		//select 사용시: executeQuery 메서드 사용
		//insert, update, delete 사용시: executeUpdate 메서드 사용
		try {
			st=conn.createStatement(); //statement 생성
			rs=st.executeQuery(sql);
			int i=0; //배열의 인덱스
			while(rs.next()) {
				list[i]=new Board(rs.getInt("board_id"),rs.getString("title"),rs.getString("writer"),rs.getString("content"),rs.getInt("hit"));
				i++;
			}
		}catch(Exception e) {
			System.out.println("데이터 로드 실패");
		}
		
		return list;
	}
	
	private void DriverLoad() { //드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	private void Connect() { //데이터베이스 접속
		String username="junga";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/junga";
		
		try {
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패");
		}
	}
	
}
/*
	Connection, Statement 또는 PreparedStatement, ResultSet
	참조변수 필요
	
	1. 데이터베이스와 연결하기 위한 드라이버 로드
	   (mysql 5버전 이후- com.mysql.cj.jdbc.Driver
			  5버전 이하- com.mysql.jbdc.Driver)
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	2. 데이터베이스에 접속하기
	   데이터베이스 계정명, 비밀번호, 주소
	   conn=DriverManager.getConnection(주소, 계정명, 비밀번호);
	   접속 시도한 결과를 Connection의 참조변수에 저장
	   
	3. conn을 통해 Statement 또는 PreparedStatement의 객체 생성하여 SQL 명령어 보내기
 */