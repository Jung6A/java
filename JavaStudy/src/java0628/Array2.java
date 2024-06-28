package java0628;

import java.util.Scanner;

public class Array2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//과자 배열에 좋아하는 과자의 판매가격 입력하여 저장
		//과자 배열에 저장된 판매가격 총합과 평균 산출
		int[] snack=new int[5];
		for(int i=0;i<snack.length;i++) {
			System.out.println("과자 가격: ");
			snack[i]=scan.nextInt();
		}
		int sum=0, avg=0;
		for(int k=0;k<snack.length;k++) {
			sum=sum+snack[k];
		}
		avg=sum/(snack.length);
		System.out.println("과자 가격의 합: "+sum+"원\n과자 가격 평균: "+avg+"원");
	}

}
