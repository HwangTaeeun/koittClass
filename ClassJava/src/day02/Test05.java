package day02;

/*
	if ~ else if ����
		������ �������ϰ�� �и��ؼ� ó���ϴ� ���ǹ�
		
		����]
			if(���ǽ�1){
				���๮ 1
			} else if (���ǽ�2){
				���๮ 2
			} else if (���ǽ�3){
				���๮ 3
			} else if (���ǽ�3){
			
				...
			} else {
				��� ���ǿ� �ش����� �ʴ� ��� ������ ����...
			}
			
			
 */
public class Test05 {

	public static void main(String[] args) {
		/*
		 * 	59 ������ ���ڸ� ���ڸ� �Է��ؼ�
			23 �̶�� ���ڰ� �ִٸ� �� ���ڴ� �����ڸ��� 20 �Դϴ�.
		 */
		
		int no = 33;
		int result ;
		if(no  >= 50) {
			result = 50;
		} else if(no >= 40) {
			result = 40;
		} else if(no >= 30) {
			result = 30;
		} else if(no >= 20) {
			result = 20;
		} else {
			result = 10;
		}
		
		System.out.println("�Էµ� ���� " + no + " �� 10�� �ڸ��� " + result + " �Դϴ�.");
	}

}
