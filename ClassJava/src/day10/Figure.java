package day10;

public interface Figure {
	// 이 경우 인터페이스의 변수는 자동적으로
	// public static final 변수가 되므로...
	// 여기서는 사용하지 않겠다.
	
	// 면적을 구해주는 함수
	void setArea(); 
	// 이경우 따로 선언하지 않아도
	// 인터페이스의 추상함수는 자동적으로 public abstract 가 붙게 된다.
	
	void toPrint();
}
