package day03;

import java.util.Arrays;

/*
	����]
		�� ������ �ζǸ� ����� �迭�� ���� ����ϰ�
		����ϼ���.
		����� �迭�� ������ Ȯ���ϴ� �Լ��� ����ؼ� ó���ϼ���.
		
 */
public class CreateLotto {
	int[][] myLotto = new int[5][6];
	
	public CreateLotto() {
		/*
			6���� �濡 �ϳ��� ���ʷ� �����ؼ�
			�����ϰ� 1 ~ 45 ������ ���ڸ� �����
			���ʷ� �־��ָ� �ȴ�.
		 */
		
		// 1. ������ �ݺ��ؼ� �� �濡 �����Ѵ�.
		int k = 0 ;
		/*
			label �� ���� for ���
				: �ݺ����ȿ� �ݺ��� ���ԵǾ� �ִ� ���
					������ �ݺ������� ������ �ݺ����� ����, �Ǵ� ����ȸ���� 
					����Ǳ⸦ ���Ұ�� label�� �ٿ��ְ� 
						break[�Ǵ� continue] label�̸�;
					�������� ó���Ѵ�.
				label ����� ���]
					�ݺ����� �ٷ� ���� 
						label�̸� :
					�������� �ٿ��ش�.
		 */
		for(int n = 0 ; n < myLotto.length ; n++) {
			start:
			for(int i = 0 ; i < myLotto[n].length ; i++) {
				/*
					�迭������ ������ ��
					��������[] �� []�� �ֻ��� �迭���� �����ؼ�
					������ ��������.
					���� �ټ������� �迭�� ���� �����Ϸ���
					myLotto[n] �̶�� ǥ���ϰ�
					����� �� �ε����� ����ִ� ������ �� �迭�� �ȴ�.
					
						myLotto[n] ==> myLotto�迭�� n��° �濡 �ִ� ������(�迭)
						
				 */
				System.out.println("�ݺ� Ƚ�� : " + k++);
				// 2. ������ ���ڸ� �����.
				int no = (int)(Math.random() * 45) + 1;
				
				for(int j = 0 ; j < i ; j++ ) {
					if(myLotto[n][j] == no) {
						i--;
						continue start;
					}
				}
				// �̺κ��� �����Ѵٴ� �ǹ̴�
				// �ٷ����� ��ȣ �ߺ�üũ�� �� ������ �ߺ��� ���� �����ٴ� ���̹Ƿ�
				// �߻��� ��ȣ�� �־��ָ� �ȴ�.
				myLotto[n][i] = no;
			}
		}
		
		// �迭�� ������ Ȯ���ϴ� �Լ�
		for(int i = 0 ; i < myLotto.length ; i++) {
			System.out.println(Arrays.toString(myLotto[i]));
		}
	}

	public static void main(String[] args) {
		new CreateLotto();
	}
	
	public void toTest() {
		// label�� ���� for ����� break(or continue)��
		// ���� ����ݺ����� ���ؼ��� ����ȴ�.
		
		for(int i = 0 ; i < 10; i++) {
			first:
			for(int j = 0 ; j < 5 ; j++) {
				
			}
			
			for(int j = 0 ; j < 7 ; j++ ) {
				if(j == 3) {
//					continue first; 
					// ==> label �� ���� ����� 
					//		�ݵ�� �����ִ� �ݺ����� ���ؼ��� ����ȴ�.
				}
			}
		}
	}

}
