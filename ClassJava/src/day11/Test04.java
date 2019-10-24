package day11;

public class Test04 {
/*
	finally 블럭
		==>	예외 발생 여부와 관계없이 반드시 실행되어야 할 
			문장이 존재할 경우 
			그런 실행문들을 기술하는 블럭
			
		형식]
			
			(1)
			try {
				(2)
				...
				(3)
			} catch(Exception e){
				(4)
			} finally {
				(5)
			}
			
				(6)
				
		실행순서]
			
			예외발생하는 경우 ]
				(1) -> (2) -> (4) -> (5) -> (6)
				
			예외가 발생하지 않는 경우]
				(1) -> (2) -> (3) -> (5) -> (6)
				
		참고]
			
			만약 finally블럭이 존재한다면 catch() 블럭은 생략 해줄 수도 있다.
			
			
------------------------------------------------------------------------------------
	
	예외정보 출력하기
		
		1. 예외정보클래스 변수를 출력하면 된다.
			방법]
				System.out.println(예외클래스변수);
				==> 예외의 원인을 파악을 할 수 있게 된다.
				<== Throwable 클래스의 toString()를 자동 호출한다.
				
		2. 변수.printStactTrace()를 이용하는 방법
			==> 예외의 정보 + 예외가 발생하게 된 위치와 
				그 경로를 추적해서 출력해준다.
	
	***
		예외처리는 프로그램의 정상적인 종료를 위해서 한다고 했지만
		
		개발자 입장에서의 예외처리는
		예외의 정보를 알아내서
		그 프로그램의 문제점의 위치를 알려줘서 
		정상적인 프로그램의 정상적으로 작동을 시키고 
		정상 종료될 수 있는 방법을 찾아야겠다.
 */
	public Test04() {
		try {
			int no = Integer.parseInt("가나다라");
		} catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
