package day16;

import java.io.*;

/*
	Test09���� ���� ������ �о��.
 */
public class Test10 {

	public Test10() {
		// DataOutputStream ���� ������ ������ �ݵ��
		// DataInputStream ���� �о�� ������ ��Ȯ�ϰ� ���δ�.
		
		// �⺻ ��Ʈ�� �غ��ϰ�
		FileInputStream fin = null;
		// ���� ��Ʈ�� �غ��ϰ�
		DataInputStream din = null;
		
		try {
			// ��Ʈ�� �����
			fin = new FileInputStream("src/day16/DoutTest.txt");
			din = new DataInputStream(fin);
			/*
				���� ����]
					�����͸� ������ ��
						�̸�, ����, ����, ����, ��ȭ, ���� 
					������ ������ �����Ƿ�
					���� ���� �ݵ�� ������ ������ ������� �о�� �Ѵ�.
			 */
			
			String name = din.readUTF();
			int age = din.readInt();
			double height = din.readDouble();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			System.out.println("name : " + name + 
								"\nage : " + age +
								"\nheight : " + height +
								"\ngen : " + gen + 
								"\ntel : " + tel + 
								"\nmail : " + mail
			);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				din.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
