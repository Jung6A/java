package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		Car car1;
		
		car1=new Car(); //carName, displacement, fuel ���� ����
		car1.carName="�Ÿ";
		car1.fuel="�ֹ���";
		
	}

}

//Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ������ ����
//Ŭ���� ����, �ν��Ͻ� ����
//�ν��Ͻ� ������ ������ �޸� �Ҵ��� ��
//Ŭ���� ��ü ������ new �����ڸ� ����

class Car{
	static String maker="����"; //Ŭ���� ����
	
	String carName; //�ν��Ͻ� ����
	int displacement; //�ν��Ͻ� ����
	String fuel; //�ν��Ͻ� ����
	
}