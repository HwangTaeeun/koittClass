package day15;

/*
	프로그램에 관련된 정보를 자동으로 뽑아서 구경해보자.
 */

import java.io.*;
import java.util.*;

public class Test10 {

	public Test10() {
		Properties prop = System.getProperties();
		/*
			System.getProperties() 가
			프로그램에 관련된 정보를 Map으로 만들어주는 함수
		 */
		
		Set set = prop.keySet();
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			Object o = itor.next();
			String key = (String) o;
			String val = (String)prop.get(key);
			System.out.println(key + " : " + val);
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
