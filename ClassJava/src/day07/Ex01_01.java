package day07;

import java.util.Scanner;

/*
	
	조건문 문제]
		1000 ~ 3000 년 사이의 년도를 랜덤하게 발생시켜서
		발생된 년도가 윤년인지 평년인지를 판별해서 출력하세요.
		
		참고]
			윤년 - 	4로 나누어 떨어지면서 
					100으로 나누어 떨어지지 않고
					400나누어 떨어지는 해
	
 */
public class Ex01_01 {

	public Ex01_01() {
		System.out.println("연도 입력");
		Scanner sc= new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%400==0) {
			System.out.println(year+"은 윤년");
		}else {
			System.out.println(year+"은 평년");
		}
	}

	public static void main(String[] args) {
		new Ex01_01();
	}

}
