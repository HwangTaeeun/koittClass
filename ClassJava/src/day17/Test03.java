package day17;

import java.io.*;

/*
	���ڴ��� ��Ʈ���� ����ؼ�
	poem.txt ������ Test03_03.txt �� �����غ���.
 */
public class Test03 {

	public Test03() {
		// 1. ��Ʈ�� �غ��ϰ�
		FileReader fr = null;
		FileWriter fw = null;
		StringBuffer sb = new StringBuffer();
		// 2. ��Ʈ�� �����
		try {
			fr = new FileReader("src/day17/poem.txt");
			fw = new FileWriter("src/day17/Test03_03.txt");
			
			// ������ �д´�. �׷��� ����� �ݺ��ؼ� ó���ؾ� �� �� �𸣹Ƿ� �ݺ������� ó������.
			for(;;) {
				// ���ڹ迭 �����...
				char[] buff = new char[32];
				int len = fr.read(buff);
				if(len == -1) break;
				// ���� ������ StringBuffer�� �����̰�..
				sb.append(new String(buff));
				// ���� �����͸� �����Ѵ�.
				fw.write(buff, 0, len);
			}
			System.out.println("### ���� �Ϸ� ###");
			System.out.println("============== �� �� ================");
			// ���� ���� ���
			System.out.println(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
