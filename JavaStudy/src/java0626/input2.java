package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		
		/*
		 �ڵ� �ۼ� �� �ؾ� �� ��: ���� �ľ�, �䱸���� ����
		 
		 ���ڿ�: ""�� �ۼ�
		 ���ڿ��� String Ŭ���� Ÿ�� ���
		 
		 ����2
		 ���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է�
		 ������ 8%
		 �̸�, �μ�, �� ���¾� ���: ���� �� ��
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		String name1, name2, division1, division2;
		int pay1, pay2; 
		
		System.out.println("ù ��° ������ �̸�: ");
		name1=scan.next();
		System.out.println("ù ��° ������ �μ�: ");
		division1=scan.next();
		System.out.println("ù ��° ������ ����: ");
		pay1=scan.nextInt();
		System.out.println("�� ��° ������ �̸�: ");
		name2=scan.next();
		System.out.println("�� ��° ������ �μ�: ");
		division2=scan.next();
		System.out.println("�� ��° ������ ����: ");
		pay2=scan.nextInt();
		//���� ���
		float t, tax1, tax2;
		t=0.08f;
		tax1=pay1-(pay1*t);
		tax2=pay2-(pay2*t);
		System.out.printf("ù ��° ����\n�̸�: %s, �μ�: %s, ���� �� ���ɾ�: %.0f��\n",name1,division1,tax1);
		System.out.printf("�� ��° ����\n�̸�: %s, �μ�: %s, ���� �� ���ɾ�: %.0f��\n",name2,division2,tax2);
		
	}

}
