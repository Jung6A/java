package java0717_2;

public class Rental<T extends Media> {
	private T item;
	private String renter;
	
	public Rental(T item,String renter) {
		this.item=item;
		this.renter=renter;
	}
	public T getItme() {
		return this.item;
	}
	public String getRenter() {
		return this.renter;
	}
	
	@Override
	public String toString() {
		return "´ë¿©ÀÚ: "+renter+"\n"+item.toString();
	}
	
}
