package day08;

public class Test02 {

	/*
		static(정적) 속성
			==> static 영역에 생겨지는 함수나 변수를 말한다.
			
			static 영역의 특징
				1. 프로그램이 실행되기 위해서 JVM이 로딩되는 순간 저절로 만들어지는 영역
					따라서 사용자가 특별히 만들어 달라고 요청하지 않아도 자동적으로 생기는 영역
					
				***
				2. 한번 생긴 변수나 함수는 두번다시 생기지 않는다.
				
			Static 변수
				==> static 영역에 만들어지는 변수(속성에 static 이 붙은 변수)
					참고]
						변수 선언형식]
							
							[접근지정자]	[속성]	타입	변수이름;
							public 			static	int		no;
							
				특징]
					1. 여러 객체(Object)가 공동으로 사용하는 변수
						==> 객체를 100개를 만들어도 
							static 변수는 오직 하나만 존재한다.
						따라서 한 객체에서 데이터를 바꾸면
						다른 객체에서도 바뀐 데이터를 사용해야 한다.
						
						그러므로 결국 static 변수는 객체의 의미가 없다.
						
					2. new 시키지 않아도 사용할 수 있는 변수이다.
						<== 이미 메모리에 올려져 있으니까...
						
						사용법]
								클래스.변수이름;
			
		---------------------------------------------------------------------------
		
		Static 함수
			==> 변수와 마찬가지로 static영역에 생기는 함수
				따라서 객체(레퍼런스 + 인스턴스)가 없어도 사용할 수 있다.
				
				사용방법]
						
						클래스이름.함수이름();
						
				***
				this를 사용할 수 없는 함수
				
			**
			static 함수 안에서는 static 멤버만 사용할 수 있다.
			일반 함수 안에서는 일반 멤버와 static 멤버도 사용할 수 있다.
		
			
	 */
	public Test02() {
		
	}
	
	private int no1;
	
	public static final float PI = 3.14f;
	
	public static void main(String[] args) {
		int num = new Test02().no1;
		
//		int num1 = this.PI;
		/*
			static 변수는 this를 사용할 수 없다.
		 */
//		abc();
		// static 함수 내에서는 static 멤버와 인스턴스의 멤버만 호출 할 수 있다.
		// ==> 메모리에 올려진 애들만 불러올 수 있다.
		
		new Test02().abc();
	}
	
	public void abc() {
		
	}

}
