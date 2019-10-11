package day02;

public class Test10 {

	public Test10() {
		// 구구단 3단을 출력하세요.
		
		// 카운터 변수 만들고
		int i = 0;
		// 반복문 만들고
		while(++i < 10 ) {
			int dan = 3;
			// 출력하고
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	
	public static void main(String[] args) {
		new Test10();
	}
}
