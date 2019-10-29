package day14;

import java.util.*;

public class Test06 {
/*
	학생의 이름, 국어, 영어, 수학, 총점을 저장할 클래스를 만들고
	ArrayList 에 5명의 데이터를 입력해서
	총점이 높은 순서대로 정렬해서 출력하세요.
 */
	
	// 학생들 저장할 ArrayList 만들고
	ArrayList list;
	public Test06() {
		setArrayList();
		System.out.println(list);
		
		// 총점으로 정렬하기
//		list.sort(new TotalSort());
		
		/*
		// 익명 내부 클래스로 구현하는 경우
		list.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud01)o2).total - ((Stud01)o1).total;
			}
		});
		
		*/
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud01)o2).total - ((Stud01)o1).total;
			}
		});
		
		System.out.println("총점 내림차순정렬 : " + list);
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println(((Stud01)list.get(i)).name + " - " + ((Stud01)list.get(i)).total);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}
	
	// 학생들을 저장할 ArrayList를 초기화 해주는 함수
	public void setArrayList() {
		list = new ArrayList();
		ArrayList name = new ArrayList();
		name.add("홍길동");
		name.add("둘리");
		name.add("도우너");
		name.add("또치");
		name.add("희동이");
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// 학생 데이터를 만들고
			Stud01 stud = new Stud01((String)name.get(i),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50)
					);
			// 학생데이터를 list에 넣고
			list.add(stud);
		}
		
	}
	
}

// 총점을 기준으로 정렬하는 클래스를 만들자
class TotalSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// list에는 Stud01 타입의 데이터가 5개 들어가 있고
		// 비교할 총점은 각 방에 있는 데이터의 멤버로 저장이 되어 있으므로
		// 먼저 자신의 타입에 맞게 강제 형변환을 해주고
		Stud01 s1 = (Stud01) o1;
		Stud01 s2 = (Stud01) o2;
		
		// 각 객체에 접근해서 멤버(총점)를 뽑아내고
		int t1 = s1.total;
		int t2 = s2.total;
		
		// 이제 총점 비교해서 반환값을 넘겨주면 된다.
		
		if(t1 < t2) {
			result = 1;
		} else if(t1 > t2) {
			result = -1;
		}
		
		return result;
	}
}

class Stud01 {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	public Stud01() {}
	public Stud01(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}
	
	public String toString() {
		return name + " : " + kor + " | " + eng + " | " + math + " | " + total + " |";
	}
}
