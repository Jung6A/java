package java0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		//��ǻ�Ϳ� ����������
		//��ǻ���� ���������� ���� comInput �޼��� ���
		//������ ������������ �ѱ۷� �Է�
		//��, ��, �� ���
		//���� ���������� �� �Է��ϰ� �����ϴ� �޼���, ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		//Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		//main �޼��忡���� Game Ŭ���� ��ü�� �޼��常 ����
		
		Game game=new Game();
		game.play();
	}

}
class Game{ //���������� ����
	String com;
	String user;
	
	void play(){
		comInput();
		userInput();
		result();
	}
	
	void comInput(){
		int temp=(int)(Math.random()*3);
		switch(temp) {
			case 0: this.com="����"; break;
			case 1: this.com="����"; break;
			case 2: this.com="��"; break;
		}
	}
	
	void userInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("���������� �Է�: ");
		this.user=sc.nextLine();
	}
	
	void result(){
		System.out.println("��ǻ��: "+com+"  ��: "+user);
		if(com.equals(user)){
			System.out.println("���º�");
		}else if((user.equals("����"))&&(com.equals("��"))||
				(user.equals("����"))&&(com.equals("����"))||
				(user.equals("��"))&&(com.equals("����"))) {
			System.out.println("�¸�");
		}else{
			System.out.println("�й�");
		}
		
	}
	
}