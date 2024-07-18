package java0718;

import java.util.Scanner;

public class MainClass1 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		MyThread th=new MyThread(); //������ ��ü ����
		th.start(); //������ ����
		
		for(int i=1;i<=10;i++) {
			System.out.println("   ���� "+i+"��° ����");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.print("���� �Է�: ");
//		int num=sc.nextInt();
//		System.out.println(num);
		
	}

}

class MyThread extends Thread {
	//Thread Ŭ������ ����� Ŭ���� ����
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("�� "+i+"��° �������");
			try {
				Thread.sleep(1000); //����ó�� �ʿ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

/*
 ���μ���: CPU�� ���� �޸�(ram)�� �ε�Ǿ��ִ� ���α׷��� ����
 		 ���� ���� ���α׷�=���μ���
 		 102���� ���μ����� �ִ�=102���� ���α׷��� ���� ��
 		 
 	�� ��ǻ�Ϳ� ���� ���� ���μ��� Ȯ���ϴ� ���
 		1. �۾� ������ ����- ���μ��� �� Ȯ��
 		2. ��� ������Ʈ���� tasklist �˻�
 
 ������: ���μ��� �ȿ��� ���� ������ �����ϴ� ����
 	   ������ �߰��� ���ÿ� ���� ���� ���� ����
 	   
 	�ڹ� ������
 	������ ������ �޼���
 	Thread(): ���ο� ������ ��ü �Ҵ�
 	Thread("�̸�"): ���ο� ������ ��ü �Ҵ�� ���ÿ� �̸� �ο�
*/