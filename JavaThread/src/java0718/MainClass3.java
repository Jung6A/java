package java0718;

public class MainClass3 {

	public static void main(String[] args) {
		
		MeThread th1=new MeThread(2000,"��õ");
		MeThread th2=new MeThread(3000,"��õ");
		
		//������ ������ ����
		//main Ŭ�������� ���������� main Ŭ�������� ���� �Ұ� 
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		
		
	}

}
/*
  sleep(�и�������): ������ �ð���ŭ ���
  start(): ������ ����, run �޼��� ȣ��
  join(): �ش� �����尡 ���� ������ ���� ������ ���
  run(): �����尡 �����ϴ� �Լ�
  stop(): ������ �ߴ� (����� �������� ����)
  interrupt(): ������ �ߴ�
  serPriority(������): ������ �켱���� ���� (���� ���ڰ� �켱)
  getPriority(): ������ ������ �켱���� Ȯ��
  isAlice(): ���� �����尡 ����ִٸ� true, ����Ǿ��� ��� false
  
  suspend(): ������ �Ͻ�����, ��� ���� (����� �������� ����)
  resume(): �Ͻ������� ������ ���� (����� �������� ����)
  
  yield(): �ٸ� �����忡 ���� ���� �纸 �� ���(�Ͻ�����)
  notify(): ��� ���¿� �ִ� �����带 ���� ���� ��ȯ. ���� ��⿡ �ִ� ������� ���� ���·� ��ȯ
 */