package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		TreeSet<Integer> tree=new TreeSet<>();
		
		tree.add(34); tree.add(45); tree.add(20); tree.add(9); tree.add(40);
		tree.add(15); tree.add(48); tree.add(2); tree.add(11); tree.add(39);
		
		System.out.println(tree);
		//���� ���� ����� ���� root�� ����, ���� ���� ���ؼ� �� ū ���� ������ node, ���� ���� ���� node�� �з�
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		System.out.println(tree.higher(25)); //higher: �Է°����� ū �� �� ���� ����� �� �˻�
		System.out.println(tree.lower(19)); //lower: �Է°����� ���� �� �� ���� ����� �� �˻�
		System.out.println(tree.headSet(35)); //headSet: �Է°����� ���� �� ��� �˻�
		System.out.println(tree.tailSet(30)); //tailSet: �Է°����� ū �� ��� �˻�
		System.out.println(tree.subSet(9, 39)); //subSet: �Է°����� ���� �� �˻� (9~39�� '��'����)
		System.out.println();
		
		TreeSet<String> word=new TreeSet<>();
		word.add("�̼���"); word.add("������"); word.add("�庸��"); word.add("������"); word.add("������");
		word.add("���س�"); word.add("���﹮"); word.add("������"); word.add("���ƾ�");
		
		System.out.println(word);
		System.out.println(word.higher("��"));
		System.out.println(word.headSet("���"));
		System.out.println(word.subSet("��", "��"));
		
		System.out.println(word.subSet("��", "��"));
		System.out.println();
		
		
		//90�� �̻�: ���� 10%, 70�� �̻�: ���� 30%, 40�� �̻�: ���� 80%
		
		TreeSet<Integer> rank=new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		//���� ������ �Է��Ͽ� ���� ��%���� ���
		
		System.out.print("�� ����: ");
		int myScore=scan.nextInt();
		scan.nextLine();
		
		switch(rank.lower(myScore+1)) {
		case 90:
			System.out.println("���� 10%");
			break;
		case 70:
			System.out.println("���� 30%");
			break;
		case 40:
			System.out.println("���� 80%");
		}
		
		TreeSet<String> score=new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������"); score.add("45�� ������"); score.add("98�� �Ѽ���");
		score.add("72�� �ڹ���"); score.add("81�� ������"); score.add("59�� �̼���"); score.add("89�� �̼���");
		
		//�� ������ �Է��ϰ� ������ ���� ����� ���
		System.out.print("�� ����: ");
		String myS=scan.nextLine()+"�� ��";
		
		score.add(myS);
		if(myS.equals("100�� ��")) {
			System.out.println("1��!!");
		}else {
			System.out.println(score.tailSet(myS));
		}
		
		
	}

}
/*  
 Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
 	�����͸� ���������� �������� ����
 	�ߺ� ������� ����
 	����Ʈ���� ����ϱ� ������ ������ ���� ���
 	���� �˻� �Ǵ� ������ �ߺ����� �� ���Ŀ� ����
 */