package day02;

/*
	do ~ while 반복문 : 조건에 관계없이 적어도 한번은 실행해주는 반복문
		1
		do {
			실행문 - 2
		} while (조건식 - 3);
 */
public class Test11 {

	public Test11() {
		int no = 10;
		
		do {
			System.out.println("no : " + no);
		} while (no++ < 10);
	}

	public static void main(String[] args) {
		new Test11();

	}

}
