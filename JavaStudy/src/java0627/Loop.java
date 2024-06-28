package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		//반복문: for, while, do~while
		//for(초기값;조건식;증감식){반복 내용}
		//조건식이 거짓이 될 때까지 {}의 내용이 계속 실행됨
		//초기값 → 조건식 비교 → true → {}실행 → 증감식 → 조건식 비교 → … → false → 종료
		
//		for(int i=1;i<=3;i++){
//			System.out.println(i+"회차");
//		}
//		
//		//배열 반복 for문이 적합
//		//for(int i=배열.length;i>=0;i--){반복내용} 인가?
//	
//		for(int i=1;i<=17;i++){
//			System.out.println("아… 반복문… "+i);
//			i++;
//		}
		
//		for(int i=10;i>0;i--){
//			System.out.println(i);
//		}
		
//		int num=1, a=1;
//		num=num+a;
//		System.out.println(num); //2
//		a++;
//		num=num+a;
//		System.out.println(num); //4
//		a++;
//		num=num+a;
//		System.out.println(num); //7
//		a++;
		
//		int num=1;
//		for(int a=1;a<4;a++){
//			num+=a;
//			System.out.println(num);
//		}
//		
//		//1부터 입력한 숫자까지의 총합
//		
//		
//		System.out.print("숫자 입력: ");
//		int sum=0;
//		num=scan.nextInt();
//		for(int i=1;i<=num;i++){
//			sum+=i;
//		}
//		System.out.println("1부터 "+num+"까지의 정수의 합: "+sum);
//		
//		//반복문을 작성하려면 몇 번 반복되는지, 언제 종료되어야 하는지 반복문의 종료시점에 대해 생각해둬야 함
//		//for, while, do~while문 모두 언제 반복이 끝나야 하는지를 찾지 못하면 작성할 수 없음 (무한 루프, 지정 횟수 반복이든)
//		
//		for(;true;){
//			System.out.print("정수 입력: ");
//			int n=scan.nextInt();
//			if(n==0) break;
//		}
		
//		int n=1;
//		for(;n!=0;){
//			System.out.print("정수 입력: ");
//			n=scan.nextInt();
//		}
//		
//		for(;true;){
//			System.out.print("정수 입력: ");
//			n=scan.nextInt();
//			if(n==0) return;
		
		//무한 루프 종료 방법
		//1. if문의 조건식이 참이 되면 break 실행
		//2. for(;조건식;)
		//3. return; 반복문 코드가 있는 메서드를 종료시켜 반복문도 종료됨
			//break;: 반복문, switch에 사용 가능, if문 단독으로는 break 불가
			
		//continue;: 반복문 종료 전 다음 반복문으로 이동시킴
		
//		for(int i=1;i<=10;i++){
//			System.out.println(i+"번째 반복 시작");
//			if(i%3==0)
//				continue;
//			System.out.println(i+"번째 반복 진행 중");
//			System.out.println(i+"번째 반복 마지막 내용");
//		}
		
		//자바의 랜덤값 출력
//		int random=(int)Math.floor(Math.random()*10)+1; //강제형변환
		//랜덤 값 계속 출력 랜덤값이 11의 배수일 경우 반복문 종료
		
		for(;true;){
			int random=(int)(Math.random()*55)+1;
			System.out.println("랜덤 값은 "+random);
			if(random%11==0) break;
		}
		
		//up&down: 컴퓨터가 제시한 숫자 맞히기
		//컴퓨터 제시 숫자는 랜덤으로 (랜덤범위 20~100)
		//컴퓨터가 제시한 숫자가 74일 경우 내가 입력한 숫자가 40일 경우 up, 80일 경우 down
		
//		int ran=(int)(Math.random()*81)+20;
//		for(;true;){
//			System.out.print("숫자는? ");
//			int user=scan.nextInt();
//			if(user>100|user<20){
//				System.out.println("숫자의 범위는 20~100입니다.");
//			}else if(user==ran){
//				System.out.println("정답입니다.");
//				break;
//			}else if(user>ran){
//				System.out.println("DOWN");
//			}else{
//				System.out.println("UP");
//			}
//		}
		
		//이름이 있는 반복문
		
		int sum=0;
		
		더하기: //for문의 이름
		for(int i=1;i<=10;i++){
			System.out.println(i);
			for(int k=1;k<=4;k++){
				if(sum+k>=40) break 더하기; //더하기라는 이름의 for문 break;
				sum=sum+k;
				System.out.println("   "+k);
			}
			sum=sum+i;
		}
		if(sum<40){
			System.out.println("sum 출력: "+sum);
		}
		
		//배스킨라빈스31
		//컴퓨터와 나와 둘이 한번에 제시할 수 있는 숫자는 최소 1개, 최대 3개
		//31을 입력하면 패배
		
		int num=1;
		
		baskin:
		for(;;){ //while(true)
			System.out.print("숫자 몇 개?: ");
			int user=scan.nextInt();
			System.out.print("나: ");
			for(int u=1;u<=user;u++){
				System.out.print(num+" ");
				if(num==31) break baskin;
				num++;
			}
			System.out.println();
			
			int com=(int)(Math.random()*3)+1;
			System.out.print("com: ");
			for(int c=1;c<=com;c++){
				System.out.print(num+" ");
				if(num==31) break baskin;
				num++;
			}
			System.out.println();
		}
			
	
	}

}
