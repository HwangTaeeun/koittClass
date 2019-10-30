package day15;

import java.util.*;

public class Test05 {
	Hashtable table ;
	public Test05() {
		initTable();
		
		System.out.println(table);
		System.out.println(table.size());
		System.out.println("table.get(\"이름\") : " + table.get("이름"));
		
		System.out.println();
		
		testKeys();
		System.out.println("############################################################");
		testKeySet();
	}
	
	// 해쉬테이블 초기화 함수
	public void initTable() {
		// 해쉬테이블 만들고
		table = new Hashtable();
		
		// 데이터 입력하고
		table.put("이름", "고길동");
		table.put("나이", 34);
		table.put("직업", "둘리머슴");
		table.put("자녀", 2);
	}
	
	// key 를 뽑아내는 함수
	public void testKeys() {
		// 키만 뽑아내고
		Enumeration en = table.keys();
		// 하나씩 꺼내서 출력하고
		while(en.hasMoreElements()) {
			// 하나씩 꺼내고
			Object o = en.nextElement();
			// 형변환 해주고
			String key = (String) o;
			// 출력하고
			//System.out.println("key : " + key);
			// 키와 데이터 모두 출력하기
			System.out.println(key + " | " + table.get(o));
		}
	}

	// keySet() 테스트 함수
	public void testKeySet() {
		// 키와 벨류를 동시에 뽑아서 저장한다.
		Set set = table.entrySet();
		
		// set 에 담긴 데이터를 하나씩 뽑아낸다.
		Iterator itor = set.iterator();
		
		// itor 에 담긴 내용을 하나씩 순차적으로 꺼낸다.
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry entry = (Map.Entry) o;
			
			// Map.Entry에는 키와 벨류가 변수형태로 저장이 되어있고 
			// 심지어 은닉화 까지 해놓았다.
			// 따라서 꺼내는 방법은 함수를 호출하는 방법으로 꺼내야 한다.
			String key = (String) entry.getKey();
			String val = "";
			Object tmp = entry.getValue();
			
			if(tmp instanceof Integer) {
				val += (int) tmp;
			} else if(tmp instanceof String) {
				val += (String) tmp;
			}
			
			// 출력하기 - 키값 : 벨류
			System.out.println(key + " : " + val);
		}
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
