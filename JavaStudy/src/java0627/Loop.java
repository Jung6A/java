package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		//�ݺ���: for, while, do~while
		//for(�ʱⰪ;���ǽ�;������){�ݺ� ����}
		//���ǽ��� ������ �� ������ {}�� ������ ��� �����
		//�ʱⰪ �� ���ǽ� �� �� true �� {}���� �� ������ �� ���ǽ� �� �� �� �� false �� ����
		
//		for(int i=1;i<=3;i++){
//			System.out.println(i+"ȸ��");
//		}
//		
//		//�迭 �ݺ� for���� ����
//		//for(int i=�迭.length;i>=0;i--){�ݺ�����} �ΰ�?
//	
//		for(int i=1;i<=17;i++){
//			System.out.println("�ơ� �ݺ����� "+i);
//			i++;
//		}
		
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
		
//		int num=1;
//		for(int a=1;a<4;a++){
//			num+=a;
//			System.out.println(num);
//		}
//		
//		//1���� �Է��� ���ڱ����� ����
//		
//		
//		System.out.print("���� �Է�: ");
//		int sum=0;
//		num=scan.nextInt();
//		for(int i=1;i<=num;i++){
//			sum+=i;
//		}
//		System.out.println("1���� "+num+"������ ������ ��: "+sum);
//		
//		//�ݺ����� �ۼ��Ϸ��� �� �� �ݺ��Ǵ���, ���� ����Ǿ�� �ϴ��� �ݺ����� ��������� ���� �����ص־� ��
//		//for, while, do~while�� ��� ���� �ݺ��� ������ �ϴ����� ã�� ���ϸ� �ۼ��� �� ���� (���� ����, ���� Ƚ�� �ݺ��̵�)
//		
//		for(;true;){
//			System.out.print("���� �Է�: ");
//			int n=scan.nextInt();
//			if(n==0) break;
//		}
		
//		int n=1;
//		for(;n!=0;){
//			System.out.print("���� �Է�: ");
//			n=scan.nextInt();
//		}
//		
//		for(;true;){
//			System.out.print("���� �Է�: ");
//			n=scan.nextInt();
//			if(n==0) return;
		
		//���� ���� ���� ���
		//1. if���� ���ǽ��� ���� �Ǹ� break ����
		//2. for(;���ǽ�;)
		//3. return; �ݺ��� �ڵ尡 �ִ� �޼��带 ������� �ݺ����� �����
			//break;: �ݺ���, switch�� ��� ����, if�� �ܵ����δ� break �Ұ�
			
		//continue;: �ݺ��� ���� �� ���� �ݺ������� �̵���Ŵ
		
//		for(int i=1;i<=10;i++){
//			System.out.println(i+"��° �ݺ� ����");
//			if(i%3==0)
//				continue;
//			System.out.println(i+"��° �ݺ� ���� ��");
//			System.out.println(i+"��° �ݺ� ������ ����");
//		}
		
		//�ڹ��� ������ ���
//		int random=(int)Math.floor(Math.random()*10)+1; //��������ȯ
		//���� �� ��� ��� �������� 11�� ����� ��� �ݺ��� ����
		
		for(;true;){
			int random=(int)(Math.random()*55)+1;
			System.out.println("���� ���� "+random);
			if(random%11==0) break;
		}
		
		//up&down: ��ǻ�Ͱ� ������ ���� ������
		//��ǻ�� ���� ���ڴ� �������� (�������� 20~100)
		//��ǻ�Ͱ� ������ ���ڰ� 74�� ��� ���� �Է��� ���ڰ� 40�� ��� up, 80�� ��� down
		
//		int ran=(int)(Math.random()*81)+20;
//		for(;true;){
//			System.out.print("���ڴ�? ");
//			int user=scan.nextInt();
//			if(user>100|user<20){
//				System.out.println("������ ������ 20~100�Դϴ�.");
//			}else if(user==ran){
//				System.out.println("�����Դϴ�.");
//				break;
//			}else if(user>ran){
//				System.out.println("DOWN");
//			}else{
//				System.out.println("UP");
//			}
//		}
		
		//�̸��� �ִ� �ݺ���
		
		int sum=0;
		
		���ϱ�: //for���� �̸�
		for(int i=1;i<=10;i++){
			System.out.println(i);
			for(int k=1;k<=4;k++){
				if(sum+k>=40) break ���ϱ�; //���ϱ��� �̸��� for�� break;
				sum=sum+k;
				System.out.println("   "+k);
			}
			sum=sum+i;
		}
		if(sum<40){
			System.out.println("sum ���: "+sum);
		}
		
		//�轺Ų���31
		//��ǻ�Ϳ� ���� ���� �ѹ��� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		//31�� �Է��ϸ� �й�
		
		int num=1;
		
		baskin:
		for(;;){ //while(true)
			System.out.print("���� �� ��?: ");
			int user=scan.nextInt();
			System.out.print("��: ");
			for(int u=1;u<=user;u++){
				System.out.print(num+" ");
				if(num==31) break baskin;
				num++;
			}
			System.out.println();
			
			int com=(int)(Math.random()*3)+1;
			System.out.print("com: ");
			for(int c=1;c<=com;c++){
				System.out.print(num+" ");
				if(num==31) break baskin;
				num++;
			}
			System.out.println();
		}
			
	
	}

}
