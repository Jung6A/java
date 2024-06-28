package java0626;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		System.out.println("자바 출력");
		//System.in: 입력
		//입력 받을 수 있는 내장 클래스: Scanner
		Scanner scan=new Scanner(System.in);
		//new를 통해 생성시 메모리 주소를 가짐-메모리 주소를 가진 변수: 참조변수
		
		//float타입: .nextFloat()  double타입: .nextDouble()
		//byte타입: .nextByte()  short타입: .nextShort()
		//.nextChar()는 없음  문자열 입력: .nextLine() 또는 .next()
//		System.out.print("정수 입력: ");
//		int a=scan.nextInt(); //int타입
//		System.out.println(a);
//	
//		//철수가 점심으로 편의점 대게라면, 삼각김밥, 바나나우유를 먹음
//		//철수의 점심값은?
//		int daege, samgak, banana;
//		System.out.println("대게라면 가격: ");
//		daege=scan.nextInt();
//		System.out.println("삼각김밥 가격: ");
//		samgak=scan.nextInt();
//		System.out.println("바나나우유 가격: ");
//		banana=scan.nextInt();
//		int total=daege+samgak+banana;
//		//System.out.println("총 가격: "+total+"원");
//		System.out.printf("총 가격: %d원\n",total);
		
//		//민수가 친구들을 만나러 나옴
//		//나와 보니 지갑을 두고 와서 다시 갔다옴 -> 신발을 짝짝이로 신어서 다시 갔다옴
//		//민수의 집은 5층, 1층 이동하는 데 걸리는 시간은 3.4초
//		//들락날락하는 데 걸린 시간
//		
//		float time=3.4f;
//		int floor=5;
//		int wangrae=4;
//		float total= (floor-1)*time*wangrae;
//		System.out.printf("총 걸리는 시간: %.1f초\n",total);
//		
//		//프로그램 코드는 기본 순차 진행 예외: if(순차진행이 아닌 분기), 함수(메서드), 반복문, goto문(이름 가진 for문)
		
		/*
		 
		 데이터의 종류: 정수, 실수, 문자, boolean(참, 거짓)
		 데이터 타입
		 	정수: byte, short, int, long
		 	실수: float, double
		 	문자: char
		 	진위: boolean
		 	
		 변수 선언 방법: 데이터타입 변수이름;
			 int num; 정수 타입 변수
			 double dnum; 실수 타입 변수
			 char ch; 문자 타입 변수(문자열x)
			 boolean bool;
		 
		 변수 초기화
		 	int num=10; 변수 선언과 함께 데이터 저장
		 	
		 출력 방법
		 	System.out.println(출력 내용);
		 	System.out.print(출력 내용);
		 	System.out.printf(출력 내용);
		 	
		 printf에서 함께 사용하는 형식지정자
		 	%d, %u: 정수, %f: 실수
		 	%c: 문자, %s: 문자열
		 	
		 System.out.printf("%s마을의 나이가 %d 살인 폭군 지도자 %c 씨",
		 		"코딩빌", 28, '박');
		 		
		 입력 방법
		 Scanner 클래스 객체 필요
		 Scanner 변수=new Scanner(System.in);
		  *Scanner 클래스는 내장 외부 클래스이므로 import 필요
		 
		 변수.nextInt(); int타입 정수
		 변수.nextByte(); byte타입 정수
		 변수.nextShort(); short타입 정수
		 변수.nextLong(); long타입 정수
		 변수.nextFloat(); float타입 실수
		 변수.nextDouble(); double타입 실수
		 변수.next(); 문자열
		 변수.nextLine(); 문자열
		 
		 c언어, 자바, 건축학개론 시험 성적 입력
		 세 과목의 총점과 평균 각각 출력
		 		 
		 */
		float C, java, building;
		
		System.out.println("C언어 점수 입력: ");
		C=scan.nextFloat();
		System.out.println("java 점수 입력: ");
		java=scan.nextFloat();
		System.out.println("건축학개론 점수 입력: ");
		building=scan.nextFloat();
		float totalScore=C+java+building;
		float averageScore=totalScore/3;
		System.out.printf("총점: %.0f점, 평균: %.1f점", totalScore, averageScore);
	}

}
