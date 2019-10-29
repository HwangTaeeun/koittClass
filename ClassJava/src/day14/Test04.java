package day14;

/*
	
	TreeSet
		==> 내부적으로 Tree Sort라는 알고리즘을 이용해서 데이터를 보관하는 기능을 가지고 있다.
			
		특징]
			우리가 상상하는 정렬방식이 아니다.
			
		생성방법]
			TreeSet(Comparator comparator)
			==> 정렬 방식을 변경해서 TreeSet을 만든다.
			
			TreeSet(SortedSet<E> s)
			==> TreeSet을 이용해서 다시 TreeSet을 만든다.
			
		참고함수]
			subSet()
				==> 하나의 Set에 담긴 내용 중 특정부분만 골라서 새로운 Set을 만드는 함수
				
			headSet(E toElement)
				==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만든다.
			
			tailSet(E fromElement)
				==> 지정한 부분부터 마지막까지 골라서 새로운 Set을 만든다.
			
 */

import java.util.*;
public class Test04 {
	// HashSet에 랜덤하게 발생된 1 ~ 10 까지의 수를 5개를 저장하자.
	public Test04() {
		HashSet set = new HashSet();
		// HashSet의 특징은 1. 나름의 규칙으로 데이터를 정렬해서 저장 2. 중복데이터는 허용하지 않는다.
		
		Random rnd = new Random();
		
		while(true) {
			// 중복된 데이터가 발생하면 다시 발생시켜야하므로
			// 몇번 반복해야될지 알 수 없다.
			int num = rnd.nextInt(10) + 1;
			
			set.add(num);
			
			if(set.size() == 5) {
				break;
			}
		}
		
		System.out.println(set);
		
		System.out.println();
		// 문제 1] set의 데이터를 순차적으로 꺼내서 출력하세요. (Iterator 로 변환하는 방식)
		
		// Iterator 로 변환해주고
		Iterator itor = set.iterator();
		
		// 반복해서 순차적으로 데이터 꺼내고
		System.out.print("# ");
		while(itor.hasNext()) {
			// Object타입으로 저장되었으니 꺼내서 변수 저장하고
			Object o = itor.next();
			// 실제 타입으로 강제 형변환 해주고
			int no = (int) o;
			// 출력해주고
			System.out.print(no + " # ");
		}
		
		System.out.println();
		// 문제 2] ArrayList 로 만들어서 처리하는 방법
		// ArrayList 로 변환하고
		ArrayList list = new ArrayList(set);
		// 반복해서 하나씩 꺼내고
		System.out.print("$ ");
		for(int i = 0 ; i < list.size(); i++ ) {
			// list에 Object 타입으로 저장이 되었으니 꺼내서 변수에 저장하고
			Object o = list.get(i);
			// 정수타입으로 강제 형변환하고
			int no = (int) o;
			// 출력하고
			System.out.print(no + " $ ");
		}
		
		System.out.println();
		
		// 위의 list를 내림차순 정렬하고 싶다.
		list.sort(new MySort01());
		
		System.out.println("MySort01 : " + list);
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

class MySort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
//		int result = (int) o2 - (int) o1 ; //  == -(o1 - o2)
		// result 가 + 일 경우는 내림차순이고 - 일 경우는 오름차순 정렬이다.
		int result = 0 ; 
		if((int) o1 > (int) o2) {
			result = -1 ;
		} else {
			result = 1;
		}
		
		return result;
	}
	
}
