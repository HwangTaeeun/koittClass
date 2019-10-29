package day13;

/*
	학생의 
		이름, 국어, 영어, 수학, 과학, 코딩, 총점, 평균
	을 관리할 Vector를 만들고
	5명의 데이터를 입력해서
	출력하세요.
	-------------------------------------------------------------
	정렬도 해보세요.
	정렬은 내림차순으로 하세요.
 */

import java.util.*;
import static java.lang.Math.*;

public class Ex01 {

	public Ex01() {
		// 전체학생을 관리할 벡터 만들고
		Vector vec = new Vector();
		Vector stud = new Vector();
		stud.add("홍길동"); stud.add("김길동"); stud.add("박길동"); stud.add("강길동"); stud.add("최길동");
		// 전체학생을 관리하는 벡터에 다섯명의 정보를 저장할 비어있는 벡터를 만들어서 넣는다.
		for(int i = 0 ; i < 5 ; i++ ) {
			Vector v1 = new Vector();
			vec.add(v1);
		}
		// 각 학생의 정보를 하나씩 넣어준다.
		for(int i = 0 ; i < vec.size(); i++ ) {
			// 각 방에 들어있는 벡터를 꺼내서 변수에 담는다.
			Vector tmp = (Vector)vec.get(i);
//			tmp.add( (char)('A' + i) + ""); // 이름 입력해서
			tmp.add((String)stud.get(i));
			// 다섯과목 점수를 만들어서 넣어준다.
			int total = 0;
			for(int j = 0 ; j < 5 ; j++ ) {
				// 점수를 랜덤하게 발생시키고 변수에 저장하고 왜?? 나중에 누적할 때 써야되니까...
				int score = (int)(random()* 51 + 50);
				tmp.add(score);
				// 그런데 총점을 계산해줘야하니 위에다 누적해서 계산할 변수를 만들어 두자.
				// 만들어진 총점 누적 변수에 누적해주자.
				total += score;
			}
			
			// 누적 총점을 입력하고
			tmp.add(total);
			
			// 평균을 입력하고
			tmp.add(total / 5.);
			
		}
		
		// 출력하고
		System.out.println(vec);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
