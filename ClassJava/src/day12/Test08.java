package day12;

import java.util.*;

public class Test08 {
/*
	Date Ŭ����
		==> ��¥�� �ð��� �����ϴ� Ŭ����
			
			������ �Լ�
				Date()
					==> �ý����� ����ð��� ��ü�� ������ش�.
				Date(int year, int month, int date)
					==> �Ű������� �Էµ� ���� ��ü�� ����� ���...
				Date(String s)
					==> ���ڿ��� �Էµ� ���� ��ü�� ����� ���...
					
			����]
				Deprecated
					==> �� �ܾ ���� ����� 
						�ڹٿ��� ���� �������� �𸣴� ����̹Ƿ�
						�ǵ����̸� �ذ�å�� ã�Ƴ�������...
						
			����]
				�� Ŭ������ Calendar Ŭ������ ������ �����̹Ƿ� 
				�ڹ��ʿ����� Calendar Ŭ������ ����� �����Ѵ�.
 */
	public Test08() {
		Date date = new Date();
		
		System.out.println(date.getYear() + " �� " + date.getMonth() + " �� " +  date.getDate() + " ��");
		// getMonth() �� ���� ���۰��� 0���� �����ϹǷ� ������ ������ -1 �� ���� ��ȯ�ȴ�.
	}

	public static void main(String[] args) {
		new Test08();
	}

}
