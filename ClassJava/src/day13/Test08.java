package day13;

import java.util.*;

public class Test08 {
/*
	컬렉션( Collection )
		==> 많은 양의 데이터를 손쉽게 보관할 수 있는 클래스들의 집합
			
			배열을 이용해서도 많은 양의 데이터를 관리할 수 있었지만...
			사용상 불편한 점이 있었다.
				1. 만들때 입력되는 타입을 정해야 됬고
				2. 길이도 정해서 만들어 줘야 하고
				3. 길이 수정이 안된다.
				
		배열의 단점을 보완해서 만들어 놓은 것들...
		
	종류]
		
		1. List 계열
			특징]
				1) 입력한 순서를 보장(처리속도가 느리다.)
				2) 중복데이터도 허용한다.
				
		2. Set 계열
			특징]
				1) 	입력한 순서를 보장하지 않는다.
					(나름의 규칙을 가지고 데이터를 정렬해서 보관한다.)
					(처리속도가 빠르다.)
				2) 중복데이터가 입력이되면 먼저번 데이터는 삭제한 후
					저장한다. ==> 중복데이터는 한번만 저장한다.
		3. Map 계열
			특징]
				1) 데이터를 저장할 때 그 데이터를 구분할 키값과 쌍을 이뤄서 저장을 한다.
				2) 입력순서가 보장되지 않는다.
				3) 같은 키값으로 데이터가 입력이 되면
					먼저번 데이터는 삭제하고 나중에 입력된 데이터로 교체한다.
					(데이터는 같아도 상관 없지만 키값은 같으면 덮어씌우게 된다.)
		
		참고]
			List계열과 Set계열은 상위 클래스가 같지만
			Map계열은 전혀 다른 상위 클래스를 가지고 있다.
			
			==> AbstractCollection col = new ArrayList();
				
				Set set = (Set) col;
				
			따라서 List와 Set은 다형성 처리가 가능하지만(서로 변환이 가능하지만)
			Map은 조상이 별도기 때문에 다형성 처리가 안된다.
			
=============================================================================================
	
	List 계열
		
		1.	Vector
			==> 내부적으로 배열 형태를 만들어서 데이터를 보관하는 컬렉션의 한 종류
				장점
					입력속도와 검색 속도가 빠르다.
				단점
					중간에 데이터를 삽입하거나,
					데이터를 삭제하는 속도는 느리다.
			결론]
				데이터의 변화가 없는 프로그램에서 많이 사용
				
			생성방법]
				1) 
					Vector()
						==> 기본 사이즈가 10으로 설정이되서 만들어진다.
							데이터가 추가가 되면 
								원래사이즈 * 2
							로 사이즈가 자동 변경이 된다.
					Vector(Collection c)
						==> 다른 컬렉션 데이터를 입력하면 데이터를 복사해서 벡터를 만들어 준다.
					Vector(int initialCapacity)
						==> 만들때 직접 사이즈를 정해서 벡터를 만든다.
							*
							이 방법을 권장한다.
					*
					Vector(int initialCapacity, int capacityIncrement)
						==> 만들 때 사이즈를 직접 정하고 추가되는 사이즈를 직접 지정해서 만든다.
						
						참고]
							컬렉션은 데이터의 양에 관계없이 항상 데이터를 입력받을 수 있다.
							이때 데이터를 입력 받을 공간을 확보해야 하는데...
							공간 확보 규칙]
								현재사이즈 * 2
								의 사이즈로 늘어난다.
								
					주요함수]
						
						1. 데이터 입력함수
							add(Object e)
							add(int index, Object element)
							addAll(Collection c)
							addAll(int index, Collection c)
							addElement(Object obj)
							insertElementAt(Object obj, int index)
							
						2. 데이터 출력함수
							get(int index)
							elementAt(int index)
							firstElement()
							lastElement()
							elements()
							
						3. 데이터 수정함수
							set(int index, Object element)
							setElementAt(Object obj, int index)
				
 */
	// 친구들의 이름을 기억할 벡터를 만들어서 관리한다.
	public Test08() {
		// 벡터를 만든다.
//		Vector vec = new Vector();
		Vector vec = new Vector(5, 5);
		
		Vector vec2 = new Vector(5, 5);
		vec2.add("김경원");
		vec2.add("송은혁");
		vec2.add("권경근");
		
		// 데이터 입력하고
		vec.add("김민재");
		vec.add("김민주");
		vec.add("박송림");
		vec.add("고희윤");
		vec.add("최우성");
		vec.add("김민재");
		vec.add("김민주");
		vec.add("박송림");
		vec.add("고희윤");
		vec.add("최우성");
		vec.add("김민재");
		vec.add("김민주");
		vec.add("박송림");
		vec.add("고희윤");
		vec.add("최우성");
		vec.add("김민재");
		vec.add("김민주");
		vec.add("박송림");
		vec.add("고희윤");
		vec.add("최우성");
//		vec.add("김민재");
		
		vec.add(13, "김산하");
		
//		vec.addAll(vec2); // ==> 벡터의 맨 뒤에 벡터의 데이터 추가하기
//		vec.addAll(7, vec2);	// ==> 추가될 위치를 정해서 추가하는 방법
//		vec.addElement(vec2);	// ==> 벡터의 맨뒤에 Object 로 데이터 추가하는 방법
		vec.insertElementAt(vec2, 7);	// 위치를 지정해서 객체 추가하는 방법
		
		
		// 벡터 수정하기
		vec.set(5, "고호경");
		
		// 하나씩 꺼내서 출력하고
		int k = 0 ; 
		for(Object o : vec) {
			if(o instanceof Vector) {
				System.out.println(k++ + " - " + ((Vector)o).toString());
			} else {
				System.out.println(k++ + " - " + (String) o);
			}
		}
		
		System.out.println("capacity() : " + vec.capacity());
		System.out.println("size() : " + vec.size());
		
		// Enumeration 을 사용해서 꺼내는 방법
		Enumeration en = vec.elements();
		System.out.println();
		System.out.println("###########################################");
		System.out.println();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
			// nextElement() 의 반환값은 Object 이므로 사용할 때 강제형변환해서 사용해야 한다.
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
