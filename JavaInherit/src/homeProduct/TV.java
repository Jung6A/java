package homeProduct;

public class TV extends House {
	
	private int channel=10; //ä��
	private int vol=5; //����
	

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
	
	protected TV(){ //������ �޼���
		super(); //super: �θ� Ŭ���� ȣ��
	}
	//�Ű������� �ִ� ������ �޼���
	public TV(String brand,int price) {
		super(brand,price); //�θ� Ŭ���� ������ �޼��� ȣ��
		//super.brand=brand;
	}
	@Override //��ǻ�Ϳ��� �����ϱ� ���� �ּ�(�������̼�)
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("TV ����: "+super.onOff);
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
