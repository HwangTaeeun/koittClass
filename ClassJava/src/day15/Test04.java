package day15;

import java.util.*;
/*
	Map
		==> 하나의 데이터를 그 데이터를 구분할 키값과 한쌍을 만들어서
			데이터를 기억하는 컬렉션
			따라서 데이터를 꺼낼 때는 키값을 이용해서 꺼내야 한다.
			
			Map 계열은 많은 양의 데이터를 보관하는 용도 보다는
			데이터를 구분하는 용도쪽으로 더 많이 사용한다.
			
		HashMap / HashTable
			
			HashTable 이 이전 버젼이고 HashMap 이 신버젼이다.
			따라서 HashMap 사용을 권장을 하고 있다.
			
			내부적으로는 키값을 해쉬테이블을 이용해서 정렬해서 보관한다.
			
			주요함수 ] 
				put(Object key, Object value)
					==> 데이터를 입력하는 함수
				get(Object key)
					==> 데이터를 꺼내는 함수
					
			참고함수]
				values()
					==> 데이터만 꺼내서 Collection 으로 반환해주는 함수
				keys()	: HashTable 소속함수
					==> 키값만 꺼내서 Enumeration 으로 반환해주는 함수
						
						참고]
							Enumeration 
								==> Iterator 의 구버젼
									데이터를 순차적으로 꺼내서 사용
				keySet() : HashMap 소속 함수
					==> 키값만 꺼내서 Set 으로 반환해주는 함수
					
				entrySet()
					==> Map 은 반드시 키값을 알아야 꺼낼 수 있다.
						물론 데이터들만 따로 꺼내 수도 있지만 그경우 데이터의 "의미" 는 사라진다.
					==> 키값과 데이터를 Set으로 묶어주는 함수
					
					문제점]
						Map은 항상 키와 벨류 두개가 있어야 저장이 된다.
						Set은 오직 한개만 저장한다.
						어떻게 해서든지 키와 데이터를 하나로 묶어야 Set에 저장이 된다.
						
						이것을 해결하기 위해서 클래스(VO)가 존재한다.
						이 클래스가 바로 
							Map.Entry
						==> 이 클래스 안에는 키와 데이터의 변수가 은닉화 되어 있고
							이 변수를 사용할 수 있는 함수를 제공하고 있다.
							한마디로 두개의 변수를 하나의 클래스에 담아놓은 클래스.
 */
public class Test04 {
	HashMap map;
	
	public Test04() {
		initMap();
		// 출력하고
		System.out.println(map);
		
		testItor();
		
		testKeySet();
		
	}
	
	// 맵 초기화 함수
	public void initMap() {
		// 맵을 만들고
		map = new HashMap();
		// 키와 데이터를 넣고
		map.put("둘리", 70);
		map.put("희동이", 95);
		map.put("고길동", 45);
	}
	
	// Iterator 처리함수
	public void testItor() {
		// 데이터만 꺼내서 ArrayList 에 담고
		Iterator itor = map.values().iterator();
		// 하나씩 꺼내서 출력하고
		System.out.print("| ");
		while(itor.hasNext()) {
			Object o = itor.next();
			System.out.print((int) o + " | ");
		}
		System.out.println();
	}
	
	// keySet() 테스트 함수
	public void testKeySet() {
		Set set = map.keySet();
		System.out.println(set);
		for(Object o : set) {
			
			String key = (String) o;
			System.out.println(key +" : " + map.get(key));
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
