package java0626;

import java.util.Scanner;

public class input2 {

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
		
		String name1, name2, division1, division2;
		int pay1, pay2; 
		
		System.out.println("첫 번째 직원의 이름: ");
		name1=scan.next();
		System.out.println("첫 번째 직원의 부서: ");
		division1=scan.next();
		System.out.println("첫 번째 직원의 월급: ");
		pay1=scan.nextInt();
		System.out.println("두 번째 직원의 이름: ");
		name2=scan.next();
		System.out.println("두 번째 직원의 부서: ");
		division2=scan.next();
		System.out.println("두 번째 직원의 월급: ");
		pay2=scan.nextInt();
		//세금 계산
		float t, tax1, tax2;
		t=0.08f;
		tax1=pay1-(pay1*t);
		tax2=pay2-(pay2*t);
		System.out.printf("첫 번째 직원\n이름: %s, 부서: %s, 월급 실 수령액: %.0f원\n",name1,division1,tax1);
		System.out.printf("두 번째 직원\n이름: %s, 부서: %s, 월급 실 수령액: %.0f원\n",name2,division2,tax2);
		
	}

}
