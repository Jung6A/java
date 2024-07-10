package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		int num=0;
		boolean is=true;
		
		do {
			try {
				System.out.print("���� �Է�: ");
				num=scan.nextInt();
				is=true;
				if(is) break;
			}catch(InputMismatchException i) { //�Ϻ� ������ import �ʿ�
				System.out.println("���� ���� ���ڰ� �ԷµǾ����ϴ�.");
			}finally { //finally: ����ó���� ���� ���ο� ������� ����
				scan.nextLine();
			}
		}while(is);
		
		System.out.println(num+100);
		
		System.out.print("�̸�: ");
		String name=scan.nextLine();
		System.out.println(name);
		
	}

}
