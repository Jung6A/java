package control;

import service.Kiosk;
import service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		System.out.println("─── DW 카페 주문 키오스크 ───\n");
		System.out.println("─── 화면을 터치하지 마세요 ───\n");
		Kiosk kiosk=new SelectDrink();
		
		kiosk.action();
		
	}

}
