package homeProduct;

public class TV extends House {
	
	int channel=10; //ä��
	int vol=5; //����

	TV(){ //������ �޼���
//		super(); //super: �θ� Ŭ���� ȣ��
	}
	//�Ű������� �ִ� ������ �޼���
	TV(String brand,int price){
		super(brand,price); //�θ� Ŭ���� ������ �޼��� ȣ��
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
