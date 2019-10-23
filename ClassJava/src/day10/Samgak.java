package day10;

public class Samgak implements Figure {
	// º¯¼ö ¼±¾ğ
	private int base;
	private int height;
	private double area;
	
	public Samgak() {
		this(2, 1);
	}
	
	public Samgak(int base, int height) {
		this.base = base;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = base * height / 2d;
	}

	@Override
	public void toPrint() {
		System.out.printf("»ï°¢Çü - ¹Ø  º¯ : %3d | ³ô  ÀÌ : %3d | ³Ğ  ÀÌ : %6.2f\n", base, height, area);
	}
	

}
