package day04;

/*
	��Ģ���� ���� �Է� �޾Ƽ�
	����� ����� ������ִ� ���α׷��� �ۼ��ϼ���.
	
		��]
			"123-11" ==> 112
			"2*8"	 ==> 16	
 */

import java.util.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���! : ");
		String sik = sc.nextLine();
		
		char ch = ' ';
		String sNum1 = "";
		String sNum2 = "";
		
		for(int i = 0 ; i < sik.length() ; i++) {
			
			if(sik.charAt(i) < '0'/*(0�� �ƽ�Ű�ڵ�)*/ || sik.charAt(i) > '9' ) {
				ch = sik.charAt(i);
				
				for(int l = 0 ; l < i ; l++) { 
					sNum1 += sik.charAt(l);
				}
				
				for(int m = i+1 ; m < sik.length() ; m++) { 
					sNum2 += sik.charAt(m);
				}
				
				break;
			}
		}
		System.out.println("########### sNum1 : " + sNum1);
		System.out.println("########### sNum2 : " + sNum2);
		int num1 = Integer.parseInt(sNum1);
		int num2 = Integer.parseInt(sNum2);
		
		String result = "";
		
		switch(ch) {
		case '+':
			result = "��� ����� " + (num1 + num2) + " �Դϴ�.";
			break;
		case '-':
			result = "��� ����� " + (num1 - num2) + " �Դϴ�.";
			break;
		case '*':
			result = "��� ����� " + (num1 * num2) + " �Դϴ�.";
			break;
		case '/':
			result = "��� ����� " + (num1 / (double)num2) + " �Դϴ�.";
			break;
		default:
			result = "�� �߸��� �����Դϴ�.";
		}
		
		System.out.println("�Է��� ���� [ " + sik + " ] " + result);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
