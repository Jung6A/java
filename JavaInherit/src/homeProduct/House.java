package homeProduct;

public abstract class House {
	//추상 클래스- class 앞에 abstract
	//추상 클래스는 객체 생성 불가
	//추상 메서드를 가지고 있는 클래스는 추상 클래스가 되어야 함
	//부모 클래스가 추상 클래스라면 자식 클래스는 반드시 추상 메서드를 정의해야 함
	//부모의 추상 메서드를 재정의하지 않을 거라면 자식 클래스도 추상 클래스가 되어야 함
	
	protected boolean onOff;
	protected String brand; //제품 브랜드
	protected int price; //제품 가격
	
	protected House() {
		this.onOff=false;
	}
	
	protected House(String brand,int price) { //자식 클래스가 호출할 메서드를 부모 클래스에 생성
		this.brand=brand; //변수는 가진 클래스에서 초기화
		this.price=price;
	}
	
	protected abstract void power(); //추상 메서드
	
	//오버라이딩: 상속 관계에 같은 이름의 메서드가 있을 때 자식 클래스의 메서드가 실행
	//오버라이딩 조건
	//부모 클래스에 해당 메서드 존재
	//오버라이딩 메서드는 반드시 반환 타입, 메서드 이름, 매개변수가 모두 동일하게 작성해야 함
	//메서드의 {} 내용은 달라도 됨
	
	//오버로딩: 완전히 새로운 메서드를 정의하는 것
	//오버라이딩: 기존의 메서드를 재정의하는 것
}
