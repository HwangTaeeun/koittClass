package day15;

import java.util.*;

/*
	TreeSet
		==> 내부적으로 TreeSort라는 알고리즘을 이용해서 데이터를 보관하는 기능을 가진 컬렉션
			(<== 우리가 상상하는 정렬 방식)
			
		생성방법]
			TreeSet(Comparator comparator)
				==> 정렬방식을 변경해서 TreeSet을 만든다.
			
			TreeSet(SortedSet<E> s)
				==> TreeSet을 이용해서 다시 TreeSet을 만든다.
			
		참고함수]
			
			subSet()
				==> 하나의 Set에 담긴 내용중에서 특정 부분만 골라서 
					새로운 Set을 만드는 함수
			
			headSet(E toElement)
				==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만든다.
			
			tailSet(E fromElement)
				==> 지정한 부분부터 마지막까지 골라서 새로운 Set을 만든다.
 */

public class Test01 {
	TreeSet tree;
	public Test01() {
//		setNum();
		setName();
		System.out.println(tree);
	}
	
	// 랜덤하게 숫자를 발생해서 넣어주는 함수
	public void setNum() {
		tree = new TreeSet();
		while(tree.size() < 10) {
			// 랜덤하게 1 ~ 20 까지의 숫자를 발생하고
			int no = (int) (Math.random()* 20 + 1);
			// TreeSet에 집어 넣고
			tree.add(no);
		}
	}
	
	// 이름을 입력하는데 리스트의 인덱스를 랜덤하게 발생해서 꺼내서 입력해주는 함수
	public void setName() {
		// tree초기화 해주고
		tree = new TreeSet();
		
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("황태은");
		list.add("김산하");
		list.add("최우성");
		list.add("김경원");
		list.add("고호경");
		list.add("박송림");
		list.add("김민주");
		list.add("고희윤");
		list.add("송은혁");
		
		// tree 에 데이터를 10개를 채운다.
		
		while(tree.size() < 10) {
			// 먼저 랜덤하게 인덱스를 발생시키고
			int idx = (int)(Math.random()*10);
			tree.add(list.get(idx));
		}
	}
	
	
	public static void main(String[] args) {
		new Test01();
	}
	
	
}
