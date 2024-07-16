package service;

import dto.Coffee;
import dto.Tea;

public class Payment implements Kiosk {
	
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Payment(Object drink) {
		if(drink instanceof Coffee)
			this.orderCoffee=(Coffee)drink;
		if(drink instanceof Tea)
			this.orderTea=(Tea)drink;
	}
	
	@Override
	public void action() {
		System.out.println("\n결제 진행합니다.");
		int price=orderCoffee!=null ? orderCoffee.getPrice():orderTea.getPrice();
		System.out.println("결제 금액: "+price+"원\n");
	}

}
