package day13;

/*
	���� 4 ]
		���͸� �����
		���Ϳ� 5�� ��� 7���� ��������...
		��, �ݺ������� ó���ϼ���.
 */

import java.util.*;

public class Ex04 {
	Vector vec ;

	public Ex04() {
		toSolve02();
	}
	
	public void toSolve02() {
		vec = new Vector();
		
		for(int i = 0 ; vec.size() < 7 ; i++) {
			int num = i + 1;
			int result = 5 * num;
			vec.add(result);
		}
		
		System.out.print("| ");
		for(Object o : vec) {
			System.out.print((int)o + " | ");
		}
	}
	

	public static void main(String[] args) {
		new Ex04();
	}
	
	public void toSolve01() {
		vec = new Vector();
		
		for(int i = 0 ; i < 7 ; i++ ) {
			int num = 5 * (i+1);
			vec.add(num);
		}
		
		System.out.println(vec);
		
		for(int i = 0 ; i < vec.size(); i++ ) {
			System.out.println((int) vec.get(i));
			/*
			 * Vector tmp = (Vector) vec.get(i);
			 * 
			 * for(int j = 0 ; j < tmp.size() ; j++ ) { tmp.get(j) }
			 */
		}
		
	}
}
