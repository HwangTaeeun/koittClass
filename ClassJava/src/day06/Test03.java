package day06;

/*
	계산식을 입력하면 계산해서 출력해주는 프로그램을 작성하세요.
	단, 계속 반복되도록 하고
	특정문자가 입력되면 종료되도록 작성하세요.
	
	==> 	1*3		--> 4

----------------------------------------------------------------------------------------

	### 실행순서
		1. 작업 코드 입력 ( 1 :  종료, 2 : 계산)
		
		2. 계산식을 입력하세요.( 빠져나가려면 "q" 를 입력하세요.)
		
 */

import java.util.*;

public class Test03 {

	public Test03() {
		miniCalc();
	}

	public static void main(String[] args) {
		new Test03();
	}
	
	// 계산식을 입력받아서 계산 결과를 출력해주는 함수
	
	public void miniCalc() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 반복해서 계산실 입력받아서 계산하고
		for(;;) {
			System.out.println("계산식을 입력하세요! : ");
			String str = sc.next();
			
			if(str.equals("quit")) return;
			
			for(int i = 0; i < str.length(); i++ ) {
				char ch = str.charAt(i);
				if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					// 계산은 아래에 함수를 만들어서 처리하자.
					toPrint(str, i);
					
					// 연산기호를 찾았으니 종료해준다.
					break;
				}
			}
		}
		
	}
	
	// 문자열과 숫자를 입력하면 계산식의 결과를 출력해주는 함수
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
