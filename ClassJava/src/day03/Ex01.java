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
		// 1. 입력 받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 2. 메세지 보여주고 입력받고
		System.out.print("변환할 알파벳을 입력하세요! : ");
		char ch = sc.next().charAt(0);
		// 3. 문자 변환해주고
		
		// 4. 출력하고
		
	}
	
}
