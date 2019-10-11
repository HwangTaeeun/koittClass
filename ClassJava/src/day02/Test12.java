package day02;

/*
	for 반복문 : 형식에 카운터변수가 추가가 되어 있다.
		형식]
			for(카운터변수; 조건식;증감식){
				실행문
			}
			
		일반적인 사용법]
			for(int i = 0 ; i < no ; i++){
			
			}
 */
public class Test12 {

	public Test12() {
		// 숫자를 1 ~ 9까지 출력하세요.
		for(int i = 0 ; i < 9; i++) {
			System.out.println(i+1);
		}
		
		// 문제 ] 위 문제를 증감식을 -- 를 사용해서 처리하세요.
		for(int i = 0 ; i < 30 ; i++) {
			System.out.print("#");
		}
		System.out.println();
		
		for(int i = 8; i >= 0; i--) {
			System.out.println(9 - i);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
