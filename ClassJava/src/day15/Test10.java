package day15;

/*
	���α׷��� ���õ� ������ �ڵ����� �̾Ƽ� �����غ���.
 */

import java.io.*;
import java.util.*;

public class Test10 {

	public Test10() {
		Properties prop = System.getProperties();
		/*
			System.getProperties() ��
			���α׷��� ���õ� ������ Map���� ������ִ� �Լ�
		 */
		
		Set set = prop.keySet();
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			Object o = itor.next();
			String key = (String) o;
			String val = (String)prop.get(key);
			System.out.println(key + " : " + val);
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
