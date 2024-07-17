package java0717;

public class FruitBox<T extends Fruit> { //T extends 부모클래스: T 타입에 사용할 수 있는 건 부모클래스의 자식개체뿐
	private T fruit;
	
	public void setFruit(T fruit) {
		this.fruit=fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
	
}
