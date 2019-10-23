package day10;

public class Circle extends Dohyung {
	private int rad; // 반지름 저장할 변수
	
	public Circle() {
		this(1);
	}
	
	// 반지름이 입력되면 원을 만들어주는 생성자 함수
	public Circle(int rad) {
		this.rad = rad;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	
	/*
		추상함수를 오버로딩해도 상관없다.
	public double setArea(int rad) {
		return 1.;
	}
	*/

	@Override
	public void toPrint() {
		System.out.printf("원  형 - 반지름 : %3d | 넓  이 : %6.2f\n", rad, area);
	}
}
