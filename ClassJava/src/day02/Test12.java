package day02;

/*
	for �ݺ��� : ���Ŀ� ī���ͺ����� �߰��� �Ǿ� �ִ�.
		����]
			for(ī���ͺ���; ���ǽ�;������){
				���๮
			}
			
		�Ϲ����� ����]
			for(int i = 0 ; i < no ; i++){
			
			}
 */
public class Test12 {

	public Test12() {
		// ���ڸ� 1 ~ 9���� ����ϼ���.
		for(int i = 0 ; i < 9; i++) {
			System.out.println(i+1);
		}
		
		// ���� ] �� ������ �������� -- �� ����ؼ� ó���ϼ���.
		for(int i = 0 ; i < 30 ; i++) {
			System.out.print("#");
		}
		System.out.println();
		
		for(int i = 8; i >= 0; i--) {
			System.out.println(9 - i);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
