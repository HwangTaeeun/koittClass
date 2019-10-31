package day16;

import java.io.*;

/*
	Test04.java �� �����ؼ� Test04.txt ������ ����� ����.
 */
public class Test07 {
	/*
		��Ʈ���� �ܹ����̴�.
		���� ���縦 ���ؼ��� �д� ��Ʈ���� ���� ��Ʈ���� �ʿ��ϰ� �ȴ�.
		�׷��� ��Ʈ���� input�� output �� ���� �غ��Ѵ�.
	 */
	public Test07() {
		FileInputStream fin = null;		// ����
		FileOutputStream fout = null;	//  ���纻
		
		try {
			// ��Ʈ�� ����� �ְ�
			fin = new FileInputStream("src/day16/Test04.java");
			fout = new FileOutputStream("src/day16/Test04.txt");
			
			// ���� �����Ͱ� �󸶰� �Ǵ��� �𸣹Ƿ� �ݺ��ؼ� ó���Ѵ�.
			while(true) {
				// ���� ������ ������ �迭 �غ�
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					// �� ���� ���� �����Ͱ� ���� ����̹Ƿ� �ݺ����� �������ش�.
					break;
				}
				
				// �迭�� ��� ������ �ƿ�ǲ��Ʈ���� ������ �����Ѵ�.
				fout.write(buff, 0, len);
			}
			
			System.out.println("### ���� ���� �Ϸ� ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
