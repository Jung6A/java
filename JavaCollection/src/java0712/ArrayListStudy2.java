package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> member=new ArrayList<>();
		
		member.add(new Asset("우리은행",3450000,"1004-91-123455","이순신"));
		member.add(new Asset("농협",513350,"34-123-349393","김유신"));
		member.add(new Asset("신한은행",891003,"394-3412-2323","박팽년"));
		member.add(new Asset("국민은행",899900,"39-2384-19939","최무선"));
		member.add(new Asset("우리은행",28300,"1002-93-878888","문익점"));
		member.add(new Asset("신한은행",98000,"293-0123-1234","이율곡"));
		member.add(new Asset("우리은행",1920000,"1006-23-123456","김시민"));
		member.add(new Asset("국민은행",932000,"23-2555-29991","이율곡"));
		
		System.out.println("   전체 계좌 확인   \n");
		for(Asset a:member) {
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("   우리은행 계좌 확인   \n");
		for(Asset a:member) {
			if(a.getBank().equals("우리은행")) {
				System.out.println(a);
			}
		}
		System.out.println();
		
		System.out.println("   잔액 100만원 이상 계좌 확인   \n");
		//member.forEach(a→실행 코드)
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
		
		System.out.println("   최무선 우리은행 계좌 확인   \n");
		boolean have=true;
		for(Asset a:member) {
			if(a.getHolder().equals("최무선")) {
				if(a.getBank().equals("우리은행")) {
					System.out.println("최무선 우리은행 계좌 소지");
					break;
				}else {
					System.out.println("최무선 우리은행 계좌 미소지");
					have=false;
				}
			}
		}
		
		if(have==false) {
			System.out.println("최무선 우리은행 계좌 개설");
			member.add(new Asset("우리은행",0,"1007-23-128954","최무선"));
		}
		System.out.println();
		
		System.out.println("   전체 계좌 확인   \n");
		for(Asset a:member) {
			System.out.println(a);
		}
		
	}

}
