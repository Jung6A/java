package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		//영화 정보 5개 입력
		
		Movie[] mv=new Movie[5];
		
		mv[0]=new Movie("렛 미 인","맷 리브스",15);
		mv[1]=new Movie("작은 아씨들","그레타 거윅",0);
		mv[2]=new Movie("레 미제라블","톰 후퍼",12);
		mv[3]=new Movie("인사이드 아웃2","켈시 만",0);
		mv[4]=new Movie("코코","리 언크리치",0);
		
		for(int i=0;i<mv.length;i++) {
			System.out.println(mv[i]);
		}
		
		System.out.println();
		
		for(Movie movie:mv) {
			System.out.println(movie);
		}
		
	}

}
/*
	배열 생성
		데이터 타입[] 참조변수=new 데이터 타입[배열 크기];
		클래스명[] 참조변수=new 클래스명[배열 크기];
		
		int[] arr=new int[10];
		int 타입의 공간 10개 생성(int 타입으로 선언된 변수 10개가 있는 것과 같다고 봐도 됨)
		Movie[] mv=new Movie[10];
		Movie 클래스의 참조변수 10개 생성
		mv[0]=new Movie(); //객체를 만들기 위한 생성자 메서드 호출
		mv[1]=new Movie(); …
 */