package java0719;

import java.lang.Thread.State;

public class ThreadState {
	
	private static Thread thread;
	private static Thread stateThread;

	public static void main(String[] args) {
		
		stateThread=new Thread(() -> { //익명 클래스 개체 생성
			while(true) {
				State state=thread.getState();
				System.out.println(thread.getName()+"- 스레드... 상태: "+state);
				if(state==State.NEW) {
					System.out.println("스레드 실행 준비 단계");
					thread.start();
				}
				if(state==State.WAITING) {
					System.out.println("스레드 대기 단계");
					thread.interrupt();
				}
				if(state==State.TERMINATED) {
					System.out.println(thread.getName()+"- 스레드... 상태: "+state);
					break; //terminated 상태라면 스레드 종료 상태. 루프 종료
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread=new My("스레드 1번",stateThread);
		stateThread.start();
		
	}

}
