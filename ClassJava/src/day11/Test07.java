package day11;

import java.util.*;

/*
	����]
		�ѱ����� ���ڸ� �Է¹޾Ƽ�
		�� ���ڰ� 0 ~ 9 �̸� ���� ó���� �ϰ�
		�� ��찡 �ƴ� ���
		�Ǵ� �α��� �̻��� �Էµ� ���� ���ܷ� �����ϰ�
		������ ���ܸ� �߻����� ����.
 */

public class Test07 {

	public Test07() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			try {
				System.out.println("���ڸ� ���ڸ� �Է��ϼ���!");
				str = sc.nextLine();
				
				if(str.equals("quit")) {
					break;
				}
				
				char ch = str.charAt(0);
				if(ch < '0' || ch > '9' || str.length() > 1) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("�߸��Է��߽��ϴ�.");
				str = "�Է� �� ����";
			}
			
			System.out.println("�Էµ� ���� : " + str);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
