package day06;

/*
	flag ���
		-   �츮�� ���α׷��� �����ϴٺ���
			�ΰ��� �̻��� ��찡 �߻��Ǵ� ������ �����Ѵ�.
			�� �Ŀ� � ��찡 �߻��ߴ��� �˾ƺ��� ���
			
			
		��]
			for( ; ;){
				
				if(){
					(1)
					break;
				}
				
				(2)
			}
			
			(3)
			
			
		�̷���� (3) �κ��� ������ �ɶ� �ݺ����� �������� Ƚ����ŭ �ݺ�(2)�� �Ǿ�����
		�ƴϸ� �߰��� � ����(1)�� ���ؼ� �ݺ��Ǵ� �ߴ��ߴ��� �˾ƺ��� ���
 */


/*
	����]
		���ڿ��� �����͸� �Է��� ����
		�����ʹ� ���ڿ� ���ڷθ� �����ؼ� �Է��Ѵ�.
		
		�� ���ڿ��� ������ ���ڷθ� �����Ǿ�����..
		�ƴϸ� �߰��� ���ڰ� �����ϴ��� �˾ƺ���.
		
		��]
			String str1 = "12345"; ==> ���� ���ڿ��Դϴ�.
			String str2 = "123t45"; ==> ���ڰ� ���� �մϴ�.
			
		��Ʈ]
			�ѱ��ھ� ������
				charAt()
			�̾Ƴ� ���ڰ� �������� �ƴϸ� ���������� �˻��ϴ� ������ 
			���� ����ŭ �ݺ��ϸ� �ȴ�.
		
 */

import java.util.*;

public class Test02 {

	public Test02() {
		toTest();
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// ���ڸ� ���Ƿ� �Է��� ���ڿ��� �����
	// �� ���ڿ��� ���ڰ� �ƴ� ���ڰ� ���ԵǾ����� �˷��ִ� �Լ�
	public void toTest() {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է¹ް�
		System.out.println("���ڸ� �Է��ϼ��� : ");
		String str = sc.next();
//		String str = " 123x456";
		int len = str.length(); // ���ڿ��� ����
		
		boolean bool = true;
		for(int i = 0 ; i < len; i++ ) {
			char ch = str.charAt(i);
			
			if( ch < '0' || ch > '9' ) {
				bool = false;
				//System.out.println("### ���ڰ� ���ԵǾ� �ֽ��ϴ�.");
				break;
			}
		}
		
		if(bool == false) {
			System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("���ڷ� �̷���� ���ڿ��Դϴ�. ����ȯ�ؼ� ����ϼ���.");
		}
		
	}
	
}
