package day08;

public class Test03 {
/*
	멤버 변수의 초기화
		==> 멤버 변수는 자동 초기화가 된다.
			(단 기본 데이터 타입에 한해서 기본값이 셋팅이 된다.)
			
	초기화 방법]
		1. 명시적 초기화
			변수를 선언하면서 값을 초기화하는 방법
			: 가장 먼저 실행되는 방법
		
		2. 초기화 블럭을 이용한 초기화
			==> 인스턴스 변수에 대해서만 가능한 것으로
				두번째 실행되는 방법
				
		
		3. static 블럭을 이용한 초기화
			==> 2번과 비슷하나 대신 static 변수에 한해서만 가능한 방법
				두번째 실행되는 방법
				형식]
					public static 타입 변수;
					
					static {
						변수 = 데이터;
					}
		
		4. 생성자함수를 이용한 초기화
			==> 제일 마지막에 실행되는 방법
				: 생성자 함수 안에서 초기화 해준다.
		
		
 */
	int tmp = 10; // 명시적 초기화 - 멤버 변수를 선언과 동시에 초기화하는 방법
	
	
	int no;
	{
		no = 100;
	}
	
	public static int num;
	
	static {
		num = 999;
	}
	
	String str;
	public Test03() {
//		this("홍길동");
		this.str = "홍길동";
		System.out.println("no : " + no + " | str : " + str );
		System.out.println("num : " + num);
	}
	
	public Test03(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		new Test03();
	}

}
