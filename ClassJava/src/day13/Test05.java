package day13;

import java.text.*;

public class Test05 {

	public Test05() {
		/*
			ChoiceFormat을 만들 때 limits, format을 하나로 만들 수 있다.
				만드는 형식
					
					60#D	[ <= ] 의 의미
					70 < C	[ <  ] 의 의미
					
					따라서 | 연산자를 이용해서 연결해서 사용하면 된다.
		 */
		
		String pattern = "0#F|60#D|70#C|80#B|90#A";
			// 60#D ==> 60 <= 면 D 로 처리하세요.
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		int score = 60 ;
		String grade = form.format(score);
		
		System.out.println(score + " 점의 학점은 " + grade + " 학점 입니다.");
	}

	public static void main(String[] args) {
		new Test05();
	}

}
