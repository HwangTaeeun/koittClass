package day02;

/*
	향상된 for 명령
		형식]
			for(데이터타입 변수이름 : 시퀀스형데이터[변수]){
				변수이름 사용해서 실행...
			}
 */
public class Test13 {

	public Test13() {
		
		int[] num = {1,2,3,4,5};
		
		int[] arr1 = new int[5];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0 ; i < 30 ; i++ ) {
			System.out.print("#");
		}
		System.out.println();
		
		for(int no : arr1) {
			System.out.println(no);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
