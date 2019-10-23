package day10;

public class Semo extends Dohyung {
	private int base;
	private int height;
	
	public Semo() {
		this(2, 1);
	}
	public Semo(int base, int height) {
		this.base = base;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = base * height / 2.;
	}

}
