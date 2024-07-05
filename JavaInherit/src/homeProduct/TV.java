package homeProduct;

public class TV extends House {
	
	private int channel=10; //채널
	private int vol=5; //볼륨
	

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	protected TV(){ //생성자 메서드
		super(); //super: 부모 클래스 호출
	}
	//매개변수가 있는 생성자 메서드
	public TV(String brand,int price) {
		super(brand,price); //부모 클래스 생성자 메서드 호출
		//super.brand=brand;
	}
	@Override //컴퓨터에게 설명하기 위한 주석(에너테이션)
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("TV 전원: "+super.onOff);
	}
	
//	void channelUP() {
//		this.channel++;
//	}
//	
//	void channelDOWN() {
//		this.channel--;
//	}
//	
//	void volUP() {
//		this.vol++;
//	}
//	
//	void volDOWN() {
//		this.vol--;
//	}
}
