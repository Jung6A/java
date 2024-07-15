package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(); //인터페이스가 아닌 클래스. 직접 개체 생성
		
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq); //우선순위 순서
		
		for(int i=1;i<=5;i++) {
			System.out.println(pq.poll()); //숫자의 값이 낮을수록 우선순위가 높음
		}
		//개발자가 정의한 클래스의 객체에서 우선순위를 정하려면 compare 메서드 구현 필요
		//인터페이스 Comparator를 implements해야 함
		
		
		Queue<String> q=new LinkedList<>(); //큐는 인터페이스라 객체 생성 불가. 링크드리스트 사용
		
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살구");
		q.offer("참외");
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek()); //확인(출력x). 비어있을 때 null값 출력
		System.out.println(q);
		System.out.println(q.element()); //확인. 비어있을 때 error
		System.out.println(q.size());
		System.out.println(q.contains("복숭아"));
		
	}

}
/*
 Queue
 	FIFO
 	입구와 출구가 다르기 때문에 입출력 동시 가능
*/