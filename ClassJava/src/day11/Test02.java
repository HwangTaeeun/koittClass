package day11;

/*
	���� 1]
		Change Ŭ�������� ���ڸ� �Է¹޾Ƽ�
		Test02�� no ���� �����ϰ�
		����غ���.
		
		��. Change Ŭ�������� Test02.no �� 
		Test02���� �ν��Ͻ��� ���� �Լ��� ȣ���ؼ� ��������.
 */

import java.util.*;

public class Test02 {
	int no = 10;
	public Test02() {
		System.out.println("�Լ� ȣ�� �� no : " + no);
		
		Change ch = new Change(this);
		
		ch.cNo();
		System.out.println("�Լ� ȣ�� �� no : " + no);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Change {
	// Test02�� ��ü�� ����� ������ �ʿ��ϴ�.
	Test02 main;
	
	// �� Ŭ������ ��ü�� �Ǿ��� �� main ������ ������ �Ǿ�� �Ѵ�.
	public Change(Test02 main) {
		this.main = main;
	}
	
	public void cNo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ no�� �� : ");
		int tmp = sc.nextInt();
		
		// Test02�� ���� no�� �Էµ� ������ �����Ѵ�.
		main.no = tmp;
	}
}
