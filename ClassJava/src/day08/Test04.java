package day08;

public class Test04 {
/*
	상속 ]
		:	이미 만들어진 클래스의 기능을 
			그대로 물려받아서(변수와 함수의 기능을 그대로 복사 받아서)
			새로운 클래스를 만드는 방법
			
			이 개념이 나타나게된 이유?
			<== 소프트웨어의 개발 속도를 빠르게 하기 위해서....
			
			즉, 상속은 객체지향 언어의 핵심이고 매우 중요한 역할을 한다.
			
			객체 지향언어는 부품 단위로(클래스단위로) 프로그램을 만든후
			그 부품을 조립해서 원하는 결과를 얻어내는 것....
			
		어디서 부품을 구했는데
		그 기능이 사용자의마음에 꼭 맞지 않을 수 있다.
		그럼 처음부터 다시 만들어야 할까요??
		==> 해결방법 : 상속
		
		
		상속은 자신이 만들고자 하는 부품과 가장 유사한 부품을 가지고 와서
		먼저 그 기능을 복사한 후
			1. 없는 기능은 덧 붙이고
			2. 있는 기능중 바꿀 내용은 바꾸고...
		
		
		
		상속을 하는 형식]
			
			[접근지정자] [속성] class 만들클래스이름 	extends 예전클래스이름 {
				예전클래스가 가진 모든 멤버는 이 안에 모두 복사되어 있다.
				믿습니까???
			 }
			 
		참고]
			자바에서는 오직 단일 상속만 가능하다.
			즉, 상속을 받을 클래스는 한개만 가능하다.(예전클래스에 하나만 기술할 수 있다.)
			
			예]
				public class Abc extends Xyz, Ddd {
				}  ==> 이렇게는 절대 안된다.
				
				
		용어정리]
			
			상속을 해준 클래스 - super class, 상위클래스, 부모클래스
			
			상속을 받은 클래스 - sub class, 하위클래스, 자식클래스
			
			
			is a		- 상속 관계에 있는 클래스를 부르는 용어 
				
				class Father {}
				
				class Son extends Father {}
				
				==> Son is a Father
			
			has a		- 어떤 클래스 안에 다른 클래스를 멤버로 가지고 있는 상태
				
				class Father{}
				
				class Son{
					Father f = new Father();
				}
				
				==> Son has a Father 가 성립된다.

	===============================================================================
	
	***
	함수의 오버라이딩( Overriding : 함수의 재정의 )
		==> 상속관계에 있는 하위 클래스에서
			상위 클래스가 가진 함수의 기능을 수정하는 행위
			
		규칙]
			0. 전재조건으로 상속을 받아야 한다.
			1. 상위 클래스가 가진 함수의 원형과 동일해야 한다.
				함수의 원형 : 반환값 + 함수이름 + 매개변수리스트
			2. 접근지정자는 같거나 넓은 방향으로...
			3. 예외처리는 같거나 좁은 방향으로...
 */
	public Test04() {
		Grand g = new Father();
//		System.out.println(g.money); // Grand 의 멤버에 없는 멤버라 사용 불가
		
//	***	String str = (String) new Object();
		
//		Father f1 = new Grand();	// Grand의 인스턴스에는 Father의 멤버가 부족하다.
//	***	Father f = (Father) new Grand();
		// 강제로 사용할 경우 강제 형변환 해주면 된다.
		// 단 상속 관계에 있는 경우에 한해서 가능한 이야기이다.
		
		
		Grand g2 = new Son();
		System.out.println("g2 tlnee : " + g2.tlnee);
		System.out.println("g2 tlnee : " + ((Son)g2).money);
		System.out.println("g2 age : " + g2.age);
//		System.out.print("g2 abc overloading : " + g2.abc("")); // ==> Grand에 오버로딩한 함수는 멤버로 있지 않으므로 호출 불가... 
		System.out.print("g2 abc : "); 
		g2.abc();
		
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}

class Grand {
	int age = 80;
	boolean tlnee = true;
	public void abc() {
		System.out.println("여기는 Grand");
	}
}

class Father extends Grand {
	int age = 50;
	int money = 1000;
	public void abc() {
		System.out.println("여기는 Father");
	}
}

class Son extends Father {
	int age = 20;
	
	String talmo = "안돼";
	public String abc(String s) { // ==> 이경우는 문자열 타입을 입력해서 호출하는 방법을 추가한 오버로딩이다.
	
			return "Overloading";
	}
	public void abc() {
		System.out.println("여기는 Son");
	}
}


