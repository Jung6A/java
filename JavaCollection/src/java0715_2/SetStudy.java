package java0715_2;
import java.util.HashSet;
//import java.util.Iterator;

public class SetStudy {

	public static void main(String[] args) {
		
//		HashSet<String> 재학=new HashSet<>();
//		HashSet<String> 상민=new HashSet<>();
//		
//		재학.add("짜장면"); 재학.add("볶음밥"); 재학.add("돈가스"); 재학.add("쭈꾸미볶음");
//		상민.add("김치볶음밥"); 상민.add("떡볶이"); 상민.add("짜장면"); 상민.add("돈가스");
//		
//		//교집합: 두 개 이상의 그룹에 공통적인 값의 집합
//		HashSet<String> 공통=new HashSet<>();
//		
//		Iterator<String> it=재학.iterator();
//		while(it.hasNext()) {
//			String 재학food=it.next();
//			if(상민.contains(재학food)) {
//				공통.add(재학food);
//			}
//		}
//		System.out.println("재학·상민 교집합: "+공통);
//		System.out.println();
//		
//		//차집합: A집합에서 B집합과의 교집합 데이터를 제외한 집합
//		HashSet<String> 차=new HashSet<>();
//		it=재학.iterator();
//		while(it.hasNext()) {
//			String 재학food=it.next();
//			if(!상민.contains(재학food)) {
//				차.add(재학food);
//			}
//		}
//		System.out.println("상민에 대한 재학의 차집합: "+차);
//		System.out.println();
//		
//		//합집합: A집합과 B집합의 합 (중복 없이)
//		HashSet<String> 합=new HashSet<>();
//		합=(HashSet<String>)재학.clone(); //복사
//		합.addAll(상민);
//		System.out.println(합);
//		System.out.println();
//		
//		//합집합: addAll
//		//교집합: retainAll  재학.retainAll(상민);
//		//차집합: removeAll  재학.removeAll(상민);
		
		HashSet<Integer> num1=new HashSet<>();
		
		while(num1.size()<=10) {
			num1.add(Integer.valueOf((int)(Math.random()*50)));
		}
		System.out.println(num1);
		System.out.println();
		
		//num1, num2, num3 세 개의 집합을 만들고 각각 1~50까지의 랜덤값 15개 저장
		//num1과 num3의 교집합
		//num1과 num2의 차집합
		//num2와 num3의 교집합
		//num1, num2, num3의 합집합
		
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
		
		HashSet<Integer> sum1=new HashSet<>(); //1과 3의 교집합
		HashSet<Integer> sum2=new HashSet<>(); //1에서 2의 차집합
		HashSet<Integer> sum3=new HashSet<>(); //2와 3의 교집합
		HashSet<Integer> sum4=new HashSet<>(); //1 2 3의 합집합
		
		//1 3의 교집합
		sum1.addAll(num1);
		sum1.retainAll(num3);
		System.out.println("num1과 num3의 교집합:\n"+sum1);
		
		//1 2의 차집합
		sum2.addAll(num1);
		sum2.removeAll(num2);
		System.out.println("num1에서 num2의 차집합:\n"+sum2);
		
		//2 3의 교집합
		sum3.addAll(num2);
		sum3.retainAll(num3);
		System.out.println("num2과 num3의 교집합:\n"+sum3);
		
		//1 2 3의 합집합
		sum4.addAll(num1);
		sum4.addAll(num2);
		sum4.addAll(num3);
		System.out.println("num1, num2, num3의 합집합:\n"+sum4);
		
		
//		HashSet<String> hash=new HashSet<>();
//		
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨칼국수");
//		hash.add("맑은곰탕");
//		hash.add("짜장면"); //이미 있는 데이터 저장 불가x 오류가 일어나는 것은 아니고 이미 있는 데이터에 덮어쓰기함
//		
//		System.out.println(hash);
//		//특정 데이터만 뽑아오기는 불가
//		hash.remove("짬뽕"); //특정 데이터 삭제는 가능
//		System.out.println(hash);
//		
//		for(String food:hash) {
//			System.out.println(food);
//		} //전용 메서드가 없는 것이지 하나씩 출력할 수는 있음. 단, HashSet은 본래 그룹으로 확인하는 클래스이기 때문에 개별로 확인하지 않음
//		
//		ArrayList<String> list=new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3)); //하나씩 사용하기 위해서는 어레이리스트, 벡터, 링크드리스트 등으로 변환해 사용
		
	}

}
/*  
 Set 인터페이스
 	-HashSet, TreeSet
 	순서대로 저장되지 않음
 	중복 허용하지 않음
 	인덱스가 없음
 	Set은 집합(데이터의 그룹)을 다룰 때 사용됨
 	-HashSet: 집합을 표현
 	-TreeSet: 검색에 특화
 */