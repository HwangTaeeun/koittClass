package day13;

/*
	���� 5 ]
		���͸� �����
		�� ���Ϳ� �Ҽ� 10���� �ְ�
		����ϼ���.
 */

import java.util.*;

public class Ex05 {
	Vector vec ;

	public Ex05() {
		toSolve02();
	}

	public static void main(String[] args) {
		new Ex05();
	}
	
	public void toSolve01() {
		vec = new Vector();
		loop:
		for(int i = 2; vec.size() <= 10 ; i++ ) {
				
			for(int j = i -1; j > 1 ; j--) {
				if(i % j == 0) {
					continue loop;
				}
			}
			vec.add(i);
			
		}
		System.out.println(vec);
	}
	
	public void toSolve02() {
		vec = new Vector();
		
		// ���ں���
		int num = 2;
		
		// �Ҽ� Ȯ���ϴ� �ݺ���
		loop:
		while(vec.size()  <= 10) {
			for(int i = num-1; i > 1 ; i-- ) {
				if(num % i == 0) {
					num++;
					continue loop;
				}
			}
			vec.add(num++);
		}
		
		System.out.println(vec);
	}

}
