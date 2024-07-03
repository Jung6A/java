package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		//메서드를 통해 숫자 10을 받아 출력하기
		
		ReturnMth re=new ReturnMth();
		
		int num=re.get();
		System.out.println(num);
		
		//메서드로부터 두 정수의 합 받아 출력
		int result=re.sum();
		System.out.println(result);
		System.out.println();
		
		//다음 물음표에 들어갈 코드를 작성해 이름과 나이가 출력되도록
		String userName=re.getName();
		int age=34;
		System.out.println(userName+" "+age+"세");
		System.out.println();
		
		//국어 89, 영어 78, 수학 50 세 과목의 총점을 구하는 메서드
		//세 과목의 평균을 구하는 메서드
		//메서드 두 개로 총점과 평균을 출력
		int sum=re.total();
		float avg=re.avg(sum);
		System.out.printf("총점: %d점\n평균: %.1f점",sum,avg);
	}

}
/*
   
   주사위 게임
   j형준과 s석완이 주사위 게임을 함
   주사위는 육면체 하나
   주사위 값이 큰 사람이 승리
   
   주사위 값을 구하는 메서드
   주사위 값 비교해 누가 이겼는지 출력하는 메서드
   
 */

class ReturnMth{
	
	int get(){
		return 10; //메서드 안의 데이터를 밖으로 드러내기 위해서 return(반환값) 필요
	}
	
	int sum(){
		int num1=30, num2=45;
		int result=num1+num2;
		return result;
	}
	
	String getName(){
		String name="이순신";
		return name;
	}
	
	int total(){
		int kor=89, eng=78, mat=50;
		int result=kor+eng+mat;
		return result;
	}
	
	float avg(int total){
		float result=(total)/(float)3;
		return result;
	}
	
}