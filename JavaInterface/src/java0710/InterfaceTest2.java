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
		System.out.println("�۸�");
	}
}

class cat1 implements animal1 {
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}

class pigeon implements animal1,bird { //Ŭ������ ���߻���� �Ұ��������� �������̽��� ����
	@Override
	public void sound() {
		System.out.println("����");
	}
	@Override
	public void fly() {
		System.out.println("Ǫ��� ��ѱ� ����");
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
	Ŭ���� ���
		1. ���ϻ��: �ϳ��� Ŭ������ ��� ����
		   �ڽ� Ŭ������ �ϳ��� �θ� Ŭ������ ���� �� ����
		   �ٸ� Ŭ������ ����� ����Ϸ��� ���� ����� ����
			���԰���: Ŭ���� �ȿ� Ÿ Ŭ������ ��ü�� ���� ��
			class A{ }
			class B{
				A a=new A();
			}
			
		2. �θ� Ŭ������ ������ �޼��带 ��ӹ޾� ���
		   �θ� Ŭ������ public, protected, default ������ ������ �޼��常 ��ӵ�
		   �ڽ� Ŭ������ �θ� ������� �ִ� ���� ��� �޾ƾ� ��
		   �ڽ� Ŭ�������� ���� �Ұ�. ���� ���
		   
		3. ���� ����
		   �θ� Ŭ������ ������ �ڽ� Ŭ������ ������ ��
	
	�������̽�
		1. ���� ����: ���� ���� �������̽� ���� ����
		   Ŭ������ ���� ���� �������̽��� ������ ������ �� ����
		
		2. ������
		   Ŭ������ �ʿ��� �������̽��� �����Ͽ� ������ �� ����
		
		3. ���� ����
		   Ŭ������ �ʿ��� �������̽��� �����ϸ� �ǹǷ� ��� ������ ������ �������� ����
		   (��Ӻ��� ������ ����)
	
 */
