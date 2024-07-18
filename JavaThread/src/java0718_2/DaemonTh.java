package java0718_2;

public class DaemonTh extends Thread {
	
	@Override
	public void run() {
		System.out.println("데몬 스레드 실행");
		while(true) {
			System.out.println("자동 저장");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


/*
 데몬 스레드
 	주 스레드를 보조하는 스레드
 	주 스레드가 종료되면 데몬 스레드도 종료됨
 	
 주 스레드는 직접 제어해야 하지만
 데몬 스레드는 주 스레드의 영향을 받아 별도의 제어가 필요 없음
 
 */