package day15;

import java.util.*;

public class Test02 {

	public Test02() {
		
		ArrayList tree = new ArrayList();
		tree.add(123);
		tree.add("홍길동");
		tree.add("심청이");
		
		for(int i = 0 ; i < tree.size() ; i++ ) {
			Object o = tree.get(i);
			
//			String str = (o instanceof String) ? (String) o : (int) o + ""; // 숫자 + "" ==> 문자열
			
			String str = "";
			
			if(o instanceof String) {
				str += (String) o;
			} else {
				str += (int) o;
			}
			
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
