package homeProduct;

public class TV extends House {
	
	int channel=10; //채널
	int vol=5; //볼륨

	TV(){ //생성자 메서드
//		super(); //super: 부모 클래스 호출
	}
	//매개변수가 있는 생성자 메서드
	TV(String brand,int price){
		super(brand,price); //부모 클래스 생성자 메서드 호출
		//super.brand=brand;
	}
	
	void channelUp(){
		this.channel++;
	}
	
	void channelDown(){
		this.channel--;
	}
	
	void volUp(){
		this.vol++;
	}
	
	void volDown(){
		this.vol--;
	}
}
