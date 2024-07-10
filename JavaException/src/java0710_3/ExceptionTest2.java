package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		int num=0;
		boolean is=true;
		
		do {
			try {
				System.out.print("정수 입력: ");
				num=scan.nextInt();
				is=true;
				if(is) break;
			}catch(InputMismatchException i) { //일부 오류는 import 필요
				System.out.println("정수 외의 문자가 입력되었습니다.");
			}finally { //finally: 예외처리시 오류 여부와 관계없이 실행
				scan.nextLine();
			}
		}while(is);
		
		System.out.println(num+100);
		
		System.out.print("이름: ");
		String name=scan.nextLine();
		System.out.println(name);
		
	}

}
