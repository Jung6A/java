package homeProduct;

public class House {
	
	boolean onOff;
	String brand; //제품 브랜드
	int price; //제품 가격
	
	House(){
		this.onOff=false;
	}
	
	House(String brand,int price){ //자식 클래스가 호출할 메서드를 부모 클래스에 생성
		this.brand=brand; //변수는 가진 클래스에서 초기화
		this.price=price;
	}
	
	void power() {
		this.onOff=!this.onOff;
		System.out.println("전원 "+this.onOff);
	}
	
}
