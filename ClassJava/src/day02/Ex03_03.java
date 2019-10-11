package day02;

import java.util.*;

/*
	문제]
		숫자 3개를 임의로 입력받아서 저장을 하고 그 수중 
		제일 큰 수만 출력하세요.
		단, 3항 연산자를 사용해서 해결하세요.
		
		(조건식) ? 참일경우반환값 : 거짓일경우 반환값;
		
		* 3항연산자로 해결을 했다면 if 문으로 해결하세요.
		* if ~ else 구문으로 처리하세요.
 */

public class Ex03_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		
		if(num1 > num2 & num1 > num3) {
			System.out.println(num1);
		}
		else {
			if(num2 > num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}
	}

}
