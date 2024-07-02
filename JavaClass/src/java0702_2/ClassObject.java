package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		System.out.println(Car.maker);
		
		Car car1;
		
		car1=new Car(); //carName, displacement, fuel ���� ����
		car1.carName="�Ÿ";
		car1.����="�ֹ���";
		Car.maker="���"; //car1.maker�� �ص� ��������
		System.out.println(Car.maker);
		
		Car car2=new Car("�׷���",3000,"�ֹ���");
		//�Ű������� �ִ� ������ �޼����� ��� ������ ���ÿ� ������ ���� ����
		System.out.println(car2.��ⷮ+"cc");
		System.out.println();
		/*
		  
		  ������: �̸�, ����Ʈ, ����
		  		��ǿ�, 4580, 4.3
		  		�����, 3285, 4.1
		  		�����, 90930, 2.7
		  		������, 19200, 3.1
		  		
		  ���Ҽ� �۰����� ������ ������ �Ҽ� ��ȸ���� ���� ����Ʈ
		  �� ������ ������ �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ���
		  
		 */
		Webwriter web1=new Webwriter("��ǿ�",4580,4.3f);
		Webwriter web2=new Webwriter("�����",3285,4.1f);
		Webwriter web3=new Webwriter("�����",90930,2.7f);
		Webwriter web4=new Webwriter("������",19200,3.1f);
		
		System.out.println("���Ҽ� �۰� ��ȸ���� ������ ����");
		
		System.out.printf("%s\n��ȸ��: %dȸ  ����: %.1f��", web1.name, web1.point, web1.score);
		System.out.println();
		System.out.printf("%s\n��ȸ��: %dȸ  ����: %.1f��", web2.name, web2.point, web2.score);
		System.out.println();
		System.out.printf("%s\n��ȸ��: %dȸ  ����: %.1f��", web3.name, web3.point, web3.score);
		System.out.println();
		System.out.printf("%s\n��ȸ��: %dȸ  ����: %.1f��", web4.name, web4.point, web4.score);
		System.out.println();
	
		System.out.println(web1);
		
	}

}

//Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ������ ����
//Ŭ���� ����, �ν��Ͻ� ����
//�ν��Ͻ� ������ ������ �޸� �Ҵ��� ��
//Ŭ���� ��ü ������ new �����ڸ� ����
//Ŭ���� ������ ���α׷� ���� �� �޸𸮿� �ε��ϸ� ������

//������ �޼���: ��ü(�ν��Ͻ�) ������ ������ �� ������ �ʱ�ȭ ���ִ� �޼���
//������ �޼���: return(��ȯ��)�� �������� ����
//           return(��ȯ)�� �ϸ� �� �Ǵ� ����: ������ �޼��忡�� return Ÿ�� ������ �� �Ǳ� ����
//�����ε�-�����ε� ���� ���� (�ϳ��� �̸����� ���� �޼��� ����)
//      1. ���� Ŭ�������� ����
//      2. �޼����� �̸��� ���ƾ� ��
//      3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� ��
//  or  4. �Ű������� ������ �޶�� ��

class Car{
	static String maker="����"; //Ŭ���� ����
	
	String carName; //�ν��Ͻ� ����
	int ��ⷮ; //�ν��Ͻ� ����
	String ����; //�ν��Ͻ� ����
	
	//������ �޼���
	Car(){
		//������ �޼����� ����: �ν��Ͻ� ������ �ʱⰪ ����
		//new �����ڿ� ���� ��ü ������ ���� ������ �ֹ����� �����
	}
	//�Ű������� �ִ� ������ �޼���
	//�Ϲ������� �Ű������� �ν��Ͻ� ������ �̸��� ���� ������ ���� �� �� ������ �򰥸��� �ʵ��� this.�ν��Ͻ� ������ ����
	Car(String carName,int cc, String fuel){
		this.carName=carName;
		��ⷮ=cc;
		this.����=fuel;
	}
	
}

class Webwriter{
	String name; //�̸�-�ν��Ͻ�
	int point; //����Ʈ-�ν��Ͻ�
	float score; //����-�ν��Ͻ�
	
	Webwriter(){
		//�Ű������� ���Ե� �����ڸ޼��尡 �ϳ��� ��������� �⺻ �޼���� �۵����� ����
		//���� �������� ��
	}
	
	Webwriter(String name){
		this.name=name;
	}

	Webwriter(String name, int point, float score){
		this.name=name;
		this.point=point;
		this.score=score;
	}
	
	public String toString(){
		return name+"\n��ȸ��: "+point+"ȸ  ����: "+score+"��";
	}
}