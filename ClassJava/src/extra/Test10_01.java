package extra;

public class Test10_01 {
/*
	회원관리 프로그램을 만들 예정이다.
	회원의 아이디, 비밀번호, 가입일을 저장할 예정이고
	
	회원 아이디를 입력하면
	회원의 정보를 출력하는데
	출력형태는 
		
		H**g - **** - 2019/10/23
		
	형태로 출력되게 하세요.
	
	회원은 배열에(10개짜리) 넣어서 관리하세요.
 */
	public Test10_01() {
		String name = "Hong Gil Dong";
		String pw = "1234";
		
		String tmp = "";
		for(int i = 0 ; i < pw.length() ; i++) {
			tmp += '*';
		}
		
		String sname = "";
		for(int i = 0 ; i < name.length(); i++ ) {
			if(i == 0 || i == name.length() - 1) {
				sname += name.charAt(i);
			} else {
				sname += '*';
			}
		}
		
		System.out.println(sname + " - " + tmp);
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}
