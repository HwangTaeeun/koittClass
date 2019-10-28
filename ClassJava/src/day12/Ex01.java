package day12;

import java.util.regex.*;

/*
	문제 1]
		회원 아이디의 형식을 검사 하려고 합니다.
		아이디는 영대소문자, 숫자 가 모두 포함되어야 하고
		길이는 8글자 이상이어야 한다.
		
		정규식 패턴을 만들고 검사해서 결과를 출력하세요.
 */

import java.util.regex.*;


public class Ex01 {

	public Ex01() {
		String sid = "abcD1234";
		
		Pattern reg = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]))(^[a-zA-Z0-9]{8}$)");
		
		Matcher match = reg.matcher(sid);
		System.out.println(sid + " | " + match.matches());
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
