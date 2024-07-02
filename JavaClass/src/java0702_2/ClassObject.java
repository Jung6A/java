package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		Car car1;
		
		car1=new Car();
		car1.carName="쏘나타";
		car1.fuel="휘발유";
		
		System.out.println(car1.carName);
		
	}

}

//클래스 내부에 선언되는 변수(또는 배열)는 두 가지가 있음
//클래스 변수, 인스턴스 변수
//인스턴스 변수는 생성시 메모리 할당이 됨
//클래스 객체 생성은 new 연산자를 통함

class Car{
	static String maker="현대"; //클래스 변수
	
	String carName; //인스턴스 변수
	int displacement; //인스턴스 변수
	String fuel; //인스턴스 변수
	
}