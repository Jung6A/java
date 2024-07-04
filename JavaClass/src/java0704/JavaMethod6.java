package java0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		//컴퓨터와 가위바위보
		//컴퓨터의 가위바위보 값은 comInput 메서드 사용
		//유저의 가위바위보는 한글로 입력
		//승, 무, 패 출력
		//유저 가위바위보 값 입력하고 저장하는 메서드, 컴퓨터와 비교하여 결과 출력하는 메서드
		//Game 클래스에 필요한 변수나 메서드 작성
		//main 메서드에서는 Game 클래스 객체로 메서드만 실행
		
		Game game=new Game();
		game.play();
	}

}
class Game{ //가위바위보 게임
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
			case 0: this.com="가위"; break;
			case 1: this.com="바위"; break;
			case 2: this.com="보"; break;
		}
	}
	
	void userInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("가위바위보 입력: ");
		this.user=sc.nextLine();
	}
	
	void result(){
		System.out.println("컴퓨터: "+com+"  나: "+user);
		if(com.equals(user)){
			System.out.println("무승부");
		}else if((user.equals("가위"))&&(com.equals("보"))||
				(user.equals("바위"))&&(com.equals("가위"))||
				(user.equals("보"))&&(com.equals("바위"))) {
			System.out.println("승리");
		}else{
			System.out.println("패배");
		}
		
	}
	
}