package day12;

import java.util.*;

public class Test09 {
/*
	Calendar 클래스
		==> Date 클래스를 버젼업 시킨 클래스
			
			생성방법]
				***
				이 클래스는 추상클래스이므로 
				new 시켜서 사용할 수 없고
				객체를 얻는 방법은
				소속 함수중 속성이 static 이면서 
				반환값이 자기자신인(Calendar) 함수를 사용해서 만들어 사용해야만 한다.
				
				Calendar cal = Calendar.getInstance();
				의 방법으로 사용해야 한다.
				
			주요함수]
				get(int field)
					==> 필요한 정보를 알려주는 함수
						이 함수는 int field 에 알고자 하는 내용을 알려주면
						그 값에 대해서 알려주는 함수이다.
						
						참고]
							field	: 클래스가 가지고있는 멤버변수를 field 라 한다.
							
						따라서
						field에는 Calendar 클래스에서 정의해놓은 멤버변수를 입력하는 것이다.
						
				getTime()
					==> Calendar 객체를 Date 객체로 변환해주는 함수
						
						실무에서는 Calendar 클래스에서 작업을하다가 
						Date 객체가 필요할 때만 변환해서 사용한다.
						
			참고]
				자바 함수 이용법]
					자바 함수의 정의를 보면 매개변수에 문자열로 의미하는 내용을 
					int 숫자로 입력해 달라는 함수가 많이 존재하는데
					이때는 99% 가 자기자신이 그 문자열이 의미하는 정수값을 정의를 해 놓았다.
					따라서 가지고 있는 그 필드를 사용하면 된다.
					
					
---------------------------------------------------------------------------------------------
		
 */
	public Test09() {
//		Calendar cal = new Calendar(); // ==> 추상 클래스이므로 인스턴스를 직접 (new 시켜서)만들어 사용할 수 없다.
		Calendar cal = Calendar.getInstance();
	}

	public static void main(String[] args) {
		new Test09();
	}

}
