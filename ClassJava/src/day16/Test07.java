package day16;

import java.io.*;

/*
	Test04.java 를 복사해서 Test04.txt 파일을 만들어 보자.
 */
public class Test07 {
	/*
		스트림은 단방향이다.
		따라서 복사를 위해서는 읽는 스트림과 쓰는 스트림이 필요하게 된다.
		그래서 스트림을 input과 output 두 개를 준비한다.
	 */
	public Test07() {
		FileInputStream fin = null;		// 원본
		FileOutputStream fout = null;	//  복사본
		
		try {
			// 스트림 만들어 주고
			fin = new FileInputStream("src/day16/Test04.java");
			fout = new FileOutputStream("src/day16/Test04.txt");
			
			// 읽은 데이터가 얼마가 되는지 모르므로 반복해서 처리한다.
			while(true) {
				// 읽은 데이터 저장할 배열 준비
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					// 이 경우는 읽은 데이터가 없는 경우이므로 반복문을 종료해준다.
					break;
				}
				
				// 배열에 담긴 내용을 아웃풋스트림에 보내서 저장한다.
				fout.write(buff, 0, len);
			}
			
			System.out.println("### 파일 복사 완료 ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
