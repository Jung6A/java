package java0626;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		System.out.println("�ڹ� ���");
		//System.in: �Է�
		//�Է� ���� �� �ִ� ���� Ŭ����: Scanner
		Scanner scan=new Scanner(System.in);
		//new�� ���� ������ �޸� �ּҸ� ����-�޸� �ּҸ� ���� ����: ��������
		
		//floatŸ��: .nextFloat()  doubleŸ��: .nextDouble()
		//byteŸ��: .nextByte()  shortŸ��: .nextShort()
		//.nextChar()�� ����  ���ڿ� �Է�: .nextLine() �Ǵ� .next()
//		System.out.print("���� �Է�: ");
//		int a=scan.nextInt(); //intŸ��
//		System.out.println(a);
//	
//		//ö���� �������� ������ ��Զ��, �ﰢ���, �ٳ��������� ����
//		//ö���� ���ɰ���?
//		int daege, samgak, banana;
//		System.out.println("��Զ�� ����: ");
//		daege=scan.nextInt();
//		System.out.println("�ﰢ��� ����: ");
//		samgak=scan.nextInt();
//		System.out.println("�ٳ������� ����: ");
//		banana=scan.nextInt();
//		int total=daege+samgak+banana;
//		//System.out.println("�� ����: "+total+"��");
//		System.out.printf("�� ����: %d��\n",total);
		
//		//�μ��� ģ������ ������ ����
//		//���� ���� ������ �ΰ� �ͼ� �ٽ� ���ٿ� -> �Ź��� ¦¦�̷� �ž �ٽ� ���ٿ�
//		//�μ��� ���� 5��, 1�� �̵��ϴ� �� �ɸ��� �ð��� 3.4��
//		//��������ϴ� �� �ɸ� �ð�
//		
//		float time=3.4f;
//		int floor=5;
//		int wangrae=4;
//		float total= (floor-1)*time*wangrae;
//		System.out.printf("�� �ɸ��� �ð�: %.1f��\n",total);
//		
//		//���α׷� �ڵ�� �⺻ ���� ���� ����: if(���������� �ƴ� �б�), �Լ�(�޼���), �ݺ���, goto��(�̸� ���� for��)
		
		/*
		 
		 �������� ����: ����, �Ǽ�, ����, boolean(��, ����)
		 ������ Ÿ��
		 	����: byte, short, int, long
		 	�Ǽ�: float, double
		 	����: char
		 	����: boolean
		 	
		 ���� ���� ���: ������Ÿ�� �����̸�;
			 int num; ���� Ÿ�� ����
			 double dnum; �Ǽ� Ÿ�� ����
			 char ch; ���� Ÿ�� ����(���ڿ�x)
			 boolean bool;
		 
		 ���� �ʱ�ȭ
		 	int num=10; ���� ����� �Բ� ������ ����
		 	
		 ��� ���
		 	System.out.println(��� ����);
		 	System.out.print(��� ����);
		 	System.out.printf(��� ����);
		 	
		 printf���� �Բ� ����ϴ� ����������
		 	%d, %u: ����, %f: �Ǽ�
		 	%c: ����, %s: ���ڿ�
		 	
		 System.out.printf("%s������ ���̰� %d ���� ���� ������ %c ��",
		 		"�ڵ���", 28, '��');
		 		
		 �Է� ���
		 Scanner Ŭ���� ��ü �ʿ�
		 Scanner ����=new Scanner(System.in);
		  *Scanner Ŭ������ ���� �ܺ� Ŭ�����̹Ƿ� import �ʿ�
		 
		 ����.nextInt(); intŸ�� ����
		 ����.nextByte(); byteŸ�� ����
		 ����.nextShort(); shortŸ�� ����
		 ����.nextLong(); longŸ�� ����
		 ����.nextFloat(); floatŸ�� �Ǽ�
		 ����.nextDouble(); doubleŸ�� �Ǽ�
		 ����.next(); ���ڿ�
		 ����.nextLine(); ���ڿ�
		 
		 c���, �ڹ�, �����а��� ���� ���� �Է�
		 �� ������ ������ ��� ���� ���
		 		 
		 */
		float C, java, building;
		
		System.out.println("C��� ���� �Է�: ");
		C=scan.nextFloat();
		System.out.println("java ���� �Է�: ");
		java=scan.nextFloat();
		System.out.println("�����а��� ���� �Է�: ");
		building=scan.nextFloat();
		float totalScore=C+java+building;
		float averageScore=totalScore/3;
		System.out.printf("����: %.0f��, ���: %.1f��", totalScore, averageScore);
	}

}
