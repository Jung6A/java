package homeProduct;

public class Aircon extends House {
	
	static final String[] windText={"미풍","약풍","강풍"}; //final: 변수를 변경하지 않겠다는 선언. js에서의 const
	
	int wind=0;
	int temperature;
	
	Aircon() {
		super();
	}
	@Override
	protected void power() {
		super.onOff=!super.onOff;
		System.out.println("에어컨 전원: "+super.onOff);
	}
	
	Aircon(String brand,int price) {
		super(brand,price);
	}
	
	void windControl() {
		wind++;
		if(wind==windText.length){
			wind=0;
		}
		System.out.println("현재 바람 세기: "+windText[wind]);
	}
	
	void tempUP() {
		temperature++;
	}
	
	void tempDOWN() {
		temperature--;
	}
}
