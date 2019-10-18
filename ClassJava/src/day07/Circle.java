package day07;

public class Circle {
	int radius;
	double arround;
	double area;
	
	public double getArround(int radius) {
		return 2 * radius * 3.14;
	}
	
	public double getArea(int radius) {
		return radius * radius * 3.14;
	}
}
