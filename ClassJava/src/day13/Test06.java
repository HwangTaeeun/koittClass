package day13;


import java.text.*;

public class Test06 {
/*
	MessageFormat
		==> Ư�� ���ڿ��� Ư�� ��ġ�� ���븸 ����Ǵ� ���
			���ڿ� ��ü�� ������ �ʰ�
			����Ǵ� ���븸 �������Ѽ�
			�ϳ��� ���ڿ��� ������ Ŭ����
			
		���� ���
			�츮�� ������ �����ߴ� StringBuffer���� 
			Oracle ���Ǹ���� ��ȯ���ִ� �Լ��� �����ؼ� ����ߴµ�
			
			����Ŭ���� �����͸� ��ȸ�ϴ� �����
			SELECT �÷��̸�, �÷��̸�, ... FROM ���̺��̸� WHERE ����;
			�� �������� ���Ǹ���� �ۼ��� �� ���̴�.
			
			�׷��ٸ� ���Ǹ���� Ʋ�� �����Ǵ� ���� �ƴϰ�
			��ü�� �Ϻκи� �ٸ� ���ڿ��� ��ü�� �Ѵٸ�
			��� �����ϰڴ�.
			
			�̷��� ���ڿ��� ������ ���� ��� ó������ �ٽø����� �ʰ�
			�Ϻκи� �����ؼ� ����ϵ��� ���ִ� Ŭ������ 
			MessageFormat Ŭ�����̴�.
			
			�����Լ�]
				parse(String source)
				==> �־��� ���ڿ� �߿��� ���� ��ȭ�Ǵ� ������ �κи� �˾Ƴ��� �Լ�
 */
	
	/*
		���� 6]
			��ȭ��ȣ�� �����Ϸ��� �ϴµ� ������
				
				"Name : ȫ�浿, Tel : 010-7777-7777, Age : 24";
				"Name : ��û��, Tel : 010-9999-9999, Age : 20";
				
	 */
	public Test06() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		/*
			������ ������ �״�� �ۼ��ϰ�
			����Ǵ� �κи� �ε����� �ٿ���(�߰�ȣ({})�ȿ� �־) ����Ѵ�.
			�ε������� �ԷµǴ� ������� �����Ͱ� ä������.
		 */
		
		
		// ��ü�� ������ �迭�� �����
		String[] addr = new String[2];
		
		// �ε����� �� ������ Object[] �� �غ� �Ѵ�.
		Object[][] obj = {{"ȫ�浿", "010-7777-7777", 24},
				{"��û��", "010-9999-9999", 20}
		};
		
		int i = 0;
		String result = "";
		for(Object[] o : obj) {
			result = form.format(o);
			addr[i++] = result;
		}
		/*
		for(String s : addr) {
			System.out.println(s);
		}
		*/
		for(int j = 0 ; j < addr.length ; j++) {
			System.out.println(addr[j]);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
