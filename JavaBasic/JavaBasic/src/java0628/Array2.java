package java0628;

import java.util.Scanner;

public class Array2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		//과자 배열에 좋아하는 과자의 판매가격 입력하여 저장
//		//과자 배열에 저장된 판매가격 총합과 평균 산출
//		int[] snack=new int[5];
//		for(int i=0;i<snack.length;i++) {
//			System.out.println("과자"+(i+1)+" 가격: ");
//			snack[i]=scan.nextInt();
//		}
//		int total=0, avg=0;
//		for(int k=0;k<snack.length;k++) {
//			total=total+snack[k];
//		}
//		avg=total/snack.length;
//		System.out.println("과자 가격의 합: "+total+"원\n과자 가격 평균: "+avg+"원");
		
//		//6명의 키를 tall 배열에 저장, 175 미만을 출력
//		
//		float[] tall=new float[] {173.4f,175.1f,169.5f,181.4f,178.8f,185.3f};
//		
//		for(int i=0;i<tall.length;i++){
//			if(tall[i]<175){
//				System.out.println(tall[i]);
//			}
//		}
		
//		//name 배열의 문자열 중 이성계, 문익점, 정도전, 최영을 선발대 배열에 저장하고 출력
//		
//		String[] name=new String[]{
//			"이순신","김유신","장보고","이성계","문익점","정도전","최영","양만춘"	
//		};
//		String[] foward=new String[4];
//		
//		System.arraycopy(name, 3, foward, 0, 4);
//		System.out.println(Arrays.toString(foward));
		
		String word="i like banana";
		
		//문자열에서 특정 문자나 문자열의 위치 찾기: indexOf
		System.out.println(word.indexOf("like")); //객체에는 indexOf 사용 가능
		//문자열에서 특정 문자나 문자열의 존재 여부-true, false: contains
		System.out.println(word.contains("orange"));
		
//		String[] name=new String[]{
//				"김유신", "한석봉", "양만춘", "김춘추", "정도전", "정약용", "이순신", "이사부", "이사람", "저사람"
//		};
//		
//		System.out.println("이름 검색: ");
//		String search=scan.nextLine();
//		
//		System.out.print("검색 결과: ");
//		for(int i=0;i<name.length;i++){
//			if(name[i].contains(search)){
//				System.out.print (name[i]+" ");
//			}
//		}
		
		//음료 검색하여 음료 이름과 금액 출력
		//카페 배열에 없는 음료 검색시 '죄송합니다. 준비 중입니다'라고 출력
		
		String[] cafe=new String[]{
			"아메리카노: 2000원","화이트 아메리카노: 2800원","카페라떼: 3000원","돌체라떼: 3800원","카페모카: 3800원","수박 주스: 4000원",
			"서머 아이스티: 2900원","복숭아 아이스티: 2800원","자두 아이스티: 2800원","유자에이드: 3500원","레모네이드: 3500원","청포도에이드: 3500원"	
		};
		
		System.out.print("카페 음료 검색: ");
		String search=scan.nextLine();
		
		System.out.println("검색 결과: ");
		
		boolean isDrink=true;
		for(int i=0;i<cafe.length;i++) {
			if(cafe[i].contains(search)){
				System.out.println(cafe[i]);
				isDrink=false;
			}
		}
		if(isDrink){
			System.out.println("죄송합니다. 준비 중입니다.");
		}
		
	}

}
