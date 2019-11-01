package day17;

import java.io.*;
import java.util.*;

/*
	ArrayList 에 데이터를 저장해서 
	통째로 파일로 저장해 보자.
 */
public class Test05 {

	public Test05() {
		// 스트림 준비하고
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("둘리");
		list.add("고길동");
		list.add("도우너");
		list.add("또치");
		list.add("희동이");
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day17/test05.txt"); 
			// 경로를 지정하지 않는 경우는 이 클래스와 동일 패키지로 경로를 선언하게 된다.
			oout = new ObjectOutputStream(fout);
			
			// 데이터 보내고 파일 쓰고...
			oout.writeObject(list);
			System.out.println("*********** 파일 생성 완료 ************");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
