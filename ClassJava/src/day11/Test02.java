package day11;

/*
	예제 1]
		Change 클래스에서 숫자를 입력받아서
		Test02의 no 값을 변경하고
		출력해보자.
		
		단. Change 클래스에서 Test02.no 는 
		Test02에서 인스턴스를 만들어서 함수를 호출해서 변경하자.
 */

import java.util.*;

public class Test02 {
	int no = 10;
	public Test02() {
		System.out.println("함수 호출 전 no : " + no);
		
		Change ch = new Change(this);
		
		ch.cNo();
		System.out.println("함수 호출 후 no : " + no);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Change {
	// Test02의 객체를 기억할 변수가 필요하다.
	Test02 main;
	
	// 이 클래스가 객체가 되었을 때 main 변수가 셋팅이 되어야 한다.
	public Change(Test02 main) {
		this.main = main;
	}
	
	public void cNo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 no의 값 : ");
		int tmp = sc.nextInt();
		
		// Test02의 변수 no를 입력된 값으로 변경한다.
		main.no = tmp;
	}
}
