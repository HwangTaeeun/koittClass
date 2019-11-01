package day17;

import java.io.*;
import extra.*;
/*
	src/extra/Day17_07.java 에서 만든 파일(score.txt)을 읽어보자.
 */
public class Test07 {

	public Test07() {
		// 스트림 준비하고
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		// 스트림 만들고
		try {
			fin = new FileInputStream("src/day17/score.txt");
			oin = new ObjectInputStream(fin);
			
			Exam e1 = (Exam) oin.readObject();
			
			System.out.println(e1.getName());
			System.out.println(e1.getKor());
			System.out.println(e1.getEng());
			System.out.println(e1.getMath());
			System.out.println(e1.getTotal());
			
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
		new Test07();
	}

}
