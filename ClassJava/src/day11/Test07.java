package day11;

import java.util.*;

/*
	예제]
		한글자의 문자를 입력받아서
		그 문자가 0 ~ 9 이면 정상 처리를 하고
		그 경우가 아닌 경우
		또는 두글자 이상이 입력된 경우는 예외로 간주하고
		강제로 예외를 발생시켜 보자.
 */

public class Test07 {

	public Test07() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			try {
				System.out.println("한자리 숫자를 입력하세요!");
				str = sc.nextLine();
				
				if(str.equals("quit")) {
					break;
				}
				
				char ch = str.charAt(0);
				if(ch < '0' || ch > '9' || str.length() > 1) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못입력했습니다.");
				str = "입력 값 없음";
			}
			
			System.out.println("입력된 숫자 : " + str);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
