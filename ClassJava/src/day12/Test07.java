package day12;

import java.math.BigDecimal;

public class Test07 {

	/*
		BigDecimal
			==> 정수로 표현할 수 없는 숫자를 사용하기 위해서 만들어진 클래스
			
				주로 데이터베이스와 연동할 때
				오라클을 예로 들자면 
				오라클의 숫자를 다루는 데이터타입은 number(숫자)
				오라클에서의 숫자는 36자리까지 저장을 할 수 있다.
				이런 데이터는 자바에서는 다룰수 있는 방법이 없으므로
				(자바에서 오라클의 데이터를 다룰만큼 큰 데이터타입은 존재하지 않으므로)
				이런 유형의 데이터를 처리할 목적으로 만들어진 클래스이다.
				
				
			예]
				BigDecimal big = new BigDecimal("1234567891234567890");
	 */
	public Test07() {
		BigDecimal big = new BigDecimal("100");
		
		int num = big.intValue();
		System.out.println("big.intValue() : " + num);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
