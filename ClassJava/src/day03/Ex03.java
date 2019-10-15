package day03;

/*
	문제 3]
		3자리 숫자를 입력받아서(100 ~ 999 사이의 숫자)
		이 숫자에서 가장 가까운 100의 배수를 만들기 위해서
		얼마가 필요한지 계산하여 출력하세요.
		
		예]
			231 은 200 가까우므로 31을 빼야된다
			578 은 600에 가까우므로 22 를 대해줘야한다.
			
			555 ==> 600
			514  ==> 500
 */

import java.util.*;

public class Ex03 {

	public Ex03() {
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 입력받아서 저장하고
		System.out.print("세자리 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 3. 계산하고
		//		먼저 변수를 준비하는데 100으로 나눈 몫을 정할 변수와
		//		100으로 나눈 나머지를 저장할 변수를 만든다.
		int baek = num / 100;
		int namuji = num % 100;
		
		// 보여줄 숫자 변수를 만들고
		int result = 0;
		if(namuji < 50) {
			result = baek * 100;
		} else {
			result = (baek + 1) * 100;
		}
		
		// 4. 출력하고
		System.out.println("입력한 숫자 [ " + num + " ] 은 [ " + result + " ] 에 가까운 숫자입니다.");
		
	}

	public static void main(String[] args) {
		new Ex03();
	}
	
	/*
		심화 학습 ]
			반복문으로 처리해서 매번 입력하는 세자리 숫자의 결과를 위처럼 출력하고
			특정 문자가 입력되면 해당 프로그램이 종료되게 처리하세요.
			단, 함수를 만들어서 호출해서 사용하세요.
			
		참고]
			무한반복시키는 반복문
				
				while(True){}
				
				for(;;){}
				
	 */

}
