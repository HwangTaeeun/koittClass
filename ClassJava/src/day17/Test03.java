package day17;

import java.io.*;

/*
	문자단위 스트림을 사용해서
	poem.txt 파일을 Test03_03.txt 로 복사해보자.
 */
public class Test03 {

	public Test03() {
		// 1. 스트림 준비하고
		FileReader fr = null;
		FileWriter fw = null;
		StringBuffer sb = new StringBuffer();
		// 2. 스트림 만들고
		try {
			fr = new FileReader("src/day17/poem.txt");
			fw = new FileWriter("src/day17/Test03_03.txt");
			
			// 파일을 읽는다. 그런데 몇번을 반복해서 처리해야 할 지 모르므로 반복문으로 처리하자.
			for(;;) {
				// 문자배열 만들고...
				char[] buff = new char[32];
				int len = fr.read(buff);
				if(len == -1) break;
				// 읽은 내용을 StringBuffer에 덧붙이고..
				sb.append(new String(buff));
				// 읽은 데이터를 저장한다.
				fw.write(buff, 0, len);
			}
			System.out.println("### 복사 완료 ###");
			System.out.println("============== 내 용 ================");
			// 읽은 내용 출력
			System.out.println(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
