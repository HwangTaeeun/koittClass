package extra;

/*
	ObjectOutputStream 으로  day17 패키지에 score.txt 파일을 만들어보자.
	사용할 클래스는 이 패키지 안에 Exam.java 클래스를 만들어서 처리해보자.
 */

import java.io.*;

public class Day17_07 {

	public Day17_07() {
		// 넘길 데이터 만들고
		Exam e1 = new Exam();
		e1.setName("둘리");
		e1.setKor(75);
		e1.setEng(55);
		e1.setMath(95);
		e1.setTotal();
		
		// 스트림 준비하고
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		// 스트림 만들고
		try {
			fout = new FileOutputStream("src/day17/score.txt");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 저장하고
			oout.writeObject(e1);
			System.out.println("######### 파일 저장 성공 ########");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Day17_07();
	}

}
