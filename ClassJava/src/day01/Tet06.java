package day01;

import java.util.*;
// �̹� ������ �������� Ŭ������ ����� ����ϰ� ���� ��� 
// �ش� Ŭ������ �������� ���
// ����]	import ��Ű�����.Ŭ�����̸�;  �Ǵ�    import ��Ű�����.*;


/*
	���� ]
		���ο� ������ ����(����)�� �Է¹޾Ƽ� �簢���� ���̸� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
		
		���]
			0. �������Լ� �غ��ϰ�
			1. �Էµ��� �غ��ϰ�
			2. �Է¹��� ������ �����ϰ�  X 2
			3. ����ؼ� ����ϰ�
			
 */
public class Tet06 {
	// 1. ������ �Լ� �غ��ϰ�
	public static void main(String[] args) {
		// 2. �Էµ��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 3. �Է°� �����ϰ� -- �ι�
		System.out.print("���� ���� : ");
		int garo = sc.nextInt();
//		System.out.println();
		System.out.print("���� ���� : ");
		int sero = sc.nextInt();
//		System.out.println();
		// 4. ����ϰ�
		int area = garo * sero;
		// 5. ����ϰ�
		System.out.println("���ΰ� " + garo + " , ���ΰ� " 
							+ sero + " �� �簢���� ���̴� " + area + " �Դϴ�.");
	
	}
}
