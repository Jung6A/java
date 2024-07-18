package java0718_3;

public class BankTh extends Thread {
	Money my=new Money();
	
	@Override
	public void run() {
		while(my.getMymoney()>0) {
			//출금 금액
			int money=((int)(Math.random()*3)+1)*1000;
			
			if(my.withdraw(money)) {
				System.out.println(Thread.currentThread().getName()+" → 출금: "+money+"원, 잔액: "+my.getMymoney());
			}else { //잔액 부족-출금 실패
				System.out.println("출금 거부- 잔액 부족");
			}
		}
	}
	
}
