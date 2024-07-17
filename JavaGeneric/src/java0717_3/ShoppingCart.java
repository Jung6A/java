package java0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<CartItem<? extends Product>> list=new ArrayList<>();
	
	public <T extends Product> void addCart(T product, int quantity) {
		CartItem<T> buy=new CartItem<>(product, quantity);
		list.add(buy);
		System.out.println(buy);
		System.out.println("��ٱ��� ��� �Ϸ�");
		System.out.println();
	}
	
	public void showCart() {
		System.out.println("��������ٱ��� ��Ϧ�����");
		System.out.println();
		for(CartItem<? extends Product> cart:list) {
			System.out.println(cart);
		}
	}
	
}
