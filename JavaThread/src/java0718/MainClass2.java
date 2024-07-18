package java0718;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) throws InterruptedException {
		Th1 th=new Th1(); //일반 클래스 객체 생성
		new Thread(th).start(); //스레드 객체 생성
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+". 비야 비야 오지 마");
			Thread.sleep(2000);
		}
	
	}
}

class Th1 implements Runnable{
	static Scanner sc=new Scanner(System.in);
	
	public void start() {}
	
	@Override
	public void run() {
		System.out.print("숫자 입력: ");
		int num=sc.nextInt();
		System.out.println("입력 숫자: "+num);
	}
	
}