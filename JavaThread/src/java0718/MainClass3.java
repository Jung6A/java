package java0718;

public class MainClass3 {

	public static void main(String[] args) {
		
		MeThread th1=new MeThread(2000,"이천");
		MeThread th2=new MeThread(3000,"삼천");
		
		//순차적 스레드 실행
		//main 클래스에서 실행하지만 main 클래스에서 제어 불가 
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		
		
	}

}
/*
  sleep(밀리세컨드): 지정된 시간만큼 대기
  start(): 스레드 시작, run 메서드 호출
  join(): 해당 스레드가 끝날 때까지 다음 스레드 대기
  run(): 스레드가 실행하는 함수
  stop(): 스레드 중단 (사용을 권장하지 않음)
  interrupt(): 스레드 중단
  serPriority(정수값): 스레드 우선순위 설정 (작은 숫자가 우선)
  getPriority(): 설정된 스레드 우선순위 확인
  isAlice(): 현재 스레드가 살아있다면 true, 종료되었을 경우 false
  
  suspend(): 스레드 일시정지, 대기 상태 (사용을 권장하지 않음)
  resume(): 일시정지된 스레드 실행 (사용을 권장하지 않음)
  
  yield(): 다른 스레드에 실행 상태 양보 후 대기(일시정지)
  notify(): 대기 상태에 있는 스레드를 실행 대기로 변환. 실행 대기에 있는 스레드는 실행 상태로 변환
 */