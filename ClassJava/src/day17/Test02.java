package day17;

import java.io.*;

/*
	Test01���� ������ ����(poem.txt)�� 
	���ڴ��� ��Ʈ������ �о��.
 */

public class Test02 {

	public Test02() {
		// 1. ��Ʈ�� �غ��ϰ�
		FileReader fr = null;
		// ���ڿ� ���庯��
		StringBuffer str = new StringBuffer();
		
		try {
			fr = new FileReader("src/day17/poem.txt");
			
			/*
			// 1. �ѱ��ڸ� �о��.
			int ch = fr.read();
			System.out.println("poem.txt �� ù���� : " + (char)ch);
			*/
			
			// 2. �������ڸ� �о str ������ �����ϰ� �������.
			// ���� �����͸� ������ ���ڹ迭�� ������ �ϴµ�
			// �������� ���̰� ������ �˼� �����Ƿ�
			// ������ ������� �迭�� �����
			// �ݺ��ؼ� ��������.
			
			char[] buff;
			
			while(true) {
				// �迭 ������ְ�
				buff = new char[32];
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				/*
				String tmp = new String(buff);
				str.append(tmp);
				*/
				str.append(new String(buff));
			}
			
			// StringBuffer�� ���ڿ������� �Ϸᰡ �Ǹ� �ݵ�� String Ÿ������ ��ȯ���� ����Ѵ�.
			System.out.println(str.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
