package control;

import service.Kiosk;
import service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		System.out.println("������ DW ī�� �ֹ� Ű����ũ ������\n");
		System.out.println("������ ȭ���� ��ġ���� ������ ������\n");
		Kiosk kiosk=new SelectDrink();
		
		kiosk.action();
		
	}

}