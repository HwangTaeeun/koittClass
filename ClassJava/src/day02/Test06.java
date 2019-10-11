package day02;

/*
	Method 작성법
		
		형식]
			[접근지정자] [속성] 반환값 함수이름(매개변수리스트){
			
			}
			
			매개변수리스트 : 함수를 실행할 때 꼭 입력해야되는 데이터들의 형태와 변수이름
			
			예]
			
			** 작성
			public int getSum(int num1, int num2){
				int sum = num1 + num2;
				return sum;
			}
			
			public float getSum(float num1, float num2){
				float sum = num1 + num2;
				return sum;
			}
			
			** 실행
			int result = getSum(5, 3); ==> float num1 = 5; float num2 = 3;
			
			
			***
			함수를 만들때 먼저 고민해야 되는 문제들
			1. 반환값의 타입을 뭘로 할것인가???
			2. 함수이름은 뭘로 할 것인가???
			3. 이 함수가 실행될때 입력해줘야 하는 데이터들은 어떤 것들이 있는가???
			
			
			
			참고]
				함수원형	- 	접근지정자, 속성, 반환값타입, 이름, 매개변수리스트 까지를 이야기한다.
 */

/*
	참고]
		;   - 토큰을 가리키는 기호...
				토큰 - 하나의 명령 단위...
				
		하나의 명령이 끝나면 붙여주는 것이 원칙이다.
		
		하지만 생략하는 경우는 {} 로 끝나는 경우는 {} ;의 역할을 대신한다.
 */

import java.util.*;

public class Test06 {
/*
	문제]
		두수를 입력받아서
		두수의 합을 구해주는 함수를 작성하고 실행하세요.
		합이 출력되게 하세요...
 */
	public static void main(String[] args) {
		// 입력받은 데이터로 아래 함수 toPrint() 호출하고
		
		new Test06().toPrint();
	}
	
	public void toPrint() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력하고 입력받고 x 2
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
		
		System.out.println(no1 + " 과 " + no2 + " 의 합은 " + (no1 + no2) + " 입니다.");
	}
}
