package day01;

import java.util.*;

public class Test05 {
	/*
	 	��� �����
	 		����]
	 			final ������Ÿ�� ����̸�(�빮��) = ������;
	 */
	// ���̰�(3.14)�� ������ ��� PI�� ���弼��.
	static final float PI = 3.14f;
	/*
	final float PI;
	PI = 3.14f;
		==> ����� ������ ������ �Է��� ������� �ʴ´�.
			�ֳ��ϸ� ����� �����͸� ������ �� �����Ƿ�...
	*/
	
	
	/*
		�ܼ� ȯ�濡�� ������ �Է¹ޱ�
			Scanner Ŭ������ �ν��Ͻ��� ���� �Է¹޴´�.
			
		����]
			��ü ����� ���
				
				Ŭ�����̸� �����̸� = new Ŭ�����̸�();
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	���۷�������	+   �ν��Ͻ�   ==> ��ü
		
		System.out.println("���� �������� �Է��ϼ���. : ");
		int rad = sc.nextInt();
		int rad1 = sc.nextInt();
		
		// ���� ���� : ������ * ������ * 3.14
		float area = rad * rad * PI;
		System.out.println("�������� " + rad + " �� ���� ���̴� " + area + " �Դϴ�.");
		// ���� �ѷ� : 2 * ������ * 3.14
		float around = 2 * rad * PI;
		System.out.println("�������� " + rad + " �� ���� �ѷ��� " + around + " �Դϴ�.");
		
		System.out.println("rad1 : " + rad1);
		// ���� ���� : ������ * ������ * 3.14
		float area1 = rad * rad1 * PI;
		System.out.println("�������� " + rad1 + " �� ���� ���̴� " + area1 + " �Դϴ�.");
		// ���� �ѷ� : 2 * ������ * 3.14
		float around1 = 2 * rad1 * PI;
		System.out.println("�������� " + rad1 + " �� ���� �ѷ��� " + around1 + " �Դϴ�.");
	}
}
