package day10;

public class Won implements Figure {
	// 데이터를 저장할 변수를 선언하고
	private int rad;
	private double area;
	
	public Won() {
		this(1);
	}
	
	public Won(int rad) {
		this.rad = rad;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("원  형 - 반지름 : %3d | 넓  이 : %6.2f\n", rad, area);
	}

}
