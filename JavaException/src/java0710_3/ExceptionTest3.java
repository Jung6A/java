package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			//보통 메서드 내부에서 사용
			//if(특정 조건)
				throw new NullPointerException("aa"); //강제로 오류 발생시킴
				//특정 조건 발생시 프로그램 강제 종료 위함
			
		}catch(Exception e) {
			System.out.println("강제 오류 발생");
		}
		
	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth) {
		this.name=name;
		this.birth=birth;
	}
	
	void setAge() {
		this.age=2024-birth;
	}
}