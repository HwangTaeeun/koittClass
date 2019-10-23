package day10;

public class Nemo extends Dohyung {
	private int width;
	private int height;
	
	public Nemo() {
		
	}
	
	public Nemo(int width, int height) {
		this.width = width;
	}

	@Override
	public void setArea() {
		this.area = width * height;
	}

}
