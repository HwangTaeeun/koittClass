package day02;

/*
	���� for ���
		����]
			for(������Ÿ�� �����̸� : ��������������[����]){
				�����̸� ����ؼ� ����...
			}
 */
public class Test13 {

	public Test13() {
		
		int[] num = {1,2,3,4,5};
		
		int[] arr1 = new int[5];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0 ; i < 30 ; i++ ) {
			System.out.print("#");
		}
		System.out.println();
		
		for(int no : arr1) {
			System.out.println(no);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
