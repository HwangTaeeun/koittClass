package day07;

import java.util.Scanner;

/*
	
	���ǹ� ����]
		1000 ~ 3000 �� ������ �⵵�� �����ϰ� �߻����Ѽ�
		�߻��� �⵵�� �������� ��������� �Ǻ��ؼ� ����ϼ���.
		
		����]
			���� - 	4�� ������ �������鼭 
					100���� ������ �������� �ʰ�
					400������ �������� ��
	
 */
public class Ex01_01 {

	public Ex01_01() {
		System.out.println("���� �Է�");
		Scanner sc= new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%400==0) {
			System.out.println(year+"�� ����");
		}else {
			System.out.println(year+"�� ���");
		}
	}

	public static void main(String[] args) {
		new Ex01_01();
	}

}
