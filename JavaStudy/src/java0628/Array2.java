package java0628;

import java.util.Scanner;

public class Array2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//���� �迭�� �����ϴ� ������ �ǸŰ��� �Է��Ͽ� ����
		//���� �迭�� ����� �ǸŰ��� ���հ� ��� ����
		int[] snack=new int[5];
		for(int i=0;i<snack.length;i++) {
			System.out.println("���� ����: ");
			snack[i]=scan.nextInt();
		}
		int sum=0, avg=0;
		for(int k=0;k<snack.length;k++) {
			sum=sum+snack[k];
		}
		avg=sum/(snack.length);
		System.out.println("���� ������ ��: "+sum+"��\n���� ���� ���: "+avg+"��");
	}

}
