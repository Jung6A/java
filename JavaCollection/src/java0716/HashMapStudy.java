package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>(); //key, value 두 타입 지정
		
		map.put("이순신", 19990405);
		map.put("김춘추", 19990101);
		map.put("장영실", 20110718);
		map.put("이도", 20051103);
		map.put("김춘추", 20091010); //key가 중복될 시 덮어쓰기
		map.put("이성계", 19990405);
		
		map.putIfAbsent("장영실", 1222); //putIfAbsent: Map에 같은 key가 존재한다면 저장하지 않음
		
		System.out.println(map);
		
		System.out.println(map.get("이도")); //.get(key)로 key에 매칭되는 value 출력
		
		//수정
		map.replace("이성계", 19760505); //일치하는 key가 없으면 수정되지 않음
		System.out.println(map);
		
		//확인
		System.out.println(map.containsKey("김정호")); //containsKey: 입력한 key가 존재하는지
		System.out.println(map.containsValue(1222)); //containsValue: 입력한 value가 존재하는지
		System.out.println(map.isEmpty()); //isEmpty: 비어있는지 아닌지
		System.out.println(map.size()); //size: 맵의 크기=들어있는 데이터 수
		
		//set 또는 collection 변환
		Set<String> keys=map.keySet(); //Map에 저장된 key만 뽑아 set으로 변환
		System.out.println(keys);
		for(String name:keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth=new ArrayList<>(map.values());
		System.out.println(birth);
		
		Set<Map.Entry<String, Integer>> entry=map.entrySet();
		System.out.println(entry);
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}

/*
 HashMap
 	순차적으로 저장되지 않음
 	key와 value로 이루어짐. key:value
 	key는 중복 불가, value는 중복 허용
 	Map은 색인 검색 특화
 	메모리 공간을 많이 소비함
 */