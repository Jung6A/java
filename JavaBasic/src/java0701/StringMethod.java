package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		//�ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ���� ���
		//String Ŭ������ ���������� char �⺻ ������Ÿ���� �迭�� �����ǵ��� �Ǿ�����
		//char Ÿ������ ������ �迭�� ���� �迭�� ����
		//���α׷����� ���Ǵ� ������ �� 70% ���� ���ڿ� ������
		//���ڿ� ���� �޼���� ���� �� �ݵ�� ������ ��
		
		//���ڿ� ������ �����ϴ� ���
		String word="i like banana";
		
		//���ڿ� ��: ���� ���ڿ��ΰ�?
		//equals
		System.out.println("equals: "+(word.equals("i like orange")));
		
		//���ڿ� ���� ����
		System.out.println("contains: "+(word.contains("banana")));
		System.out.println("indexOf: "+(word.indexOf("orange")));
		
		//���ڿ� ��ġ��
		System.out.println(word+" ��ġ��");
		System.out.println(word.concat(" ��ġ��(concat)"));
		
		//Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
		System.out.println("indexOf b: "+word.indexOf("b"));
		System.out.println("lastIndexOf a: "+word.lastIndexOf("a")); //�ڿ������� ã��
		
		//���ڿ����� Ư�� ���� ����
		System.out.println("charAt: "+word.charAt(5));
		
		//Ű����� ���� �Է� �ޱ�(���ڿ���)
		System.out.print("���ĺ� �ϳ� �Է�: ");
		char alp=scan.nextLine().charAt(0); //���ڿ��� ù��° ���� �Է¹ޱ�
		System.out.println("�Է��� ����: "+alp);
		
		//���� �ڵ� �� �⺻ �����ڵ�: �ƽ�Ű�ڵ�
		//�ƽ�Ű�ڵ� ǥ�� �� 128�� ����. �ƽ�Ű�ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
		char ch='��';
		System.out.println("char ch ��(�����ڵ�): "+(ch+0));
		
		//���ڿ��� ����
		System.out.println("length: "+word.length());
		
		//��ҹ��� ��ȯ
		String �빮��=word.toUpperCase();
		String �ҹ���=word.toLowerCase();
		System.out.println("toUpperCase: "+�빮��);
		System.out.println("toLowerCase: "+�ҹ���);
		
		//���� ���� (���� ������ ������ �������� ���ϰ� �յ��� ���� ����)
		String word2="  i hate java ";
		System.out.println(word2);
		System.out.println("trim: "+word2.trim());
		
		//�� �޼��� �� ���� ���� ���Ǵ� �͵�
		//equals, contains
		
		//���ڿ� ����
		System.out.println("split: "+Arrays.toString(word.split(" ")));
		String name1="�̼���@������@������@";
		String[] names=name1.split("@");
		System.out.println(names[1]);
		//" "�� ������ �������� ���ڿ��� ������ �迭�� ����
		
		//���ڿ� �ڸ���(����)
		System.out.println("substring(2): "+word.substring(2));
		System.out.println("substring(6): "+word.substring(6));
		//������ �ε������� ���������� ���ڿ��� ����
		System.out.println("substring(2,6): "+word.substring(2,6));
		//substring(firstIndex, lastIndex); firstIndex���� lastIndex '��'������ ���ڿ�
		
		//���ڿ� ��ȯ
		String �ǻǻ�="�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ �ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
		String ����=�ǻǻ�.replace("�ǻǻ�","�׻׻�");
		//replace("�ٲ� ���ڿ�","�ٲ� ���ڿ�");
		System.out.println(����);
		����=����.replaceAll("�׻׻�", "�ѿ��");
		//replaceAll("�ٲ� ���ڿ�","�ٲ� ���ڿ�");
		System.out.println(����);
		
		//replaceAll������ ���� ǥ���� ��� ����(replace������ �Ұ�)
		/*
		   ����ǥ����
			   ^: ���ڿ� ����
			   $: ���ڿ� ����
			   .: ������ �� ����
			   *: �� ���ڰ� �ְų� ���ų�
			   		(*��: ���� ������ �ܾ�)
			   +: �� ���ڰ� �ϳ� �̻�
			   ?: �� ���ڰ� ���ų� �ϳ� ����
			   []: ������ �����̳� ����
			   {}: Ƚ�� �Ǵ� ����
			   (): �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
			   |: ���� �ȿ��� or ���� ����
			   \s: ���鹮��
			   \S: ���鹮�ڰ� �ƴ� ������ ����
			   \w: ���ĺ��̳� ����
			   \W: ���ĺ��̳� ���ڸ� ������ ����
			   \d: ����
			   \D: ���ڸ� ������ ��� ����
			   
		   ���ڿ����� ���ڸ� ����: replaceAll("[0-9]","")
		   ����ó: ^010-\d{4}-:\d{4}$
		   �ѱ۸� �ۼ� Ȯ��: ^[��-H]
		 */
		
		String a="abc73jd82kd74j";
		System.out.println(a.replaceAll("[\\d]","")); //Ư�������̱� ������ \�� �� �� �� �Է�
		System.out.println(a.replaceAll("[\\D]",""));
		
//		String bb="203";
//		int cc=Integer.parseInt(bb); //���ڿ��� ������ ��ȯ
		
		//����
		
		String str="�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]���Դϴ�";
		String name, ag;
		int age;
		
		//ȫ�浿�� ����
		int hong=str.indexOf("[");
		int dong=str.indexOf("]");
		
		//15�� ����
		int na=str.lastIndexOf("[");
		int ee=str.lastIndexOf("]");
		
		name=str.substring(hong+1,dong);
		ag=str.substring(na+1,ee);
		age=Integer.parseInt(ag);
		
		System.out.println(name);
		System.out.println(age);
		
	}

}