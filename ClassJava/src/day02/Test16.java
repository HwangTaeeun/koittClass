package day02;

public class Test16 {

	public Test16() {
		// �ݺ����� 10ȸ �ݺ��ϴµ�
		// for ���� i�� 3�϶� �ݺ����� �����ϼ���.
		/*
		for(int i = 0 ; i < 10; i++ ) {
			if(i == 3) break;
			
			System.out.println(i);
		}
		*/
		
		
		// 4ȸ���ϰ�� �ǳʶٰ� ����ȸ���� �����ϼ���.
		/*
		for(int i = 0; i < 10 ; i++ ) {
			if(i == 3) continue;
			
			System.out.println(i);
		}
		*/
		
		// label �� ���� for ���
		abcd:
		for(int i =0; i < 10 ; i++) {
			for(int j = 0 ; j < 10; j++) {
				if(i == 2 && j == 2) break abcd;
				System.out.print("###" + i + " - " + j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test16();
	}

}
