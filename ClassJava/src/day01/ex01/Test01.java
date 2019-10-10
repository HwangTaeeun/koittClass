package day01.ex01;

/**
 * @author  전은석
 * @since	2019. 10. 10
 * @version	1.0
 * @see		
 * 
 * 			이 클래스는 static 함수의 사용법을 공부하는 클래스이다.
 *
 */

public class Test01 {
	int num2 = 200;
	static int num = 10;
	
	public static void main(String[] args) {
		/*
		 	static 함수 내에서는 static 멤버는 호출할 수 있다.
		 */
		System.out.println("num : " + num);
		
		/*
			인스턴스의 멤버도 호출 할 수 있다.
		 */
		System.out.println("num2 : " + new Test01().num2);
		/*
		 * static 함수에서는 메모리에 올려진 아이들만 불러올 수 있다.
		 * 
		 */
	}
}
