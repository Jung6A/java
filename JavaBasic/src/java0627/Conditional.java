package java0627;

import java.util.Scanner;

public class Conditional {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		//조건문: if, switch
		//반복문: for, while, do~while
		
		//if문의 조건식: 비교연산자와 논리연산자로 식을 만듦
		//            참과 거짓이 나올 수 있는 식
		//키가 150이상이다.  키>=150;
		//10월의 지출내역    전체지출날짜 월==10;
		//32000원 이상의 지출 내역   지출금>=32000;
		//판매 중인 상품만 출력  상품상태==판매;, 재고수량>0;
		
		int tall=135;
		if(tall>=150){
			//키가 150 이상이라면 무엇을 할 것인지
		} else{
			//키가 150 이상이 아니라면 무엇을 할지
		}
		
		//시험 합격 기준: 합격(60점 이상), 불합격(60점 미만)
		
		int score=72;
		if(score>=60){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		//if~else: 조건식이 참, 거짓에 따라 실행되는 내용이 다를 경우
		//하나의 조건에 두 개의 내용이 있는 경우 if~else 구조로 작성
		
		//시험 성적 등급 A>=90, B>=80, C>=70, D
		
		score=89;
		if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		
		//switch: 실행조건을 case로 설정하여 case와 값이 일치할 경우 발동되는 조건문
		//방향키 wasd, p 일시정지, o 계속하기 i는 처음부터 하기
		//ctrl+s가 게임 시작
		
		
		/*
		   switch(menu){
			case "open": 
			case "save": 
			case "build": 
			case "git": 
			case "exit": 
		}
		*/
		//조건식이 == 연산자 사용시 switch로 작성 고려
		
		//시작 버튼: 게임 시작 종료 버튼: 종료 저장 버튼: 저장
		
		String button="종료";
		
		switch(button){
			case "시작":
				System.out.println("게임 시작");
				break;
			case "자동저장":
			case "저장":
				System.out.println("게임 저장");
				break;
			case "종료":
				System.out.println("게임 종료");
				break;
		}

		//가로와 세로 길이를 키보드로 입력(단위 신경x)
		//가로와 세로의 길이가 다르면 직사각형, 가로와 세로의 길이가 같으면 정사각형이라고 출력
		//switch문으로 (if x)
		int width=0, height=0;
		System.out.println("가로의 길이: ");
		width=scan.nextInt();
		System.out.println("세로의 길이: ");
		height=scan.nextInt();
		int res=width-height;
		
		switch(res){ //조건문의 변수가 int 타입이라 case에 이외의 형식은 불가능
			case 0:
				System.out.println("정사각형");
				break;
			default:
				System.out.println("직사각형");
				break;
		}
		//switch문에서 default는 한 번만 사용. switch에 들어온 값이 모든 case와 일치하지 않다면 default가 실행
	}

}