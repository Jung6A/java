package homeProduct;

public class Computer extends House {
	
	Computer() {
		super();
	}
	
	@Override
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("��ǻ�� ����: "+super.onOff);
	}
	Computer(String brand,int price) {
		super(brand,price);
	}
	
}
