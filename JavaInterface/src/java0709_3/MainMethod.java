package java0709_3;

public class MainMethod {

	public static void main(String[] args) {
		
		
		
	}

}
class dog implements move{
	
	public void moving() {
		System.out.println("성큼성큼 이동한다.");
	}
}

class cat implements move{
	
	public void moving() {
		System.out.println("사뿐사뿐 이동한다.");
	}
}

interface move{
	static int a=10;
	public void moving();
}

/*
	인터페이스: 추상 클래스의 한 종류
		추상 메서드만 가능
		인스턴스 변수 불가
		static 변수, static 메서드 선언 가능
		객체 생성 불가
		클래스에 연결되어 사용
		다형성 구현을 위해 사용	
 */