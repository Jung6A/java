package java0704;

public class Dice {

	public static void main(String[] args) {
		
		Dicegame game=new Dicegame();
		int ����=game.getDice("����");
		int ����=game.getDice("����");
		game.result(����, ����);

	}

}

class Dicegame{
	
	int getDice(String name){
		int num=(int)(Math.random()*6)+1;
		System.out.println(name+" �ֻ���: "+num);
		return num;
	}
	
	void result(int num1, int num2){
		if(num1>num2){
			System.out.println("���� ��, ���� ��");
		}else if(num1<num2){
			System.out.println("���� ��, ���� ��");
		}else{
			System.out.println("���º�");
		}
	}
	
}