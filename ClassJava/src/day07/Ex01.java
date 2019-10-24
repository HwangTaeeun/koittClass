package day07;

/*
	
	조건문 문제]
		1000 ~ 3000 년 사이의 년도를 랜덤하게 발생시켜서
		발생된 년도가 윤년인지 평년인지를 판별해서 출력하세요.
		
		참고]
			윤년 - 	4로 나누어 떨어지면서 
					100으로 나누어 떨어지지 않고
					400나누어 떨어지는 해
	------------------------------------------------------------------------------------
		추가]
			삼항연산자로 해결하기
 */

import java.util.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요! : ");
		int year = sc.nextInt();
		
		String msg = "평년";
		
		if(year % 400 == 0) {
			msg = "윤년";
		} else if(year % 100 == 0) {
			msg = "평년";
		} else if(year % 4 == 0) {
			msg = "윤년";
		}
		
		System.out.println(year + " 년도는 " + msg + " 입니다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
