package java0717;

public class FruitBox<T extends Fruit> { //T extends �θ�Ŭ����: T Ÿ�Կ� ����� �� �ִ� �� �θ�Ŭ������ �ڽİ�ü��
	private T fruit;
	
	public void setFruit(T fruit) {
		this.fruit=fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
	
}
