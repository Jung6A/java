package java0709_3;

interface RestCustomer{
	public void setCustomer(customer);
	public String food;
	
	public void setCustomer(String customer) {
		this.customer=customer;
	}
}

class ReserveCustomerA implements RestCustomer{
	String customer;
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
	@Override
	public String food() {
		return customer+" û���� ����";
	}
	
}//����մ� A
class ReserveCustomerB implements RestCustomer{
	String customer;
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
		System.out.println(cus.customer+" ������ �����Ѵ�.");
	}
}

public class Interface_text1 {
	
	Owner ow=new Owner();
	ReserveCustomerA a=new ReserveCustomerA();
	ReserveCustomerB b=new ReserveCustomerB();
	
	a.setCustomer("A-�̼���");
	b.setCustomer("B-�庸��");
	
	ow.food(a);
	ow.food(b);
	
}

//����� ��û ó�� Ŭ����- ��Ʈ�� Ŭ����
//����� ��û�� �ʿ��� ������ ���� �� ���������� Ŭ����- ���� Ŭ����, �������̽�
//�����͸� �����ϴ� Ŭ����- ����ڿ��� ������ ������ Ŭ����(VO, DTO)
//				   - �����ͺ��̽��� �����ϱ� ���� Ŭ����(Entity)
//�����ͺ��̽� ó�� �������̽�- repository(�������͸�)
//