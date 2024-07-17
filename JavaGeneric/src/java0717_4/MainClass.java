package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{
	public void move();
}

class A<T>{
	T item;
	@SafeVarargs
	final void get(T ... add) { // ... → 가변인자: 배열처럼 값이 바뀔 수 있는 인자
		
	}
}

public class MainClass {
	
	@Deprecated
	static void aaa() {}

	public static void main(String[] args) {
		@SuppressWarnings("all")
		Date today=new Date();
		
//		@SuppressWarnings("deprecation") //getYear 메서드에 이미 deprecation이 포함되어 있어 중복으로 오류
//		today.getYear();
		
		@SuppressWarnings("all")
		ArrayList list=new ArrayList();
		
	}

}
/*
 주석: 개발자를 위한 메모
 annotation: 주석과 같은 의미
 	특정 코드를 컴퓨터에 정보 제공
 	표준 annotation, 메타 annotation 등
 	
 	@Override
 		컴파일러에 메서드를 오버라이딩하는 것임을 지시
 	@Deprecated
 		앞으로 사용하지 않을 대상임을 지시
 	@SuppressWarnings()
 		컴파일러가 경고를 출력하지 않도록 경고 억제
 			("all"): 모든 경고
 			("deprecation"): 권장되지 않는 기능 경고
 			("null"): null과 관련된 경고
 			("unchecked"): 미확인 오퍼레이션 경고
 			("unused"): 사용하지 않는 코드 또는 불필요한 코드에 대한 경고
 	@FunctionalInterface
 		함수형 인터페이스(하나의 메서드만 가진 인터페이스)라는 것을 지시
 	@SafeVaragrs
 		제너릭과 같은 가변 인자의 매개변수 사용시 경고 억제
 		
 	메타 annotation
	 	@Target: 애너테이션을 정의할 때 적용할 대상 지정
	 	@Documented: javadoc로 작성한 문서에 포함
	 	@Inherited: 하위 클래스에 상속되도록 할 때
	 	@Retention: 애너테이션 기간 설정
	 	@Repeat: 애너테이션 반복 설정
 	
*/