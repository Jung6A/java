package java0703;

import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1=new Member("이순신",31,"군인");
		Member member2=new Member("문익점",29,"섬유공장 사장");
		Member member3=new Member("장영실",45,"기계공학자");
		//태어난 해
		System.out.println("생년");
		member1.birthYear();
		member2.birthYear();
		member3.birthYear();
		System.out.println();
		
		
		DataIdenti dataIdenti=new DataIdenti();
		//연령대: 20대, 30대, 40대, 50대?
		System.out.println("연령대 표기");
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		System.out.println();
		
		//직업분류: 국가직무 분류에 따라 표기
		System.out.println("국가직무능력표준(NCS)에 따른 직업 분류");
		dataIdenti.jobGroup(member1.name, member1.job);
		dataIdenti.jobGroup(member2.name, member2.job);
		dataIdenti.jobGroup(member3.name, member3.job);
		System.out.println();
		
//		//날짜 추출 방법1
//		System.out.println(today.getYear());
//		연: .getYear();
//		월: .getMonthValue();
//		일: .getDayOfMonth();
//		요일: .getDayOfWeek().getValue();  월요일(1)~일요일(7)
		
//		//날짜 추출 방법2
//		Calendar cal=Calendar.getInstance(); //추상클래스(클래스 아이콘에 A표시): 객체를 만들 수 없는 클래스
//		int year=cal.get(Calendar.YEAR);
//		int month=cal.get(Calendar.MONTH)+1;
//		int date=cal.get(Calendar.DAY_OF_MONTH);
//		int day=cal.get(Calendar.DAY_OF_WEEK); //일요일(1)부터 시작
//		Date today=new Date();
//		System.out.println(today.getYear()+1900); //클래스의 캡슐화, 정보 은닉  취소선: 사용 권장하지 않음 (구버전)
		
	}
	
}

class Member{
	String name; //이름
	int age; //나이
	String job; //직업
	//기본 생성자 메서드
	Member(){}
	//매개변수가 있는 생성자 메서드
	Member(String name,int age,String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	//태어난 해 출력 메서드
	void birthYear(){
		//날짜 추출 방법3
		LocalDate today=LocalDate.now();
		int thisYear=today.getYear();
		//화면 출력- 이순신 태어난 해: 0000년
		int year=thisYear-this.age; //this: (Member 클래스 객체) 
		System.out.printf("%s: %d년\n",this.name,year);
	}
}
//컨트롤용 클래스, 실제 기능의 동작 클래스, 데이터 클래스
//Controller, Service, DTO(VO)

class DataIdenti{ //연령대, 직업 분류 등 데이터 분류를 위한 클래스
	void ageGroup(String name, int age){
		String group=null;
		group=(age/10)+"0대";
		System.out.println(name+"("+group+")");
	}
	void jobGroup(String name, String job){
		String ncs=null;
		//군인-05. 국방   기계공학자-15. 기계   섬유공장사장-18. 섬유의복
		switch(job){
			case "군인":
				ncs="05.법률·경찰·소방·교도·국방";
				break;
			case "섬유공장 사장":
				ncs="18.섬유·의복";
				break;
			case "기계공학자":
				ncs="15.기계";
				break;
		}
		System.out.println(name+": "+job+"\n"+ncs);
	}
}

//메서드나 함수를 사용하는 이유
//배열, 계산, 단순 출력- 반복문
//메서드를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아짐
//메서드를 사용시 구조화된 프로그래밍 가능
