package day02;

/*
	while 반복문
		반복의 종료조건을 별도로 지정해줘야 하는 반복문
		
		형식]
		while(조건식){
			실행문
		}
 */
public class Test09 {

	public Test09() {
		// 1부터 9까지 숫자를 출력하세요.
		int no = 0;
		while(no < 9) {
			System.out.println("### " + ++no);
		}
	}
	
	public static void main(String[] args) {
		new Test09();
	}
}
