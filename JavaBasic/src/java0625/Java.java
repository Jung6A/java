package java0625;

public class Java {

	public static void main(String[] args) {
		// 자바 기본 구조: 프로젝트-패키지-클래스
		
		System.out.println("자바 테스트"); //출력. 약어: syso+ctrl+space
		//코드 실행: 왼쪽 ctrl+F11
		//자바 변수 생성
		// -> 데이터타입 변수이름=데이터; 한 번 설정한 데이터타입과 다른 타입을 변수로 대입할 수 없음
		//데이터의 종류: 정수, 실수, 문자
		//정수: byte, short, int, long, char
		//문자: char
		//실수: float, double, longdouble
		byte num=10; // 1byte: -128~127이 최대
		short num1=200; // 2byte
		int num2=2323; // 4byte
		long num3=234l; // 8byte.저장하려는 숫자 뒤에 l
		
		char ch='a'; //"문자열" '문자'. 자바에서는 한글 한 자 정도는 저장 가능. C언어에서는 불가
		
		float fnum=3.14f; //저장하려는 데이터 뒤에 f
		double dnum=12.3343;
		
		boolean isTrue=false;//false, true
		
		String word1="이순신"; //String: 클래스. 사용자 정의 타입
		
		//사각형의 넓이를 구하시오 (밑변과 높이는 정수)
		int width=15;
		int height=20;
		int area=width*height;
		System.out.println("넓이: "+area);
		
		//키보드를 30개 구매해야 한다. hp 게이밍 키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
		
		int keyboard=30;
		int price=8000;
		int total=keyboard*price;
		System.out.println("총 금액: "+total+"원");
		System.out.print("java 출력 방법 print: ");
		System.out.print("줄바꿈이 안 됨\n");
		System.out.printf("printf \n 출력\n"); // \n: 엔터 키의 문자 표현. 모든 print 출력에서 사용 가능
		//서식 문자: 형식 지정 문자
		System.out.printf("총 금액: %d\n",total);
		// %d, %u: 10진수 정수, %f: 10진수 실수, %c: 문자, %s: 문자열, %d: boolean(false, true), %o: 8진수 정수, %x: 16진수 정수
		System.out.printf("국어: %d점 수학: %d점\n", 80, 90);
		System.out.printf("나이: %d 키: %f\n", 30, 172.3);
		System.out.println("172.315");
		System.out.print("172.315\n");
		System.out.printf("%.1f\n", 172.315); //printf의 경우 %.1f 등으로 원하는 소수점 자릿수까지 출력 가능 기본적으로 %f는 소수점 여섯째자리까지
		System.out.println("3");
		System.out.printf("%5d",3); //%5d: 5자리 숫자가 들어갈 부분 확보 가능
	}

}