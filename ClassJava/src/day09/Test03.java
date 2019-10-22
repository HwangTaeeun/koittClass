package day09;

public class Test03 {
/*
	Object 클래스
		: 	자바로 만들어진 클래스의 최상위 super 클래스
			따라서 자바로 만들어진 모든 클래스는 Object 의 멤버를 가지고 있고
			Object 가 제공하는 모든 기능(멤버 : 변수, 함수 )을
			자동적으로 사용할 수 있게 된다.
			
		참고]
			자바로 만든 모든 클래스는 반드시 상위 클래스를 가지고 있다.
			우리가 만드는 모든 클래스들도 상위 클래스가 존재하고
			만약 강제로 상위 클래스를 지정하지 않으면 ( ==> extends 하지않으면 )
			묵시적으로 Object 클래스를 상속 받아서 만들어진다.
			
		***
		자바로 만든 모든 클래스는 Object 클래스의 하위클래스이다.
		
	-------------------------------------------------------------------------------
	
	***
	instanceof
		==> 특정 클래스의 인스턴스를 만들면 주소가 만들어지는데
			이 주소가 어떤 클래스의 소속인지 알아내는 연산자
			결과는 true 또는 false 가 나온다.
			
			형식]
				주소	istanceof 	클래스이름
				
			의미]
				주소가 가리키고 있는 곳의 내용이
				지정한 클래스 소속인지를 물어보는 것
			
 */
	public Test03() {
		int no = 10;
		
		Object[] o = {1, "abcd", 'A', 3.14, true};
		
		Father1 f = new Father1();
		Grand1 g = new Grand1();
		System.out.println("1. : " + ("123" instanceof String));
		System.out.println("2. : " + (f instanceof Grand1));
		System.out.println("3. : " + (g instanceof Father1));
		
		
		for(int i = 0 ; i < o.length ; i++ ) {
			if(o[i] instanceof String) {
				// 문자열일 경우 처리할 내용
				System.out.println("문자열 : " + o[i]);
			} else if(o[i] instanceof Integer) {
				System.out.println("정  수 : " + o[i]);				
			} else if(o[i] instanceof Double) {
				System.out.println("실  수 : " + o[i]);				
			} else if(o[i] instanceof Character) {
				System.out.println("문  자 : " + o[i]);				
			} else if(o[i] instanceof Boolean) {
				System.out.println("논  리 : " + o[i]);				
			}
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}


class Abc {
	
}

class Grand1 {
	
}
class Father1 extends Grand1 {
	
}