package day02;

public class Test10 {

	public Test10() {
		// ������ 3���� ����ϼ���.
		
		// ī���� ���� �����
		int i = 0;
		// �ݺ��� �����
		while(++i < 10 ) {
			int dan = 3;
			// ����ϰ�
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	
	public static void main(String[] args) {
		new Test10();
	}
}
