package java0625;

public class Java {

	public static void main(String[] args) {
		// �ڹ� �⺻ ����: ������Ʈ-��Ű��-Ŭ����
		
		System.out.println("�ڹ� �׽�Ʈ"); //���. ���: syso+ctrl+space
		//�ڵ� ����: ���� ctrl+F11
		//�ڹ� ���� ����
		// -> ������Ÿ�� �����̸�=������; �� �� ������ ������Ÿ�԰� �ٸ� Ÿ���� ������ ������ �� ����
		//�������� ����: ����, �Ǽ�, ����
		//����: byte, short, int, long, char
		//����: char
		//�Ǽ�: float, double, longdouble
		byte num=10; // 1byte: -128~127�� �ִ�
		short num1=200; // 2byte
		int num2=2323; // 4byte
		long num3=234l; // 8byte.�����Ϸ��� ���� �ڿ� l
		
		char ch='a'; //"���ڿ�" '����'. �ڹٿ����� �ѱ� �� �� ������ ���� ����. C������ �Ұ�
		
		float fnum=3.14f; //�����Ϸ��� ������ �ڿ� f
		double dnum=12.3343;
		
		boolean isTrue=false;//false, true
		
		String word1="�̼���"; //String: Ŭ����. ����� ���� Ÿ��
		
		//�簢���� ���̸� ���Ͻÿ� (�غ��� ���̴� ����)
		int width=15;
		int height=20;
		int area=width*height;
		System.out.println("����: "+area);
		
		//Ű���带 30�� �����ؾ� �Ѵ�. hp ���̹� Ű������ ������ 8000���̶�� �� ���űݾ��� ���ΰ�?
		
		int keyboard=30;
		int price=8000;
		int total=keyboard*price;
		System.out.println("�� �ݾ�: "+total+"��");
		System.out.print("java ��� ��� print: ");
		System.out.print("�ٹٲ��� �� ��\n");
		System.out.printf("printf \n ���\n"); // \n: ���� Ű�� ���� ǥ��. ��� print ��¿��� ��� ����
		//���� ����: ���� ���� ����
		System.out.printf("�� �ݾ�: %d\n",total);
		// %d, %u: 10���� ����, %f: 10���� �Ǽ�, %c: ����, %s: ���ڿ�, %d: boolean(false, true), %o: 8���� ����, %x: 16���� ����
		System.out.printf("����: %d�� ����: %d��\n", 80, 90);
		System.out.printf("����: %d Ű: %f\n", 30, 172.3);
		System.out.println("172.315");
		System.out.print("172.315\n");
		System.out.printf("%.1f\n", 172.315); //printf�� ��� %.1f ������ ���ϴ� �Ҽ��� �ڸ������� ��� ���� �⺻������ %f�� �Ҽ��� ����°�ڸ�����
		System.out.println("3");
		System.out.printf("%5d",3); //%5d: 5�ڸ� ���ڰ� �� �κ� Ȯ�� ����
	}

}