package service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import dao.CoffeeDAO;
import dao.TeaDAO;
import dto.Coffee;
import dto.Tea;

public class SelectDrink implements Kiosk {
	static Scanner scan=new Scanner(System.in);
	
	private HashMap<Integer, Coffee> coffee;
	private HashMap<Integer, Tea> tea;
	
	public SelectDrink() { //������ �޼���
		
	}
	
	@Override
	public void action() {
		
		while(true) {
			System.out.print("1. Ŀ��  2. ��: ");
			int category=scan.nextInt();
			
			switch(category) {
				case 0: System.out.println("������ ������\n");
					return;
				case 1: selectCoffee();
					break;
				case 2: selectTea();
					break;
				default:
					System.out.println("�ٽ� �Է��ϼ���\n");
			}
		} //while ��ȣ ����
	}
	//Ŀ�� ����
	private void selectCoffee() {
		CoffeeDAO dao=new CoffeeDAO();
		coffee=dao.findAll();
		
		Set<Integer> ids=coffee.keySet();
		for(Integer id:ids) {
			System.out.println(id+". "+coffee.get(id));
		}
		System.out.print("\n�޴� ����: ");
		int menu=scan.nextInt();
		
		if(!coffee.containsKey(menu)) {
			System.out.println("�ٽ� �Է��ϼ���\n");
			return;
		}
		
		Kiosk order=new Order(coffee.get(menu));
		order.action();
		
	}
	//�� ����
	private void selectTea() {
		TeaDAO dao=new TeaDAO();
		tea=dao.findAll();
		
		tea.forEach((k,v)->System.out.println(k+". "+v));
		System.out.print("\n�޴� ����: ");
		int menu=scan.nextInt();
		
		if(!tea.containsKey(menu)) {
			System.out.println("�ٽ� �Է��ϼ���\n");
			return;
		}
		
		Kiosk order=new Order(tea.get(menu));
		order.action();
		
	}
}
