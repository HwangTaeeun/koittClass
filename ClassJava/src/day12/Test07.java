package day12;

import java.math.BigDecimal;

public class Test07 {

	/*
		BigDecimal
			==> ������ ǥ���� �� ���� ���ڸ� ����ϱ� ���ؼ� ������� Ŭ����
			
				�ַ� �����ͺ��̽��� ������ ��
				����Ŭ�� ���� ���ڸ� 
				����Ŭ�� ���ڸ� �ٷ�� ������Ÿ���� number(����)
				����Ŭ������ ���ڴ� 36�ڸ����� ������ �� �� �ִ�.
				�̷� �����ʹ� �ڹٿ����� �ٷ�� �ִ� ����� �����Ƿ�
				(�ڹٿ��� ����Ŭ�� �����͸� �ٷ길ŭ ū ������Ÿ���� �������� �����Ƿ�)
				�̷� ������ �����͸� ó���� �������� ������� Ŭ�����̴�.
				
				
			��]
				BigDecimal big = new BigDecimal("1234567891234567890");
	 */
	public Test07() {
		BigDecimal big = new BigDecimal("100");
		
		int num = big.intValue();
		System.out.println("big.intValue() : " + num);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
