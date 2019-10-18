package day07;

public class Test07 {
/*
	함수의 중첩( Overloading )
	==>	원칙적으로 클래스내에서 함수의 이름은 같은 이름을 한번만 사용할 수 있다.
		
		이러다보니 함수이름을 정할 때나 
		코드를 읽을 때도 불편하다. ==> 가독성에 문제가 생긴다.
		
		함수의 가독성이란???
			함수의 이름만 봐도 그 함수가 어떤 기능을 수행하는 함수인지
			알아낼수 있어야 하는데
			
		==> 이런문제를 해결하기 위해서 도입된 문법이 
			함수의 중첩( Overloading ) 이다.
			
		결론 ]
			함수의 중첩(Overloading )은 
			클래스 내에서 같은 이름의 함수를 만드는 것...
			
			
		규칙]
			1. 함수의 이름은 같게한다.
			2. 매개변수리스트는 달라야한다.
				매개변수리스트는 
				***
				매개변수의 갯수, 순서, 형태 중 하나 이상이 달라야 한다.
				
			3. 반환값과는 전혀 상관 없다.
				
	따라서
	다른 클래스에서 제작한 함수도 오버로딩이 가능하다.(상속 설명 후 다시 공부...)
	
====================================================================================

	생성자 함수 만드는 규칙
		
		1. 함수의 이름은 반드시 클래스이름과 동일하게 작성한다.(대소문자 포함)
		2. 반환값은 절대로 가지면 안된다. void 라고 작성해도 안된다.
		3. 매개변수는 가질 수 있다.
		
	
정리]
	
	생성자함수도 일반함수와 마찬가지로
	함수의 중첩( Overloading )이 가능하다.
	
	<== 필요에 따라서 그 클래스로 만드는 객체의 내용이 달라질 수 있기 때문에.....
	
				
 */
	public Test07() {}
	public Test07(float no) {
		System.out.println(no);
	}
	
	// 함수를 작성하는 위치는 클래스 블럭내에서는 아무곳이나 상관이 없다.
	
	// 정수와 문자열을 입력받아서 출력해주는 함수
	public void abc(int no, String str) {
		System.out.println(str + no);
	}
	
	// 순서가 변경되는 경우
	public void abc(String str, int no) {
		System.out.println(str + no);
	}
	
	// 타입이 변경되는 경우
	public void abc(float no, String str) {
		System.out.println(str + no);
	}
	
	/*
		위의 경우도 생성자함수를 오버로딩 해놓은 경우에 해당한다.
	 */

	/*
	 * public Test07(int no) { System.out.println(no); }
	 */
	public static void main(String[] args) {
		new Test07(3.14f);
		new Test07(314);
	}
}
