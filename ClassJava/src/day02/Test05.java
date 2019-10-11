package day02;

/*
	if ~ else if 구문
		조건이 여러개일경우 분리해서 처리하는 조건문
		
		형식]
			if(조건식1){
				실행문 1
			} else if (조건식2){
				실행문 2
			} else if (조건식3){
				실행문 3
			} else if (조건식3){
			
				...
			} else {
				모든 조건에 해당하지 않는 경우 실행할 문장...
			}
			
			
 */
public class Test05 {

	public static void main(String[] args) {
		/*
		 * 	59 이하의 두자리 숫자를 입력해서
			23 이라는 숫자가 있다면 이 숫자는 십의자리가 20 입니다.
		 */
		
		int no = 33;
		int result ;
		if(no  >= 50) {
			result = 50;
		} else if(no >= 40) {
			result = 40;
		} else if(no >= 30) {
			result = 30;
		} else if(no >= 20) {
			result = 20;
		} else {
			result = 10;
		}
		
		System.out.println("입력된 숫자 " + no + " 는 10의 자리가 " + result + " 입니다.");
	}

}
