package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao=new BoardDAO();
		Board[] list=dao.findByAll();
		
		for(Board board:list) {
			if(board.getTitle().contains("아")) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//hit 값이 700 이상인 것 출력
		for(Board board:list) {
			if(board.getHit()>=700) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//제목의 글자수가 10글자 이상인 것만 출력
		for(Board board:list) {
			if(board.getTitle().length()>=10) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//content의 글자수가 10자 이하인 객체의 title과 writer만 출력
		for(Board board:list) {
			if(board.getContent().length()<=40) {
				System.out.println(board.getTitle()+", "+board.getWriter());
			}
		}
		System.out.println();
		
		//hit 수가 700 이상인 객체를 추출하여 hot이라는 변수에 저장
		Board[] hot=new Board[list.length];
		int i=0; //hot 배열 인덱스
		for(Board board:list) {
			if(board.getHit()>700) {
				hot[i++]=board;
			}
		}
		for(Board data:hot) {
			if(data==null) break;
			System.out.println(data);
		}
		System.out.println();
		
		//writer에 신이 포함된 객체만 추출하여 sin 배열에 저장 후 출력
		Board[] sin=new Board[list.length];
		i=0;
		for(Board board:list) {
			if(board.getWriter().contains("신")) {
				sin[i++]=board;
			}
		}
		for(Board data:sin) {
			if(data==null) break;
			System.out.println(data);
		}
	}

}
