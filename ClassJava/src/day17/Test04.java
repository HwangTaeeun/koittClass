package day17;

import java.io.*;

/*
	문자기반 보조스트림을 사용해서
	Test03_03.txt 파일을 읽어보자.
	그리고 저장도 해보자. Test04_txt.txt
 */
public class Test04 {

	public Test04() {
		// 할일
		// 1. 스트림 준비하고
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		
		/*
		 	처리과정
		 		
		 		Test03_03.txt ===> FileReader ----> BufferedReader ====> char[]  : 읽는 과정
		 		 char[] ===> BufferedWriter ----> FileWriter ---> Test04_txt.txt	: 쓰는 과정
		 */
		
		// 2. 스트림 만들고
		try {
			// 읽는 스트림 만들기
			fr = new FileReader("src/day17/Test03_03.txt");
			br = new BufferedReader(fr);
			
			// 쓰는 스트림 만들기
			fw = new FileWriter("src/day17/Test04_txt.txt");
			bw = new BufferedWriter(fw);
			
			// 데이터를 읽는다.
			// 몇개가 있는지 모르므로 반복해서 처리한다.
			for(;;) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
			}
			
			bw.write(buff.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
				bw.close();
				fw.close();
			} catch(Exception e) {}
		}
		// 3. 파일 읽고
		
		// 4. 읽은 내용을 저장하고
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
