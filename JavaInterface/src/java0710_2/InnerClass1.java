package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out=new Out();
		out.num=100;
//		out.obj.age=34;
//		out.obj.setName("�̼���");
//		
//		Out.�ν��Ͻ�����Ŭ���� in=out.new �ν��Ͻ�����Ŭ����();
//		in.age=20;
//		in.setName("������");
		
	}

}

//static���� ���� �� ������ ������ �޼���� �ν��Ͻ� �޼��忡�� ��� ����
//�ν��Ͻ� ����, �޼���� static �޼��忡�� ��� �Ұ�

//static�� ���α׷� ���� �� ������

class Out {
	static int count; //Ŭ���� ����
	int num; //�ν��Ͻ� ����
	private String job; //�ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj=new �ν��Ͻ�����Ŭ����();
	
	interface Car{ //���� �������̽�
		void make();
	}
	void makeCar() {
		Car c=new Car() { //�������̽��� ���� ��ü�� ���� �͸� Ŭ����
			@Override
			public void make() {
				System.out.println("�͸� Ŭ������ ���� �����");
			}
		};
		c.make();
	}
	
	void buyComputer() {
		class ����Ŭ����{ //�޼��� ������ Ŭ����: ���� Ŭ����. �޼��尡 ����Ǹ� ����, ������ ������ �����
			int weight; //���� Ŭ���� ������ ����, �޼���� Ŭ������ ���Ե� �޼��� ���ο����� ��� ����
			void del() { //���� Ŭ�������� �����ڸ� ���� �� ����
				
			}
		}
		����Ŭ���� ob=new ����Ŭ����(); //���� Ŭ������ ��ü�� �޼��� ���ο����� ���� ����
	}
	
	static void save() {}
	static class ����Ŭ����{ //Ŭ���� ��ü�� static Ŭ�����̹Ƿ� static ����, �޼��� ���� ����
		static int birth;
		static void update() {}
	}
	
	private class �ν��Ͻ�����Ŭ����{ //private Ŭ���� �ܺο��� ����� �� ����
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
//		static void create() {
//			count=10;
//		}
		
	}
}

/* 
���� Ŭ����: Ŭ���� ���ο����� ��� ������ Ŭ���
	1. �ν��Ͻ� ���� Ŭ����
	2. ���� ���� Ŭ����
	3. ���� ���� Ŭ����
	4. �͸� ���� Ŭ����
 */