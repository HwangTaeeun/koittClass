package day14;


/*
	���� 3 ]
		������ 2���� Vector �� �־ ����ϼ���.
			==> [ [2, 1, 2], [2, 2, 4], [2, 3, 6], .....[2, 9, 18] ]
		
		Vector v = new Vector();
		
		v.add(new Vector());   
		v.add(new Vector());
		v.add(new Vector());
		v.add(new Vector());
		v.add(new Vector());
		v.add(new Vector());
		v.add(new Vector());
		v.add(new Vector());
 */

import java.util.*;

public class Ex03 {
	Vector vec;
	
	public Ex03() {
		toSolve02();
	}
	
	public void toSolve02() {
		// ���� �ʱ�ȭ �ϰ� <== ������ ��ü�� ������ ����
		vec = new Vector();
		
		for(int dan = 2 ; dan < 10 ; dan++ ) {
			// ���� ������ ����
			Vector dVec = new Vector();
			/*// �� ���� �����
			int dan = 2;*/
			
			// �� ���� ����� ���͸� ����� �����͸� �ִ´�.
			for(int gop = 1; gop < 10 ; gop++) {
				Vector v1 = new Vector();
				
				v1.add(dan);
				v1.add(gop);
				int result = dan * gop;
				v1.add(result);
				
				dVec.add(v1);
			}
			
	//		System.out.println(dVec);
			vec.add(dVec);
		}
		
		// ����ϱ�
		/*
		 * for(Object o : vec) { System.out.println((Vector) o); }
		 */
		
		Iterator itor = vec.iterator();
		
		while(itor.hasNext()) {
			Object o = itor.next();
			Vector v1 = (Vector) o;
			System.out.println(v1);
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	public void toSolve01() {
		// ��ü������ ���� ����
		vec = new Vector();
		
		// ������ ä���ִ� �ݺ���
		for(int dan = 2 ; dan < 10 ; dan++ ) {
			Vector dVec = new Vector();
			for(int i = 1; i < 10 ; i++ ) {
				Vector tmp = new Vector();
				tmp.add(dan);
				tmp.add(i);
				tmp.add(dan * i);
				dVec.add(tmp);
			}
			
			vec.add(dVec);
		}
		
		Collections.reverse(vec);
		
		// ������ ������ �ݺ���
		for(int i = 0 ; i < vec.size(); i++ ) {
			Vector d1 = (Vector)(vec.get(i));
//			System.out.println(d1);
			
			for(int j = 0 ; j < d1.size(); j++ ) { 
				Vector tmp = (Vector)(d1.get(j));
				System.out.println(tmp);
			}
		}
		
	}
}
