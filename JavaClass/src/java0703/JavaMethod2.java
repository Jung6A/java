package java0703;

import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1=new Member("�̼���",31,"����");
		Member member2=new Member("������",29,"�������� ����");
		Member member3=new Member("�念��",45,"��������");
		//�¾ ��
		System.out.println("����");
		member1.birthYear();
		member2.birthYear();
		member3.birthYear();
		System.out.println();
		
		
		DataIdenti dataIdenti=new DataIdenti();
		//���ɴ�: 20��, 30��, 40��, 50��?
		System.out.println("���ɴ� ǥ��");
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		System.out.println();
		
		//�����з�: �������� �з��� ���� ǥ��
		System.out.println("���������ɷ�ǥ��(NCS)�� ���� ���� �з�");
		dataIdenti.jobGroup(member1.name, member1.job);
		dataIdenti.jobGroup(member2.name, member2.job);
		dataIdenti.jobGroup(member3.name, member3.job);
		System.out.println();
		
//		//��¥ ���� ���1
//		System.out.println(today.getYear());
//		��: .getYear();
//		��: .getMonthValue();
//		��: .getDayOfMonth();
//		����: .getDayOfWeek().getValue();  ������(1)~�Ͽ���(7)
		
//		//��¥ ���� ���2
//		Calendar cal=Calendar.getInstance(); //�߻�Ŭ����(Ŭ���� �����ܿ� Aǥ��): ��ü�� ���� �� ���� Ŭ����
//		int year=cal.get(Calendar.YEAR);
//		int month=cal.get(Calendar.MONTH)+1;
//		int date=cal.get(Calendar.DAY_OF_MONTH);
//		int day=cal.get(Calendar.DAY_OF_WEEK); //�Ͽ���(1)���� ����
//		Date today=new Date();
//		System.out.println(today.getYear()+1900); //Ŭ������ ĸ��ȭ, ���� ����  ��Ҽ�: ��� �������� ���� (������)
		
	}
	
}

class Member{
	String name; //�̸�
	int age; //����
	String job; //����
	//�⺻ ������ �޼���
	Member(){}
	//�Ű������� �ִ� ������ �޼���
	Member(String name,int age,String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	//�¾ �� ��� �޼���
	void birthYear(){
		//��¥ ���� ���3
		LocalDate today=LocalDate.now();
		int thisYear=today.getYear();
		//ȭ�� ���- �̼��� �¾ ��: 0000��
		int year=thisYear-this.age; //this: (Member Ŭ���� ��ü) 
		System.out.printf("%s: %d��\n",this.name,year);
	}
}
//��Ʈ�ѿ� Ŭ����, ���� ����� ���� Ŭ����, ������ Ŭ����
//Controller, Service, DTO(VO)

class DataIdenti{ //���ɴ�, ���� �з� �� ������ �з��� ���� Ŭ����
	void ageGroup(String name, int age){
		String group=null;
		group=(age/10)+"0��";
		System.out.println(name+"("+group+")");
	}
	void jobGroup(String name, String job){
		String ncs=null;
		//����-05. ����   ��������-15. ���   �����������-18. �����Ǻ�
		switch(job){
			case "����":
				ncs="05.�������������ҹ桤����������";
				break;
			case "�������� ����":
				ncs="18.�������Ǻ�";
				break;
			case "��������":
				ncs="15.���";
				break;
		}
		System.out.println(name+": "+job+"\n"+ncs);
	}
}

//�޼��峪 �Լ��� ����ϴ� ����
//�迭, ���, �ܼ� ���- �ݺ���
//�޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ������
//�޼��带 ���� ����ȭ�� ���α׷��� ����
