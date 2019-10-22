package day09;

/*
	���� 3]
		�л��� ����, ����, ����, ����, �ڵ� ���� 
		�׸��� ����, ��� �� ������ ������ Ŭ������ �����
		 10 �л�(�迭)�� ������ �����ϰ� �������ؼ�
		 
		 ����ϼ���.
		
 */

public class Ex03 {

	public Ex03() {
		// �л� 10���� ������ �迭�� �����.
		Student[] stud = new Student[10];
		// ������ �Է��ؼ� �� �л��� ���� ����ִ´�.
		for(int i = 0 ; i < stud.length ; i++ ) {
			stud[i] = new Student(
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50),
						(int)(Math.random()*51 + 50)
					);
		}
		
		// ����Ѵ�.
		for(int i = 0 ; i < stud.length ; i++ ) {
			String msg = (i + 1) + " ] �� �л� - ���� : " + 
							stud[i].kor + " | ���� : " + stud[i].eng +
							" | ���� : " + stud[i].math + 
							" | ���� : " + stud[i].sci + 
							" | �ڵ� : " + stud[i].prog + 
							" | ���� : " + stud[i].total + 
							" | ��� : " + stud[i].avg ;
			System.out.println(msg);			
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}


class Student {
	// ������ ������ ������ �����
	int kor;
	int eng;
	int math;
	int sci;
	int prog;
	int total;
	double avg;
	
	// ��ü�� ������� �� ������ ������ �ǵ��� ������ �Լ��� �����
	public Student() {
		
	}
	
	public Student(int kor, int eng, int math, int sci, int prog) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.prog = prog;
		
		// ����
		this.total = getTotal();
		// ���
		this.avg = this.total / 5.;
	}
	
	// ���� �����ִ� �Լ�
	public int getTotal() {
		return kor + eng + math + sci + prog;
	}
	
}