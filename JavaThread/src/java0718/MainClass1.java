package java0718;

import java.util.Scanner;

public class MainClass1 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		MyThread th=new MyThread(); //스레드 객체 생성
		th.start(); //스레드 실행
		
		for(int i=1;i<=10;i++) {
			System.out.println("   나는 "+i+"번째 메인");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.print("숫자 입력: ");
//		int num=sc.nextInt();
//		System.out.println(num);
		
	}

}

class MyThread extends Thread {
	//Thread 클래스를 상속한 클래스 생성
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("나 "+i+"번째 스레드야");
			try {
				Thread.sleep(1000); //예외처리 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

/*
 프로세스: CPU에 의해 메모리(ram)에 로드되어있는 프로그램을 말함
 		 실행 중인 프로그램=프로세스
 		 102개의 프로세스가 있다=102개의 프로그램이 실행 중
 		 
 	내 컴퓨터에 실행 중인 프로세스 확인하는 방법
 		1. 작업 관리자 실행- 프로세스 탭 확인
 		2. 명령 프롬프트에서 tasklist 검색
 
 스레드: 프로세스 안에서 실제 동작을 수행하는 단위
 	   스레드 추가시 동시에 여려 동작 수행 가능
 	   
 	자바 스레드
 	스레드 생성자 메서드
 	Thread(): 새로운 스레드 객체 할당
 	Thread("이름"): 새로운 스레드 객체 할당과 동시에 이름 부여
*/