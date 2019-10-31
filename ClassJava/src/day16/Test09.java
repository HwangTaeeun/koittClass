package day16;

import java.io.*;

/*
	���� 1]
		���Ͽ� 
		ģ���� ������ ��������.
			����
				�̸�	- String
				����	- int
				����	- double
				����	- boolean ( ���� - true, ���� - false )
				��ȭ	- String
				����	- String
				
		������ �ϴµ� DataStream ���� ó���� �غ���.
 */

public class Test09 {

	public Test09() {
		// �⺻ ��Ʈ�� �غ��ϰ�
		FileOutputStream fout = null;
		// ������Ʈ�� �غ��ϰ�
		DataOutputStream dout = null;
		try {
			fout = new FileOutputStream("src/day16/DoutTest.txt");
			dout = new DataOutputStream(fout);
			
			String name = "�Ѹ�";
			int age = 100000000;
			double height = 125.5;
			boolean gen = false;
			String tel = "010-2222-2222";
			String mail = "dooly@naver.com";
			
			// DataInput(/Output)Stream �� Ư¡�� �ڹ��� �����͸�
			// ��ȯ���� ����� �� �ִ�. ==> ó�����ִ� �Լ��� ������ �����Ѵ�.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeBoolean(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			System.out.println("### ����Ϸ� ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
