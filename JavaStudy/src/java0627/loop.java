package java0627;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		//�ݺ���: for, while, do~while
		//for(�ʱⰪ;���ǽ�;������){�ݺ� ����}
		//���ǽ��� ������ �� ������ {}�� ������ ��� �����
		//�ʱⰪ �� ���ǽ� �� �� true �� {}���� �� ������ �� ���ǽ� �� �� �� �� false �� ����
		
		for(int i=1;i<=3;i++){
			System.out.println(i+"ȸ��");
		}
		
		//�迭 �ݺ� for���� ����
		//for(int i=�迭.length;i>=0;i--){�ݺ�����} �ΰ�?
	
		for(int i=1;i<=17;i++){
			System.out.println("�ơ� �ݺ����� "+i);
			i++;
		}
		
//		for(int i=10;i>0;i--){
//			System.out.println(i);
//		}
		
//		int num=1, a=1;
//		num=num+a;
//		System.out.println(num); //2
//		a++;
//		num=num+a;
//		System.out.println(num); //4
//		a++;
//		num=num+a;
//		System.out.println(num); //7
//		a++;
		
		int num=1;
		for(int a=1;a<4;a++){
			num+=a;
			System.out.println(num);
		}
		
		//1���� �Է��� ���ڱ����� ����
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int sum=0;
		num=scan.nextInt();
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("1���� "+num+"������ ������ ��: "+sum);
	}

}
