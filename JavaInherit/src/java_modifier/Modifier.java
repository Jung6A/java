package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book1=new Book();
		book1.setTitle("JAVA �Ӽ�");
		book1.setAuthor("������");
		book1.setPage(786);
		
		System.out.println(book1.getTitle());
		
		Book book2=new Book("JAVA, ��, ������","�̺���",564);
		System.out.println(book2);
		
	}

}
/*
	Ŭ����
		����, �޼���
		�ν��Ͻ�, Ŭ����
		������ �޼���
		���� �ʱ�ȭ
		�����ε�
		�������̵�
		���
		������
		������
		�߻�ȭ
		�������̽�
		���� Ŭ����(�͸� Ŭ����, ���� Ŭ����)
		������
	
	�÷���: �ڷ� ������ �˰���
		collection, List, Map, Set
		ArrayList, Vector, LinkedList
		Queue, stack, HashSet, TreeSet
		HashMap, TreeMap ��
		
	���׸�
	�������̼�
	��Ʈ��
	������
	JAVA �⺻ ��
	��JSP- ���尴ü, MVC(Model-������ View-ȭ�� Control-����) ����
	�潺���� �����ӿ�ũ- ��������Ʈ
	��MVC ���� �氣���� ���θ� ����Ʈ
	��������Ʈ(��) �� ������Ʈ
 */