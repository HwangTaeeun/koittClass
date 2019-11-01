package day17;

import java.io.*;

/*
	PrintWriter �� �����͸� ���Ͽ� �����غ���.
 */
public class Test09 {

	public Test09() {
		// ������ �غ��ϰ�
		String str = "�Ѹ�, \n�����, \n��浿, \n��ġ, \n����";
		// ��Ʈ�� �غ��ϰ�
		PrintWriter pw = null;
		
		// ��Ʈ�� �����
		try {
			pw = new PrintWriter("src/day17/test09.txt");
			pw.print(str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
