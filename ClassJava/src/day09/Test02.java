package day09;

public class Test02 {
/*
	super
		: 	this가 실행중인 자신의 주소를 기억하는 예약된 변수이듯이
			super 역시 예약된 변수 중 하나
			자신의 상위 클래스의 주소가 기억된 변수
			
			사용목적]
				반드시 소속을 밝혀야 하는 경우에 사용한다.
				
			
 */
	public Test02() {
		Father f = new Father();
		f.call();
		
		Son s = new Son();
		s.call();
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Grand {
	public void abc() {
		System.out.println("여기는 Grand");
	}
}

class Father extends Grand {
	public void abc() {
		System.out.println("여기는 Father");
	}
	
	public void call() {
		super.abc();
	}
}

class Son extends Father {
	public void call() {
/*
		super.super.abc();
		
		==> super 는 현재 실행되는 객체를 기준으로 주소를 기억하는 변수이므로
			Father 클래스는 현재 실행되는 클래스가 아니므로 .super 를 사용할 수 없다.
 */
		super.call();
	}
}
