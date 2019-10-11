package day02;

import java.util.Scanner;

/*
	문제]
		숫자 3개를 임의로 입력받아서 저장을 하고 그 수중 
		제일 큰 수만 출력하세요.
		단, 3항 연산자를 사용해서 해결하세요.
		
		(조건식) ? 참일경우반환값 : 거짓일경우 반환값;
		
		* 3항연산자로 해결을 했다면 if 문으로 해결하세요.
		* if ~ else 구문으로 처리하세요.
 */

public class Ex03_01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫 번재 숫자 :");
		int num1 =sc.nextInt();
		
		System.out.println("두 번재 숫자 :");
		int num2 =sc.nextInt();
		
		System.out.println("세 번재 숫자 :");
		int num3 =sc.nextInt();
		
		int result = (num1>num2)?num1:num2;
		int final_result = (result>num3)?result:num3;
		
		System.out.println("가장 큰 숫자는 : " + final_result + "입니다.");
		
	}

}
