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
		
		//�ֹ� Ȯ�� �� ���� ����
		System.out.println("\n�ֹ� �޴� Ȯ��");
		System.out.println(orderCoffee!=null ? orderCoffee:orderTea);
		System.out.println("\n������ ���� ������\n");
		System.out.println("1. ����  2. �ݱ�: ");
		if(scan.nextInt()==2) {
			System.out.println("���� ���");
			System.out.println("������ ������\n");
			return;
			}
		Kiosk payment=new Payment(orderCoffee!=null ? orderCoffee:orderTea);
		payment.action();
	}

}
