package day16;

import java.io.*;

public class Test02 {

	public Test02() {
		File f = new File("D:\\");
		
		String[] arr = f.list();
		File[] arr1 = f.listFiles();
		/*
		// 파일 이름만 뽑아내는 경우
		for(String file : arr) {
			System.out.println("*** " + file);
		}
		*/
		
		// 파일의 모든 정보를 가져오는 경우
		for(File file : arr1) {
			System.out.println("### " + file.getName());
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
