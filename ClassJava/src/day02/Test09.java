package day02;

/*
	while �ݺ���
		�ݺ��� ���������� ������ ��������� �ϴ� �ݺ���
		
		����]
		while(���ǽ�){
			���๮
		}
 */
public class Test09 {

	public Test09() {
		// 1���� 9���� ���ڸ� ����ϼ���.
		int no = 0;
		while(no < 9) {
			System.out.println("### " + ++no);
		}
	}
	
	public static void main(String[] args) {
		new Test09();
	}
}
