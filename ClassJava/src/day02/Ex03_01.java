package day02;

import java.util.Scanner;

/*
	����]
		���� 3���� ���Ƿ� �Է¹޾Ƽ� ������ �ϰ� �� ���� 
		���� ū ���� ����ϼ���.
		��, 3�� �����ڸ� ����ؼ� �ذ��ϼ���.
		
		(���ǽ�) ? ���ϰ���ȯ�� : �����ϰ�� ��ȯ��;
		
		* 3�׿����ڷ� �ذ��� �ߴٸ� if ������ �ذ��ϼ���.
		* if ~ else �������� ó���ϼ���.
 */

public class Ex03_01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ù ���� ���� :");
		int num1 =sc.nextInt();
		
		System.out.println("�� ���� ���� :");
		int num2 =sc.nextInt();
		
		System.out.println("�� ���� ���� :");
		int num3 =sc.nextInt();
		
		int result = (num1>num2)?num1:num2;
		int final_result = (result>num3)?result:num3;
		
		System.out.println("���� ū ���ڴ� : " + final_result + "�Դϴ�.");
		
	}

}
