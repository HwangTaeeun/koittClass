package day17;

import java.io.*;
import java.util.*;

/*
	Test05.txt 파일을 읽어보자.
 */
public class Test06 {

	public Test06() {
		// 스트림 준비하고
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		ArrayList<String> list;
		
		// 스트림 만들고
		try {
			fin = new FileInputStream("src/day17/test05.txt");
			oin = new ObjectInputStream(fin);
			
			// 데이터를 읽고
			list = (ArrayList<String>) oin.readObject();
			
			for(String str : list) {
				System.out.println(str);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				oin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
