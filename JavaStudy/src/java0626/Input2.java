package java0626;

import java.util.Scanner;

public class Input2 {

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
		
		String name=null, division=null;
		int pay=0, salary=0;
		float t=0.08f;
		
		System.out.println("�̸�: ");
		name=scan.nextLine();
		System.out.println("�μ�: ");
		division=scan.nextLine();
		System.out.println("�� �޿���(�� ����): ");
		pay=scan.nextInt();
		salary=(int)(pay-(pay*t)); //��������ȯ
		System.out.printf("�̸�: %s\n�μ�: %s, ���� �� ���ɾ�: %d����\n", name,division,salary);
		//Integer.parseInt(scan.nextLine());  ���ڷ� ���� �� ������ ��ȯ�ϴ� �ļ�?
		
		scan.nextLine(); //�����Է�->���� �Է��� �� ��� ���̿� nextLine();���� \n ���� ����
		
		System.out.println("�� ��° ������ �̸�: ");
		name=scan.nextLine();
		System.out.println("�� ��° ������ �μ�: ");
		division=scan.nextLine();
		System.out.println("�� ��° ������ �� �޿���(�� ����): ");
		pay=scan.nextInt();
		salary=(int)(pay-(pay*t));
		System.out.printf("�̸�: %s\n�μ�: %s, ���� �� ���ɾ�: %d����\n", name,division,salary);
		
		//next();�� ����(\n) ���� ������ �ʾƼ� ���ۿ� ��� ���� -> ���߿� ������ ���� ���� ����
		//next();�� �� �Ŀ��� �� nextLine();���� \n ���� ���ִ� ���� ����
		//next(); �����̽�, tab, ���� Ű�� �Է� ����  nextLine(); ���� Ű�� �Է� ����
	}

}
