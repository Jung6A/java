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
		//가장 먼저 저장된 값을 root에 저장, 이후 값과 비교해서 더 큰 수는 오른쪽 node, 작은 수는 왼쪽 node에 분류
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		System.out.println(tree.higher(25)); //higher: 입력값보다 큰 값 중 가장 가까운 값 검색
		System.out.println(tree.lower(19)); //lower: 입력값보다 작은 값 중 가장 가까운 값 검색
		System.out.println(tree.headSet(35)); //headSet: 입력값보다 작은 값 모두 검색
		System.out.println(tree.tailSet(30)); //tailSet: 입력값보다 큰 값 모두 검색
		System.out.println(tree.subSet(9, 39)); //subSet: 입력값들의 사이 값 검색 (9~39의 '전'까지)
		System.out.println();
		
		TreeSet<String> word=new TreeSet<>();
		word.add("이순신"); word.add("문익점"); word.add("장보고"); word.add("김유신"); word.add("정도전");
		word.add("박팽년"); word.add("성삼문"); word.add("마골피"); word.add("나훈아");
		
		System.out.println(word);
		System.out.println(word.higher("아"));
		System.out.println(word.headSet("라면"));
		System.out.println(word.subSet("나", "자"));
		
		System.out.println(word.subSet("ㄴ", "자"));
		System.out.println();
		
		
		//90점 이상: 상위 10%, 70점 이상: 상위 30%, 40점 이상: 상위 80%
		
		TreeSet<Integer> rank=new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		//나의 점수를 입력하여 상위 몇%인지 출력
		
		System.out.print("내 점수: ");
		int myScore=scan.nextInt();
		scan.nextLine();
		
		switch(rank.lower(myScore+1)) {
		case 90:
			System.out.println("상위 10%");
			break;
		case 70:
			System.out.println("상위 30%");
			break;
		case 40:
			System.out.println("상위 80%");
		}
		
		TreeSet<String> score=new TreeSet<>();
		score.add("89점 이순신"); score.add("67점 김유신"); score.add("45점 문익점"); score.add("98점 한석봉");
		score.add("72점 박문수"); score.add("81점 김춘추"); score.add("59점 이성계"); score.add("89점 이순신");
		
		//내 점수를 입력하고 나보다 높은 사람들 출력
		System.out.print("내 점수: ");
		String myS=scan.nextLine()+"점 나";
		
		score.add(myS);
		if(myS.equals("100점 나")) {
			System.out.println("1등!!");
		}else {
			System.out.println(score.tailSet(myS));
		}
		
		
	}

}
/*  
 Tree 구조를 이용하여 값을 저장시키는 TreeSet
 	데이터를 순차적으로 저장하지 않음
 	중복 허용하지 않음
 	이진트리를 사용하기 때문에 데이터 정렬 출력
 	범위 검색 또는 데이터 중복방지 및 정렬에 용이
 */