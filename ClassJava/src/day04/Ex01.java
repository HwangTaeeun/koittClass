package day04;

/*
	사칙연산 식을 입력 받아서
	계산한 결과를 출력해주는 프로그램을 작성하세요.
	
		예]
			"123-11" ==> 112
			"2*8"	 ==> 16	
 */

import java.util.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산식을 입력하세요! : ");
		String sik = sc.nextLine();
		
		char ch = ' ';
		String sNum1 = "";
		String sNum2 = "";
		
		for(int i = 0 ; i < sik.length() ; i++) {
			
			if(sik.charAt(i) < '0'/*(0의 아스키코드)*/ || sik.charAt(i) > '9' ) {
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
			result = "계산 결과는 " + (num1 + num2) + " 입니다.";
			break;
		case '-':
			result = "계산 결과는 " + (num1 - num2) + " 입니다.";
			break;
		case '*':
			result = "계산 결과는 " + (num1 * num2) + " 입니다.";
			break;
		case '/':
			result = "계산 결과는 " + (num1 / (double)num2) + " 입니다.";
			break;
		default:
			result = "은 잘못된 수식입니다.";
		}
		
		System.out.println("입력한 수식 [ " + sik + " ] " + result);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
