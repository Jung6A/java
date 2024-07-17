package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Rental<?>> list=new ArrayList<>();
	
	public <T extends Media> void addRental(T item, String renter) { //�޼��忡�� ����Ǵ� ���ʸ�
		Rental<T> rental=new Rental<>(item, renter);
		list.add(rental);
		System.out.println("�뿩��\n"+rental);
	}
	
	public void showRentalList() {
		System.out.println("�뿩 ����Ʈ");
		for(Rental<? extends Media> r:list) {
			System.out.println(r);
		}
	}
	
}
