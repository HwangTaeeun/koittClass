package day15;

import java.io.*;
import java.util.*;

/*
	Properties�� Map �����͸� ���� �����ϰ�
	������ ���Ͽ� ������ ����.
 */

public class Test09 {

	public Test09() {
		Properties prop = new Properties();
		prop.put("����", "iPhone11");
		prop.put("�Ｚ", "�����ó�Ʈ10");
		prop.put("����", "V70");
		prop.put("����", "�ȼ�3");
		
		// ���� ���� ���������
		// ������ ������ ������ ���Ϸ� �����غ���.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/phone.txt");
			// ������ ����� ���� ��θ� �غ��� ���� ����
			// ���� �����͸� ���Ͽ� ������.
			prop.store(fout, "����� �ּ� ���� �κ�");
			
			// �۷��� ��������..
			// ���� ���� �Ǿ����ϴ�.
			System.out.println("���� ���� �Ϸ�...");
		} catch(Exception e) {
			System.out.println("Error : " + e);
		}
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
