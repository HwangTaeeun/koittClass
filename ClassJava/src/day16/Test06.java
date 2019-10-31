package day16;

import java.io.*;

/*
	1. 현재 패키지에 Test.txt라는 파일을 하나 
		내용을 입력해서 저장하는 프로그램을 만들어 보자.
 */

public class Test06 {

	public Test06() {
		// 파일 저장할 스트림을 준비한다.
		FileOutputStream fout = null;
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day16/Test.txt");
			// 파일이 존재하지 않아도 자동으로 만들어 진다.
			
			/*
			// 1. 한글자만 저장해 보자.
			fout.write('A');
			*/
			
			// 여러 글자를 입력해 보자.
			
			String str = "Bootstrap 4 is the newest version of Bootstrap, "+
						"which is the most popular HTML, CSS, " + 
						"and JavaScript framework for developing responsive, mobile-first websites.\n" + 
						"\nBootstrap 4 is completely free to download and use!";
			
			int idx = str.indexOf("which");
			int idx2 = str.indexOf("\n");
			
			str = str.substring(idx, idx2);
			// 배열을 준비하고
			byte[] buff = str.getBytes();
			
			
			// 배열을 스트림에 보내서 저장한다.
			fout.write(buff);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 외부장치에 연결된 경우는 해당 외부장치의 사용이 끝나면
			// 반드시 닫아주는 것이 원칙이다.
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
