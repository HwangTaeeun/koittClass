package day07;

public class Test06 {

	/*
		String 클래스
			: 기본 데이터 타입은 아니지만 사용빈도가 높은 클래스 타입이다. 참조형 타입
			
			문자열을 만드는 방법]
				1. 
					String str = "abcd";
				2. 
					String str1 = new String("abcd");
					
		자주 사용하는 함수
			
			1. length() : 문자열의 길이를 반환해주는 함수
			2. charAt(위치) : 문자열중 해당 위치의 문자를 반환해주는 함수
			3. equals(문자열) : 문자열의 데이터자체를 비교하는 함수
			4. 
				4.1 indexOf( 문자  || 문자열  )
					- 입력주는 문자열 또는 문자가 처음 나타나는 위치를 반환해준다.
					
				4.2 indexOf( 문자 || 문자열 , 시작위치 )
					- 시작위치 이후에서 문자 또는 문자열이 나타나는 위치를 반환해준다.
					
				4.3 lastIndexOf(문자 또는 문자열) 
					- 문자열 맨 뒤부터 문자 또는 문자열이 나타는 위치를 반환
					
			5. 문자열의 일부만 추출해서 반환해주는 함수
				
				5.1 
					substring(시작위치) - 시작위치에서부터 끝까지 추출해주는 함수
					
				5.2
					substring(시작위치, 종료위치)
						- 시작위치에서 부터 종료위치 전까지 문자열 추출해서 반환해준다.
				
		
	 */
	public Test06() {
		String str1 = "abcd bcd ebeb";
		
		System.out.printf("%25s - %c\n" , "str1.charAt()",  str1.charAt(3));
		System.out.printf("%25s - %d\n" , "str1.indexOf('b')",  str1.indexOf('b'));
		System.out.printf("%25s - %d\n" , "str1.indexOf('b', 3)",  str1.indexOf('b', 3));
		System.out.printf("%25s - %d\n" , "str1.indexOf(\"beb\")",  str1.indexOf("beb"));
		System.out.printf("%25s - %d\n" , "str1.lastIndexOf(\"bcd\")",  str1.lastIndexOf("bcd"));
		System.out.printf("%25s - %s\n" , "str1.substring(2)",  str1.substring(2));
		System.out.printf("%25s - %s\n" , "str1.substring(2, 6)",  str1.substring(2, 6));
	}

	public static void main(String[] args) {
		new Test06();
	}

}
