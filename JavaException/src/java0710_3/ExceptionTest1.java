package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
			String name=null;
			String a="aaa";
			String b="bb";
			String c=null;
			name.length();
			a.length();
			b.length();
			c.length();
			
			System.out.println(10/0);
			
		}catch(NullPointerException n) {
			
			n.printStackTrace(); //�����޽��� Ȯ��: �׽�Ʈ��
			
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			System.out.println("���ڿ��� �Էµ��� �ʾҽ��ϴ�");
			
		}catch(Exception e) { //�ý������� ���� ������ catch�� ����
			//catch(�߻��ϴ¿��� �����Ǻ���)
			//�� ���: �ֻ��� Exception���� ��� ���� Ŀ�� ����
			System.out.println("0���δ� ���� �� �����ϴ�"); //å 458������
		
		}
		
		System.out.println(" ���Ⱑ ���α׷� ��");
		
	}

}
/*
	����ó��
	  ���α׷� ���� �� ���� �߻��� ��� ���α׷� ����
	    ����ó���� ������ �߻��ص� ���α׷��� ������� ����
	  ����ڰ� �߸��� ���� �Է��ϴ� ��� �˷��� �� ����
	  ������ ������ �ذ��ϴ� ����� �ƴ�, ȸ�� ���
*/