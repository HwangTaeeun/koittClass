package day02;

/*
	do ~ while �ݺ��� : ���ǿ� ������� ��� �ѹ��� �������ִ� �ݺ���
		1
		do {
			���๮ - 2
		} while (���ǽ� - 3);
 */
public class Test11 {

	public Test11() {
		int no = 10;
		
		do {
			System.out.println("no : " + no);
		} while (no++ < 10);
	}

	public static void main(String[] args) {
		new Test11();

	}

}
