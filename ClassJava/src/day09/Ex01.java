package day09;


/*
	도형 클래스를 상속받아서
	사각형, 삼각형, 원 클래스를 작성하고
	
	배열에 10개의 데이터를 저장하는데 도형타입으로 저장을 하는데
	랜덤하게 0, 1, 2 를 발생해서
	0 - 원
	1 - 삼각형
	2 - 사각형
	을 만들고 저장하고
	
	각 데이터의 정보를 출력해주는 기능을 가진 toPrint()를 재정의하고
	실행하세요.
	
 */
public class Ex01 {
	
	public Ex01() {
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

class Dohyung {
	double area;
	
	public void setArea() {
		this.area = 0;
	}
	
	public void toPrint() {
		System.out.println("여기는 도형클래스");
	}
}
