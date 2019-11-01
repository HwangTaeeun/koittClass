package extra;

/*
	ObjectOutputStream ����  day17 ��Ű���� score.txt ������ ������.
	����� Ŭ������ �� ��Ű�� �ȿ� Exam.java Ŭ������ ���� ó���غ���.
 */

import java.io.*;

public class Day17_07 {

	public Day17_07() {
		// �ѱ� ������ �����
		Exam e1 = new Exam();
		e1.setName("�Ѹ�");
		e1.setKor(75);
		e1.setEng(55);
		e1.setMath(95);
		e1.setTotal();
		
		// ��Ʈ�� �غ��ϰ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		// ��Ʈ�� �����
		try {
			fout = new FileOutputStream("src/day17/score.txt");
			oout = new ObjectOutputStream(fout);
			
			// ������ �����ϰ�
			oout.writeObject(e1);
			System.out.println("######### ���� ���� ���� ########");
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
