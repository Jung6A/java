package homeProduct;

public class Computer extends House {
	
	Computer() {
		super();
	}
	
	@Override
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("컴퓨터 전원: "+super.onOff);
	}
	Computer(String brand,int price) {
		super(brand,price);
	}
	
}
