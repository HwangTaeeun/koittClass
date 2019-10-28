package day13;

import java.util.regex.*;

public class Test01 {

	public Test01() {
		String str = "Abcdddde";
		
		Pattern reg = Pattern.compile("(?<=A).+?(?=e)");
//		Pattern reg = Pattern.compile("(?<=A).+?(?=e)");
		
		// 전방탐색자
		// ==> 주어진 형식의 전방을(앞부분의 패턴을) 탐색
		
		Matcher match = reg.matcher(str);
		System.out.println(match.matches());
		
		while(match.find()) {
			System.out.println(match.group());
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
