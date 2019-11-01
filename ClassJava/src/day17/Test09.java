package day17;

import java.io.*;

/*
	PrintWriter 로 데이터를 파일에 저장해보자.
 */
public class Test09 {

	public Test09() {
		// 데이터 준비하고
		String str = "둘리, \n도우너, \n고길동, \n또치, \n희동이";
		// 스트림 준비하고
		PrintWriter pw = null;
		
		// 스트림 만들고
		try {
			pw = new PrintWriter("src/day17/test09.txt");
			pw.print(str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
