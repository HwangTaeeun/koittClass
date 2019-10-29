package day14;

import java.util.*;

/*
	LinkedList
		==> 내부적으로 이중 연결 리스트 방식으로 데이터를 보관하는 컬렉션의 일종
			(이후에 입력되는 데이터의 위치를 기억하고있다)
			검색 속도가 느리다.
			
			장점]
				데이터를 중간에 끼워넣는 작업, 삭제하는 작업 속도가 빠르다.
			단점]
				데이터를 누적시키는 작업은 느리다.
				
		주로 데이터의 변화가 심한 경우에 많이 사용한다.
		
	참고 클래스]
		Iterator
			==> 컬렉션은 많은 클래스들의 집합이고 그 형태도 다르다.
				하지만 그것들을 서로 혼용해서 사용해야 한다.
				그런데 그안에 데이터를 꺼내는 방식이 약간씩 다르다.
				List 계열에서 데이터를 꺼내는 방식과 Set에서 데이터를 꺼내는 방식이 다르다.
				
				그래서 데이터를 꺼내기 위해서만 사용하는 클래스를 따로 만들어 놓았다.
				그것이 Iterator 라는 클래스이다.
				즉, List, Set 계열에서 Iterator 로 변환만 시켜주면 
				동일한 방법으로 데이터를 꺼낼 수가 있게 된다.
				따라서 꺼내는 코드가 동일해 질 것이다.
				
				따라서 List계열이던 Set계열이던 
				데이터를 꺼내는 순간에 Iterator로 변환을 시켜주면
				동일한 방식으로 데이터를 꺼낼 수 있게된다.
				
			특징]
				StringTokenizer와 유사하게 순차적으로 꺼낼 수 있고
				한번 꺼낸 데이터는 꺼내는 순간 삭제된다.
				
	--------------------------------------------------------------------------------------
	
	Collections 클래스
		==> 이름은 컬렉션이지만 컬렉션은 아니고
			컬렉션을 사용할 때 필요한 부가적인 기능을 제공하는 부가적인 클래스이다.
			
			주의]
				멤버함수의 매개변수에서
				List를 달라고하면 List계열을 주면 되고
				Set을 달라고 하면 Set계열을 주면 된다.
				Map을 달라고 하면 Map계열을 입력해주면 된다.
				<== 하위클래스는 상위클래스로 자동 형변환이 되기 때문에...
				
				
			참고]
				일반적으로 sort()는 오름차순으로 정렬을 해준다.
				만약 정렬 방식을 벼경하고자 하면
					sort(List list, Comparator c)를 사용하야 한다.
 */
		
public class Test02 {

	public Test02() {
		ArrayList list = new ArrayList();
		
		// list에 1 ~ 10 까지 넣는다.
		for(int i = 0 ; i < 10 ; i++ ) {
			list.add((int)(Math.random()*10 + 1));
		}
		
		System.out.println("정렬 전 : " + list);
		Collections.reverse(list);
		System.out.println("정렬 전 역정렬 : " + list);
		
		Collections.sort(list);
		System.out.println("정렬 후 : " + list);
		
		// 내림차순 정렬하기
		Collections.reverse(list);
		System.out.println("내림차순 정렬 후 역정렬 후 : " + list);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
