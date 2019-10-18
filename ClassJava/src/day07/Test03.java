package day07;

public class Test03 {

	public Test03() {
		Circle[] won = new Circle[5];
		
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i] = new Circle();	// 인스턴스 생성
			won[i].radius = i+1; 	// 반지름입력
			won[i].arround = won[i].getArround(won[i].radius);
			won[i].area = won[i].getArea(won[i].radius);
		}
		
		for(int i = 0 ; i < won.length ; i++ ) {
			System.out.print((i + 1) + " 번째 원의 반지름 : " + won[i].radius);
			System.out.print(" | " + won[i].arround);
			System.out.print(" | " + won[i].area);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
