package day05;

public class Test03 {
	
	// 1. ���ڿ��� �Է��ϸ� ���ڿ� �տ� "###"�� �ٿ��� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
	// 2. �� �Լ��� �����ε��ϴµ� ������ �Է��ϸ� ���ڿ� 10�� ���ؼ� ��ȯ���ִ� �Լ��� �ۼ�����.
	
	public String getData(String str) {
		String msg = "###" + str;
		
		return msg;
	}
	
	// 2�� �ذ��ϱ�
	public int getData(int no) {
		int num = no + 10;
		
		return num;
	}
	
	public Test03() {
		// ���� getData ȣ���ϱ�
		
		// 1. ���ڿ��� ȣ���ϱ�
		System.out.println(getData("abcd"));
		// 2. ������ ȣ���ϱ�
		System.out.println(getData(1024));
	}

	public static void main(String[] args) {
		new Test03();
	}
	
	
}
