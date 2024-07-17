package java0717_3;

public class Electronics extends Product {
	String brand; //ºê·£µå
	
	public Electronics(String id,String name,int price,String brand) {
		super(id,name,price);
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		return brand+" "+super.toString();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
