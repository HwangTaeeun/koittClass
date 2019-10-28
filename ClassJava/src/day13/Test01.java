package day13;

import java.util.regex.*;

public class Test01 {

	public Test01() {
		String str = "Abcdddde";
		
		Pattern reg = Pattern.compile("(?<=A).+?(?=e)");
//		Pattern reg = Pattern.compile("(?<=A).+?(?=e)");
		
		// ����Ž����
		// ==> �־��� ������ ������(�պκ��� ������) Ž��
		
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
