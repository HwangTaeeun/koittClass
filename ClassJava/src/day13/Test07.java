package day13;

import java.text.*;
import java.util.*;

/*
	예제 7]
		데이터베이스에 
			이름	: name
			전화	: tel
			나이	: age
		로 입력하도록 테이블 만들어 놓았다.
		
		그런데 특정이 이름(홍길동)으로 조회하는 질의 명령은
			
			"
			SELECT 
				name, tel, age
			FROM
				friend
			WHERE
				name = '홍길동'
			"
			
		이런 형식으로 질의명령이 만들어지는데
		이름을 입력받아서 질의명령을 완성하는 프로그램을 작성하세요.
 */
public class Test07 {

	public Test07() {
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT ");
		buff.append("	name, tel, age ");
		buff.append("FROM ");
		buff.append("	member ");
		buff.append("WHERE ");
		buff.append("	name = ");
		buff.append("{0}");
		
		// StingBuffer 를 String 으로 변환해서 MessageFormat 을 만든다.
		MessageFormat form = new MessageFormat(buff.toString());
		
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지출력하고 입력받고
		System.out.println("검색할 친구의 이름 : ");
//		String sname = sc.nextLine();
		String sname = "'"+sc.nextLine() + "'";
		// 데이터채워서 질의명령 완성하고
		Object[] obj = {sname};
		String msg = form.format(obj);
		
		// 완성된 질의 명령 출력
		System.out.println("입력한 [ " + sname + " ]의 정보질의명령 :\n" + msg);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
