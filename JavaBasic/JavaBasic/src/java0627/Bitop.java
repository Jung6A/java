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
		
		System.out.println(34&15); // &연산: 1&0=0, 0&1=0, 1&1=1, 0&0=0
		System.out.println(42|21); // |연산: 1|0=1, 0|1=1, 1|1=1, 0|0=0
		System.out.println(42^22); // ^연산(x or): 1^0=1, 0^1=1, 1^1=0, 0^0=0
		System.out.println(~13);
		System.out.println(~-15);
		// ~연산: 0과 1을 반전 양수 x를 반전할 경우 -(x+1), 음수 -x를 반전할 경우 x-1
		//0이 양수로 분류되어 양수가 음수보다 하나 더 많음. 따라서 0이 -1과 대응 1은 -2와… 대응
		//부호비트(0=양수, 1=음수)도 반전, 음수 이진수는 0 부분을 셈
		
		System.out.println(5<<2); // <<연산: 이진수로 < 방향으로 n칸 이동
		//이동시키고 남은 자리는 양수일 경우 0, 음수일 경우 1로 채움
		System.out.println(5>>2); // >>연산: 이진수로 > 방향으로 n칸 이동
		//밖으로 나가는 것은 버림. 남는 자리는 양수일 경우 0, 음수일 경우 1로 채움
		
		// << 2의 n승 구할 때
		System.out.println(1<<4); //2의 4승
		// >> 2의 n승만큼 나누기
		System.out.println(1024>>3); // 1024를 2의 3승으로 나누기
		
		int red=187;
		int green=228;
		int blue=246;
		int color=(red<<16)|(green<<8)|blue;
		
		System.out.printf("#%X \n",color);
		//rgb 값을 헥사코드로 변환
		
	}

}
