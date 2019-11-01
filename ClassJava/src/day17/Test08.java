package day17;

import java.io.*;

/*
	poem.txt ������
	�⺻��Ʈ���� ����Ʈ������� �ϰ�
	������Ʈ���� ���ڱ������ �ؼ� 
	������ ������ �о��.
 */
public class Test08 {

	public Test08() {
		// ���� 
		// ���� ����Ʈ��� ��Ʈ���� �غ��ϰ� ( �ޱ��)
		FileInputStream fin = null;
		// ���ڱ�� ��Ʈ���� �غ��ϰ� (���������)
		BufferedReader br = null;
		// ���� �������� ��Ʈ���� �غ��ϰ�
		InputStreamReader ir = null;
		
		//  ��Ʈ�� �����
		try {
			fin = new FileInputStream("src/day17/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			for(;;) {
				String line = br.readLine(); // readLine()�� �ٹٲ� ��ȣ �������� ��ȯ���ش�.
				if(line == null) break;
				
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				ir.close();
				br.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
