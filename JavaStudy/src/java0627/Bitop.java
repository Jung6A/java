package java0627;

public class Bitop {

	public static void main(String[] args) {
		
		/* 
		 연산자
		 정수와 정수 연산 시 결과는 정수, 정수와 실수 연산 시 결과는 실수
		 	산술연산자: +, -, *, /(몫), %(나머지)
		 	증감연산자: ++, --
		 	대입연산자: =
		 	복합대입연산자: +=, -=, *=, /=, %=
		 	비교연산자: >, <, >=, <=, ==, !=
		 	논리연산자: &&, ||, !
		 	조건연산자: (조건식)?참 내용:거짓 내용;
		 	비트연산자:
		 		비트 논리연산자: &, |, ~, ^
		 		비트 시프트연산자: >>, <<
		 */
		
		int a=10;
		a+=3; // a=a+3;  저장되는 변수와 계산하는 변수가 같을 때만 복합대입연산자 사용
		
		System.out.println(10==10.0); //java에서 비교연산자는 숫자만 가능
		String name1="김유신";
		String name2="이순신";
		System.out.println(name1.equals(name2)); //문자 비교용 메세드 a.equals(b);
		
		System.out.println(34&15); //&연산: 곱하기를 생각
		System.out.println(42|21); //|연산: 더하기를 생각 (실제 더하는 것x)
	}

}
