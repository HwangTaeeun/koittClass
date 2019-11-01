package day17;

import java.io.*;

/*
	Test01에서 저장한 파일(poem.txt)을 
	문자단위 스트림으로 읽어보자.
 */

public class Test02 {

	public Test02() {
		// 1. 스트림 준비하고
		FileReader fr = null;
		// 문자열 저장변수
		StringBuffer str = new StringBuffer();
		
		try {
			fr = new FileReader("src/day17/poem.txt");
			
			/*
			// 1. 한글자만 읽어보자.
			int ch = fr.read();
			System.out.println("poem.txt 의 첫글자 : " + (char)ch);
			*/
			
			// 2. 여러글자를 읽어서 str 변수에 저장하고 출력하자.
			// 먼저 데이터를 저장할 문자배열을 만들어야 하는데
			// 데이터의 길이가 얼마인지 알수 없으므로
			// 임의의 사이즈로 배열을 만들고
			// 반복해서 꺼내오자.
			
			char[] buff;
			
			while(true) {
				// 배열 만들어주고
				buff = new char[32];
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				/*
				String tmp = new String(buff);
				str.append(tmp);
				*/
				str.append(new String(buff));
			}
			
			// StringBuffer는 문자열수정이 완료가 되면 반드시 String 타입으로 변환시켜 사용한다.
			System.out.println(str.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
