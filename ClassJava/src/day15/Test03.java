package day15;

import java.util.*;

public class Test03 {

	public Test03() {
		
		TreeSet tree = new TreeSet(new ObjSort());
		tree.add(123);
		tree.add("Ȳ����");
		tree.add("�����");
		tree.add("�ֿ켺");
		tree.add("����");
		tree.add("��ȣ��");
		tree.add("�ڼ۸�");
		tree.add("�����");
		tree.add("������");
		tree.add("������");
		
		System.out.println(tree);
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class ObjSort implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0 ;
		
		String str1 = "";
		String str2 = "";
		// ���ڿ� �������� ���� �Ѵ�.
		if(o1 instanceof Integer) {
			str1 += (int) o1;
		} else {
			str1 += (String) o1;
		}
		if(o2 instanceof Integer) {
			str2 += (int) o2;
		} else {
			str2 += (String) o2;
		}
		
		String tmp = str2;
		
		if(str1.length() < str2.length()) {
			tmp = str1; // "ab" "abcd"
		}
		
		for(int i = 0 ; i < tmp.length(); i++ ) {
			
			if(str1.charAt(i) < str2.charAt(i)) {
				return -1;
			} else if(str1.charAt(i) > str2.charAt(i)) {
				return 1;
			}
		}
		
		return result;
	}
}