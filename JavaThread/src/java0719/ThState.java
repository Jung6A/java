package java0719;

public enum ThState {
	NEW, RUNNABLE, BLOCKED, WATING, TIME_WATING, TERMINATED
	
//	int num;
//	ThState(int num){
//		this.num=num;
//	}
//	
//	int getNum() {
//		return this.num;
//	}
	
}

/*
 Java 상수
 final int num=20;
 num=30; 오류 (상수 값을 변경하려 했기 때문에)
 
 JS
 상수 const num=10;
 num=30; 오류
 
 상수들의 클래스처럼 사용할 수 있는 방법: Enum
 
*/