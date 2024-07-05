package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		TV tv=new TV("삼성", 1000000);
		tv.brand="삼성";
		tv.power();
		tv.power();
		
		Aircon air=new Aircon();
		air.brand="LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();
		
	}

}

//클래스 상속 : 자식클래스 extends 부모클래스
//extends- 확장, 연장 등
//상속 하는 가장 큰 이유 → 다형성: 하나의 타입으로 여러 타입을 제어·사용하는 것
//부모 클래스의 인스턴스 변수와 인스턴스 메서드, 클래스 변수, 클래스 메서드 사용 가능
//단, 부모 클래스의 모든 걸 사용할 수 있는 것은 아님. 일부 제어가 걸린 변수나 메서드는 사용 불가
//자식 클래스마다 부모 클래스의 객체와 메서드 존재

//생성자 메서드를 통한 인스턴스 변수는 변수를 가지고 있는 클래스에서 초기화
//동작에 오류가 생기지는 않지만 변수의 위치가 오해되기 쉬움

//개발이 끝이 아니라 유지보수까지 생각하는 것이 좋음