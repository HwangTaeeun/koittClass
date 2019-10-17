package day06;

/*
	������ �Է��ϸ� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, ��� �ݺ��ǵ��� �ϰ�
	Ư�����ڰ� �ԷµǸ� ����ǵ��� �ۼ��ϼ���.
	
	==> 	1*3		--> 4

----------------------------------------------------------------------------------------

	### �������
		1. �۾� �ڵ� �Է� ( 1 :  ����, 2 : ���)
		
		2. ������ �Է��ϼ���.( ������������ "q" �� �Է��ϼ���.)
		
 */

import java.util.*;

public class Test03 {

	public Test03() {
		miniCalc();
	}

	public static void main(String[] args) {
		new Test03();
	}
	
	// ������ �Է¹޾Ƽ� ��� ����� ������ִ� �Լ�
	
	public void miniCalc() {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		// �ݺ��ؼ� ���� �Է¹޾Ƽ� ����ϰ�
		for(;;) {
			System.out.println("������ �Է��ϼ���! : ");
			String str = sc.next();
			
			if(str.equals("quit")) return;
			
			for(int i = 0; i < str.length(); i++ ) {
				char ch = str.charAt(i);
				if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					// ����� �Ʒ��� �Լ��� ���� ó������.
					toPrint(str, i);
					
					// �����ȣ�� ã������ �������ش�.
					break;
				}
			}
		}
		
	}
	
	// ���ڿ��� ���ڸ� �Է��ϸ� ������ ����� ������ִ� �Լ�
	public void toPrint(String s, int index) {
		char ch = s.charAt(index);
		String sno1 = "";
		String sno2 = "";
		
		for(int i = 0 ; i < index ; i++ ) {
			sno1 += s.charAt(i);
		}
		
		for(int i = index + 1 ; i < s.length() ; i++ ) {
			sno2 += s.charAt(i);
		}
		
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		
		switch(ch) {
		case '+':
			System.out.println(s + " = " + (no1 + no2));
			break;
		case '-':
			System.out.println(s + " = " + (no1 - no2));
			break;
		case '*':
			System.out.println(s + " = " + (no1 * no2));
			break;
		case '/':
			System.out.println(s + " = " + (no1 / (float)no2));
			break;
		}
	}
}
