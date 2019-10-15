package day03;

/*
	문제 1]
		스캐너로 알파벳 문자를 입력 받아서
		그 문자가 대문자면 소문자로
		소문자면 대문자로 변환해서 출력하세요.
		
		단, 기능을 함수로 만들어 처리하세요.
 */

import java.util.*;

public class Ex01 {
	
	// 기본 생성자 함수
	public Ex01() {
		toConvert();
	}
	
	// 진입점 함수
	public static void main(String[] args) {
		new Ex01();
	}
	
	// 내가 만든 함수 - 
	// 이 함수는 문자를 입력받아서 변환해서 출력해주는 함수이다.
	public void toConvert() {
		/*
			아스키 코드값에서
				'A' = 65, 'a' = 97
				'a' - 'A' = 32
				
				'a' -> 'A' ==> 'a' - 32
				
				'J' -> 'j' ==> 'J' + 32
		 */
		
		int cha = 'a' - 'A';
		
		// 1. 입력 받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 2. 메세지 보여주고 입력받고
		System.out.print("문자 하나를 입력하세요! : ");
		String str = sc.next();
		// 입력되는 문자는 한글자이고 이것을 꺼는 방법은 문자열로 꺼내야된다.
		// 그런데 문자열에 포함된 문자는 하나 이므로 꺼낼 문자의 위치는 0 이다.
		// 참고로 문자열에서 문자를 뽑아내는 함수는 
		// 			String 클래스에 charAt(int index) 함수로 처리하면 된다. 
		int ch = str.charAt(0);
		
		// 변환된 문자를 기억할 변수를 만든다.
		char byun = ' ';
		// 초기화 이유는 조건문 밖에서 사용해야 되므로 먼저 선언하고 데이터도 적당히 채워놓는다.
		if(ch < 'a') {
		// 3. 문자 변환해주고
			byun = (char)(ch + cha);
		} else {
			// 이 경우는 소문자 이므로 발생한 문자의 아스키코드값에서 32를 빼주면 된다.
			byun = (char)(ch - cha);
		}
		// 4. 출력하고
		
		System.out.println("입력한 문자 : "  + (char)ch + " | 변경한 문자 : " + byun);
		
	}
	
}
