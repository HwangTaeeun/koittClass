package day12;

import java.util.*;

public class Test05 {

/*
	Random Ŭ����
		==> ������ �߻��ϴ� Ŭ����
			�츮�� �˰� �ִ� Math.random() ���ٴ� 
			�� �� �پ��� ������ ������ �߻���ų �� �ִ�.
			
			����]
				seed
					��ǻ�Ϳ��� ���� �߻��� �� ���� ������ ������ ����� ���� ���� �ƴϰ�
					�̹� ������ ��Ǫ�Ϳ� ���� ���̺� �����ϰ�
					���� ���̺��� ������� ������ �ִ� ������� ó���� �Ѵ�.
					
					seed��
					�� ������ ���� ���̺��� �̾߱⸦ �Ѵ�.
 */
	public Test05() {
		Random random = new Random();
		random.setSeed(0);
		int no1 = random.nextInt();
		int no2 = random.nextInt();
		int no3 = random.nextInt();
		System.out.println(no1 + " | " + no2 + " | " + no3);
		//-1155484576 | -723955400 | 1033096058
	}

	public static void main(String[] args) {
		new Test05();
	}

}
