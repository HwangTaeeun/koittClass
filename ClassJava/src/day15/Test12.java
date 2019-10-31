package day15;

import java.util.*;


public class Test12 {
	HashMap<String, Integer> map;
	public Test12() {
		map = new HashMap<String, Integer>();
		
		map.put("둘리", 100000000);
		map.put("희동이", 4);
		map.put("고길동", 34);
		map.put("또치", 3);
		map.put("도우너", 5);
		
		
		// 데이터 꺼내서 출력하기
		getItor();
		
		System.out.println("#######################################");
		System.out.println();
		

		// 향상된 for 명령으로 처리하기
		getForeach();
		
		for(String s : map.keySet()) {
			
		}
	}
	
	public void getForeach() {
		Set<String> set = map.keySet();
		
		for(String key : set) {
			System.out.println(key + " - " + map.get(key));
		}
	}
	
	public void getItor() {
		// 	1. 키를 뽑아내고
		Set<String> set = map.keySet();
		
		// 순차적으로 하나씩 뽑을려니 인덱스가 없네...
		// 그래서 Iterator 로 변환해주고
		Iterator<String> itor = set.iterator();
		// 순차적으로 꺼내서 출력하고
		while(itor.hasNext()) {
			String key = itor.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}
	public static void main(String[] args) {
		new Test12();
	}

}
