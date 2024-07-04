package java0704;

public class Dice {

	public static void main(String[] args) {
		
		Dicegame game=new Dicegame();
		int 석완=game.getDice("석완");
		int 형준=game.getDice("형준");
		game.result(석완, 형준);

	}

}

class Dicegame{
	
	int getDice(String name){
		int num=(int)(Math.random()*6)+1;
		System.out.println(name+" 주사위: "+num);
		return num;
	}
	
	void result(int num1, int num2){
		if(num1>num2){
			System.out.println("석완 승, 형준 패");
		}else if(num1<num2){
			System.out.println("형준 승, 석완 패");
		}else{
			System.out.println("무승부");
		}
	}
	
}