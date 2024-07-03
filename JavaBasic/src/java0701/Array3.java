package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//�迭�� 20���� ���� ���� ���� (���� ���� 1~30)
		//�迭�� ����� ������ �� 5�� ����� ����� ����ϱ�
		
		int[] number=new int[20];
		for(int i=0;i<number.length;i++){
			number[i]=(int)(Math.random()*30)+1;
		}
		
		System.out.println(Arrays.toString(number));
		
		int count=0;
		for(int i=0;i<number.length;i++){	
			if(number[i]%5==0){
				count++;
			}
		}
		
		System.out.println("5�� ����� ������ "+count+"��");
		
		//�迭 ���� ���, �迭 ������ ���� ���, �迭�� ����� ������ ���� �Ǵ� ���
		
		
		//���� ���� �����
		//1. 25 ũ���� �迭 ����
		//2. �迭�� ���� ���� ����
		//3. �ߺ� ���� ����
		//4. 25�� ���� ȭ�� ���
		//5. ���� ����-���� ����(�Է�)
		//6. ������ ���� ��ġ�� ǥ��
		//7. �� �������� Ȯ��
		//8. ȭ�鿡 ���
		
		int[] bingo=new int[25];
		for(int i=0;i<bingo.length;i++){
			bingo[i]=(int)(Math.random()*50)+1;
			for(int k=0;k<i;k++){
				if(bingo[k]==bingo[i]){
					i--; break;
				}
			}
		}
		
		while(true) {
			//5�� 5ĭ ���
			for(int i=0;i<bingo.length;i++){
				if(i%5==0){
					System.out.println();
				}
				if(bingo[i]==0){
					System.out.printf(" %2c ", '��');
				}
				else{
					System.out.printf(" %2d ",bingo[i]);
				}
			}
			
			//���� ���� ����
			System.out.print("\n���� ���� �Է�: ");
			int num=scan.nextInt();
			
			//������ ���� ǥ��
			for(int i=0;i<bingo.length;i++){
				if(num==bingo[i]){
					bingo[i]=0; break;
				}
			}
			
			//�� �� ��������
			int ����=0, ����=0, �缱1=0, �缱2=0, end=0;
			
			for(int i=0;i<5;i++){
				for(int k=0;k<5;k++){
					if(bingo[i*5+k]==0){
						����++;
					}
					if(bingo[k*5+i]==0){
						����++;
					}
				}
				if(bingo[i*6]==0) �缱1++;
				if(bingo[i*4+4]==0) �缱2++;
				
				if(�缱1==5) end++;
				if(�缱2==5) end++;
				if(����==5) end++;
				if(����==5)end++;
				
				����=0; ����=0;
			}
			if(end==5){ //5�� ����
				System.out.println("5�� ���� �ϼ�!");
				break; //���ѷ��� ����
			}
		}
		
	}

}