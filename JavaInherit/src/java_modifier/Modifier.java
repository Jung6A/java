package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book1=new Book();
		book1.setTitle("JAVA 속성");
		book1.setAuthor("유재학");
		book1.setPage(786);
		
		System.out.println(book1.getTitle());
		
		Book book2=new Book("JAVA, 웹, 성공적","이병헌",564);
		System.out.println(book2);
		
	}

}
/*
	클래스
		변수, 메서드
		인스턴스, 클래스
		생성자 메서드
		변수 초기화
		오버로딩
		오버라이딩
		상속
		제어자
		다형성
		추상화
		인터페이스
		내부 클래스(익명 클래스, 정적 클래스)
		열거형
	
	컬렉션: 자료 구조와 알고리즘
		collection, List, Map, Set
		ArrayList, Vector, LinkedList
		Queue, stack, HashSet, TreeSet
		HashMap, TreeMap 등
		
	제네릭
	에너테이션
	스트림
	쓰레드
	JAVA 기본 끝
	→JSP- 내장객체, MVC(Model-데이터 View-화면 Control-제어) 패턴
	→스프링 프레임워크- 스프링부트
	→MVC 패턴 →간단한 쇼핑몰 사이트
	→프로젝트(웹) 팀 프로젝트
 */