package day02;

/*
	���� ���
		1. ���ǹ�
			if, if ~ else, if ~ else if, switch ~ case
			
			���ǹ��� ���ι��]
				������ �������� ������ �������� �����Ѵ�.
			
		2. �ݺ���
			for, ���� for���, while, do ~ while
 */
public class Test03 {
	public static void main(String[] args) {
		/*
			if ���ǹ�: ���ǽ��� �ְ� �� ���ǿ� �´°�츸 ó���ϴ� ���ǹ�
				����]
					1
					
					     2
					if(���ǽ�){
						���ǽ��� ���ϰ�� ó�� ��� - 3
					}
					4
					
					���ǽ��� ���ΰ�� : 1 -> 2 -> 3 -> 4
					���ǽ��� ������ ��� : 1 -> 2 -> 4
					
		 */
		
		int no = 10;
		
		if(no++ >= 10) {
			no += 5;
		}
		
		System.out.println("no : " + no);
		
	}
}
