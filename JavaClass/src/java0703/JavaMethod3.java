package java0703;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		//���� �� �� �Է¹޾� ���� ���
		Calc calc=new Calc();
		//calc.sum();
		calc.sum(2,4);
		
		//�� ������ ������ ���Ͽ� ����Ͻÿ�
		int kor=89, eng=74, mat=43;
		calc.sum(kor,eng,mat);
		
		//�޼��� ȣ���Ͽ� '�޼��� ������~'��� ���
		calc.easy(); 
		
		calc.view(); //view �޼��� ȣ��
		
		//�޼��带 ȣ���Ͽ� �̸��� ���̸� ���
		//�Ű����� ���� �޼���, Ű���� �Է�x
		calc.sogae();
		System.out.println();
		
		//�޼��带 ȣ���Ͽ� �Ʒ� ������ ���
		String animal="��� ��Ʈ����";
		String ������="2024-07-01";
		TestMethod testMethod=new TestMethod();
		testMethod.gonggo(animal,������);
		System.out.println();
		
		//���� ��¥ �� ���� �ϸ� ���
		//���ڿ� �޼��� substring �Ǵ� split ���
		String examDate="2024-08-13";
		testMethod.monthDay(examDate);
		System.out.println();
		
		//�� ��� ������ ��� ���� ���Ͽ� ��� (��հ��� ����)
		int ���=31, ����=23, ����=28, ���=37;
		testMethod.avg(���, ����, ����, ���);
	}

}
//�ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
//Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸��� ���� ���
class Calc{

	void sum(){
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��° ����: ");
		int num1=scan.nextInt();
		System.out.print("�� ��° ����: ");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("�� ���� ��: "+result);
	}
	
	void sum(int num1, int num2){
		int result=num1+num2;
		System.out.println("�� ���� ��: "+result);
	}
	
	void sum(int num1, int num2, int num3){
		int result=num1+num2+num3;
		System.out.println("����: "+result+"��");
	}
	
	void easy(){
		System.out.println("�޼��� dog����~");
	}
	
	void view(){ //���� a,b�� �� ����ϴ� �޼���
		int a=10, b=20;
		System.out.println(a+" "+b);
	}
	
	void sogae(){
		String name="���̹�";
		int age=25;
		System.out.println("�̸�: "+name+"  ����: "+age);
	}
	
}
class TestMethod{
	
	void gonggo(String animal, String date){
		System.out.println(animal+"\n������:  "+date);
	}
	
	void monthDay(String date){
		int start=date.lastIndexOf("0");
		int last=date.indexOf("3");
		String day=date.substring(start,last+1);
		String[] answer=day.split("-");
		System.out.println(answer[0]+"�� "+answer[1]+"��");
	}
	
	void avg(int num1, int num2, int num3, int num4){
		int total=num1+num2+num3+num4;
		int avg=total/4;
		System.out.println("�� ����� ��� ����: "+avg+"��");
	}
	
}