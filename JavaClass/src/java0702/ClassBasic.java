package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		//변수-배열-구조체-클래스
		//Scanner String Arrays
		/*
		   영화
		   class Movie{
		   		String 제목;
		   		String 장르;
		   		String 감독;
		   		int[] 개봉일;
		   		int 관객수;
		   		long 총 수익;
		   		
		   		메서드: 전체 출력
		   		메서드: 순수익 출력
		   } 
		 */
		//정의된 클래스 타입의 공간 생성. 생성된 공간에 데이터 저장
		//클래스 타입으로 생선된 공간을 또는 인스턴스라고 함
		
		//클래스 인스턴스 생성: 생성자 메서드
		Member member1=new Member();
		Member member2=new Member();
		
		System.out.println(member1);
		
		member1.name="이순신";
		member1.age=23;
		System.out.println(member1.name+"("+member1.age+"세)");
		
		member2.name="김유신";
		member2.age=34;
		System.out.println(member2.name+"("+member2.age+"세)");
		System.out.println();
		
		//java: 495p, 메모리최적화기법: 893p
		Book book1=new Book();
		Book book2=new Book();
		
		book1.title="java";
		book1.page=495;
		book2.title="메모리최적화기법";
		book2.page=893;
		
		//스마트폰 제품명, 운영체제, 메모리(ram) 크기에 대해
		//저장할 수 있는 클래스를 정의하고 인스턴스 생성하여 값 저장, 출력 (스마트폰 3개)

		Phone flip=new Phone();
		Phone fold=new Phone();
		Phone apple=new Phone();
		
		flip.제품명="갤럭시 Z 플립5";
		flip.운영체제="android";
		flip.메모리=512;
		
		fold.제품명="갤럭시 Z 폴드5";
		fold.운영체제="android";
		fold.메모리=512;
		
		apple.제품명="아이폰 15 프로";
		apple.운영체제="iOS18";
		apple.메모리=512;
		
		System.out.print(flip.제품명+"\n운영체제: "+flip.운영체제+", 메모리 용량: "+flip.메모리+"GB");
		System.out.println();
		System.out.print(fold.제품명+"\n운영체제: "+fold.운영체제+", 메모리 용량: "+fold.메모리+"GB");
		System.out.println();
		System.out.print(apple.제품명+"\n운영체제: "+apple.운영체제+", 메모리 용량: "+apple.메모리+"GB");
		
	}

}

class Phone{
	String 제품명;
	String 운영체제;
	int 메모리;
}

class Book{ //책 제목과 페이지 수 저장하기 위한 클래스 정의
	String title;
	int page;
}

//클래스: 설계도 / 객체: 제품
//클래스: 붕어빵틀 / 객체: 붕어빵

class Member{ //Member라는 이름의 클래스 정의
	String name; //이름
	int age; //나이
	Member(){
		//클래스 정의하면 따로 만들지 않아도 클래스 이름으로 된 메서드가 생성됨 (생략되어서 보이지 않음)
		
	}
}