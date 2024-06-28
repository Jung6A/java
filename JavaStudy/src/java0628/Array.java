package java0628;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//배열: 같은 데이터타입 데이터가 저장되는 공간이 연속적으로 되어있는 구조
		//배열을 만들 때 지정된 타입의 데이터만 저장 가능
		
		int[] a={10,20,30}; //java의 배열은 중괄호
		System.out.println(a[0]+" "+a[1]);
		
		int b[]= {30,40,50};
		//배열에 추가, 제거 등 변경 불가
		System.out.println(Arrays.toString(b)); //데이터 확인용
		
		int[] arr=new int[10];
		// 배열 공간 10개 생성
		int[] brr=new int[] {10,20,30,40};
		
		// int arr2=new int[]; 크기 지정 필수, 오류
		
		int size=15;
		int[] arr2=new int[size];
		System.out.println(Arrays.toString(arr2));
		
		//배열 생성 방법: 데이터타입[]=new 데이터타입[크기];
		
		int[] money=new int[5]; //5개의 int타입 공간을 가진 배열 생성
		money[0]=5000;
		money[1]=12000;
		money[2]=4000;
		money[3]=43000;
		money[4]=50000;
		
		for(int i=0;i<money.length;i++){
			System.out.println(money[i]+"원");
		}
		
	}

}
