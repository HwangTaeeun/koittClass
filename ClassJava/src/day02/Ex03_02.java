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

public class Ex03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���δٸ� �� �� �ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int ans=num1;
		if(ans<num2) {
			ans=num2;
		}
		if(ans<num3) {
			ans=num3;
		}
		System.out.println("���� ū �� �ڴ� : "+ans+" �Դϴ�.");
		
	}

}
