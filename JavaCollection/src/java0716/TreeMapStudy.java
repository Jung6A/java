package java0716;

import java.util.TreeMap;

public class TreeMapStudy {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree=new TreeMap<>();

		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree);
		//key에 따라 정렬, 중복 불가
		
		//검색 기능은 HashMap에는 없는 것. 대체적인 기능은 TreeSet과 유사 (이름이 조금 다름)
		//value 검색은 불가능. Set으로 변환하거나 하는 우회적인 방식으로 가능
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(15)); //입력한 key와 일치하거나 작은 값 중 가장 가까운 key
		System.out.println(tree.floorKey(33));
		System.out.println(tree.floorEntry(15)); //floorKey와 같은 조건으로 value까지 출력
		System.out.println(tree.subMap(10, 40)); //key 범위 검색
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
	}

}
