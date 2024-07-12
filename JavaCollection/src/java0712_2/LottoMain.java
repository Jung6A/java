package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] 일등=new int[] {8,12,23,28,35,41};
		
		ArrayList<Lotto> list=new ArrayList<>();
		
		System.out.print("자동 장 수: ");
		int howMany=scan.nextInt();
		
		for(int i=1;i<=howMany;i++) {
			int[] temp=new int[6];
			for(int k=0;k<temp.length;k++) {
				temp[k]=(int)(Math.random()*45)+1;
				for(int j=0;j<k;j++) {
					if(temp[k]==temp[j]) {
						k--;
						break;
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt -> System.out.println(lt));
		System.out.println();
		
		int 삼등=0, 사등=0;
		
		//내가 구매한 번호 중 3등과 4등은 몇 개인가
		//3등은 5개의 숫자가 일치, 4등은 4개의 숫자가 일치
		for(Lotto l:list) {
			int[] temp=l.getNum();
			int cnt=0;
			for(int i:temp) {
				for(int k:일등) {
					if(i==k)
						cnt++;
				}
			}
			if(cnt==6) System.out.println("1등");
			if(cnt==5) 삼등++;
			if(cnt==4) 사등++;
		}
		System.out.println("3등 "+삼등+"개");
		System.out.println("4등 "+사등+"개");
		
	}

}
