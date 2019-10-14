package day03;

import java.util.Arrays;

/*
	랜덤한 숫자 발생하기
		java.lang.Math.random() 
			- 	0보다 크거나 같고
				1보다 작은 실수를 반환해준다.
					
					0 <= x < 1
 */



public class Test01 {
	
	// 기본데이터타입의 멤버변수는 자동 초기화가 된다.
	int no1 ;
	boolean bool;
	char ch;
	float fl;
	
	
	public Test01() {
		/*
		for (int i = 0 ; i < 5 ; i++ ) {
			System.out.println(Math.random());
		}
		*/
		
		/*
		 * for(int i = 0 ; i < 5 ; i++ ) { int no = (int)(Math.random() * 4);
		 * System.out.println(no); }
		 */		
		
		/*
			배열 : 같은 형태의 데이터를 여러개 모아서 한꺼번에 관리하는 자료형
				   길이가 있고 인덱스가 존재하는 데이터 타입이다.
				   
					주의사항]
						반드시 만들때 관리할 타입과 길이를 정해야 된다.
						한번 만들어진 배열은 길이를 수정 못한다.
				형식]
					데이터타입[] 변수이름 = {데이터1, 데이터2, ....}
					데이터타입[] 변수이름 = new 데이터타입[길이];
					데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 데이터2, 데이터3, ....}
					
					
				참고]
					배열의 내용을 확인하는 함수
					Arrays.toString(배열주소)
					
					
		 */
		
		int num[] = new int[] {1,2,3,4,5};
		int no2[] = new int[] {1,2,3,4,5};
		
		
		// 향상된 for 명령으로 출력해보자.
		for(int no : num) {
			System.out.println(no);
		}
		
		System.out.println("num toString : " + Arrays.toString(num));
		System.out.println("num length : " + num.length);
		// toString()함수는 호출할 때 보고싶은 배열의 주소를 입력해야하지만
		// 자바에서는 메모리의 주소를 직접 접근할 수 없고
		// 그 주소를 변수가 기억하도록 하고 있다.
		// 따라서 배열의 주소를 기억하고 있는 변수를 입력해주면 되겠다.
		
		/*
		 	String
		 		String str = "abcd";
		 		String str2 = new String();
		 */
		/*
		String str1 = "abcd";
		String str2 = new String("abcd");
		String str3 = new String("abcd");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println("---------------------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		*/
		
		System.out.println("member var : " + no1 + " | " + bool + " | " + ch + " | " + fl);
		
		int[] num2 = new int[10];
		System.out.println(Arrays.toString(num2));
		
		String[] str3 = new String[10];
		System.out.println(Arrays.toString(str3));
	}

	public static void main(String[] args) {
		new Test01();
	}

}
