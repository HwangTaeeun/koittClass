package day13;
/*
	수업 목표]
		데이터가 주어지면 그 데이터를 원하는 형식으로 표현 할 수 있다.
		
	형식화 클래스]
		처리된 결과를 보기좋게 출력하기 위한 목적으로 사용되어지는 클래스
		
		1. DecimalFormat
			==> 데이터가 숫자인 경우 숫자를 형식에 맞춰 문자열로 만들어주는 클래스
			
			생성방법]
				DecimalFormat(String pattern)을 주로 사용한다.
				==> 특정한 형식을 만들 때 패턴을 만들어주면 된다.
				
			주요함수]
				format(double number) 
					==>  숫자를 원하는 형태로 변환해주는 함수
			
			참고]
				패턴지정법
					
					0	-	한자리 숫자를 의미하며 무효숫자도 표시하게 한다.
					#	-	한자리 숫자를 의미하며 무효숫자는 표시하지 않는다.
					.	-	소숫점을 의미
					-	-	음수일 경우 -부호의 위치를 알려준다.
					,	- 	3자리마다 , 표시를 하도록 한다.
					E	- 	실수일 경우 지수형태로 표시하도록 한다.
					:	-	패턴을 구분한다.
							(양수일 경우와 음수일 경우를 구분해서 처리할 경우 사용)
					%	-	백분율을 표시한다.
					\u00A4	-	화폐단위(원표시)를 표시
 */

import java.text.*;
public class Test02 {

	public Test02() {
		int money = 1240000;
		
		DecimalFormat form = new DecimalFormat("\u00a4 00,000,000,000");
		DecimalFormat form2 = new DecimalFormat("\u00a4 ##,###,###,###");
		
		String sMoney = form.format(money);
		String sMoney2 = form2.format(money);
		
		System.out.println(sMoney);
		System.out.println(sMoney2);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
