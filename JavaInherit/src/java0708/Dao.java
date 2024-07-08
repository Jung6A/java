package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	private Connection conn; //데이터베이스 접속 정보를 가질 객체
	private Statement st; //sql문을 실행하여 데이터베이스와 상호작용을 위한 변수
	private ResultSet rs; //데이터베이스 select(조회) 결과를 받기 위한 변수
	private PreparedStatement pt;
	
	Dao() {
		DriverInit();
		Connect();
	}
	//mysql과 java를 연결할 드라이버 로드
	private void DriverInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	//mysql에 계정 접속
	private void Connect() {
		String user="junga";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/junga";
		
		try {
			conn=DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패");
		}
	}
	
	public void insert(Member m) {
		
		String sql=
				"insert into test_member(name,kor,eng,mat,total,std_avg) values(?,?,?,?,?,?)";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, m.getName());
			pt.setInt(2, m.getKor());
			pt.setInt(3, m.getEng());
			pt.setInt(4, m.getMat());
			pt.setInt(5, m.getTotal());
			pt.setInt(6, m.getStd_avg());
			pt.executeUpdate();
		}catch(Exception e) {
			System.out.println("데이터 저장 실패");
		}
		
//		String sql="insert into test_member(name,kor,eng,mat,total,std_avg) values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","+m.getMat()+","+m.getTotal()+","+m.getStd_avg()+")";
//		
//		try {
//			st=conn.createStatement(); //sql문을 보내기 위해 Statement 객체 생성
//			st.executeUpdate(sql); //sql문을 데이터데이스에 전달
//		}catch(Exception e) {
//			System.out.println("데이터 저장 실패");
//		}
		
	}
	
	public Member[] select() {
		Member[] list=null;
		
		String sql="select count(*) as cnt from test_member";
		
		try {
			int size=0;
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {
				size=rs.getInt("cnt"); //데이터베이스에 데이터(레코드)가 총 몇 개 있는지
			}
			if(size!=0) {
				list=new Member[size];
				int i=0;
				sql="select * from test_member"; //전체 데이터 조회 쿼리문(sql 질의문)
				rs=st.executeQuery(sql); //조회 결과 받기
				while(rs.next()) { //조회 결과 하나씩 순회
					list[i]=new Member(rs.getInt("member_id"),
							rs.getString("name"),rs.getInt("kor"),rs.getInt("eng"),rs.getInt("mat"),
							rs.getInt("total"),rs.getInt("std_avg"));
					i++; //배열의 다음 인덱스 표현을 위해 1 증가
				}
			}
		}catch(Exception e) {
			System.out.println("데이터 조회 실패");
		}
		
		return list;
	}
	
}