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
		System.out.println(arr[2]+brr[1]);
		
		// int arr2=new int[]; 크기 지정 필수, 오류
		
		int size=15;
		int[] arr2=new int[size];
		System.out.println(arr2[0]);
		
		//배열 생성 방법: 데이터타입[]=new 데이터타입[크기];
		
		int[] money=new int[5]; //5개의 int타입 공간을 가진 배열 생성
		money[0]=5000;
		money[1]=12000;
		money[2]=4000;
		money[3]=43000;
		money[4]=50000;
		
		//10000 이상의 값 출력
		
		for(int i=0;i<money.length;i++){
			if(money[i]>=10000) {
				System.out.println(money[i]+"원");
			}
		}
		
		int[] Aclass=new int[3];
		Aclass[0]=89; Aclass[1]=78; Aclass[2]=93;
		int[] Bclass=new int[3];
		Bclass[0]=56; Bclass[1]=84; Bclass[2]=72;
		
		System.out.println("A반 성적: "+Arrays.toString(Aclass));
		System.out.println("B반 성적: "+Arrays.toString(Bclass));
		
		//A반과 B반의 성적 중 80점 이상만 출력
		
		for(int i=0;i<Aclass.length;i++){
			if(Aclass[i]>=80){
				System.out.println("A반 "+Aclass[i]);
			}
			if(Bclass[i]>=80){
				System.out.println("B반 "+Bclass[i]);
			}
		}
		
		int[] first=new int[Aclass.length+Bclass.length];
		//복사할 배열, 복사 시작 인덱스, 저장할 배열, 저장 위치 인덱스, 복사할 크기
		System.arraycopy(Aclass,0,first,0,Aclass.length);
		System.arraycopy(Bclass, 0, first, 3, Bclass.length);
		
//		for(int i=0;i<Bclass.length;i++){
//			first[i]=Aclass[i];
//			first[i+3]=Bclass[i];
//		}
		
		System.out.print("1학년 우수 성적: ");
		for(int i=0;i<first.length;i++){
			if(first[i]>=80){
				System.out.print(+first[i]+" ");
			}
		}
		
		Arrays.sort(first); //오름차순 정렬
		System.out.println(Arrays.toString(first));
		
		boolean same=Arrays.equals(Aclass,Bclass);
		System.out.println("A반 B반 성적이 같은가? "+same);
		
	}

}