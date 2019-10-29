package day14;

import java.util.*;

public class Test07 {
/*
	학생의 이름, 국어, 영어, 수학, 총점을 저장할 클래스를 만들고
	ArrayList 에 5명의 데이터를 입력해서
	총점이 높은 순서대로 정렬해서 출력하세요.
	
	정리]
		객체를 정렬하는 방법
			1. Comparator 를 이용하는 방법
				==> 정렬기준이 없는 객체를 정렬할 때 사용하는 방법
			2. Comparable 을 이용하는 방법
				==> 클래스 자체를 정렬할 수 있는 클래스로 만들어서 사용하는 방법
	
 */
	ArrayList list;
	public Test07() {
		setList();
		
		Collections.sort(list);
		
		System.out.println("총점 내림차순정렬 : " + list);
		System.out.println();
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println(((Stud02)list.get(i)).name + " - " + ((Stud02)list.get(i)).total);
		}
		
		list.sort(new Comparator() {
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				return result;
			}
		});
	}
	
	
	// list 초기화 함수
	public void setList() {
		list = new ArrayList();
		ArrayList name = new ArrayList();
		name.add("홍길동");
		name.add("둘리");
		name.add("도우너");
		name.add("또치");
		name.add("희동이");
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// 학생 데이터를 만들고
			Stud02 stud = new Stud02((String)name.get(i),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50)
					);
			// 학생데이터를 list에 넣고
			list.add(stud);
		}
	}
	public static void main(String[] args) {
		new Test07();
	}

}

class Stud02 implements Comparable {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	public Stud02() {}
	public Stud02(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}
	
	public String toString() {
		return name + " : " + kor + " | " + eng + " | " + math + " | " + total + " |";
	}
	
	@Override
	public int compareTo(Object o) {
		int result = 0 ;
		Stud02 stud = (Stud02) o;
		
		if(this.total < stud.total) {
			result = 1;
		} else if(this.total > stud.total) {
			result = -1;
		}
		
		return result;
	}
	
}
