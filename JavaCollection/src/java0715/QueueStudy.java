package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(); //�������̽��� �ƴ� Ŭ����. ���� ��ü ����
		
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq); //�켱���� ����
		
		for(int i=1;i<=5;i++) {
			System.out.println(pq.poll()); //������ ���� �������� �켱������ ����
		}
		//�����ڰ� ������ Ŭ������ ��ü���� �켱������ ���Ϸ��� compare �޼��� ���� �ʿ�
		//�������̽� Comparator�� implements�ؾ� ��
		
		
		Queue<String> q=new LinkedList<>(); //ť�� �������̽��� ��ü ���� �Ұ�. ��ũ�帮��Ʈ ���
		
		q.add("�ڵ�");
		q.offer("����");
		q.offer("����");
		q.offer("�챸");
		q.offer("����");
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek()); //Ȯ��(���x). ������� �� null�� ���
		System.out.println(q);
		System.out.println(q.element()); //Ȯ��. ������� �� error
		System.out.println(q.size());
		System.out.println(q.contains("������"));
		
	}

}
/*
 Queue
 	FIFO
 	�Ա��� �ⱸ�� �ٸ��� ������ ����� ���� ����
*/