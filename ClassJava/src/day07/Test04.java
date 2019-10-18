package day07;

/*
	원을 3를 관리할 배열을 만들고
	랜덤하게 반지름을 만들어서
	배열의 원들을 초기화 하세요.
 */
public class Test04 {

	public Test04() {
		// 할일
		// 	1. 원을 3개를 관리할 배열을 만든다.
		Circle01[] won = new Circle01[3];
		// 	2. 원의 반지름을 랜덤하게 만들어서 원의 객체를 배열에 넣는다.
		for(int i = 0 ; i < won.length ; i++ ) {
			// 생성자함수를 호출할 때 반지름이 필요하므로 먼저 랜덤하게 반지름을 만든다.
			// 반지름의 범위는 1 ~ 10 까지 만들어지게 하자.
			int radius = (int)(Math.random() * 10) + 1 ;
			
			// 반지름으로 원의 객체를 하나씩 만들어서 각 방에 넣어주자.
			won[i] = new Circle01(radius);
		}
		// 	3. 원의 반지름, 둘레, 넓이를 출력한다.
		
		int idx = 1;
		for(Circle01 c : won) {
			System.out.printf("%3d ] %12s - %3d | %3s - %5.2f | %3s - %6.2f\n", idx++ , "번째 원의 반지름", c.radius, "둘레", c.arround, 
								"넓이", c.area
								);
			System.out.printf("%3d ] 번째 원의 반지름  - %3d | 둘레 - %5.2f | 넓이 - %6.2f\n", 
								idx++ , c.radius, c.arround, c.area );
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
