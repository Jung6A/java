package java0628;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//�迭: ���� ������Ÿ�� �����Ͱ� ����Ǵ� ������ ���������� �Ǿ��ִ� ����
		//�迭�� ���� �� ������ Ÿ���� �����͸� ���� ����
		
		int[] a={10,20,30}; //java�� �迭�� �߰�ȣ
		System.out.println(a[0]+" "+a[1]);
		
		int b[]= {30,40,50};
		//�迭�� �߰�, ���� �� ���� �Ұ�
		System.out.println(Arrays.toString(b)); //������ Ȯ�ο�
		
		int[] arr=new int[10];
		// �迭 ���� 10�� ����
		int[] brr=new int[] {10,20,30,40};
		
		// int arr2=new int[]; ũ�� ���� �ʼ�, ����
		
		int size=15;
		int[] arr2=new int[size];
		System.out.println(Arrays.toString(arr2));
		
		//�迭 ���� ���: ������Ÿ��[]=new ������Ÿ��[ũ��];
		
		int[] money=new int[5]; //5���� intŸ�� ������ ���� �迭 ����
		money[0]=5000;
		money[1]=12000;
		money[2]=4000;
		money[3]=43000;
		money[4]=50000;
		
		for(int i=0;i<money.length;i++){
			System.out.println(money[i]+"��");
		}
		
	}

}
