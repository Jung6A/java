package java0709_3;

public class MainMethod {

	public static void main(String[] args) {
		
		move d=new dog();
		move c=new cat();
		d.moving();
		c.moving();
		
	}

}
class dog implements move{
	@Override
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}

class cat implements move{
	@Override
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
		���α׷��� �⺻ Ʋ ����
		
	�������� Ŭ���̾�Ʈ���� ������ ����
	Ŭ���̾�Ʈ�� ��û�� �޴� �޼���
	Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼���
 */