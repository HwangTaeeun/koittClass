package day05;

public class Test03 {
	
	// 1. 문자열을 입력하면 문자열 앞에 "###"을 붙여서 반환해주는 함수를 작성하고
	// 2. 이 함수를 오버로딩하는데 정수를 입력하면 숫자에 10을 더해서 반환해주는 함수를 작성하자.
	
	public String getData(String str) {
		String msg = "###" + str;
		
		return msg;
	}
	
	// 2번 해결하기
	public int getData(int no) {
		int num = no + 10;
		
		return num;
	}
	
	public Test03() {
		// 위의 getData 호출하기
		
		// 1. 문자열로 호출하기
		System.out.println(getData("abcd"));
		// 2. 정수로 호출하기
		System.out.println(getData(1024));
	}

	public static void main(String[] args) {
		new Test03();
	}
	
	
}
