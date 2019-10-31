package day16;

import java.io.*;

/*
	Test04.java 파일을 읽고 출력해 보자. 
 */

public class Test05 {

	public Test05() {
		// 파일에 연결할 스트림을 준비한다.
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day16/Test04.java");
			/*
			// 1. 한글자만 읽어보자.
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			/*
			// 2. 여러 글자를 읽자
			// 읽은 데이터를 저장할 배열을 만들고
			byte[] buff = new byte[1024];
			// 스트림에 저장된 데이터를 꺼내서 배열에 담고
			int len = fin.read(buff);
			
			// byte[] 을 문자열로 변환하고
			String str = new String(buff);
			System.out.println(str);
			*/
			
			// 파일 전체의 내용을 읽는다.
			// 몇글자를 읽어서 끝날지 모르기 때문에...
			String str = "";
			while(true) {
				// 먼저 읽은 데이터를 저장할 배열을 만들고
				byte[] buff = new byte[1024];
				
				// 배열에 읽어서 채운다.
				int len = fin.read(buff);
				System.out.println("읽어온 데이터 수 : " + len);
				if(len == -1) {
					// 더이상 읽어올 데이터가 없으므로 종료시킨다.
					break;
				}
				str += new String(buff, 0, len);
			}
			
			System.out.println(str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
