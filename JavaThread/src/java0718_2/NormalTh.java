package java0718_2;

import java.util.Scanner;

public class NormalTh extends Thread {
	private String name;
	Scanner sc=new Scanner(System.in);
	
	public NormalTh(String name) {
		super(name);
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("�������: "+name);
		DaemonTh th=new DaemonTh();
		th.setDaemon(true);
		th.start();
		
		for(int i=1;i<=3;i++) {
			System.out.println("�ƹ��ų� �Է�: ");
			String word=sc.nextLine();
			System.out.println(word);
		}
	}
	
}
