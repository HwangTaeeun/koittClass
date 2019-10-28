package day13;

import java.util.*;
import java.text.*;

public class Test03 {

/*
	SimpleDateFormat
		==> 날짜 데이터를 형식화 시켜서 만들어 주는 클래스
			
			생성방법과 사용법은 DecimalFormat 과 같다.
			
			생성자]
				
				SimpleDateFormat(String pattern)
				
			사용함수]
				format(Date date)
				
			
			패턴 만드는 방법]
				패턴			설명						예제
				------------------------------------------------------
				G		- 		연대 ( BC | AD )			AD
				y		-		년도						2019
				M		-		월(1 ~ 12 | 1월 ~ 12월)		10 또는 10월 또는 OCT
				w		-		년의 몇번째 주(1 ~ 53 )		47
				W		-		월의 몇번째 주(1 ~ 5 )		5
				D		-		년의 몇번째 일( 1 ~ 366 )	255
				d		- 		월의 몇번째 일( 1 ~ 31 )	28
				F		-		월의 몇번째 요일(1 ~ 5 )	5
				E		-		요일						월
				a		-		오전  / 오후( AM, PM )		AM
				H		-		시간( 0 ~ 23 )				11
				k		-		시간(0 ~ 24 )				11
				K		-		시간(0 ~ 11 )				11
				h		-		시간( 1 ~ 12 )				???
				m		-		분( 0 ~ 59 )				45
				s		-		초( 0 ~ 59 )				32
				S		-		초( 천분의 1초 : 0 ~ 999 )	788
				z		-		Time zone (General Time Zone) 	GMT+11:45
				Z		-		Time zone ( RFC 822 time zone)	+1145
				'		-		escape문자(특수문자를 표현하는데 사용)	
 */
	public Test03() {
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		SimpleDateFormat form = new SimpleDateFormat("[ G ] yyyy년 MM월 dd일 - MM월의 W 주 - yyyy 년의 w 주");
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년의 DD 번째 일 - hh 시 mm분 ss초 - SS 초");
		
		System.out.println(form.format(date));
		System.out.println(form1.format(date));
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
