package day15;

import java.util.*;

public class Test02 {

	public Test02() {
		
		ArrayList tree = new ArrayList();
		tree.add(123);
		tree.add("ȫ�浿");
		tree.add("��û��");
		
		for(int i = 0 ; i < tree.size() ; i++ ) {
			Object o = tree.get(i);
			
//			String str = (o instanceof String) ? (String) o : (int) o + ""; // ���� + "" ==> ���ڿ�
			
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
