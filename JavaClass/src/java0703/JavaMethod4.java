package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		//�޼��带 ���� ���� 10�� �޾� ����ϱ�
		
		ReturnMth re=new ReturnMth();
		
		int num=re.get();
		System.out.println(num);
		
		//�޼���κ��� �� ������ �� �޾� ���
		int result=re.sum();
		System.out.println(result);
		System.out.println();
		
		//���� ����ǥ�� �� �ڵ带 �ۼ��� �̸��� ���̰� ��µǵ���
		String userName=re.getName();
		int age=34;
		System.out.println(userName+" "+age+"��");
		System.out.println();
		
		//���� 89, ���� 78, ���� 50 �� ������ ������ ���ϴ� �޼���
		//�� ������ ����� ���ϴ� �޼���
		//�޼��� �� ���� ������ ����� ���
		int sum=re.total();
		float avg=re.avg(sum);
		System.out.printf("����: %d��\n���: %.1f��",sum,avg);
	}

}
/*
   
   �ֻ��� ����
   j���ذ� s������ �ֻ��� ������ ��
   �ֻ����� ����ü �ϳ�
   �ֻ��� ���� ū ����� �¸�
   
   �ֻ��� ���� ���ϴ� �޼���
   �ֻ��� �� ���� ���� �̰���� ����ϴ� �޼���
   
 */

class ReturnMth{
	
	int get(){
		return 10; //�޼��� ���� �����͸� ������ �巯���� ���ؼ� return(��ȯ��) �ʿ�
	}
	
	int sum(){
		int num1=30, num2=45;
		int result=num1+num2;
		return result;
	}
	
	String getName(){
		String name="�̼���";
		return name;
	}
	
	int total(){
		int kor=89, eng=78, mat=50;
		int result=kor+eng+mat;
		return result;
	}
	
	float avg(int total){
		float result=(total)/(float)3;
		return result;
	}
	
}