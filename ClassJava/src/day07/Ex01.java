package day07;

/*
	
	���ǹ� ����]
		1000 ~ 3000 �� ������ �⵵�� �����ϰ� �߻����Ѽ�
		�߻��� �⵵�� �������� ��������� �Ǻ��ؼ� ����ϼ���.
		
		����]
			���� - 	4�� ������ �������鼭 
					100���� ������ �������� �ʰ�
					400������ �������� ��
	------------------------------------------------------------------------------------
		�߰�]
			���׿����ڷ� �ذ��ϱ�
 */

import java.util.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���! : ");
		int year = sc.nextInt();
		
		String msg = "���";
		
		if(year % 400 == 0) {
			msg = "����";
		} else if(year % 100 == 0) {
			msg = "���";
		} else if(year % 4 == 0) {
			msg = "����";
		}
		
		System.out.println(year + " �⵵�� " + msg + " �Դϴ�.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
