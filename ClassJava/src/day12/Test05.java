package day12;

import java.util.*;

public class Test05 {

/*
	Random 클래스
		==> 난수를 발생하는 클래스
			우리가 알고 있는 Math.random() 보다는 
			좀 더 다양한 형태의 난수를 발생시킬 수 있다.
			
			참고]
				seed
					컴퓨터에서 난수 발생은 그 순간 실제로 난수를 만들어 내는 것이 아니고
					이미 난수는 컴푸터에 난수 테이블에 존재하고
					난수 테이블에서 순서대로 꺼내서 주는 방식으로 처리를 한다.
					
					seed란
					그 꺼내는 난수 테이블을 이야기를 한다.
 */
	public Test05() {
		Random random = new Random();
		random.setSeed(0);
		int no1 = random.nextInt();
		int no2 = random.nextInt();
		int no3 = random.nextInt();
		System.out.println(no1 + " | " + no2 + " | " + no3);
		//-1155484576 | -723955400 | 1033096058
	}

	public static void main(String[] args) {
		new Test05();
	}

}
