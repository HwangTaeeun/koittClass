package day06;

/*
	flag 기법
		-   우리가 프로그램을 실행하다보면
			두가지 이상의 경우가 발생되는 순간이 존재한다.
			그 후에 어떤 경우가 발생했는지 알아보는 기법
			
			
		예]
			for( ; ;){
				
				if(){
					(1)
					break;
				}
				
				(2)
			}
			
			(3)
			
			
		이런경우 (3) 부분이 실행이 될때 반복문이 정상적인 횟수만큼 반복(2)이 되었는지
		아니면 중간에 어떤 조건(1)에 의해서 반복되다 중단했는지 알아보는 기법
 */


/*
	예제]
		문자열에 데이터를 입력해 놓고
		데이터는 숫자와 문자로만 구성해서 입력한다.
		
		이 문자열이 순수한 숫자로만 구성되었는지..
		아니면 중간에 문자가 존재하는지 알아보자.
		
		예]
			String str1 = "12345"; ==> 숫자 문자열입니다.
			String str2 = "123t45"; ==> 문자가 존재 합니다.
			
		힌트]
			한글자씩 꺼내서
				charAt()
			뽑아낸 문자가 숫자인지 아니면 문자인지를 검사하는 과정을 
			글자 수만큼 반복하면 된다.
		
 */

import java.util.*;

public class Test02 {

	public Test02() {
		toTest();
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// 문자를 임의로 입력한 문자열을 만들고
	// 그 문자열에 숫자가 아닌 문자가 포함되었는지 알려주는 함수
	public void toTest() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받고
		System.out.println("문자를 입력하세요 : ");
		String str = sc.next();
//		String str = " 123x456";
		int len = str.length(); // 문자열의 길이
		
		boolean bool = true;
		for(int i = 0 ; i < len; i++ ) {
			char ch = str.charAt(i);
			
			if( ch < '0' || ch > '9' ) {
				bool = false;
				//System.out.println("### 문자가 포함되어 있습니다.");
				break;
			}
		}
		
		if(bool == false) {
			System.out.println("문자가 포함되어 있습니다.");
		} else {
			System.out.println("숫자로 이루어진 문자열입니다. 형변환해서 사용하세요.");
		}
		
	}
	
}
