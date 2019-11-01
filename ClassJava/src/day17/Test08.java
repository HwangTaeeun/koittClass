package day17;

import java.io.*;

/*
	poem.txt 파일을
	기본스트림은 바이트기반으로 하고
	보조스트림을 문자기반으로 해서 
	파일의 내용을 읽어보자.
 */
public class Test08 {

	public Test08() {
		// 할일 
		// 먼저 바이트기반 스트림을 준비하고 ( 받기용)
		FileInputStream fin = null;
		// 문자기반 스트림을 준비하고 (내보내기용)
		BufferedReader br = null;
		// 둘을 연결해줄 스트림도 준비하고
		InputStreamReader ir = null;
		
		//  스트림 만들고
		try {
			fin = new FileInputStream("src/day17/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			for(;;) {
				String line = br.readLine(); // readLine()는 줄바꿈 기호 전까지만 반환해준다.
				if(line == null) break;
				
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				ir.close();
				br.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
