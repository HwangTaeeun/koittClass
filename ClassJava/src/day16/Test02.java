package day16;

import java.io.*;

public class Test02 {

	public Test02() {
		File f = new File("D:\\");
		
		String[] arr = f.list();
		File[] arr1 = f.listFiles();
		/*
		// ���� �̸��� �̾Ƴ��� ���
		for(String file : arr) {
			System.out.println("*** " + file);
		}
		*/
		
		// ������ ��� ������ �������� ���
		for(File file : arr1) {
			System.out.println("### " + file.getName());
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
