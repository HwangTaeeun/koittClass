package day04;

import java.util.Arrays;

/*
	�迭 �����ϱ�
		
		0 ~ 99 ������ ���ڸ� �����ϰ� 10 ���� �迭�� �����ϰ�
		ũ�Ⱑ ���� ������ �迭�� �����ϼ���.
 */

public class Test02 {

	public Test02() {
		System.out.println(Arrays.toString(getIntArr()));
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// �� �Լ��� �����ϰ� ���� ���� 10���� �����ϰ� ��ȯ���ִ� �Լ�
	public int[] getIntArr() {
		// ���� 10���� ������ �迭�� �����.
		int[] num = new int[10];
		
		// �����ϰ� ���ڸ� �߻���Ų��. x 10
		makeNum:
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random() * 99 + 1);
			
			// ���� �ߺ��� ���� ��������� �ٽ� �̴´�.
			for(int j = 0 ; j < i ; j++) {
				if(num[j] == no) {
					i--;
					continue makeNum;
				}
				// �� ������ �д� ���� ���� ���ǹ��� �´� ��찡 �����Ƿ� �ߺ��Ǵ� ���� ���� ����.
			}
			
			num[i] = no;
		}
		
		return num;
	}
}
