package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		
		book.add(new Book("B1401","자바완전정복","김동형"));
		book.add(new Book("B7189","살다 보면 생기는 일","최정강"));
		book.add(new Book("B2885","돈키호테","미겔 데 세르반테스"));
		
		dvd.add(new DVD("D6162","벅스라이프","존 라세터"));
		dvd.add(new DVD("D5511","바람이 분다","미야자키 하야오"));
		dvd.add(new DVD("D0938","작은아씨들","그레타 거윅"));
		
		//대여
		Library lib=new Library();
		lib.addRental(book.get(0),"김유신");
		lib.addRental(dvd.get(2),"김춘추");
		lib.showRentalList();
		
		
//		Rental<DVD> drent=new Rental<>(dvd.get(0),"김유신");
//		System.out.println(drent);
//		
//		Rental<Book> brent=new Rental<>(book.get(1),"김춘추");
//		System.out.println(brent);
		
	}

}
