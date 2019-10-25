package day12;

import java.util.*;

public class Test08 {
/*
	Date 클래스
		==> 날짜와 시간을 관리하는 클래스
			
			생성자 함수
				Date()
					==> 시스템의 현재시간을 객체로 만들어준다.
				Date(int year, int month, int date)
					==> 매개변수로 입력된 값을 객체로 만드는 기능...
				Date(String s)
					==> 문자열로 입력된 값을 객체로 만드는 기능...
					
			참고]
				Deprecated
					==> 이 단어가 붙은 멤버는 
						자바에서 언제 없지질지 모르는 멤버이므로
						되도록이면 해결책을 찾아놓으세요...
						
			참고]
				이 클래스는 Calendar 클래스가 버젼업 버젼이므로 
				자바쪽에서는 Calendar 클래스의 사용을 권장한다.
 */
	public Test08() {
		Date date = new Date();
		
		System.out.println(date.getYear() + " 년 " + date.getMonth() + " 월 " +  date.getDate() + " 일");
		// getMonth() 는 월의 시작값을 0부터 시작하므로 본래의 월보다 -1 된 값이 반환된다.
	}

	public static void main(String[] args) {
		new Test08();
	}

}
