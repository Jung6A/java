package java0701;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		//많은 양의 데이터를 다룰 때는 배열 사용
		//상황에 따라서는 배열을 쓰면 안 되는 경우도 있지만 보통은 배열의 구조에 데이터 저장
		
		//동적 배열 만들기
		//기존 배열 크기를 늘리거나 줄여서 사용하는 배열
		
//		int[] a=new int[5];
//		a[0]=10; a[1]=20; a[4]=40;
//		System.out.println(Arrays.toString(a));
//		a=new int[7];
//		a[5]=100;
//		System.out.println(Arrays.toString(a));
		
//		int[] num=new int[] {10,20,30,40,50};
//		System.out.println("크기 증가 전: "+Arrays.toString(num));
//		
//		//num[5]=60; 인덱스 범위 벗어나 오류
//		//데이터를 추가로 저장하려면 배열의 크기를 늘려야 함
//		int size=num.length; //기존 배열의 크기
//		
//		int[] temp=new int[size+1];
//		for(int i=0;i<size;i++){
//			temp[i]=num[i];
//		}
//		
//		num=temp;
//		num[5]=60;
//		System.out.println("크기 증가 후: "+Arrays.toString(num));
		
		//문자열에서 같다 비교는 .equals()
		//문자열에 특정 문자나 문자열 포함 여부 확인은 .contains()
		//다음 주소중 선화동 주소만 추출하여 배열에 저장
		//배열에 잘 저장되었는지 확인 출력은 Arrays를 이용해 출력
		
		String[] addr=new String[] {
				"대전 중구 선화동 25", "대전 중구 선화동 92", "대전 서구 둔산동 111", "대전 서구 둔산동 1023", "대전 유성구 노은동 93",
				"대전 중구 대흥동 932", "대전 동구 가양동 945", "대전 중구 선화동 1234", "대전 중구 대흥동 23", "대전 중구 선화동 984"
		};
		int seon=0;
		for(int i=0;i<addr.length;i++){
			if(addr[i].contains("선화동")){
				seon++;
			}
		}
		
		String[] temp=new String[seon];
		
		int k=0;
		for(int i=0;i<addr.length;i++){
			if(addr[i].contains("선화동")){
				temp[k]=addr[i];
				k++;
			}
		}
		addr=temp;
		
		System.out.println(Arrays.toString(addr));

	}

}
