package java0716;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		HashMap<String, ImageBoard> board=new HashMap<>();
		
		ImageBoard temp=new ImageBoard("�ڹ� ��ġ","javava","��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("mysql ��ġ���","��ġ�λ�","mysql��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("õ����","������³�","�鸸���ǰ��.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("�����ӱݡ�","����������","��ȥ��������.jpg");
		board.put(temp.getTitle(), temp);
		temp=new ImageBoard("mysql ��ġ���2","��ġ�λ�","mysql��ġ.jpg");
		board.put(temp.getTitle(), temp);
		
		System.out.println(board.get("�ڹ� ��ġ"));
		
		//�̹��� �Խ����� �� ���� �� ���� ���
		//���� ���� �� ���� �Է� �� �ش� ���� ���� ���� ����
		
		Set<String> titles=board.keySet();
		System.out.println("���������̹��� �Խ��� ��Ϧ�������");
		titles.forEach(title->System.out.println(title));
		
		System.out.print("�� ���� �˻�: ");
		String inputTitle=scan.nextLine();
		
		System.out.println(board.get(inputTitle));
		
	}

}
