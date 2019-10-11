package day02;

/*
	제어 명령
		1. 조건문
			if, if ~ else, if ~ else if, switch ~ case
			
			조건문의 공부방법]
				조건의 가지수의 범위를 기준으로 공부한다.
			
		2. 반복문
			for, 향상된 for명령, while, do ~ while
 */
public class Test03 {
	public static void main(String[] args) {
		/*
			if 조건문: 조건식을 주고 그 조건에 맞는경우만 처리하는 조건문
				형식]
					1
					
					     2
					if(조건식){
						조건식이 참일경우 처리 명령 - 3
					}
					4
					
					조건식이 참인경우 : 1 -> 2 -> 3 -> 4
					조건식이 거짓일 경우 : 1 -> 2 -> 4
					
		 */
		
		int no = 10;
		
		if(no++ >= 10) {
			no += 5;
		}
		
		System.out.println("no : " + no);
		
	}
}
