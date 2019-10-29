package day14;
/*
	Set 계열
		입력한 순서대로 보관하고 있을 보장이 없다.
		(나름의 규칙에 따라서 내부적으로 정렬을 해서 보관하기 때문에...)
		
		중복되는 데이터는 한번만 저장을 한다.
		(같은 데이터가 입력이 되면 먼저번에 입력한 데이터를 삭제하고 새로운 데이터로 교체한다.)
		
		1. HashSet
			==> HashCode 를 이용해서 정렬해서 보관하는 방식
				우리가 알고있는 정렬은 이루어지지 않는다.
				
				정말 참고 ]
					HashSet(int initialCapacity, float loadFactor)
						loadFactor : 	해쉬코드값을 만드는 규칙에 사용할 상수 값을 
										사용자가 지정하면서 해쉬테이블을 만들어서 사용한다.
										
			
			**
			참고]
				Set 계열에는 데이터를 꺼내오는 함수가 따로 존재하지 않는다.
				==> 왜??
					개발자가 데이터가 저장된 주소를 알 수 없기 때문에...
					따라서 특정 위치의 데이터를 꺼낼 수 있는 방법이 없다.
					
					따라서 Iterator로 변환해서 순서대로 꺼내서 사용해야 한다.
 */

import java.util.*;

public class Test03 {

	public Test03() {
		HashSet set = new HashSet();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			set.add(i+1);
		}
		
		System.out.println(set);
		
		// 1. Iterator 로 꺼내는 방법
		Iterator itor = set.iterator();
		System.out.print("| ");
		while(itor.hasNext()) {
			System.out.print((int) itor.next() + " | ");
		}
		System.out.println();
		
		
		// 2. ArrayList로 변환해서 꺼내는 방법
		ArrayList list = new ArrayList(set);
		System.out.print("* ");
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.print(list.get(i) + " * ");
		}
		
		/*
			<== 형변환은 가능하지만 사용할 수 는 없다. 왜?? 인스턴스에 멤버가 없기 때문에...
		ArrayList list2 = (ArrayList) ((Collection)set);
		
		System.out.println(list2.get(3));
		*/
	}

	public static void main(String[] args) {
		new Test03();
	}

}
