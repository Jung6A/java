package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
//		Stack<String> st=new Stack<>();
//		
//		st.add("이순신");
//		st.push("김유신"); //스택의 전용 메서드
//		st.push("김춘추");
//		st.push("장보고");
//		st.push("김종서");
//		
//		System.out.println(st);
//		System.out.println(st.pop()); //출력&제거
//		System.out.println(st);
//		System.out.println(st.search("김춘추"));
//		
//		System.out.println(st.size()); //스택의 사이즈, 전체 데이터 개수
//		//st.size()-st.search("김춘추") pop 메서드 실행 횟수
//		
//		System.out.println(st.isEmpty()); //비어있는지 아닌지: 비어 있다면  true, 비어 있지 않다면 false
		
		Stack<String> pre=new Stack<>();
		Stack<String> back=new Stack<>();
		String now="네이버";
		
		while(true) {
			System.out.print("이동 페이지 입력 (1.뒤 2.앞): ");
			String temp=sc.nextLine();
			if(temp.equals("1")&&!back.isEmpty()) { //이전 페이지 이동
				pre.push(now); //현재 페이지는 앞쪽 스택에 저장
				now=back.pop();
			}else if(temp.equals("2")&&!pre.isEmpty()) { //앞 페이지 이동
				back.push(now);
				now=pre.pop();
			}else if(!(temp.equals("1")||temp.equals("2"))){ //새 페이지 이동
				back.push(now);
				pre.clear();
				now=temp;
			}
			System.out.println("현재 페이지: "+now);
			System.out.println("이전 페이지 목록: "+back);
			System.out.println("앞 페이지 목록: "+pre);
			System.out.println();
		}
		
	}

}
/* 
 stack
 	데이터를 저장하기 위한 입구와 출력하기 위한 출구가 같음
 	한 곳을 통해 저장과 출력이 이루어지는 구조
 	FILO-first in last out
	
 */