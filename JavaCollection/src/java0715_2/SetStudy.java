package java0715_2;
import java.util.HashSet;
//import java.util.Iterator;

public class SetStudy {

	public static void main(String[] args) {
		
//		HashSet<String> ����=new HashSet<>();
//		HashSet<String> ���=new HashSet<>();
//		
//		����.add("¥���"); ����.add("������"); ����.add("������"); ����.add("�޲ٹ̺���");
//		���.add("��ġ������"); ���.add("������"); ���.add("¥���"); ���.add("������");
//		
//		//������: �� �� �̻��� �׷쿡 �������� ���� ����
//		HashSet<String> ����=new HashSet<>();
//		
//		Iterator<String> it=����.iterator();
//		while(it.hasNext()) {
//			String ����food=it.next();
//			if(���.contains(����food)) {
//				����.add(����food);
//			}
//		}
//		System.out.println("���С���� ������: "+����);
//		System.out.println();
//		
//		//������: A���տ��� B���հ��� ������ �����͸� ������ ����
//		HashSet<String> ��=new HashSet<>();
//		it=����.iterator();
//		while(it.hasNext()) {
//			String ����food=it.next();
//			if(!���.contains(����food)) {
//				��.add(����food);
//			}
//		}
//		System.out.println("��ο� ���� ������ ������: "+��);
//		System.out.println();
//		
//		//������: A���հ� B������ �� (�ߺ� ����)
//		HashSet<String> ��=new HashSet<>();
//		��=(HashSet<String>)����.clone(); //����
//		��.addAll(���);
//		System.out.println(��);
//		System.out.println();
//		
//		//������: addAll
//		//������: retainAll  ����.retainAll(���);
//		//������: removeAll  ����.removeAll(���);
		
		HashSet<Integer> num1=new HashSet<>();
		
		while(num1.size()<=10) {
			num1.add(Integer.valueOf((int)(Math.random()*50)));
		}
		System.out.println(num1);
		System.out.println();
		
		//num1, num2, num3 �� ���� ������ ����� ���� 1~50������ ������ 15�� ����
		//num1�� num3�� ������
		//num1�� num2�� ������
		//num2�� num3�� ������
		//num1, num2, num3�� ������
		
		HashSet<Integer> num2=new HashSet<>();
		HashSet<Integer> num3=new HashSet<>();
		
		while(num1.size()<=15) {
			num1.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		while(num2.size()<=15) {
			num2.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		while(num3.size()<=15) {
			num3.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		System.out.println("num1\n"+num1);
		System.out.println("num2\n"+num2);
		System.out.println("num3\n"+num3);
		System.out.println();
		
		HashSet<Integer> sum1=new HashSet<>(); //1�� 3�� ������
		HashSet<Integer> sum2=new HashSet<>(); //1���� 2�� ������
		HashSet<Integer> sum3=new HashSet<>(); //2�� 3�� ������
		HashSet<Integer> sum4=new HashSet<>(); //1 2 3�� ������
		
		//1 3�� ������
		sum1.addAll(num1);
		sum1.retainAll(num3);
		System.out.println("num1�� num3�� ������:\n"+sum1);
		
		//1 2�� ������
		sum2.addAll(num1);
		sum2.removeAll(num2);
		System.out.println("num1���� num2�� ������:\n"+sum2);
		
		//2 3�� ������
		sum3.addAll(num2);
		sum3.retainAll(num3);
		System.out.println("num2�� num3�� ������:\n"+sum3);
		
		//1 2 3�� ������
		sum4.addAll(num1);
		sum4.addAll(num2);
		sum4.addAll(num3);
		System.out.println("num1, num2, num3�� ������:\n"+sum4);
		
		
//		HashSet<String> hash=new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("���Į����");
//		hash.add("��������");
//		hash.add("¥���"); //�̹� �ִ� ������ ���� �Ұ�x ������ �Ͼ�� ���� �ƴϰ� �̹� �ִ� �����Ϳ� �������
//		
//		System.out.println(hash);
//		//Ư�� �����͸� �̾ƿ���� �Ұ�
//		hash.remove("«��"); //Ư�� ������ ������ ����
//		System.out.println(hash);
//		
//		for(String food:hash) {
//			System.out.println(food);
//		} //���� �޼��尡 ���� ������ �ϳ��� ����� ���� ����. ��, HashSet�� ���� �׷����� Ȯ���ϴ� Ŭ�����̱� ������ ������ Ȯ������ ����
//		
//		ArrayList<String> list=new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3)); //�ϳ��� ����ϱ� ���ؼ��� ��̸���Ʈ, ����, ��ũ�帮��Ʈ ������ ��ȯ�� ���
		
	}

}
/*  
 Set �������̽�
 	-HashSet, TreeSet
 	������� ������� ����
 	�ߺ� ������� ����
 	�ε����� ����
 	Set�� ����(�������� �׷�)�� �ٷ� �� ����
 	-HashSet: ������ ǥ��
 	-TreeSet: �˻��� Ưȭ
 */