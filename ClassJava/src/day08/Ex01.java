package day08;

/*
	Factorial : 1 부터 정수 n 까지의 곱
				수학 기호로 n! 로 표현한다.
	
	문제 1]
	1 ~ 20 까지의 곱을 구하세요.
		해결방법 ]
			1. 반복문으로 처리하는 방법
			
			2. 함수를 만들어서 처리하는 방법
				==> 재귀호출함수
 */
public class Ex01 {

	public Ex01() {
		useFor(20);	// 반복문으로 처리하는 함수
		
		// 재귀호출함수로 처리하는 방법
		System.out.println("calc(20) : " + calc(20));
	}

	public static void main(String[] args) {
		new Ex01();
	}
	
	// 반복문으로 처리하는 방법
	public void useFor(int no) {
		// 할일
		// 		누적된 값을 저장할 변수를 만들고
		long result = 1;
		
		// 반복해서 곱해준다.
		for(int i = 1; i < no + 1 ; i++ ) {
			result *= i; // ==> result = result * i;
		}
		System.out.println("useFor(20) : " + result);
	}
	
	// 재귀호출함수로 처리하는 방법
	/*
		재귀호출함수 : 현재 실행되는 함수가 그 함수의 블럭내에서 
						자기자신(그함수)을 호출하는 함수
						==> 계산식이 무지막지하게 짧아진다.	
	 */
	public long calc(int no) {
		// no가 1이 입력되는 순간 재귀호출이 멈춰야 한다.
		if(no == 1) return 1;
		return (long)no * calc(no - 1);
	}
}
