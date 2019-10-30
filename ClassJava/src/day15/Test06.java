package day15;

import java.util.*;

/*
		TreeMap
			==> TreeSet과 마찬가지로
				내부에서 정렬하면서 데이터를 기억하는 Map이다.
				*
				이때 정렬을 하게 되는 기준은 키값을 가지고 정렬을 한다.
				
				따라서 
					키값이 정렬이 되지 않는 클래스를 사용할 수 없고
					필요하다면 정렬 방식을 정해서 사용해야 한다.
					
		참고]
			컬렉션 안에는 다시 컬렉션을 입력할 수 있다.
			왜??
				컬렉션에 입력할 수 있는 데이터는 Object 타입이고
				우리가 사용하는 컬렉션도 Object 클래스의 하위 클래스 이기 때문에...
 */

public class Test06 {
	// 맵 선언하고
	TreeMap map;
	
	public Test06() {
		// 맵 셋팅하고
//		setMap();
		lowSort();
		
		// 맵 출력하고
		System.out.println(map);
	}
	
	// map 초기화 함수
	public void setMap() {
		// map 초기화 하고
		map = new TreeMap();
		
		// 데이터 입력하고
		map.put("탱크보이", 1000);
		map.put("월드콘", 1500);
		map.put("더위사냥", 800);
		map.put("나뚜르", 2500);
		map.put("하겐다즈", 3000);	
	}
	
	// 내림차순 정렬 함수
	public void lowSort() {
		// map 초기화 하고
		// TreeMap에 정렬방식을 정할 때 Comparator.compare(Object o1, Object o2)를 
		// 오버라이드 해야하는데
		// 이때 o1, o2 는 키값을 이야기하며
		// 생성자 함수에서 키값을 뽑아서 정렬을 하게 되므로
		// o1, o2를 키값으로 변환해준후에 정렬방식을 정해주면 된다.
		
		map = new TreeMap(new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				int result= 0;
				
				String k1 = (String) o1;
				String k2 = (String) o2;
				int tmp = 0;
				if(k1.length() < k2.length()) {
					tmp = k1.length();
				} else {
					tmp = k2.length();
				}
				// 문자 하나씩 꺼내서 비교한다.
				for(int i = 0 ; i < tmp ; i++ ) {
					
					if(k1.charAt(i) < k2.charAt(i)) {
						result = 1;
						break;
					} else if(k1.charAt(i) > k2.charAt(i)){
						result = -1;
						break;
					} else {
						continue;
					}
				}
				
				return result;
			}
		});
		
		// 데이터 입력하고
		map.put("탱크보이", 1000);
		map.put("월드콘", 1500);
		map.put("더위사냥", 800);
		map.put("나뚜르", 2500);
		map.put("하겐다즈", 3000);
	}
	public static void main(String[] args) {
		new Test06();
	}

}
