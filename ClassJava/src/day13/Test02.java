package day13;
/*
	���� ��ǥ]
		�����Ͱ� �־����� �� �����͸� ���ϴ� �������� ǥ�� �� �� �ִ�.
		
	����ȭ Ŭ����]
		ó���� ����� �������� ����ϱ� ���� �������� ���Ǿ����� Ŭ����
		
		1. DecimalFormat
			==> �����Ͱ� ������ ��� ���ڸ� ���Ŀ� ���� ���ڿ��� ������ִ� Ŭ����
			
			�������]
				DecimalFormat(String pattern)�� �ַ� ����Ѵ�.
				==> Ư���� ������ ���� �� ������ ������ָ� �ȴ�.
				
			�ֿ��Լ�]
				format(double number) 
					==>  ���ڸ� ���ϴ� ���·� ��ȯ���ִ� �Լ�
			
			����]
				����������
					
					0	-	���ڸ� ���ڸ� �ǹ��ϸ� ��ȿ���ڵ� ǥ���ϰ� �Ѵ�.
					#	-	���ڸ� ���ڸ� �ǹ��ϸ� ��ȿ���ڴ� ǥ������ �ʴ´�.
					.	-	�Ҽ����� �ǹ�
					-	-	������ ��� -��ȣ�� ��ġ�� �˷��ش�.
					,	- 	3�ڸ����� , ǥ�ø� �ϵ��� �Ѵ�.
					E	- 	�Ǽ��� ��� �������·� ǥ���ϵ��� �Ѵ�.
					:	-	������ �����Ѵ�.
							(����� ���� ������ ��츦 �����ؼ� ó���� ��� ���)
					%	-	������� ǥ���Ѵ�.
					\u00A4	-	ȭ�����(��ǥ��)�� ǥ��
 */

import java.text.*;
public class Test02 {

	public Test02() {
		int money = 1240000;
		
		DecimalFormat form = new DecimalFormat("\u00a4 00,000,000,000");
		DecimalFormat form2 = new DecimalFormat("\u00a4 ##,###,###,###");
		
		String sMoney = form.format(money);
		String sMoney2 = form2.format(money);
		
		System.out.println(sMoney);
		System.out.println(sMoney2);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
