package java0717_3;

public class Clothing extends Product {
	String size; //������
	
	public Clothing(String id,String name,int price,String size) {
		super(id,name,price);
		this.size=size;
	}
	
	@Override
	public String toString() {
		return size+"������ "+super.toString();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
