package java0708;

import java.util.Scanner;

public class DbTest {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Dao dao=new Dao();
		Member[] list; //Member 클래스 타입 배열 주소를 저장할 참조변수
		
		System.out.println("1. 입력  2. 출력");
		int menu=scan.nextInt();
		scan.nextLine();
		
		switch(menu) {
			case 1:
				System.out.print("학생 이름: ");
				String name=scan.nextLine();
				System.out.print("국어 성적: ");
				int kor=scan.nextInt();
				System.out.print("영어 성적: ");
				int eng=scan.nextInt();
				System.out.print("수학 성적: ");
				int mat=scan.nextInt();
				
				Member member=new Member(name,kor,eng,mat);
				total_avg(member);
				System.out.println(member);
				
				//데이터베이스에 저장
				dao.insert(member);
				break;
			case 2: //데이터 전부 출력
				list=dao.select(); //데이터베이스의 데이터를 Member 클래스 배열로 가져오기
				for(Member data:list) {
					System.out.println(data);
				}
				break;
		}
		
	}
	
	static void total_avg(Member m) {
		int total=m.getKor()+m.getEng()+m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
	}

}
