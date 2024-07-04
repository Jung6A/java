package java0704;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		Dicegame game=new Dicegame();
		
		game.init(); //�ֻ��� ���� �ʱ� ����: ���� �ο� �� �̸�
		game.diceThrow(); //������ ���� �°� �ֻ��� ������
		game.result(); //��� �����ڵ��� �ֻ��� �� ��
		
	}

}

class Dicegame{
	String[] names;
	int[] diceNum;
	
	void init(){
		Scanner sc=new Scanner(System.in);
		System.out.print("�ֻ��� ���� ���� �ο�: ");
		int cnt=sc.nextInt();
		sc.nextLine(); //���� ����
		this.names=new String[cnt];
		this.diceNum=new int[cnt];
		for(int i=0;i<names.length;i++){
			System.out.print("������ �̸�: ");
			names[i]=sc.nextLine();
		}
	}
	
	void diceThrow(){ //�ֻ��� ������
		for(int i=0;i<names.length;i++){
			this.diceNum[i]=(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+" �ֻ���: "+this.diceNum[i]);
		}
	}
	
	void result(){ //�ֻ��� ���: ���� ũ�� �̱�
		//���� ū �ֻ����� ã��
		int max=0;
		for(int num:diceNum){
			if(max<num) max=num;
		}
		//��� �����ڵ��� �ֻ��� ���� ���ٸ�
		boolean isSame=true;
		for(int num:diceNum){
			if(num!=max) isSame=false;
		}
		if(isSame){
			System.out.println("��� ������ ���º�");
			return;
		}
		
		//���� ū �ֻ����� ���� ���(��)�� �¸� 
		for(int i=0;i<diceNum.length;i++){
			if(diceNum[i]==max){
				System.out.println(names[i]+" �¸�");
			}
		}
	}
}


//package java0704;
//
//public class Dice {
//
//	public static void main(String[] args) {
//		
//		Dicegame game=new Dicegame();
//		int ����=game.getDice("����");
//		int ����=game.getDice("����");
//		game.result(����, ����);
//
//	}
//
//}
//
//
//class Dicegame{
//	
//	int getDice(String name){
//		int num=(int)(Math.random()*6)+1;
//		System.out.println(name+" �ֻ���: "+num);
//		return num;
//	}
//	
//	void result(int num1, int num2){
//		if(num1>num2){
//			System.out.println("���� ��, ���� ��");
//		}else if(num1<num2){
//			System.out.println("���� ��, ���� ��");
//		}else{
//			System.out.println("���º�");
//		}
//	}
//	
//}