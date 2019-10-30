package day15;

import java.io.*;
import java.util.*;

/*
	sample.txt 파일을 읽어서 맵으로 만들어보자.
 */

public class Test08 {
	
	public Test08() {
		Properties prop = new Properties();
		// 외부 파일과 연결할 예정이다.
		// 이 후 코드중 아직 안배운 IO 의 내용이 나오지만 내일 설명할 예정이니 참아주세요...
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day15/result.txt");
			// 경로는 절대경로 형식으로 D:\share\git\... 써줘도 되고
			// 우리의 경우는 이클립스를 사용하고 있고
			// 이클립스가 경로를 새롭게 정의해서 처리하므로 
			// src 폴더로 시작하는 경로를 적어주면 될것이다.
			
			// 이제 이 파일의 내용을 Properties 가 읽도록 한다.
			prop.load(fin);
			// 이제 파일의 내용이 읽어져서 Map으로 처리가 되어 있는 상태다.
			
		} catch(Exception e) {
			System.out.println("Error : " + e);
		}
		
		// 이제부터는 일반 Map 의 처리 형태로 사용하면 된다.
		
		String name = (String) prop.get("name");
		String addr = (String) prop.get("addr");
		
		System.out.println(name + " - " + addr);
	}

	public static void main(String[] args) {
		new Test08();
	}

}
