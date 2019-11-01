package day17;

import java.io.*;
import java.util.*;

/*
	Test05.txt ������ �о��.
 */
public class Test06 {

	public Test06() {
		// ��Ʈ�� �غ��ϰ�
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		ArrayList<String> list;
		
		// ��Ʈ�� �����
		try {
			fin = new FileInputStream("src/day17/test05.txt");
			oin = new ObjectInputStream(fin);
			
			// �����͸� �а�
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
