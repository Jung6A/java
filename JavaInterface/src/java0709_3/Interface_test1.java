package java0709_3;

interface RestCustomer{
	public void setCustomer(String customer);
	public String food();
	
}

class ReserveCustomerA implements RestCustomer{
	String customer; // ���� �մ�

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" û���� ����";		
	}
} //����մ� A
class ReserveCustomerB implements RestCustomer{
	String customer; // ���� �մ�
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" ������ ����";		
	}
} //����մ� B

class Owner{ //����
	void food(RestCustomer cus) {
		System.out.println(cus.food());
	}
}

public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow=new Owner();
		ReserveCustomerA a=new ReserveCustomerA();
		ReserveCustomerB b=new ReserveCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
	}

}

//����� ��û ó�� Ŭ����- ��Ʈ�� Ŭ����
//����� ��û�� �ʿ��� ������ ���� �� ���������� Ŭ����- ���� Ŭ����, �������̽�
//�����͸� �����ϴ� Ŭ����- ����ڿ��� ������ ������ Ŭ����(VO, DTO)
//				   - �����ͺ��̽��� �����ϱ� ���� Ŭ����(Entity)
//�����ͺ��̽� ó�� �������̽�- repository(�������͸�)
//