package java0718_2;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh nm=new NormalTh("�Ϲ�");
		nm.start();
		
//		DaemonTh dm=new DaemonTh();
//		dm.setDaemon(true);
//		
//		dm.start();
		
		Thread.sleep(6000);
		
		System.out.println("main ����");
		
	}

}
