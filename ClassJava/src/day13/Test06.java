package day13;


import java.text.*;

public class Test06 {
/*
	MessageFormat
		==> 특정 문자열에 특정 위치에 내용만 변경되는 경우
			문자열 전체를 만들지 않고
			변경되는 내용만 변형시켜서
			하나의 문자열을 만들어내는 클래스
			
		예를 들어
			우리가 지난번 공부했던 StringBuffer에서 
			Oracle 질의명령을 반환해주는 함수를 제작해서 사용했는데
			
			오라클에서 데이터를 조회하는 명령은
			SELECT 컬럼이름, 컬럼이름, ... FROM 테이블이름 WHERE 조건;
			의 형식으로 질의명령을 작성을 할 것이다.
			
			그렇다면 질의명령의 틀은 변형되는 것이 아니고
			전체의 일부분만 다른 문자열로 교체를 한다면
			사용 가능하겠다.
			
			이렇게 문자열을 여러개 만들 경우 처음부터 다시만들지 않고
			일부분만 수정해서 사용하도록 해주는 클래스가 
			MessageFormat 클래스이다.
			
			참고함수]
				parse(String source)
				==> 주어진 문자열 중에서 실제 변화되는 데이터 부분만 알아내는 함수
 */
	
	/*
		예제 6]
			전화번호를 관리하려고 하는데 형식이
				
				"Name : 홍길동, Tel : 010-7777-7777, Age : 24";
				"Name : 심청이, Tel : 010-9999-9999, Age : 20";
				
	 */
	public Test06() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		/*
			동일한 내용은 그대로 작성하고
			변경되는 부분만 인덱스를 붙여서(중괄호({})안에 넣어서) 기술한다.
			인덱스에는 입력되는 순서대로 데이터가 채워진다.
		 */
		
		
		// 전체를 저장할 배열을 만들고
		String[] addr = new String[2];
		
		// 인덱스에 들어갈 내용을 Object[] 로 준비를 한다.
		Object[][] obj = {{"홍길동", "010-7777-7777", 24},
				{"심청이", "010-9999-9999", 20}
		};
		
		int i = 0;
		String result = "";
		for(Object[] o : obj) {
			result = form.format(o);
			addr[i++] = result;
		}
		/*
		for(String s : addr) {
			System.out.println(s);
		}
		*/
		for(int j = 0 ; j < addr.length ; j++) {
			System.out.println(addr[j]);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
