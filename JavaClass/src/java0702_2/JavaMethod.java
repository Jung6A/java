package java0702_2;

public class JavaMethod {

	public static void main(String[] args) {
		//클래스 메서드에서는 오직 클래스 변수나 클래스 메서드만 실행
		//메모리에 로드(적재)되는 때가 인스턴스보다 먼저 이루어지기 때문에 인스턴스 변수나 인스턴스 메서드는 불가
		
		output();
		JavaMethod ja=new JavaMethod();
		ja.output();
	}
	
static void output(){
	System.out.println("나는 메서드입니다.");
}

class a{
	int num=10;
	
	void out(){
		System.out.println("나는 메서드입니다.");
	}
}
	
}
//main 메서드 → JVM에서 가장 먼저 실행하는 메소드. 필수
//JVM(java virtual machine, 자바 가상 머신): 운영체제 무관으로 동작하기 위한 가상의 컴퓨터 환경


//자바 메서드
//반환타입 메서드 이름(매개변수){ 메서드 내용 }

//반환타입- int, short, float, double, char, boolean, void, String 등
//		 메서드의 return 데이터 타입
//	return 10; → 반환 타입 int, short, long
//	return income; → income 변수의 타입을 반환 타입으로

//void 타입은 반환값이 없다는 의미

/*
    주민등록번호로 남자인지 여자인지 구별
    String gender(String jumin){
    
    	jumin.substring(7,8);
    	if(gen.equals("1")||gen.equals("3")){
    		returns "남자";
    	}else if(gen.equals("2")||gen.equals("4")){
    		returns "여자";
    	}
    	
    }
 */