package day09;

/*
	문제 3]
		학생의 국어, 영어, 수학, 과학, 코딩 과목 
		그리고 총점, 평균 의 점수를 관리할 클래스를 만들고
		 10 학생(배열)의 점수를 랜덤하게 저장을해서
		 
		 출력하세요.
		
 */

public class Ex03 {

	public Ex03() {
		// 학생 10명을 관리할 배열을 만든다.
		Student[] stud = new Student[10];
		// 점수를 입력해서 각 학생을 만들어서 집어넣는다.
		for(int i = 0 ; i < stud.length ; i++ ) {
			stud[i] = new Student(
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50)
					);
		}
		
		// 출력한다.
		for(int i = 0 ; i < stud.length ; i++ ) {
			String msg = (i + 1) + " ] 번 학생 - 국어 : " + 
							stud[i].kor + " | 영어 : " + stud[i].eng +
							" | 수학 : " + stud[i].math + 
							" | 과학 : " + stud[i].sci + 
							" | 코딩 : " + stud[i].prog + 
							" | 총점 : " + stud[i].total + 
							" | 평균 : " + stud[i].avg ;
			System.out.println(msg);			
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}


class Student {
	// 과목을 저장할 변수를 만들고
	int kor;
	int eng;
	int math;
	int sci;
	int prog;
	int total;
	double avg;
	
	// 객체가 만들어질 때 점수가 셋팅이 되도록 생성자 함수를 만들고
	public Student() {
		
	}
	
	public Student(int kor, int eng, int math, int sci, int prog) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.prog = prog;
		
		// 총점
		this.total = getTotal();
		// 평균
		this.avg = this.total / 5.;
	}
	
	// 총점 구해주는 함수
	public int getTotal() {
		return kor + eng + math + sci + prog;
	}
	
}