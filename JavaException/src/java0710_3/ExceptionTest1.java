package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
			String name=null;
			String a="aaa";
			String b="bb";
			String c=null;
			name.length();
			a.length();
			b.length();
			c.length();
			
			System.out.println(10/0);
			
		}catch(NullPointerException n) {
			
			n.printStackTrace(); //오류메시지 확인: 테스트용
			
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			System.out.println("문자열이 입력되지 않았습니다");
			
		}catch(Exception e) { //시스템으로 가는 오류를 catch가 잡음
			//catch(발생하는오류 임의의변수)
			//모를 경우: 최상위 Exception으로 모든 오류 커버 가능
			System.out.println("0으로는 나눌 수 없습니다"); //책 458페이지
		
		}
		
		System.out.println(" 여기가 프로그램 끝");
		
	}

}
/*
	예외처리
	  프로그램 실행 중 에러 발생시 즉시 프로그램 종료
	    예외처리시 에러가 발생해도 프로그램은 종료되지 않음
	  사용자가 잘못된 값을 입력하는 경우 알려줄 수 있음
	  에러나 오류를 해결하는 방법이 아님, 회피 방법
*/