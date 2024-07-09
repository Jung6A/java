package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		//7개의 게임 정보를 가진 객체를 생성하고 출력
		
		Game[] game=new Game[7];
		
		game[0]=new Game("원샷","어드벤처","PC");
		game[1]=new Game("스타듀 밸리","시뮬레이션","PC");
		game[2]=new Game("Don't Starve","서바이벌","PC");
		game[3]=new Game("Shatterd Pixel Dungeon","로그라이크","mobile");
		game[4]=new Game("마비노기","MMORPG","PC");
		game[5]=new Game("모여봐요 동물의 숲","커뮤니케이션","Nintendo Switch");
		game[6]=new Game("로얄 매치","퍼즐","mobile");
		
		for(Game gm:game) {
			System.out.println(gm);
		}
		
	}

}
