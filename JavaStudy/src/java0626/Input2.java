package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		/*
		 코드 작성 전 해야 할 일: 문제 파악, 요구사항 도출
		 
		 문자열: ""로 작성
		 문자열은 String 클래스 타입 사용
		 
		 문제2
		 직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력
		 세금은 8%
		 이름, 부서, 실 수력액 출력: 직원 두 명
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		String name=null, division=null;
		int pay=0, salary=0;
		float t=0.08f;
		
		System.out.println("이름: ");
		name=scan.nextLine();
		System.out.println("부서: ");
		division=scan.nextLine();
		System.out.println("월 급여액(만 단위): ");
		pay=scan.nextInt();
		salary=(int)(pay-(pay*t)); //강제형변환
		System.out.printf("이름: %s\n부서: %s, 월급 실 수령액: %d만원\n", name,division,salary);
		//Integer.parseInt(scan.nextLine());  문자로 받은 걸 정수로 변환하는 꼼수?
		
		scan.nextLine(); //숫자입력->문자 입력을 할 경우 사이에 nextLine();으로 \n 값을 빼줌
		
		System.out.println("두 번째 직원의 이름: ");
		name=scan.nextLine();
		System.out.println("두 번째 직원의 부서: ");
		division=scan.nextLine();
		System.out.println("두 번째 직원의 월 급여액(만 단위): ");
		pay=scan.nextInt();
		salary=(int)(pay-(pay*t));
		System.out.printf("이름: %s\n부서: %s, 월급 실 수령액: %d만원\n", name,division,salary);
		
		//next();는 엔터(\n) 값을 가지지 않아서 버퍼에 계속 남음 -> 나중에 문제가 생길 수도 있음
		//next();를 쓴 후에는 늘 nextLine();으로 \n 값을 빼주는 것이 좋음
		//next(); 스페이스, tab, 엔터 키로 입력 종료  nextLine(); 엔터 키로 입력 종료
	}

}
