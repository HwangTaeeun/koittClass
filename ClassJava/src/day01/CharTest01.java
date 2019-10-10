package day01;

public class CharTest01 {
/*
	여기는 멀티라인 주석부분
*/
//	여기는 단일행 주석
	
	// 정수 1004를 저장할 변수 num을 만드세요.
	int num = 1004;
	
	public static void main(String[] args) {
		char ch1 ; // 문자 변수 선언
		ch1 = 'A';
		System.out.println("ch1 : " + ch1);

		char ch2 = 65 + 1 ;
		System.out.println("ch2 : " + ch2);
		
		int tmp = ch1 + 3;
		char ch3 = (char)(tmp + 5);
		System.out.println("ch3 : " + ch3);
		
//		System.out.println("num : " + num);
	}
}