package day11;

import java.util.*;

public class Test05 {
/*
	���������ϱ�
		==>	�Լ��� ���α׷��� ���� ���� ������ 
			�Ѱ��� �۾��� �ϱ� ���ؼ� ���� ���̴�.
			���� �Լ� �ȿ��� �۾��� �ϴٰ�
			���ܰ� �߻��� �ϸ�
			�� �Լ��� ���̻� ������ �ʿ䰡 ��������.
			�׷��� �Լ��� ���ܸ� ������ �� �ֵ���(�ٸ������� ���ѱ� �� �ֵ���)
			�� ���� ��찡 �ִ�.
			
			����]
				
				[����������] [�Ӽ�] ��ȯ�� �Լ��̸�(�Ű���������Ʈ) throws ����Ŭ����1, ����Ŭ����2, ... {
				
				}
			
			�ǹ�]
				������ ���ܰ� �߻��ϸ� �� �Լ��� ���̻� �����ص� �ǹ̰� �����Ƿ� ������ �����Ѵ�.
				
			*****
			���ܰ� ���̵� �Լ���
			�� �Լ��� ȣ���� ������ �ݵ�� ����ó���� ����� �Ѵ�.
			
			
			����]
				�Լ��� ���ܸ� �����ϴ� �Լ���
				����ó���� ���� �ʾƵ� �Ǵ� ��찡 �ִ�.
				
				�����ϴ� ���ܰ� RuntimeException �� ���� ������ ��쿡��
				����ó���� �ص� �׸� ���ص� �׸��̴�.
				(�ַ� java.lang �Ҽ� Ŭ������ �ִ� �Լ�����
					�̷� �Լ����� ���� �����Ѵ�.)
					
				�׷��� �� �� ������ �ϴ� ���� �����ϴ�.
 */
	
	public Test05() {
		int no = 0;
		System.out.println("1. ����ó����");
		
		no = getNum();
		
		try {
			int num = 100;
			System.out.println("2. try ����"); 
			no = getNum1();
			System.out.println("3. �Լ� ���� ��"); 
		} catch(Exception e) {
			System.out.println("���ܹ߻�"); e.printStackTrace(); 
		}
		
		System.out.println("######## no : " + no);
//		System.out.println("******* : " + num); try �� �ȿ��� ��������� ������ ���� �����̹Ƿ� �ۿ����� ��� ���Ѵ�.
	}

	public static void main(String[] args) {
		new Test05();
	}
	
	public int getNum(){
		int no = 0 ;
		System.out.println("*** �۾� �� ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���!");
		no = sc.nextInt();
		System.out.println("�۾���...");
		return no;
	}
	
	public int getNum1() throws Exception {
		int no = 0 ;
		System.out.println("*** �۾� �� ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���!");
		no = sc.nextInt();
		System.out.println("�۾���...");
		return no;
	}
}
