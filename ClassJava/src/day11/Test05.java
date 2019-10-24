package day11;

import java.util.*;

public class Test05 {
/*
	예외전이하기
		==>	함수는 프로그램의 가장 작은 단위로 
			한가지 작업을 하기 위해서 만든 것이다.
			따라서 함수 안에서 작업을 하다가
			예외가 발생을 하면
			그 함수는 더이상 실행할 필요가 없어진다.
			그래서 함수는 예외를 전이할 수 있도록(다른곳으로 떠넘길 수 있도록)
			해 놓은 경우가 있다.
			
			형식]
				
				[접근지정자] [속성] 반환값 함수이름(매개변수리스트) throws 예외클래스1, 예외클래스2, ... {
				
				}
			
			의미]
				지정한 예외가 발생하면 이 함수는 더이상 실행해도 의미가 없으므로 실행을 중지한다.
				
			*****
			예외가 전이된 함수는
			그 함수를 호출한 곳에서 반드시 예외처리를 해줘야 한다.
			
			
			참고]
				함수가 예외를 전이하는 함수라도
				예외처리를 하지 않아도 되는 경우가 있다.
				
				전이하는 예외가 RuntimeException 의 하위 예외인 경우에는
				예외처리를 해도 그만 안해도 그만이다.
				(주로 java.lang 소속 클래스에 있는 함수들이
					이런 함수들이 많이 존재한다.)
					
				그래도 될 수 있으면 하는 것이 좋습니다.
 */
	
	public Test05() {
		int no = 0;
		System.out.println("1. 예외처리전");
		
		no = getNum();
		
		try {
			int num = 100;
			System.out.println("2. try 시작"); 
			no = getNum1();
			System.out.println("3. 함수 실행 후"); 
		} catch(Exception e) {
			System.out.println("예외발생"); e.printStackTrace(); 
		}
		
		System.out.println("######## no : " + no);
//		System.out.println("******* : " + num); try 블럭 안에서 만들어지는 변수는 지역 변수이므로 밖에서는 사용 못한다.
	}

	public static void main(String[] args) {
		new Test05();
	}
	
	public int getNum(){
		int no = 0 ;
		System.out.println("*** 작업 전 ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		no = sc.nextInt();
		System.out.println("작업끝...");
		return no;
	}
	
	public int getNum1() throws Exception {
		int no = 0 ;
		System.out.println("*** 작업 전 ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		no = sc.nextInt();
		System.out.println("작업끝...");
		return no;
	}
}
