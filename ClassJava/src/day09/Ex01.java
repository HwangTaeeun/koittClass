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
		// 할일
		// 도형을 10개 담을 수 있는 배열을 만들고
		Dohyung[] d1 = new Dohyung[10];
		
		// 반복해서 랜덤하게 도형을 집어 넣어주고
		for(int i = 0 ; i < d1.length ; i++ ) {
			// 랜덤하게 숫자를 0 ~ 2 뽑아서
			int proto = (int)(Math.random() * 3);
			
			switch(proto) {
			case 0:
				d1[i] = new Circle((int)(Math.random() * 26) + 5);
				break;
			case 1:
				d1[i] = new Semo((int)(Math.random() * 6) + 3, (int)(Math.random() * 6) + 3);
				break;
			case 2:
				d1[i] = new Nemo((int)(Math.random()*11 + 10), (int)(Math.random()*11 + 10));
				break;
			}
		}
		
		// 출력한다.
		for(int i = 0 ; i < d1.length ; i++ ) {
			d1[i].toPrint();
		}
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

// 원 클래스를 만든다.
class Circle extends Dohyung {
	int rad;
	
	public Circle() {
		// 기본 생성자 함수
		// 데이터를 입력하지 않는 경우에는 반지름이 [ 1 ]로 셋팅이 되도록 해보자.
		// 그런데 변수들의 초기화는 아래 데이터가 입력되서 실행되는
		// 생성자함수를 만들어 놓았으므로 그 함수를 호출해주면
		// 반지름 셋팅 + 면적계산 까지 해결이 된다.
		this(1);
	} 
	
	public Circle(int rad) {
		// 반지름을 입력해서 원의 객체를 만드는 생성자 함수
		this.rad = rad;
		// 반지름이 입력이 되면 면적도 계산이 된다.
		// 그 기능은 아래 setArea()를 오버라이딩(함수의 재정의)로 처리해 놓았으므로
		// 함수를 호출만 해주면 된다.
		setArea();
	}
	
	public void setArea() {
		this.area = this.rad * this.rad * Math.PI;
	}
	
	public void toPrint() {
		System.out.println("원 : 반지름 - " + rad + " | 면적 - " + area);
	}
}

// 삼각형 클래스를 만든다.
class Semo extends Dohyung {
	int width;
	int height;
	
	// 기본 생성자함수
	public Semo() {
		this(1, 2);
	}
	// 데이터입력하는 생성자 함수
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		this.area = width * height / 2d;
	}
	
	public void toPrint() {
		System.out.println("세모 : 밑변 - " + width + " | 높이 - " + height + " | 면적 - " + area);
	}
	
}

// 사각형 클래스를 만든다.
class Nemo extends Dohyung {
	// 변수 선언
	int width;
	int height;
	
	// 생성자 함수
	public Nemo() {
		this(1, 1);
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	public void setArea() {
		this.area = this.width * this.height;
	}
	
	public void toPrint() {
		System.out.println("네모 : 가로 - " + width + " | 세로 - " + height + " | 면적 - " + area);
	}
}