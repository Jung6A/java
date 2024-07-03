package java0703;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		//정수 두 개 입력받아 합을 출력
		Calc calc=new Calc();
		//calc.sum();
		calc.sum(2,4);
		
		//세 과목의 총점을 구하여 출력하시오
		int kor=89, eng=74, mat=43;
		calc.sum(kor,eng,mat);
		
		//메서드 호출하여 '메서드 개쉽네~'라고 출력
		calc.easy(); 
		
		calc.view(); //view 메서드 호출
		
		//메서드를 호출하여 이름과 나이를 출력
		//매개변수 없는 메서드, 키보드 입력x
		calc.sogae();
		System.out.println();
		
		//메서드를 호출하여 아래 데이터 출력
		String animal="골든 리트리버";
		String 공고일="2024-07-01";
		TestMethod testMethod=new TestMethod();
		testMethod.gonggo(animal,공고일);
		System.out.println();
		
		//다음 날짜 중 월과 일만 출력
		//문자열 메서드 substring 또는 split 사용
		String examDate="2024-08-13";
		testMethod.monthDay(examDate);
		System.out.println();
		
		//네 사람 나이의 평균 값을 구하여 출력 (평균값은 정수)
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		testMethod.avg(흥민, 강인, 희찬, 재범);
	}

}
//인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
//클래스 메서드, 클래스 변수는 클래스 이름을 통해 사용
class Calc{

	void sum(){
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		int num1=scan.nextInt();
		System.out.print("두 번째 정수: ");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("두 수의 합: "+result);
	}
	
	void sum(int num1, int num2){
		int result=num1+num2;
		System.out.println("두 수의 합: "+result);
	}
	
	void sum(int num1, int num2, int num3){
		int result=num1+num2+num3;
		System.out.println("총점: "+result+"점");
	}
	
	void easy(){
		System.out.println("메서드 dog쉽네~");
	}
	
	void view(){ //변수 a,b의 값 출력하는 메서드
		int a=10, b=20;
		System.out.println(a+" "+b);
	}
	
	void sogae(){
		String name="김이박";
		int age=25;
		System.out.println("이름: "+name+"  나이: "+age);
	}
	
}
class TestMethod{
	
	void gonggo(String animal, String date){
		System.out.println(animal+"\n공고일:  "+date);
	}
	
	void monthDay(String date){
		int start=date.lastIndexOf("0");
		int last=date.indexOf("3");
		String day=date.substring(start,last+1);
		String[] answer=day.split("-");
		System.out.println(answer[0]+"월 "+answer[1]+"일");
	}
	
	void avg(int num1, int num2, int num3, int num4){
		int total=num1+num2+num3+num4;
		int avg=total/4;
		System.out.println("네 사람의 평균 나이: "+avg+"살");
	}
	
}