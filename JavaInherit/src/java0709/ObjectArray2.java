package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		//7���� ���� ������ ���� ��ü�� �����ϰ� ���
		
		Game[] game=new Game[7];
		
		game[0]=new Game("����","��庥ó","PC");
		game[1]=new Game("��Ÿ�� �븮","�ùķ��̼�","PC");
		game[2]=new Game("Don't Starve","�����̹�","PC");
		game[3]=new Game("Shatterd Pixel Dungeon","�α׶���ũ","mobile");
		game[4]=new Game("������","MMORPG","PC");
		game[5]=new Game("�𿩺��� ������ ��","Ŀ�´����̼�","Nintendo Switch");
		game[6]=new Game("�ξ� ��ġ","����","mobile");
		
		for(Game gm:game) {
			System.out.println(gm);
		}
		
	}

}
