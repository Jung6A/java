package java0717;

public class Juice {
	
	//제너릭을 사용하지 않는 클래스의 메서드에서 제너릭을 사용할 때 한 번 더 표시해줘야 함
	public void makeJuice(FruitBox<? extends Fruit> box) { // <?>: 와일드카드- 어떤 타입이든 가능. 제한을 걸 수도 있음
		
	}
	
}
