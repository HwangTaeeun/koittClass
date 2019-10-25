package day12;

import java.util.*;

public class Test03 {
/*
	StringTokenizer
		==> 하나의 문자열을 원하는 문자를 중심으로 나누어주는 기능을 가진 클래스이다.
			
			예]
				"a,b,c,d,e,f"
				==> a b c d e f 를 , 기준으로 나눠줄 수 있다.
				
			생성방법]
				1. StringTokenizer(String str)
					==> 문자열을 공백을 기준으로 나눠주는 기능
				2. StringTokenizer(String str, String delim) 
					==> delim : 구분자
						문자열을 구분자를 기준으로 나눠주는 기능
				3. StringTokenizer(String str, String delim, boolean returnDelims)
					==> returnDelims : 구분자들의 포함여부
						구분자도 포함을 시켜서 할건지 말건지 처리를 해주는 기능
						
			주요함수]
				
				countTokens()
					==> 나눠진 결과 수를 반환
				hasMoreElements() | hasMoreTokens()
					==> 임시 버퍼에 내용이 남아있는지 여부를 알려주는 함수
				nextElement()	| nextToken()
					==> 데이터를 꺼내는 함수
						nextElement()	- Object로 반환
						nextToken()		- String으로 반환
			
 */
	public Test03() {
		// 전화번호를 입력할 변수
		String str = "010-1111-2222";
		// StringTokenizer로 '-'를 기준으로 자르고
		StringTokenizer token = new StringTokenizer(str,"-");
		
		// 문자열이 눠진 갯수 구하고
		int len = token.countTokens();
		// 문자열이 나눠진 갯수만큼 배열을 만들고
		String[] arr = new String[len];
		int[] arr1 = new int[len];
		int i = 0;
		while(token.hasMoreElements()) {
//			arr1[i++] = (int)token.nextElement();
			arr[i++] = token.nextToken();
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		new Test03();
	}

}
