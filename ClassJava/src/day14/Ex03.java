package day14;


/*
	문제 3 ]
		구구단 2단을 Vector 에 넣어서 출력하세요.
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
		// 벡터 초기화 하고 <== 구구단 전체를 저장할 벡터
		vec = new Vector();
		
		for(int dan = 2 ; dan < 10 ; dan++ ) {
			// 단을 저장할 벡터
			Vector dVec = new Vector();
			/*// 단 변수 만들기
			int dan = 2;*/
			
			// 각 곱이 저장될 벡터를 만들고 데이터를 넣는다.
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
		
		// 출력하기
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
		// 전체구구단 저장 벡터
		vec = new Vector();
		
		// 데이터 채워주는 반복문
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
		
		// 데이터 꺼내는 반복문
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
