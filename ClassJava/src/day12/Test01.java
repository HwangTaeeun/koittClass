package day12;

public class Test01 {
/*
	Object 클래스
		:  	자바의 최상위 클래스
			모든 클래스는 Object를 상속받아서 만들어진다.
			따라서 모든 클래스는 Object 가 가지고 있는 멤버는 모두 가지고 있다.
			비록 오버라이딩 하더라도...
			
			clone()
				==> 자기 자신을 깊은 복사를 해주는 함수
					이 함수는 접근지정자가 protected 이므로
					자기자신의 내부에서는 사용이 가능하지만
					다른 클래스에서 이 객체를 복사할 경우에는 사용 못한다.
					따라서 접근지정자를 public 으로 바꿔서 오버라이딩을 해줘야 한다.
					
					
			hashCode()
				==>	자바는 주소를 노출하지 않기 위해서
					해쉬테이블을 이용해서 주소를 관리한다.
					그 해쉬테이블의 주소를 관리하는 코드값을 알아주는 함수
					
 */
	public Test01() {
		Test_01 t1 = new Test_01();
		
//		Test_01 tt = t1.clone(); // ==> clone() 접근지정자는 protected 이다...
		Test_01 tt = null;
		
		try {
			tt = (Test_01) t1.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}

class Test_01{
	int no = 10;
	
	public Object clone() throws CloneNotSupportedException {
		
		return this;
	}
}
