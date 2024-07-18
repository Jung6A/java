package java0718_2;

public class MainClass {

	public static void main(String[] args) {
		
		Web th1=new Web("첫째");
		Web th2=new Web("  둘째");
		Web th3=new Web("    셋째");
		Web th4=new Web("       넷째");
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.MAX_PRIORITY);
		
		//종료 순서는 MAX-NORM-MIN
		//우선순위는 말 그대로 우선순위를 줄 뿐 처리 속도에 따라 다른 결과로 나타낼 때도 있음
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}

}
