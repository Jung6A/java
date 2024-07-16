package dto;

public class Tea {
	private String itemName;
	private int price;
	
	public Tea(String itemName,int price) {
		this.price=price;
		this.itemName=itemName;
	}
	
	@Override
	public String toString() {
		return itemName+"("+price+"¿ø)";
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
