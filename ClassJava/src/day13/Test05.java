package day13;

import java.text.*;

public class Test05 {

	public Test05() {
		/*
			ChoiceFormat�� ���� �� limits, format�� �ϳ��� ���� �� �ִ�.
				����� ����
					
					60#D	[ <= ] �� �ǹ�
					70 < C	[ <  ] �� �ǹ�
					
					���� | �����ڸ� �̿��ؼ� �����ؼ� ����ϸ� �ȴ�.
		 */
		
		String pattern = "0#F|60#D|70#C|80#B|90#A";
			// 60#D ==> 60 <= �� D �� ó���ϼ���.
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		int score = 60 ;
		String grade = form.format(score);
		
		System.out.println(score + " ���� ������ " + grade + " ���� �Դϴ�.");
	}

	public static void main(String[] args) {
		new Test05();
	}

}
