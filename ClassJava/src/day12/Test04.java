package day12;

import java.util.Objects;

public class Test04 {
/*
	Objects
		==>	이 클래스는 100% static 함수로만 구성된 클래스
			객체를 다룰때 유용한 몇가지 유틸리티적인 함수로 구성된 클래스
			
			예]
				isNull(Object obj)
				==>	객체에 내용이 있는지를 확인하는 함수
 */
	public Test04() {
		int[] num1 = null ;
		int[] num2 = new int[0];
		System.out.println("int[] num1 = null : " + Objects.isNull(num1));
		System.out.println("int[] num2 = new int[0] : " + Objects.isNull(num2));
	}

	public static void main(String[] args) {
		new Test04();
	}

}
