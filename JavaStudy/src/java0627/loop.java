package java0627;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		//반복문: for, while, do~while
		//for(초기값;조건식;증감식){반복 내용}
		//조건식이 거짓이 될 때까지 {}의 내용이 계속 실행됨
		//초기값 → 조건식 비교 → true → {}실행 → 증감식 → 조건식 비교 → … → false → 종료
		
		for(int i=1;i<=3;i++){
			System.out.println(i+"회차");
		}
		
		//배열 반복 for문이 적합
		//for(int i=배열.length;i>=0;i--){반복내용} 인가?
	
		for(int i=1;i<=17;i++){
			System.out.println("아… 반복문… "+i);
			i++;
		}
		
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
		
		int num=1;
		for(int a=1;a<4;a++){
			num+=a;
			System.out.println(num);
		}
		
		//1부터 입력한 숫자까지의 총합
		Scanner scan=new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int sum=0;
		num=scan.nextInt();
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("1부터 "+num+"까지의 정수의 합: "+sum);
	}

}
