package day02;

import java.util.*;

/*
	����]
		���� 3���� ���Ƿ� �Է¹޾Ƽ� ������ �ϰ� �� ���� 
		���� ū ���� ����ϼ���.
		��, 3�� �����ڸ� ����ؼ� �ذ��ϼ���.
		
		(���ǽ�) ? ���ϰ���ȯ�� : �����ϰ�� ��ȯ��;
		
		* 3�׿����ڷ� �ذ��� �ߴٸ� if ������ �ذ��ϼ���.
		* if ~ else �������� ó���ϼ���.
 */

public class Ex03_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = scan.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan.nextInt();
		
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int num3 = scan.nextInt();
		
		if(num1 > num2 & num1 > num3) {
			System.out.println(num1);
		}
		else {
			if(num2 > num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}
	}

}
