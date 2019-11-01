package day17;

import java.io.*;

/*
	���ڱ�� ������Ʈ���� ����ؼ�
	Test03_03.txt ������ �о��.
	�׸��� ���嵵 �غ���. Test04_txt.txt
 */
public class Test04 {

	public Test04() {
		// ����
		// 1. ��Ʈ�� �غ��ϰ�
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		
		/*
		 	ó������
		 		
		 		Test03_03.txt ===> FileReader ----> BufferedReader ====> char[]  : �д� ����
		 		 char[] ===> BufferedWriter ----> FileWriter ---> Test04_txt.txt	: ���� ����
		 */
		
		// 2. ��Ʈ�� �����
		try {
			// �д� ��Ʈ�� �����
			fr = new FileReader("src/day17/Test03_03.txt");
			br = new BufferedReader(fr);
			
			// ���� ��Ʈ�� �����
			fw = new FileWriter("src/day17/Test04_txt.txt");
			bw = new BufferedWriter(fw);
			
			// �����͸� �д´�.
			// ��� �ִ��� �𸣹Ƿ� �ݺ��ؼ� ó���Ѵ�.
			for(;;) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
			}
			
			bw.write(buff.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
				bw.close();
				fw.close();
			} catch(Exception e) {}
		}
		// 3. ���� �а�
		
		// 4. ���� ������ �����ϰ�
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
