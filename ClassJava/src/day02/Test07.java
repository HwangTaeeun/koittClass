package day02;



/*
	switch ~ case 조건문
		형식]
			switch(변수){
				case 데이터1:
					실행문1;
					break;
				case 데이터2:
					실행문2;
					break;
				...
				default:
					실행문;
			}
 */
public class Test07 {
	
	private int num1 = 100;
	int num2 = 200;
	protected int num3 = 300;
	public int num4 = 400;
	
	public Test07() {
		System.out.println(num4);
		
	}

	public static void main(String[] args) {
		int no = 3;
		String str = "";
		switch(no) {
		case 1:
			str = "하나";
			break;
		case 2:
			str = "둘";
			break;
		case 3:
			str = "셋";
			break;
		case 4:
			str = "넷";
			break;
		default:
			str = "다섯이상";
		}
		
		System.out.println(no + " | " + str);
	}

}
