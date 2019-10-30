package day15;

import java.io.*;
import java.util.*;

/*
	Properties로 Map 데이터를 만들어서 저장하고
	내용을 파일에 저장해 보자.
 */

public class Test09 {

	public Test09() {
		Properties prop = new Properties();
		prop.put("애플", "iPhone11");
		prop.put("삼성", "갤럭시노트10");
		prop.put("엘지", "V70");
		prop.put("구글", "픽셀3");
		
		// 이제 맵은 만들어졌고
		// 맵으로 저장한 내용을 파일로 저장해보자.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/phone.txt");
			// 파일을 만들고 연결 통로만 준비해 놓은 상태
			// 맵의 데이터를 파일에 써주자.
			prop.store(fout, "여기는 주석 내용 부분");
			
			// 송률씨 믿으세요..
			// 벌써 저장 되었습니다.
			System.out.println("파일 저장 완료...");
		} catch(Exception e) {
			System.out.println("Error : " + e);
		}
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
