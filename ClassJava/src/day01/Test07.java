package day01;

import java.util.*;

/*
	문제]
		밑변과 높이를 입력(정수)받아서 
		삼각형의 넓이를 구해서 
		출력해주는 프로그램을 작성하세요.
 */
public class Test07 {
	// 1. 진입점 함수 준비하고
	public static void main(String[] args) {
		// 2. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 3. 입력받아 저장하고
		
		// 밑변 입력받아 저장하고
		System.out.print("밑변 :");
		int width = sc.nextInt();
		
		// 높이 입력받아 저장하고
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		// 4. 계산하고
		float area = width * height / 2f;
//		float area = (float)(width * height) / 2;
		
		// 5. 출력하고
		/*
		 * System.out.print("밑변이 "); System.out.print(width);
		 * System.out.print(" 이고 높이가 "); System.out.print(height);
		 * System.out.print(" 인 삼각형의 넓이는 "); System.out.print(area);
		 * System.out.print(" 입니다. ");
		 */
		/*
			출력방법]
				1. println() : 출력해주고 줄바꿈해주는 메서드
				2. print()	: 내용을 출력하고 줄바꿈 하지 않는다.
				3. printf()	: 형식과 데이터를 입력해서 출력하는 방법
					형식 ]
						System.out.printf("형식문자열", 데이터1, 데이터2, 데이터3,....);
						
						형식에 사용되는 기호
							%s : 문자열
							%d	: 정수(십진수)
							%f	: 실수
							%c	: 문자
							%o	: 8진수 데이터
							%x	: 16진수 데이터
							%e	: 실수를 10지수방식으로 출력할때
							%b	: 논리값(true, false)
		 */
		
		System.out.printf("밑변 : %5d, \n높이 : %5d \n%s %.2f 입니다. ", 
								width, height, "인 삼각형의 넓이는", area);
	}
}
