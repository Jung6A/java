package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//배열에 20개의 랜덤 숫자 저장 (랜덤 범위 1~30)
		//배열에 저장된 데이터 중 5의 배수는 몇개인지 출력하기
		
		int[] number=new int[20];
		for(int i=0;i<number.length;i++){
			number[i]=(int)(Math.random()*30)+1;
		}
		
		System.out.println(Arrays.toString(number));
		
		int count=0;
		for(int i=0;i<number.length;i++){	
			if(number[i]%5==0){
				count++;
			}
		}
		
		System.out.println("5의 배수의 개수는 "+count+"개");
		
		//배열 생성 방법, 배열 데이터 저장 방법, 배열에 저장된 데이터 추출 또는 출력
		
		
		//빙고 게임 만들기
		//1. 25 크기의 배열 선언
		//2. 배열에 랜덤 숫자 저장
		//3. 중복 없이 저장
		//4. 25개 숫자 화면 출력
		//5. 게임 시작-숫자 선택(입략)
		//6. 선택한 숫자 위치에 표현
		//7. 몇 빙고인지 확인
		//8. 화면에 출력
		
		int[] bingo=new int[25];
		for(int i=0;i<bingo.length;i++){
			bingo[i]=(int)(Math.random()*50)+1;
			for(int k=0;k<i;k++){
				if(bingo[k]==bingo[i]){
					i--; break;
				}
			}
		}
		
		while(true) {
			//5줄 5칸 출력
			for(int i=0;i<bingo.length;i++){
				if(i%5==0){
					System.out.println();
				}
				if(bingo[i]==0){
					System.out.printf(" %2c ", '■');
				}
				else{
					System.out.printf(" %2d ",bingo[i]);
				}
			}
			
			//빙고 숫자 선택
			System.out.print("\n빙고 숫자 입력: ");
			int num=scan.nextInt();
			
			//선택한 숫자 표시
			for(int i=0;i<bingo.length;i++){
				if(num==bingo[i]){
					bingo[i]=0; break;
				}
			}
			
			//몇 줄 빙고인지
			int 가로=0, 세로=0, 사선1=0, 사선2=0, end=0;
			
			for(int i=0;i<5;i++){
				for(int k=0;k<5;k++){
					if(bingo[i*5+k]==0){
						가로++;
					}
					if(bingo[k*5+i]==0){
						세로++;
					}
				}
				if(bingo[i*6]==0) 사선1++;
				if(bingo[i*4+4]==0) 사선2++;
				
				if(사선1==5) end++;
				if(사선2==5) end++;
				if(가로==5) end++;
				if(세로==5)end++;
				
				가로=0; 세로=0;
			}
			if(end==5){ //5줄 빙고
				System.out.println("5줄 빙고 완성!");
				break; //무한루프 종료
			}
		}
		
	}

}