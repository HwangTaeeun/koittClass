package day11;

public class Test06 {
/*
	강제 예외발생하기
		형식]
		 	
		 	throw new 예외클래스이름();
 */
	public Test06() {
		try {
			System.out.println(" try 시작");
			throw new Exception();
//			System.out.println(" ");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new Test06();
	}

}
