package day02;


public class Test04 {
	public static void main(String[] a) {
		/*
			if ~ else ���� :
				- ���ǽĿ� �´� ���� ���� �ʴ� ��츦 �����ؼ� ó�����ش�.
				
				����]
					1
					if(���ǽ� - 2){
						���ϰ�� ���� ��ɵ�... - 3
					} else {
						������ ��� ���� ��ɵ�... - 4
					}
					- 5
					
					���ǽ��� ���ϰ�� : 1 -> 2 -> 3 -> 5
					���ǽ��� ������ ��� : 1 -> 2 -> 4 -> 5
		 */
		System.out.println("1. start");
		if(2 < 3) {
			System.out.println("3. 2�� 3���� �۽��ϴ�.");
		} else {
			System.out.println("4. 2�� 3���� Ů�ϴ�.");
		}
		System.out.println("5. stop");
		
		/*
			����]
				���ǹ� ���ο� �ٽ� ���ǹ��� ����� �� �ִ�.
				if(����){
					if(����2){
					
					} else {
					
					}
				} else {
					if(����3){
					
					} else {
					
					}
				}
		 */
		
	}
}
