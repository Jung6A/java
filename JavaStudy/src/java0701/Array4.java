package java0701;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		//���� ���� �����͸� �ٷ� ���� �迭 ���
		//��Ȳ�� ���󼭴� �迭�� ���� �� �Ǵ� ��쵵 ������ ������ �迭�� ������ ������ ����
		
		//���� �迭 �����
		//���� �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
		
//		int[] a=new int[5];
//		a[0]=10; a[1]=20; a[4]=40;
//		System.out.println(Arrays.toString(a));
//		a=new int[7];
//		a[5]=100;
//		System.out.println(Arrays.toString(a));
		
//		int[] num=new int[] {10,20,30,40,50};
//		System.out.println("ũ�� ���� ��: "+Arrays.toString(num));
//		
//		//num[5]=60; �ε��� ���� ��� ����
//		//�����͸� �߰��� �����Ϸ��� �迭�� ũ�⸦ �÷��� ��
//		int size=num.length; //���� �迭�� ũ��
//		
//		int[] temp=new int[size+1];
//		for(int i=0;i<size;i++){
//			temp[i]=num[i];
//		}
//		
//		num=temp;
//		num[5]=60;
//		System.out.println("ũ�� ���� ��: "+Arrays.toString(num));
		
		//���ڿ����� ���� �񱳴� .equals()
		//���ڿ��� Ư�� ���ڳ� ���ڿ� ���� ���� Ȯ���� .contains()
		//���� �ּ��� ��ȭ�� �ּҸ� �����Ͽ� �迭�� ����
		//�迭�� �� ����Ǿ����� Ȯ�� ����� Arrays�� �̿��� ���
		
		String[] addr=new String[] {
				"���� �߱� ��ȭ�� 25", "���� �߱� ��ȭ�� 92", "���� ���� �л굿 111", "���� ���� �л굿 1023", "���� ������ ������ 93",
				"���� �߱� ���ﵿ 932", "���� ���� ���絿 945", "���� �߱� ��ȭ�� 1234", "���� �߱� ���ﵿ 23", "���� �߱� ��ȭ�� 984"
		};
		int seon=0;
		for(int i=0;i<addr.length;i++){
			if(addr[i].contains("��ȭ��")){
				seon++;
			}
		}
		
		String[] temp=new String[seon];
		
		int k=0;
		for(int i=0;i<addr.length;i++){
			if(addr[i].contains("��ȭ��")){
				temp[k]=addr[i];
				k++;
			}
		}
		addr=temp;
		
		System.out.println(Arrays.toString(addr));

	}

}
