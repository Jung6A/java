package java0709_3;

public class MainMethod {

	public static void main(String[] args) {
		
		
		
	}

}
class dog implements move{
	
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}

class cat implements move{
	
	public void moving() {
		System.out.println("��ӻ�� �̵��Ѵ�.");
	}
}

interface move{
	static int a=10;
	public void moving();
}

/*
	�������̽�: �߻� Ŭ������ �� ����
		�߻� �޼��常 ����
		�ν��Ͻ� ���� �Ұ�
		static ����, static �޼��� ���� ����
		��ü ���� �Ұ�
		Ŭ������ ����Ǿ� ���
		������ ������ ���� ���	
 */