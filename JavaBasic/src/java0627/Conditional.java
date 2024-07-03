package java0627;

import java.util.Scanner;

public class Conditional {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		//���ǹ�: if, switch
		//�ݺ���: for, while, do~while
		
		//if���� ���ǽ�: �񱳿����ڿ� �������ڷ� ���� ����
		//            ���� ������ ���� �� �ִ� ��
		//Ű�� 150�̻��̴�.  Ű>=150;
		//10���� ���⳻��    ��ü���⳯¥ ��==10;
		//32000�� �̻��� ���� ����   �����>=32000;
		//�Ǹ� ���� ��ǰ�� ���  ��ǰ����==�Ǹ�;, ������>0;
		
		int tall=135;
		if(tall>=150){
			//Ű�� 150 �̻��̶�� ������ �� ������
		} else{
			//Ű�� 150 �̻��� �ƴ϶�� ������ ����
		}
		
		//���� �հ� ����: �հ�(60�� �̻�), ���հ�(60�� �̸�)
		
		int score=72;
		if(score>=60){
			System.out.println("�հ�");
		}else{
			System.out.println("���հ�");
		}
		
		//if~else: ���ǽ��� ��, ������ ���� ����Ǵ� ������ �ٸ� ���
		//�ϳ��� ���ǿ� �� ���� ������ �ִ� ��� if~else ������ �ۼ�
		
		//���� ���� ��� A>=90, B>=80, C>=70, D
		
		score=89;
		if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
		
		//switch: ���������� case�� �����Ͽ� case�� ���� ��ġ�� ��� �ߵ��Ǵ� ���ǹ�
		//����Ű wasd, p �Ͻ�����, o ����ϱ� i�� ó������ �ϱ�
		//ctrl+s�� ���� ����
		
		
		/*
		   switch(menu){
			case "open": 
			case "save": 
			case "build": 
			case "git": 
			case "exit": 
		}
		*/
		//���ǽ��� == ������ ���� switch�� �ۼ� ���
		
		//���� ��ư: ���� ���� ���� ��ư: ���� ���� ��ư: ����
		
		String button="����";
		
		switch(button){
			case "����":
				System.out.println("���� ����");
				break;
			case "�ڵ�����":
			case "����":
				System.out.println("���� ����");
				break;
			case "����":
				System.out.println("���� ����");
				break;
		}

		//���ο� ���� ���̸� Ű����� �Է�(���� �Ű�x)
		//���ο� ������ ���̰� �ٸ��� ���簢��, ���ο� ������ ���̰� ������ ���簢���̶�� ���
		//switch������ (if x)
		int width=0, height=0;
		System.out.println("������ ����: ");
		width=scan.nextInt();
		System.out.println("������ ����: ");
		height=scan.nextInt();
		int res=width-height;
		
		switch(res){ //���ǹ��� ������ int Ÿ���̶� case�� �̿��� ������ �Ұ���
			case 0:
				System.out.println("���簢��");
				break;
			default:
				System.out.println("���簢��");
				break;
		}
		//switch������ default�� �� ���� ���. switch�� ���� ���� ��� case�� ��ġ���� �ʴٸ� default�� ����
	}

}