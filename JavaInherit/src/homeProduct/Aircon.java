package homeProduct;

public class Aircon extends House {
	
	static final String[] windText={"��ǳ","��ǳ","��ǳ"}; //final: ������ �������� �ʰڴٴ� ����. js������ const
	
	int wind=0;
	int temperature;
	
	Aircon() {
		super();
	}
	@Override
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("������ ����: "+super.onOff);
	}
	
	Aircon(String brand,int price) {
		super(brand,price);
	}
	
	void windControl() {
		wind++;
		if(wind==windText.length){
			wind=0;
		}
		System.out.println("���� �ٶ� ����: "+windText[wind]);
	}
	
	void tempUP() {
		temperature++;
	}
	
	void tempDOWN() {
		temperature--;
	}
}
