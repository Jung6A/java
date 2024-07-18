package java0718_3;

public class Money {
	private int mymoney=10000;
	
	public int getMymoney() {
		return mymoney;
	}
	//withdraw 메서드를 임계영역으로 설정
	public synchronized boolean withdraw(int money) {
		if(mymoney>=money) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			mymoney-=money;
			return true;
		}
		return false;
	}
}
