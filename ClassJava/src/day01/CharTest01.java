package day01;

public class CharTest01 {
/*
	����� ��Ƽ���� �ּ��κ�
*/
//	����� ������ �ּ�
	
	// ���� 1004�� ������ ���� num�� ���弼��.
	int num = 1004;
	
	public static void main(String[] args) {
		char ch1 ; // ���� ���� ����
		ch1 = 'A';
		System.out.println("ch1 : " + ch1);

		char ch2 = 65 + 1 ;
		System.out.println("ch2 : " + ch2);
		
		int tmp = ch1 + 3;
		char ch3 = (char)(tmp + 5);
		System.out.println("ch3 : " + ch3);
		
//		System.out.println("num : " + num);
	}
}