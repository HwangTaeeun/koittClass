package day15;

import java.util.*;

public class Test03 {

	public Test03() {
		
		TreeSet tree = new TreeSet(new ObjSort());
		tree.add(123);
		tree.add("È²ÅÂÀº");
		tree.add("±è»êÇÏ");
		tree.add("ÃÖ¿ì¼º");
		tree.add("±è°æ¿ø");
		tree.add("°íÈ£°æ");
		tree.add("¹Ú¼Û¸²");
		tree.add("±è¹ÎÁÖ");
		tree.add("°íÈñÀ±");
		tree.add("¼ÛÀºÇõ");
		
		System.out.println(tree);
		
		TreeSet t1 = (TreeSet) tree.headSet("±è»êÇÏ");
		
		System.out.println("headSet(\"±è»êÇÏ\") : " + t1);
		
		TreeSet t2 = (TreeSet) tree.tailSet("±è»êÇÏ");
		
		System.out.println("tailSet(\"±è»êÇÏ\") : " + t2);
		
		TreeSet sub = (TreeSet) tree.subSet("¹Ú¼Û¸²", "°íÈñÀ±");
		System.out.println("subSet(\"¹Ú¼Û¸²\", \"°íÈñÀ±\") : " + sub);
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
		
		// ¹®ÀÚ¿­ ±âÁØÀ¸·Î Á¤·Ä ÇÑ´Ù.
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
				return 1;
			} else if(str1.charAt(i) > str2.charAt(i)) {
				return -1;
			}
			
			/*
			if(str1.charAt(i) < str2.charAt(i)) {
				return -1;
			} else if(str1.charAt(i) > str2.charAt(i)) {
				return 1;
			}
			*/
		}
		
		return result;
	}
}