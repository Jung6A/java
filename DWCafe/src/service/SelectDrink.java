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
	
	public SelectDrink() { //생성자 메서드
		
	}
	
	@Override
	public void action() {
		
		while(true) {
			System.out.print("1. 커피  2. 차: ");
			int category=scan.nextInt();
			
			switch(category) {
				case 0: System.out.println("다음에 만나요\n");
					return;
				case 1: selectCoffee();
					break;
				case 2: selectTea();
					break;
				default:
					System.out.println("다시 입력하세요\n");
			}
		} //while 괄호 종료
	}
	//커피 선택
	private void selectCoffee() {
		CoffeeDAO dao=new CoffeeDAO();
		coffee=dao.findAll();
		
		Set<Integer> ids=coffee.keySet();
		for(Integer id:ids) {
			System.out.println(id+". "+coffee.get(id));
		}
		System.out.print("\n메뉴 선택: ");
		int menu=scan.nextInt();
		
		if(!coffee.containsKey(menu)) {
			System.out.println("다시 입력하세요\n");
			return;
		}
		
		Kiosk order=new Order(coffee.get(menu));
		order.action();
		
	}
	//차 선택
	private void selectTea() {
		TeaDAO dao=new TeaDAO();
		tea=dao.findAll();
		
		tea.forEach((k,v)->System.out.println(k+". "+v));
		System.out.print("\n메뉴 선택: ");
		int menu=scan.nextInt();
		
		if(!tea.containsKey(menu)) {
			System.out.println("다시 입력하세요\n");
			return;
		}
		
		Kiosk order=new Order(tea.get(menu));
		order.action();
		
	}
}
