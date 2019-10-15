package day04;

import java.util.Arrays;

/*
	배열 정렬하기
		
		0 ~ 99 까지의 숫자를 랜덤하게 10 만들어서 배열에 저장하고
		크기가 작은 순으로 배열을 정렬하세요.
 */

public class Test02 {

	public Test02() {
		System.out.println(Arrays.toString(getIntArr()));
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// 이 함수는 랜덤하게 만든 정수 10개를 저장하고 반환해주는 함수
	public int[] getIntArr() {
		// 정수 10개를 관리할 배열을 만든다.
		int[] num = new int[10];
		
		// 랜덤하게 숫자를 발생시킨다. x 10
		makeNum:
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random() * 99 + 1);
			
			// 만약 중복된 값이 만들어지면 다시 뽑는다.
			for(int j = 0 ; j < i ; j++) {
				if(num[j] == no) {
					i--;
					continue makeNum;
				}
				// 이 라인을 읽는 경우는 위의 조건문에 맞는 경우가 없으므로 중복되는 값이 없는 경우다.
			}
			
			num[i] = no;
		}
		
		return num;
	}
}
