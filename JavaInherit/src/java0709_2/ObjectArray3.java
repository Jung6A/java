package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao=new BoardDAO();
		Board[] list=dao.findByAll();
		
		for(Board board:list) {
			if(board.getTitle().contains("��")) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//hit ���� 700 �̻��� �� ���
		for(Board board:list) {
			if(board.getHit()>=700) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//������ ���ڼ��� 10���� �̻��� �͸� ���
		for(Board board:list) {
			if(board.getTitle().length()>=10) {
				System.out.println(board);
			}
		}
		System.out.println();
		
		//content�� ���ڼ��� 10�� ������ ��ü�� title�� writer�� ���
		for(Board board:list) {
			if(board.getContent().length()<=40) {
				System.out.println(board.getTitle()+", "+board.getWriter());
			}
		}
		System.out.println();
		
		//hit ���� 700 �̻��� ��ü�� �����Ͽ� hot�̶�� ������ ����
		Board[] hot=new Board[list.length];
		int i=0; //hot �迭 �ε���
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
		
		//writer�� ���� ���Ե� ��ü�� �����Ͽ� sin �迭�� ���� �� ���
		Board[] sin=new Board[list.length];
		i=0;
		for(Board board:list) {
			if(board.getWriter().contains("��")) {
				sin[i++]=board;
			}
		}
		for(Board data:sin) {
			if(data==null) break;
			System.out.println(data);
		}
	}

}
