package day16;

/*
	���ͽ�Ʈ�� ( ������Ʈ�� )
		==> �⺻��Ʈ���� ����� �߰��Ѵٴ���
			������� ���Ǹ� �����ϱ� ����
			�������� ����� �ϴ� ��Ʈ��
			
			���� ����
				�⺻��Ʈ���� �ݵ�� �����ؾ��ϸ�
				���ͽ�Ʈ���� �ʿ信 ���� �����ؼ� ����ϸ� �ȴ�.
				
			����]
				���ͽ�Ʈ�� ���� ���⼺�� �ְ�
				�ݵ�� ���� ���Ⳣ���� ������ �ȴ�.
				
		***
		1. BufferedInputStream / BufferedOutputStream
			==> ������� ���Ǳ���� ����
				��ſ�
				��Ʈ���� ������ ����Ű�� ������ �Ѵ�.
				���ۿ� �����͸� ��Ƴ��Ҵٰ� �ѹ��� ó���ϴ� ����� �߰��� ��Ʈ��...
				
			�ֿ��Լ�]
				
				flush()
					==> ������ ���۸� ���� �Լ�
					
		2. DataInputStream / DataOutputStream
			==> ���� ����ϴ� ��Ʈ���� �ƴϴ�.
				��� ����� ����
				���
				���� ��Ʈ���� �ݵ�� byte[]�θ� �����͸� ó���Ѵ�.
				���ڵ����Ͱ� �ƴ� �ٸ� ������ �����ʹ� 
				������ ���� �� �ִ�.
				==> �ڹ��� ���������� byte[]�� ��ȯ ���� �ʰ�
					���� �ܺ���ġ�� �Է��ϴ� ����� �߰��� ��.
					
				
				�� ������� �ʴ� ����
					DataOutputStream �� �̿��� ����
					�ݵ�� DataInputStream�� �̿��ؼ� �޾ƾ� �Ѵ�.
					<== ������ ���������ϱ� ������...
					(������ �� int, float -> ���� ���� int, float�� ������� �޾ƾ� �Ѵ�.)
					
 */

import java.io.*;

public class Test08 {
// BufferedStream �� ����ؼ� ������ ������ ����Ǵ� ������ ����� ����.
	public Test08() {
		// 1. �ݵ�� �⺻��Ʈ���� �ʿ��ϴ�.
		FileOutputStream fout = null;
		// 2. �ʿ信 ���� ����(����)��Ʈ���� �����ؼ� ����� �� �ִ�.
		BufferedOutputStream bout = null;
		
		String str = "write(byte[] b)\r\n" + 
				"Writes b.length bytes from the specified byte array to this file output stream.";
		
		byte[] buff = str.getBytes();
		
		try {
			fout = new FileOutputStream("src/day16/TestBOut.txt");
			bout = new BufferedOutputStream(fout);
			
			// �����͸� ������.
			bout.write(buff);
			// ���۴� �� ä������ ������ �ڵ����� �������� �ʴ´�.
			// ���� �⺻��Ʈ������ �����Ͱ� ���޵��� ���� ���´�.
			
			// �ݵ�� ���������� �Ϸ�� �������� ���۸� ������ ���� ������ ������ �Ѵ�.
			bout.flush();
			
			// ���� �Ϸ�
			System.out.println("### ���� �Ϸ� ###");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
