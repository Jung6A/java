package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		System.out.println(Car.maker);
		
		Car car1;
		
		car1=new Car(); //carName, displacement, fuel 변수 생성
		car1.carName="쏘나타";
		car1.연료="휘발유";
		Car.maker="기아"; //car1.maker를 해도 마찬가지
		System.out.println(Car.maker);
		
		Car car2=new Car("그랜저",3000,"휘발유");
		//매개변수가 있는 생성자 메서드의 경우 생성과 동시에 데이터 저장 가능
		System.out.println(car2.배기량+"cc");
		System.out.println();
		/*
		  
		  데이터: 이름, 포인트, 평점
		  		김건우, 4580, 4.3
		  		김경제, 3285, 4.1
		  		박재범, 90930, 2.7
		  		서석완, 19200, 3.1
		  		
		  웹소설 작가들의 구독자 평점과 소설 조회수에 따른 포인트
		  위 내용을 저장할 수 있는 클래스를 정의하고 데이터 입력 후 출력
		  
		 */
		Webwriter web1=new Webwriter("김건우",4580,4.3f);
		Webwriter web2=new Webwriter("김경제",3285,4.1f);
		Webwriter web3=new Webwriter("박재범",90930,2.7f);
		Webwriter web4=new Webwriter("서석완",19200,3.1f);
		
		System.out.println("웹소설 작가 조회수와 구독자 평점");
		
		System.out.printf("%s\n조회수: %d회  평점: %.1f점", web1.name, web1.point, web1.score);
		System.out.println();
		System.out.printf("%s\n조회수: %d회  평점: %.1f점", web2.name, web2.point, web2.score);
		System.out.println();
		System.out.printf("%s\n조회수: %d회  평점: %.1f점", web3.name, web3.point, web3.score);
		System.out.println();
		System.out.printf("%s\n조회수: %d회  평점: %.1f점", web4.name, web4.point, web4.score);
		System.out.println();
	
		System.out.println(web1);
		
	}

}

//클래스 내부에 선언되는 변수(또는 배열)는 두 가지가 있음
//클래스 변수, 인스턴스 변수
//인스턴스 변수는 생성시 메모리 할당이 됨
//클래스 객체 생성은 new 연산자를 통함
//클래스 변수는 프로그램 실행 시 메모리에 로드하며 생성됨

//생성자 메서드: 객체(인스턴스) 공간을 생성할 때 공간을 초기화 해주는 메서드
//생성자 메서드: return(반환값)이 존재하지 않음
//           return(반환)을 하면 안 되는 이유: 생성자 메서드에는 return 타입 지정이 안 되기 때문
//오버로딩-오버로딩 구현 조건 (하나의 이름으로 여러 메서드 생성)
//      1. 동일 클래스에서 가능
//      2. 메서드의 이름이 같아야 함
//      3. 매개변수의 타입은 다르게 선언되어야 함
//  or  4. 매개변수의 갯수가 달라야 함

class Car{
	static String maker="현대"; //클래스 변수
	
	String carName; //인스턴스 변수
	int 배기량; //인스턴스 변수
	String 연료; //인스턴스 변수
	
	//생성자 메서드
	Car(){
		//생성자 메서드의 내용: 인스턴스 변수의 초기값 지정
		//new 연산자에 의해 객체 생성시 연료 변수에 휘발유가 저장됨
	}
	//매개변수가 있는 생성자 메서드
	//일반적으로 매개변수와 인스턴스 변수의 이름은 같은 것으로 지음 → 두 변수를 헷갈리지 않도록 this.인스턴스 변수로 구분
	Car(String carName,int cc, String fuel){
		this.carName=carName;
		배기량=cc;
		this.연료=fuel;
	}
	
}

class Webwriter{
	String name; //이름-인스턴스
	int point; //포인트-인스턴스
	float score; //평점-인스턴스
	
	Webwriter(){
		//매개변수가 포함된 생성자메서드가 하나라도 만들어지면 기본 메서드는 작동하지 않음
		//새로 만들어줘야 함
	}
	
	Webwriter(String name){
		this.name=name;
	}

	Webwriter(String name, int point, float score){
		this.name=name;
		this.point=point;
		this.score=score;
	}
	
	public String toString(){
		return name+"\n조회수: "+point+"회  평점: "+score+"점";
	}
}