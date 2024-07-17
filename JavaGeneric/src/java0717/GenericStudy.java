package java0717;

//import java.util.ArrayList;

public class GenericStudy {

	public static void main(String[] args) {
		
		FruitBox<Apple> appleBox=new FruitBox<>();
		appleBox.setFruit(new Apple());
		
		FruitBox<Banana> bananaBox=new FruitBox<>();
		bananaBox.setFruit(new Banana());
		
		FruitBox<Grape> grapeBox=new FruitBox<>();
		grapeBox.setFruit(new Grape());
		
//		Apple apple=appleBox.getFruit();
//		//제너릭 사용시 형변환 필요 없음
		
//		FruitBox<Toy> toyBox=new FruitBox<>();
//		toyBox.setFruit(new Toy());
		
		FruitBox<Fruit> fruitBox=new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j=new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
		
//		A<String> a=new A<>();
//		//A<String> -> A 클래스의 제너릭 타입 T에 String으로 지정됨. item 변수는 String item으로 사용됨
//		a.setItem("이순신");
//		
//		A<Integer> b=new A<>();
//		b.setItem(233);
		
		
	}

}

//class A<T>{
//	T item;
//	T[] arr;
//	//T[] arr=new T[3];  <- 불가능
//	//타입이 지정되기 전이라 공간을 만들 수 없음
//	ArrayList<T> list=new ArrayList<>();
//	
//	void setItem(T item) {
//		this.item=item;
//	}
//}

/*
 generic
 
 	클래스와 인터페이스 내부의 타입을 지정하는 방법
 	제너릭 타입 표현 (시스템 언어로 지정되지 않았지만 보편적으로 쓰이는 표현)
 		T: type
 		E: element
 		K: key
 		V: value
 		N: number
 	
 	클래스에 제너릭 표현 방법
 		class A<T>
 	
 	제너릭 타입은 클래스 타입만 지정 가능
 		A<Tea> a=new A<Tea();
 	제한 없이 클래스라면 모두 가능
 	
 	제너릭 타입으로 사용 가능한 클래스 제한을 두는 방법
 		class A<T extends Parent>
 		→ Parent 클래스의 자식 클래스와 Parent 클래스만 제너릭 타입 지정 가능
 		  이외 다른 클래스 불가
 		→ 다중 타입으로도 제한 설정 가능
 		  인터페이스만 다중 타입 설정 가능, 클래스는 불가
 	
 	제너릭 와일드카드 <?>
 		제너릭 타입의 한계를 보완하기 위해 사용하는 방법
 		메서드의 매개변수 타입으로 제너릭을 표현하는 클래스를 사용한다면 클래스에 표현된 제너릭이 제대로 표현되지 않기 때문에(클래스가 달라서) 다시 한 번 제너릭을 지정할 필요가 있음
 		이때 예외 없이 허용한다는 뜻으로 사용하는 것을 ?로 표현
 	와일드카드의 제한
 		<? extends T>: T 클래스와 그 자식까지 가능
 		<? super T>: T 클래스와 그 조상까지 가능(자식 불가)
 */
