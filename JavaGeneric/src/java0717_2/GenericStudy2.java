package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		
		book.add(new Book("B1401","�ڹٿ�������","�赿��"));
		book.add(new Book("B7189","��� ���� ����� ��","������"));
		book.add(new Book("B2885","��Űȣ��","�̰� �� �������׽�"));
		
		dvd.add(new DVD("D6162","����������","�� ����"));
		dvd.add(new DVD("D5511","�ٶ��� �д�","�̾���Ű �Ͼ߿�"));
		dvd.add(new DVD("D0938","�����ƾ���","�׷�Ÿ ����"));
		
		//�뿩
		Library lib=new Library();
		lib.addRental(book.get(0),"������");
		lib.addRental(dvd.get(2),"������");
		lib.showRentalList();
		
		
//		Rental<DVD> drent=new Rental<>(dvd.get(0),"������");
//		System.out.println(drent);
//		
//		Rental<Book> brent=new Rental<>(book.get(1),"������");
//		System.out.println(brent);
		
	}

}
