package java0716;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		HashMap<String, ImageBoard> board=new HashMap<>();
		
		ImageBoard temp=new ImageBoard("자바 설치","javava","설치.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("mysql 설치방법","설치인생","mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("천장결과","운수없는날","백만원의결과.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("최저임금…","편의정사장","나혼자편의점.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("mysql 설치방법2","설치인생","mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		
		System.out.println(board.get("자바 설치"));
		
		//이미지 게시판의 글 제목 글 제목 출력
		//보고 싶은 글 제목 입력 시 해당 글의 내용 열람 가능
		
		Set<String> titles=board.keySet();
		System.out.println("────이미지 게시판 목록────");
		titles.forEach(title->System.out.println(title));
		
		System.out.print("글 제목 검색: ");
		String inputTitle=scan.nextLine();
		
		System.out.println(board.get(inputTitle));
		
	}

}
