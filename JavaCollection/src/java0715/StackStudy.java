package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
//		Stack<String> st=new Stack<>();
//		
//		st.add("�̼���");
//		st.push("������"); //������ ���� �޼���
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		
//		System.out.println(st);
//		System.out.println(st.pop()); //���&����
//		System.out.println(st);
//		System.out.println(st.search("������"));
//		
//		System.out.println(st.size()); //������ ������, ��ü ������ ����
//		//st.size()-st.search("������") pop �޼��� ���� Ƚ��
//		
//		System.out.println(st.isEmpty()); //����ִ��� �ƴ���: ��� �ִٸ�  true, ��� ���� �ʴٸ� false
		
		Stack<String> pre=new Stack<>();
		Stack<String> back=new Stack<>();
		String now="���̹�";
		
		while(true) {
			System.out.print("�̵� ������ �Է� (1.�� 2.��): ");
			String temp=sc.nextLine();
			if(temp.equals("1")&&!back.isEmpty()) { //���� ������ �̵�
				pre.push(now); //���� �������� ���� ���ÿ� ����
				now=back.pop();
			}else if(temp.equals("2")&&!pre.isEmpty()) { //�� ������ �̵�
				back.push(now);
				now=pre.pop();
			}else if(!(temp.equals("1")||temp.equals("2"))){ //�� ������ �̵�
				back.push(now);
				pre.clear();
				now=temp;
			}
			System.out.println("���� ������: "+now);
			System.out.println("���� ������ ���: "+back);
			System.out.println("�� ������ ���: "+pre);
			System.out.println();
		}
		
	}

}
/* 
 stack
 	�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����
 	�� ���� ���� ����� ����� �̷������ ����
 	FILO-first in last out
	
 */