package day16;

import java.io.*;
import java.util.Arrays;

/*
	키보드를 이용해서 문자를 입력 받아보자.
 */
public class Test04 {
	/*
		참고]
			키보드 역시 외부 장치이다.
			자주 사용하는 외부장치이기  때문에
			이미 스트림을 준비한 변수가 존재한다.
			==>
				System.in
	 */
	public Test04() {
		System.out.println("한글자를 입력하세요.");
		
		// 입력한 데이터를 저장할 변수 선언
		int ch = 0;
		
		try {
			/*
			// 입력된 문자는 이미 System.in에 저장이 되어 있고
			// 타입은 InputStream 이다. 따라서 읽어서 저장만 하면 된다.
			ch = System.in.read();
			//출력한다.
			System.out.println("당신이 입력한 문자 : " + (char)ch);
			System.out.println("당신이 입력한 문자 코드값 : " + ch);
			 */
			
			// 2. 여러문자를 동시에 받아서 출력해보자.
			// 먼저 읽은 결과를 저장할 변수를 만든다.
			byte[] buff = new byte[256];
			// 256 이란 숫자는 한번에 읽어올 데이터의 숫자를 정하는 결과가 된다.
			// 한번에 읽어올 데이터의 갯수가 된다.
			Arrays.fill(buff, (byte)'$');
			
			/*
			// 스트림의 데이터 모두를 읽어오는 방법
			int len = System.in.read(buff); 
			*/
			
			// 스트림의 데이터중 일부만 읽어오는 방법
			int len = System.in.read(buff, 0, 5);
			
			// 실행이 되면 배열에 데이터는 채워진다.
			// 채워진 배열을 문자열로 변환하고
			String str = new String(buff);
			str = str.replace("\r\n", "$$");
			System.out.println(str);
			System.out.println(str.length());
			System.out.println("처리한 데이터 수 : " + len);
//			System.out.println(Arrays.toString(buff));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
