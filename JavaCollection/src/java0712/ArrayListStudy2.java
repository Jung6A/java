package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> member=new ArrayList<>();
		
		member.add(new Asset("�츮����",3450000,"1004-91-123455","�̼���"));
		member.add(new Asset("����",513350,"34-123-349393","������"));
		member.add(new Asset("��������",891003,"394-3412-2323","���س�"));
		member.add(new Asset("��������",899900,"39-2384-19939","�ֹ���"));
		member.add(new Asset("�츮����",28300,"1002-93-878888","������"));
		member.add(new Asset("��������",98000,"293-0123-1234","������"));
		member.add(new Asset("�츮����",1920000,"1006-23-123456","��ù�"));
		member.add(new Asset("��������",932000,"23-2555-29991","������"));
		
		System.out.println("   ��ü ���� Ȯ��   \n");
		for(Asset a:member) {
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("   �츮���� ���� Ȯ��   \n");
		for(Asset a:member) {
			if(a.getBank().equals("�츮����")) {
				System.out.println(a);
			}
		}
		System.out.println();
		
		System.out.println("   �ܾ� 100���� �̻� ���� Ȯ��   \n");
		//member.forEach(a����� �ڵ�)
//		member.forEach(a->){
//			(a.getBalance()>=1000000){
//				System.out.println(a);
//			}
//		}
		
		for(Asset a:member) {
			if(a.getBalance()>=1000000) {
				System.out.println(a);
			}
		}
		System.out.println();
		
		System.out.println("   �ֹ��� �츮���� ���� Ȯ��   \n");
		boolean have=true;
		for(Asset a:member) {
			if(a.getHolder().equals("�ֹ���")) {
				if(a.getBank().equals("�츮����")) {
					System.out.println("�ֹ��� �츮���� ���� ����");
					break;
				}else {
					System.out.println("�ֹ��� �츮���� ���� �̼���");
					have=false;
				}
			}
		}
		
		if(have==false) {
			System.out.println("�ֹ��� �츮���� ���� ����");
			member.add(new Asset("�츮����",0,"1007-23-128954","�ֹ���"));
		}
		System.out.println();
		
		System.out.println("   ��ü ���� Ȯ��   \n");
		for(Asset a:member) {
			System.out.println(a);
		}
		
	}

}
