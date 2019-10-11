package day02;


public class Test04 {
	public static void main(String[] a) {
		/*
			if ~ else 구문 :
				- 조건식에 맞는 경우와 맞지 않는 경우를 구분해서 처리해준다.
				
				형식]
					1
					if(조건식 - 2){
						참일경우 실행 명령들... - 3
					} else {
						거짓일 경우 실행 명령들... - 4
					}
					- 5
					
					조건식이 참일경우 : 1 -> 2 -> 3 -> 5
					조건식이 거짓일 경우 : 1 -> 2 -> 4 -> 5
		 */
		System.out.println("1. start");
		if(2 < 3) {
			System.out.println("3. 2는 3보다 작습니다.");
		} else {
			System.out.println("4. 2는 3보다 큽니다.");
		}
		System.out.println("5. stop");
		
		/*
			참고]
				조건문 내부에 다시 조건문을 사용할 수 있다.
				if(조건){
					if(조건2){
					
					} else {
					
					}
				} else {
					if(조건3){
					
					} else {
					
					}
				}
		 */
		
	}
}
