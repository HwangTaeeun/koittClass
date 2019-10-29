package day13;

/*
	�л��� 
		�̸�, ����, ����, ����, ����, �ڵ�, ����, ���
	�� ������ Vector�� �����
	5���� �����͸� �Է��ؼ�
	����ϼ���.
	-------------------------------------------------------------
	���ĵ� �غ�����.
	������ ������������ �ϼ���.
 */

import java.util.*;
import static java.lang.Math.*;

public class Ex01 {

	public Ex01() {
		// ��ü�л��� ������ ���� �����
		Vector vec = new Vector();
		Vector stud = new Vector();
		stud.add("ȫ�浿"); stud.add("��浿"); stud.add("�ڱ浿"); stud.add("���浿"); stud.add("�ֱ浿");
		// ��ü�л��� �����ϴ� ���Ϳ� �ټ����� ������ ������ ����ִ� ���͸� ���� �ִ´�.
		for(int i = 0 ; i < 5 ; i++ ) {
			Vector v1 = new Vector();
			vec.add(v1);
		}
		// �� �л��� ������ �ϳ��� �־��ش�.
		for(int i = 0 ; i < vec.size(); i++ ) {
			// �� �濡 ����ִ� ���͸� ������ ������ ��´�.
			Vector tmp = (Vector)vec.get(i);
//			tmp.add( (char)('A' + i) + ""); // �̸� �Է��ؼ�
			tmp.add((String)stud.get(i));
			// �ټ����� ������ ���� �־��ش�.
			int total = 0;
			for(int j = 0 ; j < 5 ; j++ ) {
				// ������ �����ϰ� �߻���Ű�� ������ �����ϰ� ��?? ���߿� ������ �� ��ߵǴϱ�...
				int score = (int)(random()* 51 + 50);
				tmp.add(score);
				// �׷��� ������ ���������ϴ� ������ �����ؼ� ����� ������ ����� ����.
				// ������� ���� ���� ������ ����������.
				total += score;
			}
			
			// ���� ������ �Է��ϰ�
			tmp.add(total);
			
			// ����� �Է��ϰ�
			tmp.add(total / 5.);
			
		}
		
		// ����ϰ�
		System.out.println(vec);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
