package day02;

/*
	Method �ۼ���
		
		����]
			[����������] [�Ӽ�] ��ȯ�� �Լ��̸�(�Ű���������Ʈ){
			
			}
			
			�Ű���������Ʈ : �Լ��� ������ �� �� �Է��ؾߵǴ� �����͵��� ���¿� �����̸�
			
			��]
			
			** �ۼ�
			public int getSum(int num1, int num2){
				int sum = num1 + num2;
				return sum;
			}
			
			public float getSum(float num1, float num2){
				float sum = num1 + num2;
				return sum;
			}
			
			** ����
			int result = getSum(5, 3); ==> float num1 = 5; float num2 = 3;
			
			
			***
			�Լ��� ���鶧 ���� ����ؾ� �Ǵ� ������
			1. ��ȯ���� Ÿ���� ���� �Ұ��ΰ�???
			2. �Լ��̸��� ���� �� ���ΰ�???
			3. �� �Լ��� ����ɶ� �Է������ �ϴ� �����͵��� � �͵��� �ִ°�???
			
			
			
			����]
				�Լ�����	- 	����������, �Ӽ�, ��ȯ��Ÿ��, �̸�, �Ű���������Ʈ ������ �̾߱��Ѵ�.
 */

/*
	����]
		;   - ��ū�� ����Ű�� ��ȣ...
				��ū - �ϳ��� ��� ����...
				
		�ϳ��� ����� ������ �ٿ��ִ� ���� ��Ģ�̴�.
		
		������ �����ϴ� ���� {} �� ������ ���� {} ;�� ������ ����Ѵ�.
 */

import java.util.*;

public class Test06 {
/*
	����]
		�μ��� �Է¹޾Ƽ�
		�μ��� ���� �����ִ� �Լ��� �ۼ��ϰ� �����ϼ���.
		���� ��µǰ� �ϼ���...
 */
	public static void main(String[] args) {
		// �Է¹��� �����ͷ� �Ʒ� �Լ� toPrint() ȣ���ϰ�
		
		new Test06().toPrint();
	}
	
	public void toPrint() {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		// �޼��� ����ϰ� �Է¹ް� x 2
		System.out.print("ù��° ���� : ");
		int no1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int no2 = sc.nextInt();
		
		System.out.println(no1 + " �� " + no2 + " �� ���� " + (no1 + no2) + " �Դϴ�.");
	}
}
