package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{
	public void move();
}

class A<T>{
	T item;
	@SafeVarargs
	final void get(T ... add) { // ... �� ��������: �迭ó�� ���� �ٲ� �� �ִ� ����
		
	}
}

public class MainClass {
	
	@Deprecated
	static void aaa() {}

	public static void main(String[] args) {
		@SuppressWarnings("all")
		Date today=new Date();
		
//		@SuppressWarnings("deprecation") //getYear �޼��忡 �̹� deprecation�� ���ԵǾ� �־� �ߺ����� ����
//		today.getYear();
		
		@SuppressWarnings("all")
		ArrayList list=new ArrayList();
		
	}

}
/*
 �ּ�: �����ڸ� ���� �޸�
 annotation: �ּ��� ���� �ǹ�
 	Ư�� �ڵ带 ��ǻ�Ϳ� ���� ����
 	ǥ�� annotation, ��Ÿ annotation ��
 	
 	@Override
 		�����Ϸ��� �޼��带 �������̵��ϴ� ������ ����
 	@Deprecated
 		������ ������� ���� ������� ����
 	@SuppressWarnings()
 		�����Ϸ��� ��� ������� �ʵ��� ��� ����
 			("all"): ��� ���
 			("deprecation"): ������� �ʴ� ��� ���
 			("null"): null�� ���õ� ���
 			("unchecked"): ��Ȯ�� ���۷��̼� ���
 			("unused"): ������� �ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ���
 	@FunctionalInterface
 		�Լ��� �������̽�(�ϳ��� �޼��常 ���� �������̽�)��� ���� ����
 	@SafeVaragrs
 		���ʸ��� ���� ���� ������ �Ű����� ���� ��� ����
 		
 	��Ÿ annotation
	 	@Target: �ֳ����̼��� ������ �� ������ ��� ����
	 	@Documented: javadoc�� �ۼ��� ������ ����
	 	@Inherited: ���� Ŭ������ ��ӵǵ��� �� ��
	 	@Retention: �ֳ����̼� �Ⱓ ����
	 	@Repeat: �ֳ����̼� �ݺ� ����
 	
*/