package java0716;

import java.util.TreeMap;

public class TreeMapStudy {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree=new TreeMap<>();

		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree);
		//key�� ���� ����, �ߺ� �Ұ�
		
		//�˻� ����� HashMap���� ���� ��. ��ü���� ����� TreeSet�� ���� (�̸��� ���� �ٸ�)
		//value �˻��� �Ұ���. Set���� ��ȯ�ϰų� �ϴ� ��ȸ���� ������� ����
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(15)); //�Է��� key�� ��ġ�ϰų� ���� �� �� ���� ����� key
		System.out.println(tree.floorKey(33));
		System.out.println(tree.floorEntry(15)); //floorKey�� ���� �������� value���� ���
		System.out.println(tree.subMap(10, 40)); //key ���� �˻�
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
	}

}
