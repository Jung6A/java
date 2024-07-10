package java0710;

interface animal1{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound();
	
}
interface bird {
	public void fly();
}

class dog1 implements animal1 {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class cat1 implements animal1 {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class pigeon implements animal1,bird { //클래스는 다중상속이 불가능하지만 인터페이스는 가능
	@Override
	public void sound() {
		System.out.println("구구");
	}
	@Override
	public void fly() {
		System.out.println("푸드득 비둘기 날다");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		
		dog1 d=new dog1();
		cat1 c=new cat1();
		pigeon p=new pigeon();
		
		d.sound();
		c.sound();
		p.sound();
		p.fly();

	}

}
/*
	클래스 상속
		1. 단일상속: 하나의 클래스만 상속 가능
		   자식 클래스는 하나의 부모 클래스만 가질 수 있음
		   다른 클래스의 기능을 사용하려면 포함 관계로 구현
			포함관계: 클래스 안에 타 클래스의 객체를 갖는 것
			class A{ }
			class B{
				A a=new A();
			}
			
		2. 부모 클래스의 변수와 메서드를 상속받아 사용
		   부모 클래스의 public, protected, default 제어자 변수와 메서드만 상속됨
		   자식 클래스는 부모가 상속으로 주는 것을 모두 받아야 함
		   자식 클래스에서 선택 불가. 강제 상속
		   
		3. 강한 결합
		   부모 클래스의 변경이 자식 클래스에 영향을 줌
	
	인터페이스
		1. 다중 구현: 여러 개의 인터페이스 구현 가능
		   클래스는 여러 개의 인터페이스를 연결해 구현할 수 있음
		
		2. 유연성
		   클래스는 필요한 인터페이스를 조합하여 구현할 수 있음
		
		3. 약한 결합
		   클래스는 필요한 인터페이스만 구현하면 되므로 상속 관계일 때보다 유연성이 높음
		   (상속보다 영향이 적다)
	
 */
