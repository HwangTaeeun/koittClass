package day14;

import java.util.*;

/*
	참고]
		컬렉션의 함수의 매개변수를 보면
		E, V, K 라고 표현한 것들이 보이는데
		이것들은 이후에 배울 제너릭스의 용어들이다.
		이런것들은 Object를 의미하고 
		Object라고 이해하면 되겠다.
------------------------------------------------------------------------------------------

	ArrayList
		==> Vector 의 신버젼
			역시 배열의 형태로 데이터를 관리하기 때문에
			Vector의 특징을 그대로 가지고 있다.
			다만, 스레드에서 동기화 처리를 자동으로 해준다.( ==> 동기화 처리에 안정적 ) 
			v 1.2 부터는 벡터보다는 ArrayList를 선호하는 경향이 있다.
			
			사용방법 역시 벡터와 유사하다.
			
		참고]
			List 계열의 주소(변수)를 출력하면 
			마치 데이터를 꺼내서 보여지는데
			이것은 toString() 함수를 오버라이드 해 놓아서 
			toString()함수가 실행된 결과를 보여준 것일 뿐이다.
			(내부의 내용만 확인하는 용도일 뿐이다.)
			절대로 데이터를 사용하는 개념은 아니다.
		
 */

import java.util.*;

public class Test01 {

	public Test01() {
		ArrayList list = new ArrayList();
		list.add("둘리");
		list.add("도우너");
		list.add("희동이");
		list.add("고길동");
		list.add("둘리");
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
