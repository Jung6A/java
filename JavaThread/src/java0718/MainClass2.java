package java0718;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) throws InterruptedException {
		Th1 th=new Th1(); //�Ϲ� Ŭ���� ��ü ����
		new Thread(th).start(); //������ ��ü ����
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+". ��� ��� ���� ��");
			Thread.sleep(2000);
		}
	
	}
}

class Th1 implements Runnable{
	static Scanner sc=new Scanner(System.in);
	
	public void start() {}
	
	@Override
	public void run() {
		System.out.print("���� �Է�: ");
		int num=sc.nextInt();
		System.out.println("�Է� ����: "+num);
	}
	
}