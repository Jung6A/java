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
		System.out.println(arr[2]+brr[1]);
		
		// int arr2=new int[]; ũ�� ���� �ʼ�, ����
		
		int size=15;
		int[] arr2=new int[size];
		System.out.println(arr2[0]);
		
		//�迭 ���� ���: ������Ÿ��[]=new ������Ÿ��[ũ��];
		
		int[] money=new int[5]; //5���� intŸ�� ������ ���� �迭 ����
		money[0]=5000;
		money[1]=12000;
		money[2]=4000;
		money[3]=43000;
		money[4]=50000;
		
		//10000 �̻��� �� ���
		
		for(int i=0;i<money.length;i++){
			if(money[i]>=10000) {
				System.out.println(money[i]+"��");
			}
		}
		
		int[] Aclass=new int[3];
		Aclass[0]=89; Aclass[1]=78; Aclass[2]=93;
		int[] Bclass=new int[3];
		Bclass[0]=56; Bclass[1]=84; Bclass[2]=72;
		
		System.out.println("A�� ����: "+Arrays.toString(Aclass));
		System.out.println("B�� ����: "+Arrays.toString(Bclass));
		
		//A�ݰ� B���� ���� �� 80�� �̻� ���
		
		for(int i=0;i<Aclass.length;i++){
			if(Aclass[i]>=80){
				System.out.println("A�� "+Aclass[i]);
			}
			if(Bclass[i]>=80){
				System.out.println("B�� "+Bclass[i]);
			}
		}
		
		int[] first=new int[Aclass.length+Bclass.length];
		//������ �迭, ���� ���� �ε���, ������ �迭, ���� ��ġ �ε���, ������ ũ��
		System.arraycopy(Aclass,0,first,0,Aclass.length);
		System.arraycopy(Bclass, 0, first, 3, Bclass.length);
		
//		for(int i=0;i<Bclass.length;i++){
//			first[i]=Aclass[i];
//			first[i+3]=Bclass[i];
//		}
		
		System.out.print("1�г� ��� ����: ");
		for(int i=0;i<first.length;i++){
			if(first[i]>=80){
				System.out.print(+first[i]+" ");
			}
		}
		
		Arrays.sort(first); //�������� ����
		System.out.println(Arrays.toString(first));
		
		boolean same=Arrays.equals(Aclass,Bclass);
		System.out.println("A�� B�� ������ ������? "+same);
		
	}

}