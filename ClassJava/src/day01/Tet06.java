package day01;

import java.util.*;
// 이미 누군가 만들어놓은 클래스의 기능을 사용하고 싶은 경우 
// 해당 클래스를 가져오는 명령
// 형식]	import 패키지경로.클래스이름;  또는    import 패키지경로.*;


/*
	문제 ]
		가로와 세로의 길이(정수)를 입력받아서 사각형의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
		
		방법]
			0. 진입점함수 준비하고
			1. 입력도구 준비하고
			2. 입력받은 데이터 저장하고  X 2
			3. 계산해서 출력하고
			
 */
public class Tet06 {
	// 1. 진입점 함수 준비하고
	public static void main(String[] args) {
		// 2. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 3. 입력값 저장하고 -- 두번
		System.out.print("가로 길이 : ");
		int garo = sc.nextInt();
//		System.out.println();
		System.out.print("세로 길이 : ");
		int sero = sc.nextInt();
//		System.out.println();
		// 4. 계산하고
		int area = garo * sero;
		// 5. 출력하고
		System.out.println("가로가 " + garo + " , 세로가 " 
							+ sero + " 인 사각형의 넓이는 " + area + " 입니다.");
	
	}
}
