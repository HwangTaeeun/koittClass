package day17;

import java.io.*;
import java.util.*;

/*
	ArrayList �� �����͸� �����ؼ� 
	��°�� ���Ϸ� ������ ����.
 */
public class Test05 {

	public Test05() {
		// ��Ʈ�� �غ��ϰ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�Ѹ�");
		list.add("��浿");
		list.add("�����");
		list.add("��ġ");
		list.add("����");
		
		try {
			// ��Ʈ�� �����
			fout = new FileOutputStream("src/day17/test05.txt"); 
			// ��θ� �������� �ʴ� ���� �� Ŭ������ ���� ��Ű���� ��θ� �����ϰ� �ȴ�.
			oout = new ObjectOutputStream(fout);
			
			// ������ ������ ���� ����...
			oout.writeObject(list);
			System.out.println("*********** ���� ���� �Ϸ� ************");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
