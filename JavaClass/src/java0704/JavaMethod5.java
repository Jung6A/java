package java0704;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
//		//�� ���� ���� ��ȯ
		MethodUtil util=new MethodUtil();
//		int[] num=util.twoNum();
//		System.out.println(Arrays.toString(num));
//		System.out.println();
//		
//		//�簢���� �ʺ�� ���̸� �����ϰ� ���̸� ���
//		//���̴� main �޼��忡�� ��µǵ���
//		int area=util.area(3,2);
//		System.out.println("�簢���� ����: "+area);
//		System.out.println();
//		
//		int area2=util.rectArea();
//		System.out.println("�簢���� ����: "+area2);
//		
//		//�α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
//		//login �޼��带 �����Ͽ� �α��� ���� ���
//		//���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���, �ϳ��� ����ġ �� �α��� ���� ���
//		//�α��� ���� ����� main �޼��忡��
//		
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
		//���� �� ���� Ű����� �Է� �޾� �Է��� �� ������ ���� 100�� ������ 100-��, 100�� ���� ������ �� ������ ���� ���
		//main �޼��忡�� ���
		
		int answer=util.three();
		if(answer>0){
			System.out.println("�� ���� ��: "+answer);
		}else{
			System.out.println("100-�� ���� ��: "+answer);
		}
	}

}

class MethodUtil{
	Scanner sc=new Scanner(System.in);
	
	int[] twoNum(){
		int num1=20;
		int num2=50;
//		int[] temp=new int[] {num1,num2};
		return new int[] {num1,num2};
		//return���� ��ȯ�� �� �ִ� ���� ���ϰ�
		//�ټ��� ���� �ϳ��� ��ȯ�� �� �ִ� ���� �迭��
	}
	
	int area(int num1, int num2){
		int width=num1, height=num2;
		int area=width*height;
		return area;
	}
	
	int rectArea(){
		int width=45, height=50;
		int area=width*height;
		return area;
	}
	
	boolean login(){
		System.out.print("���̵�: ");
		String id=sc.nextLine();
		System.out.print("��й�ȣ: ");
		String password=sc.nextLine();
		boolean isSuccess=true;
		if(id.equals("skyblue")) {
			if(password.equals("1234sea"))
				return isSuccess;
		}
		return isSuccess=false;
	}
	
	int three(){
		System.out.print("ù ��° ��: ");
		int num1=sc.nextInt();
		System.out.print("�� ��° ��: ");
		int num2=sc.nextInt();
		System.out.print("�� ��° ��: ");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		
		if(sum>100){
			int minus=100-sum;
			return minus;
		}
		return sum;
	}
	
}