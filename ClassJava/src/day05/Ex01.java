package day05;

import java.util.Arrays;

/*
	5���� �л��� ������ ������ �迭�� ����µ�
	�迭���� ���������� �����͸� ������ ���̴�.
	�׷��� �� �л����� ������ �л���ȣ, ����, ����, ����, ����, ��ȸ �� ������ �����ϰ� ���� �Է��ϰ�
	������ ���ؼ� �Է��� �����̴�.
	
	�л��� �̸��� ���ڿ� �迭�� ������ ���� ������ �����̴�.
	
	�迭�� ����� ����ϼ���.
	
		��� ��]
			ȫ�浿 : 50 | 70 | 80 | 90 | 40 | ####(����)
			
	======================================================================================
	�� ������ �ذ��� �Ǹ� ��յ� ���ؼ� ����ϼ���	
	
	======================================================================================
	������ ���ؼ� �����ϰ� ����ϼ���.
	
	
	=======================================================================================
	
	�� ó���� �Լ��� �ۼ��ϰ� ȣ���ؼ� ó���ϼ���.
	
 */
public class Ex01 {
	
	public Ex01() {
		// �̸��� ������ �迭�� �����.
		String[] name = {"A", "B", "C", "D", "E"};
		
		// ������ ������ �迭�� �����.
		int[][] score = new int[5][7];
		
		// �л���ȣ�� ������ �Է��Ѵ�.
		// �л���ȣ�� 1 ���� ���������� ���������ֱ�� ����.
		// ������ 50 ~ 100���� �����ϰ� �߻����Ѽ� �� ���� �濡�� �����ϰ� 
		// ������ �Ѹ��� ���������� ��������� ���� ���ϴ� �Լ��� ȣ���ؼ� ������ �Է��Ѵ�.
		for(int i = 0 ; i < 5 ; i++ ) {
			// �л��� ��ȣ�� �Է��ϰ�
			score[i][0] = i+1;
			int[] tmp = new int[5];
			// ������ �����ϰ� ���� �Է��Ѵ�. �׷��� ������ �ټ����� ���;��Ѵ�.
			// ���� �ټ��� �ݺ��ؾߵȴ�.
			for(int j = 1 ; j < 6 ; j++ ) {
				int jumsoo = (int)(Math.random() * 51 + 50);
				score[i][j] = jumsoo;
				tmp[j - 1] = jumsoo;
			}
			
			//������ �������� ������ ���ؼ� �Է����ش�.
			// �׷��� ������ �Ʒ� �Լ����� ���� ��ȯ���ֱ�� �ߴ�.
			score[i][6] = getTotal(tmp);
		}
		
		// ����Ѵ�.
		
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.println(Arrays.toString(score[i]) + " | ��� : " + getAvg(score[i]));
		}
		
		
		// �����ϱ� : �������� ������ �ؾ� �Ѵ�.
		// ���ı����� �������� �ϸ� �ȴ�.
		for(int i = 0 ; i < 4 ; i++ ) {
			for(int j = i + 1; j < 5; j++ ) {
				if(score[i][6] < score[j][6]) {
					// ���� ��ü�ؾ� �� ��� 
					// ���� ���� �����͸� �Է��ϴ� ���� �����ִ� �����ʹ� ������Ƿ�
					// ���� ������ �س��� ��ü�ϸ� �ȴ�.
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.println(Arrays.toString(score[i]) + " | ��� : " + getAvg(score[i]) + " | ���� : " + (i+1));
		}
	}
	
	// �� �Լ��� �̷µǴ� �����͸� �������Ѽ� ������ִ� �Լ��̴�.
	// ���������� �ԷµǾ��ִ� �迭�� �Է��ϸ� ��� ������ ���� ���ؼ� ��ȯ���ִ� �Լ��� �ۼ�����.
	public int getTotal(int[] sub) {
		// ���� ���� ������ �����
		int total = 0;
		
		// ������ �����ְ�
		for(int i = 0 ; i < sub.length ; i++ ) {
			total += sub[i];
		}
		
		// ������ ��ȯ���ְ�
		return total;
	}
	
	// �� �л��� �����͸� �Է��ϸ� ����� ���ؼ� ��ȯ���ִ� �Լ��� �����.
	public double getAvg(int[] s) {
		
		// ������ �ִ� ���� �ε��� ���ϱ�
		int idx = s.length - 1;
		double avg = s[s.length - 1] / 5.0;
		
		// ��� ��ȯ�ϰ�
		return avg;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}