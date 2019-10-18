package day07;

public class Test05 {

	/*
		콘솔화면에 데이터를 출력하는 방법
			
			1. System.out.print();
				==> 데이터를 출력하고 다음 함수(print())실행시 데이터를 먼저번 출력 뒤에 이어서 출력한다.
			2. System.out.println();
				==> 데이터를 출력하면 무조건 줄바꿈이 일어난다.
			3. System.out.printf(출력형식, 데이터1, 데이터2, ....);
				==> 출력의 형태를 만들어서 출력해주는 함수
				
				형식을 만드는 방법
					
					%x	- 16진수로 출력
					%o	- 8진수로 출력
					%d	- 10진수
					
					%e	- 지수형태로 출력
					%b	- 논리값을 출력
					%c	- 문자
					%f	- 실수
					%s	- 문자열
					
					길이를 정해줄 수 있다.
					%10s  	==> 문자열을 10자리에 맞춰서 출력해라
					%5d 	==> 10진수를 5자리에 맞춰 출력해라
					%f
					
	 */
	public Test05() {
		double pi = Math.PI;
		System.out.printf("%10s : %.5f\n", "파이값", (pi+10));
		System.out.printf("%10s : %x", "파이값", (int)(pi+10));
	}

	public static void main(String[] args) {
		new Test05();
	}

}
