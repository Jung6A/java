package dto;

public class Coffee {
	private String itemName;
	private int price;
	private boolean deCaffein;
	
	public Coffee(String itemName,int price,boolean deCaffein) {
		this.itemName=itemName;
		this.price=price;
		this.deCaffein=deCaffein;
	}
	
	@Override
	public String toString() {
		return itemName+"("+price+"원)"+(deCaffein?" 디카페인":"");
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
	public boolean isDeCaffein() {
		return deCaffein;
	}
	public void setDeCaffein(boolean deCaffein) {
		this.deCaffein = deCaffein;
	}
}
