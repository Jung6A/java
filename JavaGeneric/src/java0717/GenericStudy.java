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
//		//���ʸ� ���� ����ȯ �ʿ� ����
		
//		FruitBox<Toy> toyBox=new FruitBox<>();
//		toyBox.setFruit(new Toy());
		
		FruitBox<Fruit> fruitBox=new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j=new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
		
//		A<String> a=new A<>();
//		//A<String> -> A Ŭ������ ���ʸ� Ÿ�� T�� String���� ������. item ������ String item���� ����
//		a.setItem("�̼���");
//		
//		A<Integer> b=new A<>();
//		b.setItem(233);
		
		
	}

}

//class A<T>{
//	T item;
//	T[] arr;
//	//T[] arr=new T[3];  <- �Ұ���
//	//Ÿ���� �����Ǳ� ���̶� ������ ���� �� ����
//	ArrayList<T> list=new ArrayList<>();
//	
//	void setItem(T item) {
//		this.item=item;
//	}
//}

/*
 generic
 
 	Ŭ������ �������̽� ������ Ÿ���� �����ϴ� ���
 	���ʸ� Ÿ�� ǥ�� (�ý��� ���� �������� �ʾ����� ���������� ���̴� ǥ��)
 		T: type
 		E: element
 		K: key
 		V: value
 		N: number
 	
 	Ŭ������ ���ʸ� ǥ�� ���
 		class A<T>
 	
 	���ʸ� Ÿ���� Ŭ���� Ÿ�Ը� ���� ����
 		A<Tea> a=new A<Tea();
 	���� ���� Ŭ������� ��� ����
 	
 	���ʸ� Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
 		class A<T extends Parent>
 		�� Parent Ŭ������ �ڽ� Ŭ������ Parent Ŭ������ ���ʸ� Ÿ�� ���� ����
 		  �̿� �ٸ� Ŭ���� �Ұ�
 		�� ���� Ÿ�����ε� ���� ���� ����
 		  �������̽��� ���� Ÿ�� ���� ����, Ŭ������ �Ұ�
 	
 	���ʸ� ���ϵ�ī�� <?>
 		���ʸ� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
 		�޼����� �Ű����� Ÿ������ ���ʸ��� ǥ���ϴ� Ŭ������ ����Ѵٸ� Ŭ������ ǥ���� ���ʸ��� ����� ǥ������ �ʱ� ������(Ŭ������ �޶�) �ٽ� �� �� ���ʸ��� ������ �ʿ䰡 ����
 		�̶� ���� ���� ����Ѵٴ� ������ ����ϴ� ���� ?�� ǥ��
 	���ϵ�ī���� ����
 		<? extends T>: T Ŭ������ �� �ڽı��� ����
 		<? super T>: T Ŭ������ �� ������� ����(�ڽ� �Ұ�)
 */
