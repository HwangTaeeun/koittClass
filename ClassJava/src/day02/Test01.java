package day02;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ƹ��ų� �Է��ϼ���! : ");
		String str = sc.next();
		
		System.out.println("str : " + str);
		/*
			���ڿ��� �ٸ� ������Ÿ���� ����
				���ڿ�  + ���� ==> ���ڿ�
				���ڿ� + �Ǽ� ==> ���ڿ�
				���ڿ� + ���� ==> ���ڿ�
				
				"10" + 1 ==> "101"
				"3.14" + 0.1 ==> "3.140.1"
		 */
		System.out.println("\"3.14\" + 0.1 : " + "3.14" + 0.1);
		
		/*
			'A' - char
			==> "A"
			====> 'A' + "" ==> "A"
		 */
	}
}
