package java0717_3;

public class CartItem <T extends Product> {
	T product;
	int quantity; //수량
	
	public CartItem(T product, int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	
	public T getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	@Override
	public String toString() {
		return product+"\n수량: "+quantity;
	}
	
}
