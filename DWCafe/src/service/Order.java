package service;

import java.util.Scanner;

import dto.Coffee;
import dto.Tea;

public class Order implements Kiosk {
	
	static Scanner scan=new Scanner(System.in);
	
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Order(Coffee orderCoffee) {
		this.orderCoffee=orderCoffee;
	}
	public Order(Tea orderTea) {
		this.orderTea=orderTea;
	}
	
	@Override
	public void action() {
		
		//주문 확인 및 결제 진행
		System.out.println("\n주문 메뉴 확인");
		System.out.println(orderCoffee!=null ? orderCoffee:orderTea);
		System.out.println("\n─── 결제 ───\n");
		System.out.println("1. 결제  2. 닫기: ");
		if(scan.nextInt()==2) {
			System.out.println("결제 취소");
			System.out.println("다음에 만나요\n");
			return;
			}
		Kiosk payment=new Payment(orderCoffee!=null ? orderCoffee:orderTea);
		payment.action();
	}

}
