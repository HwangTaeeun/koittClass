package day01.ex01;

/**
 * @author  ������
 * @since	2019. 10. 10
 * @version	1.0
 * @see		
 * 
 * 			�� Ŭ������ static �Լ��� ������ �����ϴ� Ŭ�����̴�.
 *
 */

public class Test01 {
	int num2 = 200;
	static int num = 10;
	
	public static void main(String[] args) {
		/*
		 	static �Լ� �������� static ����� ȣ���� �� �ִ�.
		 */
		System.out.println("num : " + num);
		
		/*
			�ν��Ͻ��� ����� ȣ�� �� �� �ִ�.
		 */
		System.out.println("num2 : " + new Test01().num2);
		/*
		 * static �Լ������� �޸𸮿� �÷��� ���̵鸸 �ҷ��� �� �ִ�.
		 * 
		 */
	}
}
