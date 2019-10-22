package day09;

/*
	문제 4]
		핸드폰에 전화번호를 저장할 프로그램을 만들 예정이다.
		
		친구 클래스를 작성하고 (이름, 전화번호)
		친구를 추가(10명)해서(이름과 전화번호는 임의로 입력하고 겹치지 않도록한다.) 
		
		이름 검색하면 정보를 알려주는 프로그램을 작성하세요.
		
		
 */

import java.util.*;

public class Ex04 {

	public Ex04() {
		// 틀은 만들어 졌으니
		// 친구들을 저장할 배열을(사이즈가 10인) 만들고
		Person[] buddy = new Person[10];
		// 배열에 데이터를 입력해서 각 친구들을 등록하고
		// 친구이름을 저장할 배열을 만들고
		String[] irum = {
							"박송림", "김경원", "김민재", "김민주", "김산하",
							"고희윤", "고호경", "공형진", "최우성", "황태은"
						};
		// 친구전화번호를 저장할 배열을 만들고
		String[] junbun = {
				"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", 
				"010-5555-5555", "010-6666-6666", "010-7777-7777", "010-8888-8888",
				"010-9999-9999", "010-1234-5678"
		};
		
		// 친구 정보를 입력해서 저장하자.
		for(int i = 0 ; i < buddy.length ; i++ ) {
			buddy[i] = new Person(irum[i], junbun[i]);
		}
		
		
		// 이름이 입력되면 이름이 같은 사람의 정보를 출력하고
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			// 메세지 출력하고 입력받고
			System.out.print("검색할 이름을 입력하세요!(종료 - exit) : ");
			String tmp = sc.nextLine();
			if(tmp.equals("exit")) {
				break;
			}
			
			boolean bool = true;
			for(int i = 0 ; i < buddy.length ; i++ ) {
				
				if((buddy[i].name).equals(tmp)) {
					bool = false;
					System.out.println(buddy[i]);
					break;
				}
			}
			
			if(bool) {
				System.out.println("등록되지 않은 친구입니다.");
			}
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}

}

class Person {
	String name;
	String tel;
	
	public Person() {}
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String toString() {
		return  "### " + name + " - " + tel;
	}
	
}
