package day10;

public class Test03 {
/*
	다형성
		상속관계에 있는 클래스들 중
		상위 클래스의 변수로 하위클래스들의 인스턴스를 담을 수 있는 게 한 규칙
		
		상속관계에서의 형변환
			: 형변환을 할 수 있는 전제 조건은 상속관계에 있을 때...
			
			1. 자동 형변환
				: 하위 클래스의 인스턴스를 상위클래스의 변수에 입력할 때
				
			2. 강제 형변화
				: 상위 클래스의 변수를 하위클래스의 변수에 입력할 때
					
					원칙적으로는 불가능하며
					강제로 형변환은 가능은 하다.
				
 */
	public Test03() {
		Grand g1 = new Father();
		Grand g2 = new Son();
		Father f1 = new Son();
		
//		g2.abc(); - x ==> Grand의 멤버로 abc() 가 정의 되어 있지 않기 때문에...
		
//		Father f2 = (Father)new Grand();
		Father f2 = (Father)g1;
	}

	public static void main(String[] args) {
		new Test03();
	}

}


class Grand {
	int no = 10;
}

class Father extends Grand {
	public void abc() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public void abc() {
		System.out.println("Son");
	}
}