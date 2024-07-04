package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
//		//두 개의 정수 반환
		MethodUtil util=new MethodUtil();
//		int[] num=util.twoNum();
//		System.out.println(Arrays.toString(num));
//		System.out.println();
//		
//		//사각형의 너비와 높이를 설정하고 넓이를 출력
//		//넓이는 main 메서드에서 출력되도록
//		int area=util.area(3,2);
//		System.out.println("사각형의 넓이: "+area);
//		System.out.println();
//		
//		int area2=util.rectArea();
//		System.out.println("사각형의 넓이: "+area2);
//		
//		//로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
//		//login 메서드를 실행하여 로그인 여부 출력
//		//아이디 비밀번호가 일치하면 로그인 성공 출력, 하나라도 불일치 시 로그인 실패 출력
//		//로그인 여부 출력은 main 메서드에서
//		
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		//정수 세 개를 키보드로 입력 받아 입력한 세 정수의 합의 100을 넘으면 100-합, 100을 넘지 않으면 세 정수의 합을 출력
		//main 메서드에서 출력
		
		int answer=util.three();
		if(answer>0){
			System.out.println("세 수의 합: "+answer);
		}else{
			System.out.println("100-세 수의 합: "+answer);
		}
	}

}

class MethodUtil{
	Scanner sc=new Scanner(System.in);
	
	int[] twoNum(){
		int num1=20;
		int num2=50;
//		int[] temp=new int[] {num1,num2};
		return new int[] {num1,num2};
		//return으로 반환할 수 있는 값은 단일값
		//다수의 값을 하나로 반환할 수 있는 것은 배열뿐
	}
	
	int area(int num1, int num2){
		int width=num1, height=num2;
		int area=width*height;
		return area;
	}
	
	int rectArea(){
		int width=45, height=50;
		int area=width*height;
		return area;
	}
	
	boolean login(){
		System.out.print("아이디: ");
		String id=sc.nextLine();
		System.out.print("비밀번호: ");
		String password=sc.nextLine();
		boolean isSuccess=true;
		if(id.equals("skyblue")) {
			if(password.equals("1234sea"))
				return isSuccess;
		}
		return isSuccess=false;
	}
	
	int three(){
		System.out.print("첫 번째 수: ");
		int num1=sc.nextInt();
		System.out.print("두 번째 수: ");
		int num2=sc.nextInt();
		System.out.print("세 번째 수: ");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		
		if(sum>100){
			int minus=100-sum;
			return minus;
		}
		return sum;
	}
	
}