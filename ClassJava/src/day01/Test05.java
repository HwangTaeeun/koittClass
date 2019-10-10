package day01;

import java.util.*;

public class Test05 {
	/*
	 	상수 만들기
	 		형식]
	 			final 데이터타입 상수이름(대문자) = 데이터;
	 */
	// 파이값(3.14)를 저장할 상수 PI를 만드세요.
	static final float PI = 3.14f;
	/*
	final float PI;
	PI = 3.14f;
		==> 상수는 선언후 데이터 입력을 허락하지 않는다.
			왜냐하면 상수는 데이터를 수정할 수 없으므로...
	*/
	
	
	/*
		콘솔 환경에서 데이터 입력받기
			Scanner 클래스의 인스턴스를 만들어서 입력받는다.
			
		참고]
			객체 만드는 방법
				
				클래스이름 변수이름 = new 클래스이름();
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	레퍼런스변수	+   인스턴스   ==> 객체
		
		System.out.println("원의 반지름을 입력하세요. : ");
		int rad = sc.nextInt();
		int rad1 = sc.nextInt();
		
		// 원의 넓이 : 반지름 * 반지름 * 3.14
		float area = rad * rad * PI;
		System.out.println("반지름이 " + rad + " 인 원의 넓이는 " + area + " 입니다.");
		// 원의 둘레 : 2 * 반지름 * 3.14
		float around = 2 * rad * PI;
		System.out.println("반지름이 " + rad + " 인 원의 둘레는 " + around + " 입니다.");
		
		System.out.println("rad1 : " + rad1);
		// 원의 넓이 : 반지름 * 반지름 * 3.14
		float area1 = rad * rad1 * PI;
		System.out.println("반지름이 " + rad1 + " 인 원의 넓이는 " + area1 + " 입니다.");
		// 원의 둘레 : 2 * 반지름 * 3.14
		float around1 = 2 * rad1 * PI;
		System.out.println("반지름이 " + rad1 + " 인 원의 둘레는 " + around1 + " 입니다.");
	}
}
