package java0712_3;

public class LinkedList2 {
	Node head=null; //ù ���
	Node tail; //������ ���
	
	void add(int n) { //�� ������ ����
		Node temp=new Node(n);
		if(head==null) {
			head=temp;
			tail=temp;
		}else{
			tail.next=temp;
			tail=temp;
		}
	}
	
	void remove(int index) { //������ ��ġ ������ ����
		
	}

	@Override
	public String toString() { //��ü ���
		String out="[";
		Node move=head;
		while(move!=null) {
			out+=move.num+", ";
			move=move.next;
		}
		out=out.substring(0, out.length()-2);
		out+="]";
		return out;
	}
	
	int get(int index) { //������ ��ġ�� ������ ���
		return 0;
	}
	
}

//�� ������ ����: add
//������ ����: remove
//��ü ���: toString
//������ �ϳ� ���: get