package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		//����-�迭-����ü-Ŭ����
		//Scanner String Arrays
		/*
		   ��ȭ
		   class Movie{
		   		String ����;
		   		String �帣;
		   		String ����;
		   		int[] ������;
		   		int ������;
		   		long �� ����;
		   		
		   		�޼���: ��ü ���
		   		�޼���: ������ ���
		   } 
		 */
		//���ǵ� Ŭ���� Ÿ���� ���� ����. ������ ������ ������ ����
		//Ŭ���� Ÿ������ ������ ������ �Ǵ� �ν��Ͻ���� ��
		
		//Ŭ���� �ν��Ͻ� ����: ������ �޼���
		Member member1=new Member();
		Member member2=new Member();
		
		System.out.println(member1);
		
		member1.name="�̼���";
		member1.age=23;
		System.out.println(member1.name+"("+member1.age+"��)");
		
		member2.name="������";
		member2.age=34;
		System.out.println(member2.name+"("+member2.age+"��)");
		System.out.println();
		
		//java: 495p, �޸�����ȭ���: 893p
		Book book1=new Book();
		Book book2=new Book();
		
		book1.title="java";
		book1.page=495;
		book2.title="�޸�����ȭ���";
		book2.page=893;
		
		//����Ʈ�� ��ǰ��, �ü��, �޸�(ram) ũ�⿡ ����
		//������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ� �� ����, ��� (����Ʈ�� 3��)

		Phone flip=new Phone();
		Phone fold=new Phone();
		Phone apple=new Phone();
		
		flip.��ǰ��="������ Z �ø�5";
		flip.�ü��="android";
		flip.�޸�=512;
		
		fold.��ǰ��="������ Z ����5";
		fold.�ü��="android";
		fold.�޸�=512;
		
		apple.��ǰ��="������ 15 ����";
		apple.�ü��="iOS18";
		apple.�޸�=512;
		
		System.out.print(flip.��ǰ��+"\n�ü��: "+flip.�ü��+", �޸� �뷮: "+flip.�޸�+"GB");
		System.out.println();
		System.out.print(fold.��ǰ��+"\n�ü��: "+fold.�ü��+", �޸� �뷮: "+fold.�޸�+"GB");
		System.out.println();
		System.out.print(apple.��ǰ��+"\n�ü��: "+apple.�ü��+", �޸� �뷮: "+apple.�޸�+"GB");
		
	}

}

class Phone{
	String ��ǰ��;
	String �ü��;
	int �޸�;
}

class Book{ //å ����� ������ �� �����ϱ� ���� Ŭ���� ����
	String title;
	int page;
}

//Ŭ����: ���赵 / ��ü: ��ǰ
//Ŭ����: �ؾƲ / ��ü: �ؾ

class Member{ //Member��� �̸��� Ŭ���� ����
	String name; //�̸�
	int age; //����
	Member(){
		//Ŭ���� �����ϸ� ���� ������ �ʾƵ� Ŭ���� �̸����� �� �޼��尡 ������ (�����Ǿ ������ ����)
		
	}
}