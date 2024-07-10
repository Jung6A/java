package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out=new Out();
		out.num=100;
//		out.obj.age=34;
//		out.obj.setName("이순신");
//		
//		Out.인스턴스내부클래스 in=out.new 인스턴스내부클래스();
//		in.age=20;
//		in.setName("김유신");
		
	}

}

//static으로 선언 및 정의한 변수와 메서드는 인스턴스 메서드에서 사용 가능
//인스턴스 변수, 메서드는 static 메서드에서 사용 불가

//static은 프로그램 시작 시 생성됨

class Out {
	static int count; //클래스 변수
	int num; //인스턴스 변수
	private String job; //인스턴스 변수
	인스턴스내부클래스 obj=new 인스턴스내부클래스();
	
	interface Car{ //내부 인터페이스
		void make();
	}
	void makeCar() {
		Car c=new Car() { //인터페이스를 통해 객체를 만든 익명 클래스
			@Override
			public void make() {
				System.out.println("익명 클래스를 통해 만들기");
			}
		};
		c.make();
	}
	
	void buyComputer() {
		class 지역클래스{ //메서드 내부의 클래스: 지역 클래스. 메서드가 실행되면 존재, 실행이 끝나면 사라짐
			int weight; //지역 클래스 내부의 변수, 메서드는 클래스가 포함된 메서드 내부에서만 사용 가능
			void del() { //지역 클래스에는 제어자를 붙일 수 없음
				
			}
		}
		지역클래스 ob=new 지역클래스(); //지역 클래스의 객체는 메서드 내부에서만 생성 가능
	}
	
	static void save() {}
	static class 정적클래스{ //클래스 자체가 static 클래스이므로 static 변수, 메서드 생성 가능
		static int birth;
		static void update() {}
	}
	
	private class 인스턴스내부클래스{ //private 클래스 외부에서 사용할 수 없음
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
//		static void create() {
//			count=10;
//		}
		
	}
}

/* 
내부 클래스: 클래스 내부에서만 사용 가능한 클라그
	1. 인스턴스 내부 클래스
	2. 정적 내부 클래스
	3. 지역 내부 클래스
	4. 익명 내부 클래스
 */