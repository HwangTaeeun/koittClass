package day02;

public class Test16 {

	public Test16() {
		// 반복문을 10회 반복하는데
		// for 문의 i가 3일때 반복문을 중지하세요.
		/*
		for(int i = 0 ; i < 10; i++ ) {
			if(i == 3) break;
			
			System.out.println(i);
		}
		*/
		
		
		// 4회차일경우 건너뛰고 다음회차로 진행하세요.
		/*
		for(int i = 0; i < 10 ; i++ ) {
			if(i == 3) continue;
			
			System.out.println(i);
		}
		*/
		
		// label 이 붙은 for 명령
		abcd:
		for(int i =0; i < 10 ; i++) {
			for(int j = 0 ; j < 10; j++) {
				if(i == 2 && j == 2) break abcd;
				System.out.print("###" + i + " - " + j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test16();
	}

}
