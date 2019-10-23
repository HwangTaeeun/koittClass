package day10;

public class Sagak implements Figure {
	// 변수 선언
	private int width;
	private int height;
	private double area;
	
	public Sagak() {
		
	}
	
	// 가로와 세로를 입력하면 사각형을 만들어주는 생성자 함수
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("사각형 - 가  로 : %3d | 세  로 : %3d | 넓  이 : %6.2f\n", width, height, area);
	}

}
