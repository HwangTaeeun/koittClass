package day04;

import java.util.Arrays;

/*
	배열의 복사
		1. 얕은 복사
			주소만 복사
			
			형식 ]
				데이터타입[] 변수이름 = 배열변수;
			
			: 데이터는 공유하므로 한곳이 수정되면
			  다른 곳의 데이터도 수정된 내용을 사용한다.
			
		2. 깊은 복사
			데이터를 복사
			
			형식]
				
				System.arraycopy( #1, #2, #3, #4, #5);
					#1 	: 원본데이터의 주소
					#2	: 원본데이터에서 복사할 시작위치
					#3	: 복사받을 배열의 주소
					#4	: 복사받을 주소의 시작위치
					#5	: 복사받을 데이터의 갯수
					
			: 데이터가 복사 되었다는 것은
			  Heap 영역에 다른 곳에 데이터(배열객체)가 한번 더 존재한다는 의미이므로
			  따라서 데이터(배열객체)의 주소가 달라지게 된다.
			  
			  ***
			  복사된 데이터(배열의 각 방의 데이터)는 독립적으로 사용된다.
			  
			  
	*****
	배열의 단점
		1. 한번 배열의 크기를 정하면 크기 조절이 불가능하다.
		2. 같은 형태의 데이터만 관리할 수 있다. ==> 한가지 타입의 데이터만 관리할 수 있다.
				
 */

public class Test01 {

	public Test01() {
		int[] num1 = { 3, 2, 6, 8, 9 };
		int[] num2 = new int[num1.length];
		
		System.out.println(Arrays.toString(num2));
		
		System.arraycopy(num1, 0, num2, 0, num1.length);
		num1[0] = 1 ;
		System.out.println(Arrays.toString(num2));
		
//		System.out.println(Arrays.toString(num2));
		
		// 배열의 단점 2번 참고 ==> Object 타입으로 모든 데이터가 자동형변환되서 입력된다.
		Object[] obj = new Object[10];
		obj[0] = "abcd";
		obj[1] = 1;
		obj[2] = 3.14f;
		obj[3] = true;
		obj[4] = 'Z';
		
		// Object 타입은 꺼내서 사용할 때 원래 데이터에 맞는 형태로 강제 형변환 해줘야 연산이 가능하다.
		float result = (int)obj[1] + (float)obj[2];
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
