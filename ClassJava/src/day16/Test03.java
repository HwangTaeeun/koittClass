package day16;

import java.io.*;

/*
	day15 ��Ű�� ���� ������ .txt ������ ����� �˾Ƴ���.
	
 */

public class Test03 {

	public Test03() {
		// ����� �˾Ƴ��� ���� ������ ���� ���Ϸ� �����
		File file = new File("src/day15");
		
		/*
		String[] arr = file.list();
		for(String fname : arr) {
			System.out.println(fname);
		}
		*/
		// Ȯ���ڰ� txt�� ���ϸ� ��� ����ϰ� �ʹ�.
		String[] arr = file.list(new MyFilter());
		// ����� ����Ѵ�.
		for(String fname : arr) {
			System.out.println(fname);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		/*
			�� �Լ��� �Ű������� ����
				File dir	- ���� ������ ������ �˷��ְ�
				String name	- ���� ������ �̸��� �˷��ش�.
				
			�� �Լ��� list()�� ����� �� �Լ��� �ڵ� ȣ���ϴ� �Լ��̴�.
			����� ���ϴ� ������ �ϳ��� �߰��� �� ���� �� �Լ��� ȣ���� �ȴ�.
			
			��ȯ���� ������ �� ������ true �ƴϸ� false �� ��ȯ�� �Ǵµ�...
				true	- ��Ͽ� ���Խ�Ű��
				false	- ��Ͽ��� ����
		 */
		boolean bool = false;
		
		if(name.endsWith(".txt")) {
			bool = true;
		}
		
		return bool;
	}
	
}