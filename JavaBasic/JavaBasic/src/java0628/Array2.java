package java0628;

import java.util.Scanner;

public class Array2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		//���� �迭�� �����ϴ� ������ �ǸŰ��� �Է��Ͽ� ����
//		//���� �迭�� ����� �ǸŰ��� ���հ� ��� ����
//		int[] snack=new int[5];
//		for(int i=0;i<snack.length;i++) {
//			System.out.println("����"+(i+1)+" ����: ");
//			snack[i]=scan.nextInt();
//		}
//		int total=0, avg=0;
//		for(int k=0;k<snack.length;k++) {
//			total=total+snack[k];
//		}
//		avg=total/snack.length;
//		System.out.println("���� ������ ��: "+total+"��\n���� ���� ���: "+avg+"��");
		
//		//6���� Ű�� tall �迭�� ����, 175 �̸��� ���
//		
//		float[] tall=new float[] {173.4f,175.1f,169.5f,181.4f,178.8f,185.3f};
//		
//		for(int i=0;i<tall.length;i++){
//			if(tall[i]<175){
//				System.out.println(tall[i]);
//			}
//		}
		
//		//name �迭�� ���ڿ� �� �̼���, ������, ������, �ֿ��� ���ߴ� �迭�� �����ϰ� ���
//		
//		String[] name=new String[]{
//			"�̼���","������","�庸��","�̼���","������","������","�ֿ�","�縸��"	
//		};
//		String[] foward=new String[4];
//		
//		System.arraycopy(name, 3, foward, 0, 4);
//		System.out.println(Arrays.toString(foward));
		
		String word="i like banana";
		
		//���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġ ã��: indexOf
		System.out.println(word.indexOf("like")); //��ü���� indexOf ��� ����
		//���ڿ����� Ư�� ���ڳ� ���ڿ��� ���� ����-true, false: contains
		System.out.println(word.contains("orange"));
		
//		String[] name=new String[]{
//				"������", "�Ѽ���", "�縸��", "������", "������", "�����", "�̼���", "�̻��", "�̻��", "�����"
//		};
//		
//		System.out.println("�̸� �˻�: ");
//		String search=scan.nextLine();
//		
//		System.out.print("�˻� ���: ");
//		for(int i=0;i<name.length;i++){
//			if(name[i].contains(search)){
//				System.out.print (name[i]+" ");
//			}
//		}
		
		//���� �˻��Ͽ� ���� �̸��� �ݾ� ���
		//ī�� �迭�� ���� ���� �˻��� '�˼��մϴ�. �غ� ���Դϴ�'��� ���
		
		String[] cafe=new String[]{
			"�Ƹ޸�ī��: 2000��","ȭ��Ʈ �Ƹ޸�ī��: 2800��","ī���: 3000��","��ü��: 3800��","ī���ī: 3800��","���� �ֽ�: 4000��",
			"���� ���̽�Ƽ: 2900��","������ ���̽�Ƽ: 2800��","�ڵ� ���̽�Ƽ: 2800��","���ڿ��̵�: 3500��","������̵�: 3500��","û�������̵�: 3500��"	
		};
		
		System.out.print("ī�� ���� �˻�: ");
		String search=scan.nextLine();
		
		System.out.println("�˻� ���: ");
		
		boolean isDrink=true;
		for(int i=0;i<cafe.length;i++) {
			if(cafe[i].contains(search)){
				System.out.println(cafe[i]);
				isDrink=false;
			}
		}
		if(isDrink){
			System.out.println("�˼��մϴ�. �غ� ���Դϴ�.");
		}
		
	}

}
