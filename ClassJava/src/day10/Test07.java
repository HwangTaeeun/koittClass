package day10;

import static java.lang.Math.*;

public class Test07 {

	public Test07() {
		Figure[] d1 = new Figure[10];
		
		// ���� ���� �迭�� �ֱ�
		for(int i = 0 ; i < d1.length ; i++ ) {
			int tmp = (int)(random() * 3);
			
			if(tmp == 0) {
				d1[i] = new Won((int)(random() * 11) + 10);
			} else if(tmp == 1) {
				d1[i] = new Samgak((int)(random() * 11) + 10, (int)(random() * 11) + 10);
			} else if(tmp == 2) {
				d1[i] = new Sagak((int)(random() * 11) + 10, (int)(random() * 11) + 10);
			}
		}
		
		// ���� ������ ����ϱ�
		for(int i = 0 ; i < d1.length ; i++ ) {
			d1[i].toPrint();
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
