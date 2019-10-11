package day02;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 아무거나 입력하세요! : ");
		String str = sc.next();
		
		System.out.println("str : " + str);
		/*
			문자열과 다른 데이터타입의 연산
				문자열  + 정수 ==> 문자열
				문자열 + 실수 ==> 문자열
				문자열 + 문자 ==> 문자열
				
				"10" + 1 ==> "101"
				"3.14" + 0.1 ==> "3.140.1"
		 */
		System.out.println("\"3.14\" + 0.1 : " + "3.14" + 0.1);
		
		/*
			'A' - char
			==> "A"
			====> 'A' + "" ==> "A"
		 */
	}
}
