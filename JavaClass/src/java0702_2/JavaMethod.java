package java0702_2;

public class JavaMethod {

	public static void main(String[] args) {
		//Ŭ���� �޼��忡���� ���� Ŭ���� ������ Ŭ���� �޼��常 ����
		//�޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ����� ���� �̷������ ������ �ν��Ͻ� ������ �ν��Ͻ� �޼���� �Ұ�
		
		output();
		JavaMethod ja=new JavaMethod();
		ja.output();
	}
	
static void output(){
	System.out.println("���� �޼����Դϴ�.");
}

class a{
	int num=10;
	
	void out(){
		System.out.println("���� �޼����Դϴ�.");
	}
}
	
}
//main �޼��� �� JVM���� ���� ���� �����ϴ� �޼ҵ�. �ʼ�
//JVM(java virtual machine, �ڹ� ���� �ӽ�): �ü�� �������� �����ϱ� ���� ������ ��ǻ�� ȯ��


//�ڹ� �޼���
//��ȯŸ�� �޼��� �̸�(�Ű�����){ �޼��� ���� }

//��ȯŸ��- int, short, float, double, char, boolean, void, String ��
//		 �޼����� return ������ Ÿ��
//	return 10; �� ��ȯ Ÿ�� int, short, long
//	return income; �� income ������ Ÿ���� ��ȯ Ÿ������

//void Ÿ���� ��ȯ���� ���ٴ� �ǹ�

/*
    �ֹε�Ϲ�ȣ�� �������� �������� ����
    String gender(String jumin){
    
    	jumin.substring(7,8);
    	if(gen.equals("1")||gen.equals("3")){
    		returns "����";
    	}else if(gen.equals("2")||gen.equals("4")){
    		returns "����";
    	}
    	
    }
 */