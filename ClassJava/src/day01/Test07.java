package day01;

import java.util.*;

/*
	����]
		�غ��� ���̸� �Է�(����)�޾Ƽ� 
		�ﰢ���� ���̸� ���ؼ� 
		������ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Test07 {
	// 1. ������ �Լ� �غ��ϰ�
	public static void main(String[] args) {
		// 2. �Էµ��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 3. �Է¹޾� �����ϰ�
		
		// �غ� �Է¹޾� �����ϰ�
		System.out.print("�غ� :");
		int width = sc.nextInt();
		
		// ���� �Է¹޾� �����ϰ�
		System.out.print("���� : ");
		int height = sc.nextInt();
		
		// 4. ����ϰ�
		float area = width * height / 2f;
//		float area = (float)(width * height) / 2;
		
		// 5. ����ϰ�
		/*
		 * System.out.print("�غ��� "); System.out.print(width);
		 * System.out.print(" �̰� ���̰� "); System.out.print(height);
		 * System.out.print(" �� �ﰢ���� ���̴� "); System.out.print(area);
		 * System.out.print(" �Դϴ�. ");
		 */
		/*
			��¹��]
				1. println() : ������ְ� �ٹٲ����ִ� �޼���
				2. print()	: ������ ����ϰ� �ٹٲ� ���� �ʴ´�.
				3. printf()	: ���İ� �����͸� �Է��ؼ� ����ϴ� ���
					���� ]
						System.out.printf("���Ĺ��ڿ�", ������1, ������2, ������3,....);
						
						���Ŀ� ���Ǵ� ��ȣ
							%s : ���ڿ�
							%d	: ����(������)
							%f	: �Ǽ�
							%c	: ����
							%o	: 8���� ������
							%x	: 16���� ������
							%e	: �Ǽ��� 10����������� ����Ҷ�
							%b	: ����(true, false)
		 */
		
		System.out.printf("�غ� : %5d, \n���� : %5d \n%s %.2f �Դϴ�. ", 
								width, height, "�� �ﰢ���� ���̴�", area);
	}
}
