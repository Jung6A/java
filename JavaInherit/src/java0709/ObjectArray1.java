package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		//��ȭ ���� 5�� �Է�
		
		Movie[] mv=new Movie[5];
		
		mv[0]=new Movie("�� �� ��","�� ���꽺",15);
		mv[1]=new Movie("���� �ƾ���","�׷�Ÿ ����",0);
		mv[2]=new Movie("�� �������","�� ����",12);
		mv[3]=new Movie("�λ��̵� �ƿ�2","�̽� ��",0);
		mv[4]=new Movie("����","�� ��ũ��ġ",0);
		
		for(int i=0;i<mv.length;i++) {
			System.out.println(mv[i]);
		}
		
		System.out.println();
		
		for(Movie movie:mv) {
			System.out.println(movie);
		}
		
	}

}
/*
	�迭 ����
		������ Ÿ��[] ��������=new ������ Ÿ��[�迭 ũ��];
		Ŭ������[] ��������=new Ŭ������[�迭 ũ��];
		
		int[] arr=new int[10];
		int Ÿ���� ���� 10�� ����(int Ÿ������ ����� ���� 10���� �ִ� �Ͱ� ���ٰ� ���� ��)
		Movie[] mv=new Movie[10];
		Movie Ŭ������ �������� 10�� ����
		mv[0]=new Movie(); //��ü�� ����� ���� ������ �޼��� ȣ��
		mv[1]=new Movie(); ��
 */