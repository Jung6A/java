package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>(); //key, value �� Ÿ�� ����
		
		map.put("�̼���", 19990405);
		map.put("������", 19990101);
		map.put("�念��", 20110718);
		map.put("�̵�", 20051103);
		map.put("������", 20091010); //key�� �ߺ��� �� �����
		map.put("�̼���", 19990405);
		
		map.putIfAbsent("�念��", 1222); //putIfAbsent: Map�� ���� key�� �����Ѵٸ� �������� ����
		
		System.out.println(map);
		
		System.out.println(map.get("�̵�")); //.get(key)�� key�� ��Ī�Ǵ� value ���
		
		//����
		map.replace("�̼���", 19760505); //��ġ�ϴ� key�� ������ �������� ����
		System.out.println(map);
		
		//Ȯ��
		System.out.println(map.containsKey("����ȣ")); //containsKey: �Է��� key�� �����ϴ���
		System.out.println(map.containsValue(1222)); //containsValue: �Է��� value�� �����ϴ���
		System.out.println(map.isEmpty()); //isEmpty: ����ִ��� �ƴ���
		System.out.println(map.size()); //size: ���� ũ��=����ִ� ������ ��
		
		//set �Ǵ� collection ��ȯ
		Set<String> keys=map.keySet(); //Map�� ����� key�� �̾� set���� ��ȯ
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
 	���������� ������� ����
 	key�� value�� �̷����. key:value
 	key�� �ߺ� �Ұ�, value�� �ߺ� ���
 	Map�� ���� �˻� Ưȭ
 	�޸� ������ ���� �Һ���
 */